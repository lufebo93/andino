package ec.com.cebycam.rnegocio.entidades;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.Thread.UncaughtExceptionHandler;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamDiscoveryEvent;
import com.github.sarxos.webcam.WebcamDiscoveryListener;
import com.github.sarxos.webcam.WebcamEvent;
import com.github.sarxos.webcam.WebcamListener;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamPicker;
import com.github.sarxos.webcam.WebcamResolution;
import static ec.com.cebycam.vistas.Enfermeria.frmModificarPaciente.lblFoto;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 * Proof of concept of how to handle webcam video stream from Java
 * 
 * @author Bartosz Firyn (SarXos)
 */
public class frmCamaraModificarPac extends JFrame implements ActionListener , Runnable, WebcamListener, WindowListener, UncaughtExceptionHandler, ItemListener, WebcamDiscoveryListener {
 
    private static final long serialVersionUID = 1L;
 
    private Webcam webcam = null;
    private WebcamPanel panel = null;
    private WebcamPicker picker = null;
    private final JButton boton = new JButton("Tomar Foto");
    public static int longitudBytes;
    public static FileInputStream fin;
    @Override
    public void run() {
 
        Webcam.addDiscoveryListener(this);
 
        setTitle("CEBYCAM-CES :: Cámara");
        setIconImage(new ImageIcon(getClass().getResource("/ec/com/cebycam/imagenes/icono.png")).getImage());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
 
        addWindowListener(this);
 
        picker = new WebcamPicker();
        picker.addItemListener(this);
 
        webcam = picker.getSelectedWebcam();
 
        if (webcam == null) {
            System.out.println("No webcams found...");
            JOptionPane.showMessageDialog(this, "Camara no Encontrada: ",
                    "CEBYCAM-CES", JOptionPane.INFORMATION_MESSAGE);
        }
 
        webcam.setViewSize(WebcamResolution.QVGA.getSize());
        webcam.addWebcamListener(frmCamaraModificarPac.this);
 
        panel = new WebcamPanel(webcam, false);
        panel.setFPSDisplayed(false);
 
        add(picker, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(boton, BorderLayout.SOUTH);
         
        boton.addActionListener(this);
 
        pack();
        setVisible(true);
 
        Thread t = new Thread() {
 
            @Override
            public void run() {
                panel.start();
            }
        };
        t.setName("example-starter");
        t.setDaemon(true);
        t.setUncaughtExceptionHandler(this);
        t.start();
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new frmCamaraModificarPac());
    }
 
    @Override
    public void webcamOpen(WebcamEvent we) {
        System.out.println("webcam open");
    }
 
    @Override
    public void webcamClosed(WebcamEvent we) {
        System.out.println("webcam closed");
    }
 
    @Override
    public void webcamDisposed(WebcamEvent we) {
        System.out.println("webcam disposed");
    }
 
    @Override
    public void webcamImageObtained(WebcamEvent we) {
        // do nothing
    }
 
    @Override
    public void windowActivated(WindowEvent e) {
    }
 
    @Override
    public void windowClosed(WindowEvent e) {
        webcam.close();
    }
 
    @Override
    public void windowClosing(WindowEvent e) {
    }
 
    @Override
    public void windowOpened(WindowEvent e) {
    }
 
    @Override
    public void windowDeactivated(WindowEvent e) {
    }
 
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("webcam viewer resumed");
        panel.resume();
    }
 
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("webcam viewer paused");
        panel.pause();
    }
 
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.err.println(String.format("Exception in thread %s", t.getName()));
    }
 
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getItem() != webcam) {
            if (webcam != null) {
 
                panel.stop();
 
                remove(panel);
 
                webcam.removeWebcamListener(this);
                webcam.close();
 
                webcam = (Webcam) e.getItem();
                webcam.setViewSize(WebcamResolution.VGA.getSize());
                webcam.addWebcamListener(this);
 
                System.out.println("selected " + webcam.getName());
 
                panel = new WebcamPanel(webcam, false);
                panel.setFPSDisplayed(true);
 
                add(panel, BorderLayout.CENTER);
                pack();
 
                Thread t = new Thread() {
 
                    @Override
                    public void run() {
                        panel.start();
                    }
                };
                t.setName("example-stoper");
                t.setDaemon(true);
                t.setUncaughtExceptionHandler(this);
                t.start();
            }
        }
    }
 
    @Override
    public void webcamFound(WebcamDiscoveryEvent event) {
        if (picker != null) {
            picker.addItem(event.getWebcam());
        }
    }
 
    @Override
    public void webcamGone(WebcamDiscoveryEvent event) {
        if (picker != null) {
            picker.removeItem(event.getWebcam());
        }
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
         
        if(e.getSource()== boton){
            BufferedImage image = webcam.getImage();
            try {
                ImageIO.write(image, "JPG", new File("imagen.jpg"));
                JOptionPane.showMessageDialog(this, "                   ¡Listo!",
                    "CEBYCAM-CES", JOptionPane.INFORMATION_MESSAGE);
                File f = new File("imagen.jpg");
                fin=new FileInputStream(f);
                BufferedImage bim=ImageIO.read(f);
                bim.getScaledInstance(230,300,BufferedImage.SCALE_SMOOTH);
                
                frmCamaraModificarPac.longitudBytes=(int)f.length();
                try{
                    lblFoto.setText("");
                    Image icono=ImageIO.read(f).getScaledInstance
                        (lblFoto.getWidth(),lblFoto.getHeight(),Image.SCALE_SMOOTH);
                    lblFoto.setIcon(new ImageIcon(icono));
                    lblFoto.updateUI();
                    dispose();
                }catch(IOException ex){
                    JOptionPane.showMessageDialog(rootPane, "imagen: "+ex);
                }
            } catch (IOException e1) {
            }
             
        }
         
    }
}
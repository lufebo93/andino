/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.cebycam.vistas;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author lufeb
 */
public class frmSplashScreen extends JWindow{
    private final int duration;
    
    /**
     * Creates new form frmSplashScreen
     * @param d
     */
    public frmSplashScreen(int d) {
        duration=d;
    }
    
    public void showSplash() {
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.white);
         
        int width = 1024;
        int height = 270;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
         
        JLabel label = new JLabel(new ImageIcon("welcome.png"));
        JLabel copyrt = new JLabel
                ("Todos los derechos reservados(C). 2019", JLabel.CENTER);
        copyrt.setFont(new Font("Sans-Serif", Font.ITALIC, 12));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        setVisible(true);
         
        try { Thread.sleep(duration); } catch (InterruptedException e) {JOptionPane.showMessageDialog(this, "Error"+e,
                    "CEBYCAM-CES", JOptionPane.INFORMATION_MESSAGE);}
        setVisible(false);
    }
    
    public void showSplashAndExit() throws SQLException, IOException {
        showSplash();
        frmLogin frm = new frmLogin();
        frm.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws SQLException, IOException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(frmSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        frmSplashScreen splash = new frmSplashScreen(4000);
        splash.showSplashAndExit();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

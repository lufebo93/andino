package ec.com.cebycam.rnegocio.entidades;

import java.awt.Graphics;
import javax.swing.*;

public class JClass extends JPanel {

    private ImageIcon imagen;

    public JClass() {
    }

    public JClass(String nombreImagen) {
        if (nombreImagen != null) {
            imagen = new ImageIcon(nombreImagen);
        }
    }

    public JClass(ImageIcon imagenInicial) {
        if (imagenInicial != null) {
            imagen = imagenInicial;
        }
    }

    public void setImagen(String nombreImagen) {
        if (nombreImagen != null) {
            imagen = new ImageIcon(nombreImagen);
        } else {
            imagen = null;
        }
        repaint();
    }

    public void setImagen(ImageIcon nuevaImagen) {
        imagen = nuevaImagen; 
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        } else {
            setOpaque(true);
        }
        super.paint(g);
    }
}

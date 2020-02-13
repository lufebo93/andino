/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.andino.rnegocio.entidades;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PabloRuiz
 */
public final class Buscador {
    private int seleccion;
    private final JFileChooser buscar;
    private final FileNameExtensionFilter filter;
    private DefaultTableModel model;
    public static ArrayList direcciones;

    public Buscador() {
        buscar = new JFileChooser("fotos/");
        filter = new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
        nuevoModelo();
        direcciones = new ArrayList();
    }

    public void buscar(JTable tabla) {
        try {
            nuevoModelo();
            buscar.setFileFilter(filter);
            buscar.setMultiSelectionEnabled(true);
            Frame f = new Frame();
            f.setTitle("Seleccione una imagen");
            f.setIconImage(new ImageIcon(getClass().getResource("/ec/com/cebycam/imagenes/icono.png")).getImage());
            seleccion = buscar.showOpenDialog(f);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File[] fichero = buscar.getSelectedFiles();
                for (int i = 0; i < fichero.length; i++) {
                    String nombre[] = {fichero[i].getName(), fichero[i].getAbsolutePath()};
                    direcciones.add(fichero[i].getAbsoluteFile());
                    model.addRow(nombre);
                }
            }else{
                buscar.cancelSelection();
            }
            tabla.setModel(model);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error!"+e);
        }
    }

    public void nuevoModelo(){
        model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Dirección");
    }
}

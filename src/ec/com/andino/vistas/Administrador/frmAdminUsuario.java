/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.andino.vistas.Administrador;

import ec.com.andino.accesodatos.Conexion;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lufeb
 */
public final class frmAdminUsuario extends javax.swing.JFrame {
    public static String cedula=null;
    public static int codigo;
    public static String categoria;
    DefaultTableModel modelo;
    TableRowSorter trsFiltro;
    
    /** Creates new form frmInsertarMedico
     * @throws java.sql.SQLException
     * @throws java.io.IOException */
    public frmAdminUsuario() throws SQLException, IOException {
        initComponents();
        frmAdminUsuario.txtNombreUsuario.setText(cedula);
        frmAdminUsuario.txtCodigoAdmin.setText(String.valueOf(codigo));
        frmAdminUsuario.txtCategoria.setText(String.valueOf(categoria));
        cargarTabla();
        setIconImage(new ImageIcon(getClass().getResource("/ec/com/andino/imagenes/icono.png")).getImage());
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(frmAdminUsuario.DISPOSE_ON_CLOSE);
        JRootPane boton = SwingUtilities.getRootPane(btnRegUsuario); 
        boton.setDefaultButton(btnRegUsuario);
        txtCredCodEmpleado.setVisible(false);
        
        txtCredUsuario.setCaretPosition(0);
        pwdCredPalabraSecreta.setCaretPosition(0);
        pwdCredContraseña.setCaretPosition(0);
        pwdCredConfirmContraseña.setCaretPosition(0);
        
        
        txtCredUsuario.setEnabled(false);
        pwdCredPalabraSecreta.setEnabled(false);
        pwdCredContraseña.setEnabled(false);
        pwdCredConfirmContraseña.setEnabled(false);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        panel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pwdCredContraseña = new javax.swing.JPasswordField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtCodigoAdmin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pwdCredConfirmContraseña = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        pwdCredPalabraSecreta = new javax.swing.JPasswordField();
        txtCategoria = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCredUsuario = new javax.swing.JTextField();
        btnRegUsuario = new javax.swing.JButton();
        txtCredCodEmpleado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        txtBusquedaEmpleado = new javax.swing.JTextField();
        btnActualizarCredencial = new javax.swing.JButton();
        cmbFiltroEmpleado = new javax.swing.JComboBox<>();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("HU.ANDINO :: Usuario");
        setResizable(false);

        panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.setPreferredSize(new java.awt.Dimension(300, 230));

        jLabel12.setText("Contraseña:");

        txtNombreUsuario.setEditable(false);
        txtNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCodigoAdmin.setEditable(false);
        txtCodigoAdmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Bienvenido");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");

        jLabel8.setText("Rep. Contraseña:");

        jLabel11.setText("ID Recuperación:");

        txtCategoria.setEditable(false);
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("USUARIO");

        jLabel15.setText("Usuario:");

        btnRegUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/guardar_256px-2.png"))); // NOI18N
        btnRegUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegUsuarioActionPerformed(evt);
            }
        });

        txtCredCodEmpleado.setEditable(false);
        txtCredCodEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Empleados"));

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados);

        jLabel17.setText("Búsqueda");

        txtBusquedaEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaEmpleadoKeyTyped(evt);
            }
        });

        btnActualizarCredencial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/refresh-0.png"))); // NOI18N
        btnActualizarCredencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCredencialActionPerformed(evt);
            }
        });

        cmbFiltroEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Código", "Nombre" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbFiltroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBusquedaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizarCredencial, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtBusquedaEmpleado)
                    .addComponent(btnActualizarCredencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbFiltroEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(txtCredCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel14))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))
                        .addGap(28, 28, 28)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(txtCategoria)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pwdCredContraseña)
                                    .addComponent(txtCredUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11)
                                            .addComponent(btnRegUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(148, 148, 148))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pwdCredPalabraSecreta)
                                        .addComponent(pwdCredConfirmContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel14)
                        .addGap(32, 32, 32)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtCredUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(pwdCredContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(pwdCredPalabraSecreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(pwdCredConfirmContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(txtCredCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(btnRegUsuario)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarTabla() throws SQLException, IOException{
        Conexion con = new Conexion();
        con.conectar();
        ResultSet rs = null;
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        
        try{
            rs = con.ejecutarQuery("SELECT idempleado, nombre FROM empleado\n" +
"WHERE NOT EXISTS (SELECT idempleado\n" +
"              FROM usuario\n" +
"              WHERE usuario.idempleado = empleado.idempleado);");
                ResultSetMetaData md = rs.getMetaData();
                int columnCount = md.getColumnCount();
                String[] cols = new String[columnCount];
                for (int i=1;i<= columnCount;i++){
                    cols[i-1] = md.getColumnName(i);
                }
                while (rs.next()){
                    Object[] row = new Object[columnCount];
                    for (int i = 1 ; i <= columnCount ; i++){
                        row[i-1] = rs.getObject(i);
                    }
                    modelo.addRow(row);
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error "+e,
                    "HU.ANDINO", JOptionPane.INFORMATION_MESSAGE);
        }finally {
            con.desconectar();
            rs.close();
        }
        tablaEmpleados.setModel(modelo);
        modelo.fireTableDataChanged();
        
        
        tablaEmpleados.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaEmpleados.getColumnModel().getColumn(0).setMinWidth(0);
        tablaEmpleados.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    public void filtro() {
        int columnaABuscar = 0;
        if (cmbFiltroEmpleado.getSelectedItem().equals("Código")) {
            columnaABuscar = 0;
        }
        if (cmbFiltroEmpleado.getSelectedItem() == "Nombre") {
            columnaABuscar = 1;
        }
        String replace = txtBusquedaEmpleado.getText();
        replace = replace.replace("e", "(é)");
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i).*"+replace+".*", columnaABuscar));
        tablaEmpleados.setRowSorter(trsFiltro);
    }
       
    private void btnActualizarCredencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCredencialActionPerformed
        Conexion con = new Conexion();
        try {
            con.conectar();
        } catch (IOException ex) {
            Logger.getLogger(frmAdminUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
        modelo.setRowCount( 0 );
        try{
            rs = con.ejecutarQuery("SELECT idempleado, nombre FROM empleado\n" +
"WHERE NOT EXISTS (SELECT idempleado\n" +
"              FROM usuario\n" +
"              WHERE usuario.idempleado = empleado.idempleado);");
                ResultSetMetaData md = rs.getMetaData();
                int columnCount = md.getColumnCount();
                String[] cols = new String[columnCount];
                for (int i=1;i<= columnCount;i++){
                    cols[i-1] = md.getColumnName(i);
                }
                while (rs.next()){
                    Object[] row = new Object[columnCount];
                    for (int i = 1 ; i <= columnCount ; i++){
                        row[i-1] = rs.getObject(i);
                    }
                    modelo.addRow(row);
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error "+e,
                    "HU.ANDINO", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(frmAdminUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            con.desconectar();
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(frmAdminUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnActualizarCredencialActionPerformed

    private void txtBusquedaEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaEmpleadoKeyTyped
        txtBusquedaEmpleado.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBusquedaEmpleado.getText());
                txtBusquedaEmpleado.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tablaEmpleados.getModel());
        tablaEmpleados.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBusquedaEmpleadoKeyTyped

    private void tablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadosMouseClicked
        int selectedRowIndex = tablaEmpleados.rowAtPoint(evt.getPoint());
        txtCredCodEmpleado.setText(tablaEmpleados.getValueAt(selectedRowIndex, 0).toString());
        txtCredUsuario.setEnabled(true);
        pwdCredPalabraSecreta.setEnabled(true);
        pwdCredContraseña.setEnabled(true);
        pwdCredConfirmContraseña.setEnabled(true);
    }//GEN-LAST:event_tablaEmpleadosMouseClicked

    private void btnRegUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegUsuarioActionPerformed
        String clave1=String.valueOf(pwdCredContraseña.getPassword());
        String clave2=String.valueOf(pwdCredConfirmContraseña.getPassword());
        String recuperacion=String.valueOf(pwdCredPalabraSecreta.getPassword());
        Conexion con= new Conexion();
        try {
            con.conectar();
        } catch (IOException ex) {
            Logger.getLogger(frmAdminUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (JOptionPane.showConfirmDialog(null, "¿Esta usted seguro?", "HU.ANDINO",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(txtCredUsuario.getText().equals("")||clave1.equals("")||txtCredCodEmpleado.getText().equals("")
                ||recuperacion.equals("")||clave2.equals("")){
                JOptionPane.showMessageDialog(this, "Debe ingresar toda la información",
                    "HU.ANDINO", JOptionPane.INFORMATION_MESSAGE);
            }else{
                if(Arrays.equals(pwdCredContraseña.getPassword(), pwdCredConfirmContraseña.getPassword())){
                    try{
                        String insertarCategoria="INSERT INTO public.usuario(\n" +
    "	idempleado, usuario, clave, recuperacion)\n" +
    "	VALUES (?, ?, ?, ?);";
                        try (PreparedStatement ps = con.conectar().prepareStatement(insertarCategoria)) {
                            ps.setInt(1, Integer.parseInt(txtCredCodEmpleado.getText()));
                            ps.setString(2, txtCredUsuario.getText());
                            ps.setString(3, String.valueOf(pwdCredContraseña.getPassword()));
                            ps.setString(4, String.valueOf(pwdCredPalabraSecreta.getPassword()));

                            ps.execute();
                            ps.close();
                        } catch (IOException ex) {
                            Logger.getLogger(frmAdminUsuario.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }catch(SQLException | NumberFormatException | HeadlessException x){
                        JOptionPane.showMessageDialog(rootPane, "Error al guardar la información "+x);
                    }finally {
                        con.desconectar();
                    }
                    txtCredUsuario.setText("");
                    pwdCredContraseña.setText("");
                    pwdCredPalabraSecreta.setText("");
                    pwdCredConfirmContraseña.setText("");
                    txtCredCodEmpleado.setText("");
                    JOptionPane.showMessageDialog(rootPane,"Guardado correctamente");
                }else{
                    JOptionPane.showMessageDialog(null,"Las claves no concuerdan", "HU.ANDINO",
                        JOptionPane.ERROR_MESSAGE);
                    pwdCredContraseña.setText("");
                    pwdCredConfirmContraseña.setText("");
                }
            }
        }
    }//GEN-LAST:event_btnRegUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmAdministrador().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCredencial;
    private javax.swing.JButton btnRegUsuario;
    private javax.swing.JComboBox<String> cmbFiltroEmpleado;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPasswordField pwdCredConfirmContraseña;
    public static javax.swing.JPasswordField pwdCredContraseña;
    private javax.swing.JPasswordField pwdCredPalabraSecreta;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtBusquedaEmpleado;
    public static javax.swing.JTextField txtCategoria;
    public static javax.swing.JTextField txtCodigoAdmin;
    private javax.swing.JTextField txtCredCodEmpleado;
    private javax.swing.JTextField txtCredUsuario;
    public static javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables

}

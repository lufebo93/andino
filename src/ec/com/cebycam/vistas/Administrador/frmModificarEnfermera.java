/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.cebycam.vistas.Administrador;

import ec.com.cebycam.accesodatos.*;
import java.awt.HeadlessException;
import java.awt.event.*;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author lufeb
 */
public final class frmModificarEnfermera extends javax.swing.JFrame {
    DefaultTableModel modelo;
    TableRowSorter trsFiltro;

    /**
     * Creates new form frmModificarEnfermera
     * @throws java.io.IOException
     */
    
    public frmModificarEnfermera() throws IOException {
        initComponents();
        cargarTabla();
        ordenarTabla();
        setIconImage(new ImageIcon(getClass().getResource("/ec/com/cebycam/imagenes/icono.png")).getImage());
        setLocationRelativeTo(null);
        JRootPane boton = SwingUtilities.getRootPane(btnRegAceptar); 
        boton.setDefaultButton(btnRegAceptar);
        
        txtNombreApellido.setEnabled(false);
        txtCedula.setEnabled(false);
        txtSexo.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtCorreo.setEnabled(false);
        pwdPalabraSecreta.setEnabled(false);
        jpcFechaInicio.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnRegAceptar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtCodigoEnfermeria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pwdPalabraSecreta = new javax.swing.JPasswordField();
        txtCategoria = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jpcFechaInicio = new org.jdesktop.swingx.JXDatePicker();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEnfermeriaRegistrados = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        cmbListar = new javax.swing.JComboBox<>();
        txtBusqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CEBYCAM-CES :: Modificar Enfermera");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 230));

        jLabel3.setText("Nombre y Apellido");

        jLabel4.setText("Cédula");

        jLabel5.setText("Teléfono");

        jLabel6.setText("Sexo");

        txtNombreApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreApellidoFocusLost(evt);
            }
        });
        txtNombreApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreApellidoKeyTyped(evt);
            }
        });

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel9.setText("DATOS ENFERMERÍA");

        btnRegAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/cebycam/imagenes/guardar_256px-2.png"))); // NOI18N
        btnRegAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAceptarActionPerformed(evt);
            }
        });

        jLabel10.setText("Dirección");

        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });

        jLabel1.setText("Correo");

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });

        txtSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSexoKeyTyped(evt);
            }
        });

        lblTitulo.setText("Código");

        txtCodigoEnfermeria.setEditable(false);
        txtCodigoEnfermeria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoEnfermeria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("ID Recuperación");

        txtCategoria.setEditable(false);
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("Fecha de Inicio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoEnfermeria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRegAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(24, 24, 24)
                            .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(pwdPalabraSecreta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtDireccion)
                            .addComponent(txtTelefono))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jpcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtCodigoEnfermeria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pwdPalabraSecreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jpcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnRegAceptar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enfermeras Registradas"));
        jPanel1.setToolTipText("");

        tablaEnfermeriaRegistrados.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaEnfermeriaRegistrados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaEnfermeriaRegistrados.setAutoscrolls(false);
        tablaEnfermeriaRegistrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEnfermeriaRegistradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEnfermeriaRegistrados);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/cebycam/imagenes/refresh-0.png"))); // NOI18N
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel16.setText("Buscar por:");

        cmbListar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Enfermería", "Nombre", "Cédula" }));

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(cmbListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreApellidoFocusGained
        txtNombreApellido.setCaretPosition(0);
    }//GEN-LAST:event_txtNombreApellidoFocusGained

    private void txtNombreApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreApellidoFocusLost
        txtNombreApellido.setCaretPosition(0);
    }//GEN-LAST:event_txtNombreApellidoFocusLost

    public void ordenarTabla(){
        TableRowSorter<TableModel> ordenar = new TableRowSorter<>(modelo);
        tablaEnfermeriaRegistrados.setRowSorter(ordenar);
    }
    
    public void cargarTabla() throws IOException{
        Conexion con = new Conexion();
        con.conectar();
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Cedula");
        modelo.addColumn("Sexo");
        modelo.addColumn("Correo");
        modelo.addColumn("Recuperacion");
        modelo.addColumn("ID Enfermería");
        modelo.addColumn("Categoria");
        modelo.addColumn("Fecha_inicio");
        
        try{
            try (ResultSet rs = con.ejecutarQuery("SELECT nombre, direccion, telefono, cedula, sexo, correo, recuperacion, \n" +
                    "       codigo, categoria, fecha_inicio\n" +
                    "  FROM public.enfermeria where activo='SI';")) {
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
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error "+e,
                    "CEBYCAM-CES", JOptionPane.INFORMATION_MESSAGE);
        }finally {
            con.desconectar();
        }
        tablaEnfermeriaRegistrados.setModel(modelo);
        modelo.fireTableDataChanged();
        
        tablaEnfermeriaRegistrados.getColumnModel().getColumn(6).setMaxWidth(0);
        tablaEnfermeriaRegistrados.getColumnModel().getColumn(6).setMinWidth(0);
        tablaEnfermeriaRegistrados.getColumnModel().getColumn(6).setPreferredWidth(0);
        
        tablaEnfermeriaRegistrados.getColumnModel().getColumn(8).setMaxWidth(0);
        tablaEnfermeriaRegistrados.getColumnModel().getColumn(8).setMinWidth(0);
        tablaEnfermeriaRegistrados.getColumnModel().getColumn(8).setPreferredWidth(0);
    }
    private void btnRegAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAceptarActionPerformed
        Conexion con= new Conexion();
        try {
            con.conectar();
        } catch (IOException ex) {
            Logger.getLogger(frmModificarEnfermera.class.getName()).log(Level.SEVERE, null, ex);
        }
        String recuperacion=String.valueOf(pwdPalabraSecreta.getPassword());
        
        if (JOptionPane.showConfirmDialog(null, "¿Esta usted seguro?", "CEBYCAM-CES",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(txtNombreApellido.getText().equals("")||txtCedula.getText().equals("")||txtTelefono.getText().equals("")
                    ||txtDireccion.getText().equals("")||txtCorreo.getText().equals("")||txtCodigoEnfermeria.getText().equals("")
                    ||recuperacion.equals("")||jpcFechaInicio.getDate() == null){
                JOptionPane.showMessageDialog(this, "Debe ingresar toda la información",
                    "CEBYCAM-CES", JOptionPane.INFORMATION_MESSAGE);
            }else{
                try{
                    String sql="UPDATE public.enfermeria\n" +
    "   SET nombre=?, direccion=?, telefono=?, cedula=?, sexo=?, \n" +
    "       correo=?, recuperacion=?, fecha_inicio=?\n" +
                    " WHERE codigo="+Integer.parseInt(txtCodigoEnfermeria.getText());

                    try (PreparedStatement ps = con.conectar().prepareStatement(sql)) {
                        ps.setString(1, txtNombreApellido.getText());
                        ps.setString(2, txtDireccion.getText());
                        ps.setString(3, txtTelefono.getText());
                        ps.setString(4, txtCedula.getText());
                        ps.setString(5, txtSexo.getText());
                        ps.setString(6, txtCorreo.getText());
                        ps.setString(7, String.valueOf(pwdPalabraSecreta.getPassword()));
                        ps.setDate(8, new java.sql.Date(jpcFechaInicio.getDate().getTime()));
                        ps.execute();
                        ps.close();
                    } catch (IOException ex) {
                        Logger.getLogger(frmModificarEnfermera.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    txtNombreApellido.setText("");
                    txtDireccion.setText("");
                    txtTelefono.setText("");
                    txtCedula.setText("");
                    txtSexo.setText("");
                    txtCorreo.setText("");
                    txtCodigoEnfermeria.setText("");
                    pwdPalabraSecreta.setText("");
                    txtCategoria.setText("");
                    jpcFechaInicio.setDate(null);
                    JOptionPane.showMessageDialog(rootPane,"Guardado correctamente");

                    txtNombreApellido.setEnabled(false);
                    txtCedula.setEnabled(false);
                    txtSexo.setEnabled(false);
                    txtTelefono.setEnabled(false);
                    txtDireccion.setEnabled(false);
                    txtCorreo.setEnabled(false);
                    pwdPalabraSecreta.setEnabled(false);
                    jpcFechaInicio.setEnabled(false);
                }catch(SQLException | NumberFormatException | HeadlessException x){
                    JOptionPane.showMessageDialog(rootPane, "Debe ingresar datos "+x);
                }finally {
                    con.desconectar();
                }
            }
        }
    }//GEN-LAST:event_btnRegAceptarActionPerformed

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        txtDireccion.setCaretPosition(0);
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        txtDireccion.setCaretPosition(0);
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        txtCorreo.setCaretPosition(0);
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        txtCorreo.setCaretPosition(0);
    }//GEN-LAST:event_txtCorreoFocusLost

    private void tablaEnfermeriaRegistradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEnfermeriaRegistradosMouseClicked
        int selectedRowIndex = tablaEnfermeriaRegistrados.rowAtPoint(evt.getPoint());
        txtNombreApellido.setText(tablaEnfermeriaRegistrados.getValueAt(selectedRowIndex, 0).toString());
        txtDireccion.setText(tablaEnfermeriaRegistrados.getValueAt(selectedRowIndex, 1).toString());
        txtTelefono.setText(tablaEnfermeriaRegistrados.getValueAt(selectedRowIndex, 2).toString());
        txtCedula.setText(tablaEnfermeriaRegistrados.getValueAt(selectedRowIndex, 3).toString());
        txtSexo.setText(tablaEnfermeriaRegistrados.getValueAt(selectedRowIndex, 4).toString());
        txtCorreo.setText(tablaEnfermeriaRegistrados.getValueAt(selectedRowIndex, 5).toString());
        pwdPalabraSecreta.setText(tablaEnfermeriaRegistrados.getValueAt(selectedRowIndex, 6).toString());
        txtCodigoEnfermeria.setText(tablaEnfermeriaRegistrados.getValueAt(selectedRowIndex, 7).toString());
        txtCategoria.setText(tablaEnfermeriaRegistrados.getValueAt(selectedRowIndex, 8).toString());
        jpcFechaInicio.setDate(Date.valueOf(tablaEnfermeriaRegistrados.getValueAt(selectedRowIndex, 9).toString()));
        
        txtNombreApellido.setCaretPosition(0);
        txtDireccion.setCaretPosition(0);
        txtCorreo.setCaretPosition(0);
        
        txtNombreApellido.setEnabled(true);
        txtCedula.setEnabled(true);
        txtSexo.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtCorreo.setEnabled(true);
        pwdPalabraSecreta.setEnabled(true);
        jpcFechaInicio.setEnabled(true);
    }//GEN-LAST:event_tablaEnfermeriaRegistradosMouseClicked

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        btnActualizar.setToolTipText("Actualizar tabla");
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Conexion con = new Conexion();
        try {
            con.conectar();
        } catch (IOException ex) {
            Logger.getLogger(frmModificarEnfermera.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelo.setRowCount( 0 );
        
        try{
            try (ResultSet rs = con.ejecutarQuery("SELECT nombre, direccion, telefono, cedula, sexo, correo, recuperacion, \n" +
                    "       codigo, categoria, fecha_inicio\n" +
                    "  FROM public.enfermeria;")) {
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
            } catch (IOException ex) {
                Logger.getLogger(frmModificarEnfermera.class.getName()).log(Level.SEVERE, null, ex);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Error "+e,
                    "CEBYCAM-CES", JOptionPane.INFORMATION_MESSAGE);
        }finally {
            con.desconectar();
        }
        tablaEnfermeriaRegistrados.setModel(modelo);
        modelo.fireTableDataChanged();
    }//GEN-LAST:event_btnActualizarActionPerformed

    public void filtro() {
        int columnaABuscar = 0;
        if (cmbListar.getSelectedItem().equals("ID Enfermería")) {
            columnaABuscar = 7;
        }
        if (cmbListar.getSelectedItem() == "Nombre") {
            columnaABuscar = 0;
        }
        if (cmbListar.getSelectedItem() == "Cédula") {
            columnaABuscar =3;
        }
        String replace = txtBusqueda.getText();
        replace = replace.replace("e", "(é)");
        trsFiltro.setRowFilter(RowFilter.regexFilter("(?i).*"+replace+".*", columnaABuscar));
        tablaEnfermeriaRegistrados.setRowSorter(trsFiltro);
    }
    
    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        txtBusqueda.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBusqueda.getText());
                txtBusqueda.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tablaEnfermeriaRegistrados.getModel());
        tablaEnfermeriaRegistrados.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char []p={'1','2','3','4','5','6','7','8','9','0'};
        int b=0;
        for(int i=0;i<=9;i++){
            if (p[i]==evt.getKeyChar()){
                b=1;
            }
        }
        if(b==0){
            evt.consume();
        }
        if (txtCedula.getText().length() == 10)  
             evt.consume();
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char []p={'1','2','3','4','5','6','7','8','9','0'};
        int b=0;
        for(int i=0;i<=9;i++){
            if (p[i]==evt.getKeyChar()){
                b=1;
            }
        }
        if(b==0){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreApellidoKeyTyped
        char []p={'1','2','3','4','5','6','7','8','9','0'};
        int b=0;
        for(int i=0;i<=9;i++){
            if (p[i]==evt.getKeyChar()){
                b=1;
            }
        }
        if(b!=0){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreApellidoKeyTyped

    private void txtSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoKeyTyped
        char []p={'1','2','3','4','5','6','7','8','9','0'};
        int b=0;
        for(int i=0;i<=9;i++){
            if (p[i]==evt.getKeyChar()){
                b=1;
            }
        }
        if(b!=0){
            evt.consume();
        }
    }//GEN-LAST:event_txtSexoKeyTyped

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(frmModificarEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmModificarEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmModificarEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmModificarEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmModificarEnfermera().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegAceptar;
    private javax.swing.JComboBox<String> cmbListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jpcFechaInicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField pwdPalabraSecreta;
    private javax.swing.JTable tablaEnfermeriaRegistrados;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCategoria;
    public static javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCodigoEnfermeria;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtNombreApellido;
    public static javax.swing.JTextField txtSexo;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

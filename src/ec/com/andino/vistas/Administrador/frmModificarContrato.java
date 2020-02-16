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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lufeb
 */
public final class frmModificarContrato extends javax.swing.JFrame {
    public static String cedula=null;
    public static int codigo;
    public static String categoria;
    DefaultTableModel modelo;
    TableRowSorter trsFiltro;
    
    /** Creates new form frmInsertarMedico
     * @throws java.sql.SQLException
     * @throws java.io.IOException */
    public frmModificarContrato() throws SQLException, IOException {
        initComponents();
        frmModificarContrato.txtNombreUsuario.setText(cedula);
        frmModificarContrato.txtCodigoAdmin.setText(String.valueOf(codigo));
        frmModificarContrato.txtCategoria.setText(String.valueOf(categoria));
        cargarTabla();
        consultar_tipoContrato();
        setIconImage(new ImageIcon(getClass().getResource("/ec/com/andino/imagenes/icono.png")).getImage());
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(frmModificarContrato.DISPOSE_ON_CLOSE);
        JRootPane boton = SwingUtilities.getRootPane(btnRegContrato); 
        boton.setDefaultButton(btnRegContrato);
        txtCredCodEmpleado.setVisible(false);
        txtTipoContrato.setVisible(false);
        
        jpcCredFechaInicio.setEnabled(false);
        jpcCredFechaFin.setEnabled(false);
        cmbContrato.setEnabled(false);
        txtPaneObservacion.setEnabled(false);
        
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
        txtNombreUsuario = new javax.swing.JTextField();
        txtCodigoAdmin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnRegContrato = new javax.swing.JButton();
        txtCredCodEmpleado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        txtBusquedaEmpleado = new javax.swing.JTextField();
        btnActualizarCredencial = new javax.swing.JButton();
        cmbFiltroEmpleado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jpcCredFechaInicio = new com.toedter.calendar.JDateChooser();
        jpcCredFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        cmbContrato = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtRemuneracion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPaneObservacion = new javax.swing.JTextPane();
        txtTipoContrato = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("HE.ANDINO :: Contrato");
        setResizable(false);

        panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.setPreferredSize(new java.awt.Dimension(300, 230));

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

        txtCategoria.setEditable(false);
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("CONTRATO");

        btnRegContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/guardar_256px-2.png"))); // NOI18N
        btnRegContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegContratoActionPerformed(evt);
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

        cmbFiltroEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Código", "Nombre", "Categoria" }));

        jLabel3.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFiltroEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusquedaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarCredencial, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBusquedaEmpleado)
                        .addComponent(cmbFiltroEmpleado)
                        .addComponent(jLabel3))
                    .addComponent(btnActualizarCredencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel20.setText("Contrato:");

        cmbContrato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbContratoItemStateChanged(evt);
            }
        });

        jLabel21.setText("Remuneración:");

        jLabel16.setText("Fecha Finalización:");

        jLabel13.setText("Fecha Inicio:");

        txtRemuneracion.setEditable(false);
        txtRemuneracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Observacion:");

        jScrollPane2.setViewportView(txtPaneObservacion);

        txtTipoContrato.setEditable(false);
        txtTipoContrato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipoContrato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTipoContratoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel14))
                            .addComponent(jpcCredFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpcCredFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(txtRemuneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCredCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(cmbContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtCodigoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(25, 25, 25)
                                .addComponent(jpcCredFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jpcCredFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRemuneracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCredCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel13)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel16)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel20)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel21)))
                        .addGap(29, 29, 29)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegContrato))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        modelo.addColumn("F.Inicio");
        modelo.addColumn("F.Fin");
        modelo.addColumn("Detalle");
        modelo.addColumn("Contrato");
        modelo.addColumn("Tipo");
        modelo.addColumn("Remuneración");
        
        try{
            rs = con.ejecutarQuery("SELECT \n" +
" empleado.\"idempleado\" as codigo,\n" +
" empleado.\"nombre\",\n" +
" contrato.\"fechainicio\" as \"f.inicio\",\n" +
" contrato.\"fechafin\" as \"f.fin\",\n" +
" contrato.\"detalle\" as observacion,\n" +
" tipocontrato.\"idtipocontrato\" as \"t.Contrato\",\n" +
" tipocontrato.\"tipo\",\n" +
" tipocontrato.\"remuneracion\"\n" +
" FROM public.\"empleado\" empleado INNER JOIN public.\"contrato\" contrato ON\n" +
" empleado.\"idempleado\"=contrato.\"idempleado\" INNER JOIN public.\"tipocontrato\" tipocontrato ON\n" +
" contrato.\"idtipocontrato\"=tipocontrato.\"idtipocontrato\";");
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
                    "HE.ANDINO", JOptionPane.INFORMATION_MESSAGE);
        }finally {
            con.desconectar();
            rs.close();
        }
        tablaEmpleados.setModel(modelo);
        modelo.fireTableDataChanged();
        
        
        tablaEmpleados.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaEmpleados.getColumnModel().getColumn(0).setMinWidth(0);
        tablaEmpleados.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tablaEmpleados.getColumnModel().getColumn(5).setMaxWidth(0);
        tablaEmpleados.getColumnModel().getColumn(5).setMinWidth(0);
        tablaEmpleados.getColumnModel().getColumn(5).setPreferredWidth(0);
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
    
    public void consultar_tipoContrato() throws SQLException, IOException{
        Conexion con= new Conexion();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT tipo\n" +
"	FROM public.tipocontrato order by tipo asc";
        try {
           pst=con.conectar().prepareStatement(sql);
           rs = pst.executeQuery();
           cmbContrato.addItem("Seleccione");
           while(rs.next()){
               cmbContrato.addItem(rs.getString("tipo"));
           }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener los datos",
                    "HE.ANDINO", JOptionPane.ERROR_MESSAGE);
        }finally{
            con.desconectar();
            rs.close();
        }
    }
       
    private void btnActualizarCredencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCredencialActionPerformed
        Conexion con = new Conexion();
        try {
            con.conectar();
        } catch (IOException ex) {
            Logger.getLogger(frmModificarContrato.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
        modelo.setRowCount( 0 );
        try{
            rs = con.ejecutarQuery("SELECT \n" +
" empleado.\"idempleado\" as codigo,\n" +
" empleado.\"nombre\",\n" +
" contrato.\"fechainicio\" as \"f.inicio\",\n" +
" contrato.\"fechafin\" as \"f.fin\",\n" +
" contrato.\"detalle\" as observacion,\n" +
" tipocontrato.\"idtipocontrato\" as \"t.Contrato\",\n" +
" tipocontrato.\"tipo\",\n" +
" tipocontrato.\"remuneracion\"\n" +
" FROM public.\"empleado\" empleado INNER JOIN public.\"contrato\" contrato ON\n" +
" empleado.\"idempleado\"=contrato.\"idempleado\" INNER JOIN public.\"tipocontrato\" tipocontrato ON\n" +
" contrato.\"idtipocontrato\"=tipocontrato.\"idtipocontrato\";");
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
                    "HE.ANDINO", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(frmModificarContrato.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            con.desconectar();
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(frmModificarContrato.class.getName()).log(Level.SEVERE, null, ex);
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
        jpcCredFechaInicio.setDate(Date.valueOf(tablaEmpleados.getValueAt(selectedRowIndex, 2).toString()));
        jpcCredFechaFin.setDate(Date.valueOf(tablaEmpleados.getValueAt(selectedRowIndex, 3).toString()));
        txtPaneObservacion.setText(tablaEmpleados.getValueAt(selectedRowIndex, 4).toString());
        txtTipoContrato.setText(tablaEmpleados.getValueAt(selectedRowIndex, 5).toString());
        txtRemuneracion.setText(tablaEmpleados.getValueAt(selectedRowIndex, 7).toString());
        
        jpcCredFechaInicio.setEnabled(true);
        jpcCredFechaFin.setEnabled(true);
        cmbContrato.setEnabled(true);
        txtPaneObservacion.setEnabled(true);
    }//GEN-LAST:event_tablaEmpleadosMouseClicked

    private void btnRegContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegContratoActionPerformed
        Conexion con= new Conexion();
        try {
            con.conectar();
        } catch (IOException ex) {
            Logger.getLogger(frmModificarContrato.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (JOptionPane.showConfirmDialog(null, "¿Esta usted seguro?", "HE.ANDINO",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(jpcCredFechaInicio.getDate()==null||jpcCredFechaFin.getDate()==null
                    ||txtTipoContrato.getText().equals("")||txtRemuneracion.getText().equals("")
                    ||txtCredCodEmpleado.getText().equals("")||txtPaneObservacion.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Debe ingresar toda la información",
                    "HE.ANDINO", JOptionPane.INFORMATION_MESSAGE);
            }else{
                try{
                    String insertarCategoria="UPDATE public.contrato\n" +
"	SET fechainicio=?, fechafin=?, detalle=?, idtipocontrato=?\n" +
"	WHERE idempleado=?;";
                    try (PreparedStatement ps = con.conectar().prepareStatement(insertarCategoria)) {
                        ps.setDate(1, new java.sql.Date(jpcCredFechaInicio.getDate().getTime()));
                        ps.setDate(2, new java.sql.Date(jpcCredFechaFin.getDate().getTime()));
                        ps.setString(3, txtPaneObservacion.getText());
                        ps.setInt(4, Integer.parseInt(txtTipoContrato.getText()));
                        ps.setInt(5, Integer.parseInt(txtCredCodEmpleado.getText()));

                        ps.execute();
                        ps.close();
                    } catch (IOException ex) {
                        Logger.getLogger(frmModificarContrato.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }catch(SQLException | NumberFormatException | HeadlessException x){
                    JOptionPane.showMessageDialog(rootPane, "Error al guardar la información "+x);
                }finally {
                    con.desconectar();
                }
                jpcCredFechaInicio.setDate(null);
                jpcCredFechaFin.setDate(null);
                txtRemuneracion.setText("");
                txtCredCodEmpleado.setText("");
                txtPaneObservacion.setText("");
                cmbContrato.setSelectedItem("Seleccione");
                txtTipoContrato.setText("");
                JOptionPane.showMessageDialog(rootPane,"Guardado correctamente");
                jpcCredFechaInicio.setEnabled(false);
                jpcCredFechaFin.setEnabled(false);
                txtRemuneracion.setEnabled(false);
                txtCredCodEmpleado.setEnabled(false);
                txtPaneObservacion.setEnabled(false);
                cmbContrato.setEnabled(false);
                txtTipoContrato.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnRegContratoActionPerformed

    private void cmbContratoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbContratoItemStateChanged
        Conexion con= new Conexion();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT idtipocontrato, remuneracion\n" +
"	FROM public.tipocontrato WHERE tipo='"+cmbContrato.getSelectedItem()+"'";
        try {
           pst=con.conectar().prepareStatement(sql);
           rs = pst.executeQuery();
           while(rs.next()){
               txtTipoContrato.setText(rs.getString("idtipocontrato"));
               txtRemuneracion.setText(rs.getString("remuneracion"));
           }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener los datos",
                    "HE.ANDINO", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(frmModificarContrato.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.desconectar();
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(frmModificarContrato.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmbContratoItemStateChanged

    private void txtTipoContratoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTipoContratoFocusLost
        txtTipoContrato.setCaretPosition(0);
    }//GEN-LAST:event_txtTipoContratoFocusLost

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
    private javax.swing.JButton btnRegContrato;
    private javax.swing.JComboBox<String> cmbContrato;
    private javax.swing.JComboBox<String> cmbFiltroEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jpcCredFechaFin;
    private com.toedter.calendar.JDateChooser jpcCredFechaInicio;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtBusquedaEmpleado;
    public static javax.swing.JTextField txtCategoria;
    public static javax.swing.JTextField txtCodigoAdmin;
    private javax.swing.JTextField txtCredCodEmpleado;
    public static javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextPane txtPaneObservacion;
    private javax.swing.JTextField txtRemuneracion;
    private javax.swing.JTextField txtTipoContrato;
    // End of variables declaration//GEN-END:variables

}

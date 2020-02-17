/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.andino.vistas.Administrador;
import ec.com.andino.accesodatos.Conexion;
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author lufeb
 */
public final class frmAdminPaciente extends javax.swing.JFrame {
    public static String cedula=null;
    public static int codigo;
    public static String categoria;
    DefaultTableModel modelo;
    TableRowSorter trsFiltro;
    
    /** Creates new form frmInsertarMedico
     * @throws java.sql.SQLException
     * @throws java.io.IOException */
    public frmAdminPaciente() throws SQLException, IOException {
        initComponents();
        frmAdminPaciente.txtNombreUsuario.setText(cedula);
        frmAdminPaciente.txtCodigoAdmin.setText(String.valueOf(codigo));
        frmAdminPaciente.txtCategoria.setText(String.valueOf(categoria));
        setIconImage(new ImageIcon(getClass().getResource("/ec/com/andino/imagenes/icono.png")).getImage());
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(frmAdminPaciente.DISPOSE_ON_CLOSE);
        JRootPane boton = SwingUtilities.getRootPane(btnRegEmpleado); 
        boton.setDefaultButton(btnRegEmpleado);
        txtCedulaPac.setCaretPosition(0);
        txtDirPac.setCaretPosition(0);
        txtCorreoPac.setCaretPosition(0);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedulaPac = new javax.swing.JTextField();
        txtApellidoPac = new javax.swing.JTextField();
        txtTelPac = new javax.swing.JTextField();
        btnRegEmpleado = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtDirPac = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtCodigoAdmin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtNombrePac = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEdadPac = new javax.swing.JTextField();
        cmbTipoSangrePac = new javax.swing.JComboBox<>();
        cmbEstCivilPac = new javax.swing.JComboBox<>();
        txtProfesionPac = new javax.swing.JTextField();
        txtRucPac = new javax.swing.JTextField();
        cmbSexoPac = new javax.swing.JComboBox<>();
        txtCorreoPac = new javax.swing.JTextField();
        jdcNacPac = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HU.ANDINO :: Nuevo Paciente");
        setResizable(false);

        panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.setPreferredSize(new java.awt.Dimension(300, 230));

        jLabel3.setText("Cédula:");

        jLabel4.setText("Apellido");

        jLabel5.setText("Sexo:");

        jLabel7.setText("Correo:");

        txtCedulaPac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCedulaPacFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaPacFocusLost(evt);
            }
        });
        txtCedulaPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaPacKeyTyped(evt);
            }
        });

        txtApellidoPac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoPacFocusGained(evt);
            }
        });
        txtApellidoPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPacKeyTyped(evt);
            }
        });

        txtTelPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelPacKeyTyped(evt);
            }
        });

        btnRegEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/andino/imagenes/guardar_256px-2.png"))); // NOI18N
        btnRegEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEmpleadoActionPerformed(evt);
            }
        });

        jLabel10.setText("Dirección:");

        txtDirPac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDirPacFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDirPacFocusLost(evt);
            }
        });

        jLabel1.setText("Teléfono:");

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

        txtNombrePac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePacKeyTyped(evt);
            }
        });

        jLabel6.setText("Nombre:");

        Tipo.setText("Edad:");

        jLabel8.setText("F. Nacimiento:");

        jLabel11.setText("T. Sangre:");

        jLabel12.setText("E. Civil:");

        jLabel13.setText("Profesión:");

        jLabel14.setText("RUC:");

        txtEdadPac.setEditable(false);
        txtEdadPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdadPac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEdadPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadPacKeyTyped(evt);
            }
        });

        cmbTipoSangrePac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-" }));

        cmbEstCivilPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a" }));

        txtRucPac.setEditable(false);
        txtRucPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucPacKeyTyped(evt);
            }
        });

        cmbSexoPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino" }));

        txtCorreoPac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoPacFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(btnRegEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10))
                                .addGap(37, 37, 37)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDirPac, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoPac, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombrePac, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCedulaPac, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tipo)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCorreoPac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(txtTelPac, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(cmbSexoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))))
                        .addGap(25, 25, 25)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRucPac, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEstCivilPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipoSangrePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdadPac, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProfesionPac, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcNacPac, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(txtCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedulaPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Tipo)
                    .addComponent(txtEdadPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombrePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8))
                    .addComponent(jdcNacPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(cmbTipoSangrePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(cmbEstCivilPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(txtProfesionPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSexoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtRucPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCorreoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnRegEmpleado)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculaEdad() {
        Calendar fechaActual = new GregorianCalendar();
        int anio = fechaActual.get(Calendar.YEAR)-jdcNacPac.getCalendar().get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH)-jdcNacPac.getCalendar().get(Calendar.MONTH);
        int dia = fechaActual.get(Calendar.DATE)-jdcNacPac.getCalendar().get(Calendar.DATE);
        
        if(mes<0 ||(mes==0 && dia<0)){
            anio--;
            txtEdadPac.setText(String.valueOf(anio));
            int valor = Integer.parseInt(txtEdadPac.getText());
            if(valor<0){
                JOptionPane.showMessageDialog(this, "Ingrese la fecha de nacimiento correcta",
                    "HU.ANDINO", JOptionPane.ERROR_MESSAGE);
                txtEdadPac.setText("");
                jdcNacPac.setDate(null);
            }
        }else{
            txtEdadPac.setText(String.valueOf(anio));
        }
    }
    
    private void txtDirPacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDirPacFocusLost
        txtDirPac.setCaretPosition(0);
    }//GEN-LAST:event_txtDirPacFocusLost

    private void txtDirPacFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDirPacFocusGained
        txtDirPac.setCaretPosition(0);
    }//GEN-LAST:event_txtDirPacFocusGained

    private void btnRegEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEmpleadoActionPerformed
        Conexion con= new Conexion();
        try {
            con.conectar();
        } catch (IOException ex) {
            Logger.getLogger(frmAdminPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (JOptionPane.showConfirmDialog(null, "¿Esta usted seguro?", "HU.ANDINO",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(txtCedulaPac.getText().equals("")||txtNombrePac.getText().equals("")||txtApellidoPac.getText().equals("")||txtDirPac.getText().equals("")||
                cmbSexoPac.getSelectedItem().equals("Seleccione")||txtTelPac.getText().equals("")||txtCorreoPac.getText().equals("")
                ||txtEdadPac.getText().equals("")
                ||jdcNacPac.getDate()==null||cmbTipoSangrePac.getSelectedItem().equals("Seleccione")||
                    cmbEstCivilPac.getSelectedItem().equals("Seleccione")||txtProfesionPac.getText().equals("")
                    ||txtRucPac.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Debe ingresar toda la información",
                    "HU.ANDINO", JOptionPane.INFORMATION_MESSAGE);
            }else{
                try{
                    String insertarCategoria="INSERT INTO public.paciente(\n" +
"	cedula, nombre, apellido, direccion, sexo, telefono, correo, edad, fechanacimiento, tiposangre, estadocivil, profesion, ruc)\n" +
"	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
                    try (PreparedStatement ps = con.conectar().prepareStatement(insertarCategoria)) {
                        ps.setString(1, txtCedulaPac.getText());
                        ps.setString(2, txtNombrePac.getText());
                        ps.setString(3, txtApellidoPac.getText());
                        ps.setString(4, txtDirPac.getText());
                        ps.setString(5, cmbSexoPac.getSelectedItem().toString());
                        ps.setString(6, txtTelPac.getText());
                        ps.setString(7, txtCorreoPac.getText());
                        ps.setInt(8, Integer.parseInt(txtEdadPac.getText()));
                        ps.setDate(9, new java.sql.Date(jdcNacPac.getDate().getTime()));
                        ps.setString(10, cmbTipoSangrePac.getSelectedItem().toString());
                        ps.setString(11, cmbEstCivilPac.getSelectedItem().toString());
                        ps.setString(12, txtProfesionPac.getText());
                        ps.setString(13, txtRucPac.getText());

                        ps.execute();
                        ps.close();
                    } catch (IOException ex) {
                        Logger.getLogger(frmAdminPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }catch(SQLException | NumberFormatException | HeadlessException x){
                    JOptionPane.showMessageDialog(rootPane, "Error al guardar la información "+x);
                }finally {
                    con.desconectar();
                }

                txtCedulaPac.setText("");
                txtNombrePac.setText("");
                txtApellidoPac.setText("");
                txtDirPac.setText("");
                cmbSexoPac.setSelectedItem("Seleccione");
                txtTelPac.setText("");
                txtCorreoPac.setText("");
                txtEdadPac.setText("");
                jdcNacPac.setDate(null);
                cmbTipoSangrePac.setSelectedItem("Seleccione");
                cmbEstCivilPac.setSelectedItem("Seleccione");
                txtProfesionPac.setText("");
                txtRucPac.setText("");

                JOptionPane.showMessageDialog(rootPane,"Guardado correctamente");

            }
        }
    }//GEN-LAST:event_btnRegEmpleadoActionPerformed

    private void txtTelPacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelPacKeyTyped
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
        if (txtTelPac.getText().length() == 10)
        evt.consume();
    }//GEN-LAST:event_txtTelPacKeyTyped

    private void txtApellidoPacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPacKeyTyped
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
    }//GEN-LAST:event_txtApellidoPacKeyTyped

    private void txtCedulaPacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaPacKeyTyped
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
        if (txtCedulaPac.getText().length() == 10)
        evt.consume();
    }//GEN-LAST:event_txtCedulaPacKeyTyped

    private void txtCedulaPacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaPacFocusLost
        txtCedulaPac.setCaretPosition(0);
        String ruc = txtCedulaPac.getText()+"001";
        txtRucPac.setText(ruc);
    }//GEN-LAST:event_txtCedulaPacFocusLost

    private void txtCedulaPacFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaPacFocusGained
        txtCedulaPac.setCaretPosition(0);
    }//GEN-LAST:event_txtCedulaPacFocusGained

    private void txtNombrePacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePacKeyTyped
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
    }//GEN-LAST:event_txtNombrePacKeyTyped

    private void txtEdadPacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadPacKeyTyped
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
    }//GEN-LAST:event_txtEdadPacKeyTyped

    private void txtRucPacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucPacKeyTyped
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
        if (txtRucPac.getText().length() == 13)
        evt.consume();
    }//GEN-LAST:event_txtRucPacKeyTyped

    private void txtCorreoPacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoPacFocusLost
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(txtCorreoPac.getText());
        if (mather.find() != true) {
            JOptionPane.showMessageDialog(this, "El correo ingresado es inválido",
                "HU.ANDINO", JOptionPane.ERROR_MESSAGE);
            txtCorreoPac.setText("");
            txtCorreoPac.requestFocus();
        } 
    }//GEN-LAST:event_txtCorreoPacFocusLost

    private void txtApellidoPacFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoPacFocusGained
        calculaEdad();
    }//GEN-LAST:event_txtApellidoPacFocusGained
     
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
    private javax.swing.JLabel Tipo;
    private javax.swing.JButton btnRegEmpleado;
    private javax.swing.JComboBox<String> cmbEstCivilPac;
    private javax.swing.JComboBox<String> cmbSexoPac;
    private javax.swing.JComboBox<String> cmbTipoSangrePac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdcNacPac;
    private javax.swing.JPanel panel1;
    public static javax.swing.JTextField txtApellidoPac;
    public static javax.swing.JTextField txtCategoria;
    public static javax.swing.JTextField txtCedulaPac;
    public static javax.swing.JTextField txtCodigoAdmin;
    private javax.swing.JTextField txtCorreoPac;
    public static javax.swing.JTextField txtDirPac;
    private javax.swing.JTextField txtEdadPac;
    private javax.swing.JTextField txtNombrePac;
    public static javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtProfesionPac;
    private javax.swing.JTextField txtRucPac;
    public static javax.swing.JTextField txtTelPac;
    // End of variables declaration//GEN-END:variables

}

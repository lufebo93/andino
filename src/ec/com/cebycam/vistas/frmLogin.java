/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.cebycam.vistas;

import ec.com.cebycam.vistas.Administrador.frmAdministrador;
import ec.com.cebycam.accesodatos.Conexion;
import ec.com.cebycam.dao.impl.LoginImp;
import ec.com.cebycam.vistas.Administrador.frmAdminContrato;
import ec.com.cebycam.vistas.Administrador.frmAdminPaciente;
import ec.com.cebycam.vistas.Administrador.frmAdminUsuario;
import ec.com.cebycam.vistas.Administrador.frmModificarContrato;
import ec.com.cebycam.vistas.Administrador.frmModificarEmpleado;
import ec.com.cebycam.vistas.Administrador.frmModificarPaciente;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author lufeb
 */
public final class frmLogin extends javax.swing.JFrame {
    JProgressBar pb;
        
    /**
     * Creates new form frmLogin
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     */
    
    public frmLogin() throws SQLException, IOException {
        initComponents();
        consultar_tipoEmpleado();
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(frmLogin.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/ec/com/cebycam/imagenes/icono.png")).getImage());
        SwingUtilities.getRootPane(btnLoginAceptar).setDefaultButton(btnLoginAceptar);
        lblImagen.setIcon(new ImageIcon(getClass().getResource("/ec/com/cebycam/imagenes/login.png")));
        
    }
    
    public void consultar_tipoEmpleado() throws SQLException, IOException{
        Conexion con= new Conexion();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT tipo FROM public.categoriaempleado order by tipo asc";
        try {
           pst=con.conectar().prepareStatement(sql);
           rs = pst.executeQuery();
           cmbTipo.addItem("Seleccione una opción");
           while(rs.next()){
               cmbTipo.addItem(rs.getString("tipo"));
           }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener los datos",
                    "CEBYCAM-CES", JOptionPane.ERROR_MESSAGE);
        }finally{
            con.desconectar();
            rs.close();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnCambiarPass = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLoginUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pwdfieldLoginCodigo = new javax.swing.JPasswordField();
        btnLoginAceptar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();

        jPopupMenu1.add(jSeparator1);

        setTitle("CEBYCAM-CES :: Acceso");
        setIconImage(new ImageIcon(getClass().getResource("/ec/com/cebycam/imagenes/icono.png")).getImage());
        setResizable(false);

        btnCambiarPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/com/cebycam/imagenes/clave_256px-0.png")));
        btnCambiarPass.setText("¿Olvidó su clave?");
        btnCambiarPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCambiarPassMouseEntered(evt);
            }
        });
        btnCambiarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarPassActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("USUARIO:");

        txtLoginUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLoginUsuarioKeyTyped(evt);
            }
        });

        jLabel2.setText("CLAVE:");

        btnLoginAceptar.setText("ACEPTAR");
        btnLoginAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAceptarActionPerformed(evt);
            }
        });

        lblImagen.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblImagen.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel3.setText("TIPO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(pwdfieldLoginCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLoginUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnLoginAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pwdfieldLoginCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(btnLoginAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnCambiarPass)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCambiarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnLoginAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAceptarActionPerformed
        LoginImp login = new LoginImp();
        String txtPass=String.valueOf(pwdfieldLoginCodigo.getPassword());
        Conexion con= new Conexion();
        Statement st = null;
        ResultSet rs = null;
        try {
            con.conectar();
        } catch (IOException ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(txtLoginUsuario.getText().equals("")||txtPass.equals("")||cmbTipo.getSelectedItem().equals("Seleccione una opción")){
                JOptionPane.showMessageDialog(this, "Debe ingresar toda la información",
                        "CEBYCAM-CES", JOptionPane.INFORMATION_MESSAGE);
        }else{
            try {
                if(login.LoginUsuario()==1){
                    try{
                        String usuario=txtLoginUsuario.getText();
                        String sql ="SELECT \n" +
"empleado.\"nombre\", \n" +
"empleado.\"idempleado\" as codigo, \n" +
"categoria.\"tipo\"\n" +
"FROM public.\"empleado\" empleado inner join public.\"categoriaempleado\" categoria\n" +
"on empleado.\"idempleado\"=categoria.\"idcategoriaempleado\" inner join\n" +
"public.\"usuario\" usuario on empleado.\"idempleado\"=usuario.\"idempleado\"\n" +
"where usuario.\"usuario\"='"+usuario+"'";
                        st=con.conectar().createStatement();
                        rs=st.executeQuery(sql);
                        if(rs.next()){
                            String nombre=rs.getString(1);
                            int codigo=rs.getInt(2);
                            String tipo=rs.getString(3);
                            
                                if("Administrador".equals(tipo)){
                                    frmAdministrador.cedula=nombre;
                                    frmAdministrador.codigo=codigo;
                                    frmAdministrador.categoria=tipo;
                                    
                                    frmAdminPaciente.cedula=nombre;
                                    frmAdminPaciente.codigo=codigo;
                                    frmAdminPaciente.categoria=tipo;
                                    
                                    frmAdminUsuario.cedula=nombre;
                                    frmAdminUsuario.codigo=codigo;
                                    frmAdminUsuario.categoria=tipo;
                                    
                                    frmAdminContrato.cedula=nombre;
                                    frmAdminContrato.codigo=codigo;
                                    frmAdminContrato.categoria=tipo;
                                    
                                    frmModificarEmpleado.cedula=nombre;
                                    frmModificarEmpleado.codigo=codigo;
                                    frmModificarEmpleado.categoria=tipo;
                                    
                                    frmModificarPaciente.cedula=nombre;
                                    frmModificarPaciente.codigo=codigo;
                                    frmModificarPaciente.categoria=tipo;
                                    
                                    frmModificarContrato.cedula=nombre;
                                    frmModificarContrato.codigo=codigo;
                                    frmModificarContrato.categoria=tipo;

                                    this.dispose();
                                     JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
                            + "satisfactoriamente al sistema", "Mensaje de bienvenida",
                            JOptionPane.INFORMATION_MESSAGE);
                    frmAdministrador frm = new frmAdministrador();          
                    frm.setVisible(true);
                                }
                        }else{
                            JOptionPane.showMessageDialog(null, "Error al ingresar al sistema "
                            , "Mensaje de error",
                            JOptionPane.ERROR_MESSAGE);
                        }                        
                    }catch(SQLException e){
                        
                    }finally {
                        con.desconectar();
                        try {
                            rs.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            st.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                                    + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
                                    JOptionPane.ERROR_MESSAGE);
                            txtLoginUsuario.setText("");
                            pwdfieldLoginCodigo.setText("");
                            txtLoginUsuario.requestFocus();
                            cmbTipo.setSelectedItem("Seleccione una opción");
                }
            }  catch (IOException | SQLException ex) {
                Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLoginAceptarActionPerformed
    
    private void btnCambiarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarPassActionPerformed
        JOptionPane.showMessageDialog(this, "Recuerde, el sistema se cerrará \n    luego de cambiar la clave!",
                                "CEBYCAM-CES", JOptionPane.INFORMATION_MESSAGE);
        frmCambiarClave frm = new frmCambiarClave();
        frm.setVisible(true);
    }//GEN-LAST:event_btnCambiarPassActionPerformed

    private void btnCambiarPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarPassMouseEntered
        btnCambiarPass.setToolTipText("¿Olvidaste la contraseña?"); 
    }//GEN-LAST:event_btnCambiarPassMouseEntered

    private void txtLoginUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginUsuarioKeyTyped
//        char []p={'1','2','3','4','5','6','7','8','9','0'};
//        int b=0;
//        for(int i=0;i<=9;i++){
//            if (p[i]==evt.getKeyChar()){
//                b=1;
//            }
//        }
//        if(b==0){
//            evt.consume();
//        }
//        if (txtLoginUsuario.getText().length() == 10)  
//             evt.consume();
    }//GEN-LAST:event_txtLoginUsuarioKeyTyped
        
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmLogin().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarPass;
    public static javax.swing.JButton btnLoginAceptar;
    public static javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblImagen;
    public static javax.swing.JPasswordField pwdfieldLoginCodigo;
    public static javax.swing.JTextField txtLoginUsuario;
    // End of variables declaration//GEN-END:variables
}

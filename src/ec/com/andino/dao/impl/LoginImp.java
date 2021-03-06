/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.andino.dao.impl;

import ec.com.andino.accesodatos.Conexion;
import ec.com.andino.vistas.frmLogin;
import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lufeb
 */
public class LoginImp {
    Conexion con = new Conexion();
    Statement st;
    ResultSet rs;
    
    public int LoginUsuario() throws SQLException, IOException{
        String usuario = frmLogin.txtLoginUsuario.getText();
        String clave = String.valueOf(frmLogin.pwdfieldLoginCodigo.getPassword());
        String tipo = frmLogin.cmbTipo.getSelectedItem().toString();
        int resultado=0;
    
        String sql="SELECT \n" +
"usuario.\"usuario\", \n" +
"usuario.\"clave\", \n" +
"categoriaempleado.\"tipo\"\n" +
"FROM public.\"usuario\" usuario inner join public.\"empleado\" empleado \n" +
"on  usuario.\"idempleado\"=empleado.\"idempleado\" \n" +
"inner join public.\"categoriaempleado\" categoriaempleado \n" +
"on empleado.\"idcategoriaempleado\"=categoriaempleado.\"idcategoriaempleado\" \n" +
"where usuario.\"usuario\"='"+usuario+"' AND usuario.\"clave\"='"+clave+"' AND categoriaempleado.\"tipo\"='"+tipo+"'";
        
        try {
            st = con.conectar().createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                resultado=1;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }finally {
            con.desconectar();
            rs.close();
            st.close();
        }
        return resultado;
    }
}

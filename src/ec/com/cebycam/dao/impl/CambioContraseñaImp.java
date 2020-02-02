/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.cebycam.dao.impl;

import ec.com.cebycam.accesodatos.*;
import ec.com.cebycam.vistas.frmCambiarClave;
import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lufeb
 */

public class CambioContraseñaImp{
    Conexion con = new Conexion();
    Statement st;
    ResultSet rs;
    public int CambioContraseñaImp() throws SQLException, IOException{
        String usuario = frmCambiarClave.txtUsuario.getText();
        String recuperacion = String.valueOf(frmCambiarClave.txtRecuperacion.getPassword());
        int resultado=0;
        String sql="SELECT \n" +
"usuario.\"usuario\", \n" +
"usuario.\"recuperacion\"\n" +
"FROM public.\"empleado\" empleado inner join public.\"categoriaempleado\" categoria\n" +
"on empleado.\"idempleado\"=categoria.\"idcategoriaempleado\" inner join\n" +
"public.\"usuario\" usuario on empleado.\"idempleado\"=usuario.\"idempleado\"\n" +
"where usuario.\"usuario\"='"+usuario+"' AND usuario.\"recuperacion\"='"+recuperacion+"'";
        try{
            st = con.conectar().createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                resultado=1;
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }finally {
            con.desconectar();
            rs.close();
            st.close();
        }
        return resultado;
    }
    
    public int CambioContraseñaImpAdmin() throws SQLException, IOException{
        String usuario = frmCambiarClave.txtUsuario.getText();
        String recuperacion = String.valueOf(frmCambiarClave.txtRecuperacion.getPassword());
        int resultado=0;
        String sql="SELECT cedula, recuperacion FROM public.administrador WHERE cedula='"+usuario+"' AND recuperacion='"+recuperacion+"'";
        try{
            st = con.conectar().createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                resultado=1;
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }finally {
            con.desconectar();
            rs.close();
            st.close();
        }
        return resultado;
    }
    
    public int CambioContraseñaImpEnfermeria() throws SQLException, IOException{
        String usuario = frmCambiarClave.txtUsuario.getText();
        String recuperacion = String.valueOf(frmCambiarClave.txtRecuperacion.getPassword());
        int resultado=0;
        String sql="SELECT cedula, recuperacion FROM public.enfermeria WHERE cedula='"+usuario+"' AND recuperacion='"+recuperacion+"'";
        try{
            st = con.conectar().createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                resultado=1;
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }finally {
            con.desconectar();
            rs.close();
            st.close();
        }
        return resultado;
    }
}

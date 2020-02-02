/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.cebycam.dao.impl;
import ec.com.cebycam.accesodatos.*;
import ec.com.cebycam.vistas.Medico.frmReceta;
import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author lufeb
 */
public class RecetaImp {
    Conexion con = new Conexion();
    Statement st;
    ResultSet rs;
    
    public int Check() throws SQLException, IOException{
        String atencion = frmReceta.txtAtencion.getText();
        int resultado=0;
    
        String sql="SELECT rp, atencion, cita FROM public.receta WHERE atencion='"+atencion+"'";
        
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

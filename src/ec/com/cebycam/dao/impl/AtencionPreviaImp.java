/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.cebycam.dao.impl;

import ec.com.cebycam.accesodatos.Conexion;
import ec.com.cebycam.rnegocio.entidades.AtencionPrevia;
import java.sql.*;
import java.util.*;

/**
 *
 * @author lufeb
 */
public class AtencionPreviaImp{
    
    public List<AtencionPrevia> obtener() throws Exception{
        List<AtencionPrevia> lista = new ArrayList<>();
        ResultSet rst = null;
        String sql = "SELECT \n" +
"  historia_clinica.\"codigo\",\n" +
"  historia_clinica.\"paciente\", \n" +
"  atencion.\"fecha\", \n" +
"  atencion.\"indicaciones\",\n" +
"  atencion.\"prescripcion\",\n" +
"  atencion.\"diagnostico\",\n" +
"  medico.\"nombre\",\n" +
"  medico.\"especialidad\", \n" +
"  historia_clinica.\"categoria\"\n" +                 
"FROM \n" +
"  public.\"historia clinica\" historia_clinica inner join public.\"atencion\" atencion on historia_clinica.\"codigo\"=atencion.\"historia clinica\" \n" +
"  inner join public.\"medico\" medico on atencion.\"medico\"=medico.\"codigo\";";
        Conexion con = new Conexion();
        con.conectar();
        try{
            rst = con.ejecutarQuery(sql);
            while (rst.next()){
                AtencionPrevia atencion = new AtencionPrevia();
                atencion.setCodigo(rst.getInt(1));
                atencion.setPaciente(rst.getString(2));
                atencion.setFecha(rst.getDate(3));
                atencion.setIndicaciones(rst.getString(4));
                atencion.setPrescripcion(rst.getString(5));
                atencion.setDiagnostico(rst.getString(6));
                atencion.setMedico(rst.getString(7));
                atencion.setEspecialidad(rst.getString(8));
                atencion.setCategoria(rst.getString(9));
                lista.add(atencion);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            con.desconectar();
            rst.close();
        }
        return lista;
    }
}

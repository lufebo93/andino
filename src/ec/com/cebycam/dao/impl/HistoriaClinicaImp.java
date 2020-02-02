/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.cebycam.dao.impl;
import ec.com.cebycam.rnegocio.entidades.HistoriaClinica;
import ec.com.cebycam.dao.contrato.IHistoriaClinica;
import ec.com.cebycam.accesodatos.*;
import java.sql.*;
import java.util.*;
/**
 *
 * @author lufeb
 */
public class HistoriaClinicaImp implements IHistoriaClinica{
    @Override
    public List<HistoriaClinica> obtener() throws Exception {
        List<HistoriaClinica> lista = new ArrayList<>();
        ResultSet rst = null;
        String sql = "SELECT codigo, paciente, cedula, telefono, edad, sexo, direccion, \n" +
"       \"fecha de nacimiento\", mail, estatura, peso, ocupacion, foto, enfermero, categoria FROM public.\"historia clinica\";";
        Conexion con = new Conexion();
        con.conectar();
        try {
            rst = con.ejecutarQuery(sql);
            while (rst.next()) {
                HistoriaClinica historia = new HistoriaClinica();
                historia.setCodigo(rst.getInt(1));
                historia.setPaciente(rst.getString(2));
                historia.setCedula(rst.getString(3));
                historia.setTelefono(rst.getString(4));
                historia.setEdad(rst.getInt(5));
                historia.setSexo(rst.getString(6));
                historia.setDireccion(rst.getString(7));
                historia.setFecha_nacimiento(rst.getDate(8));
                historia.setMail(rst.getString(9));
                historia.setEstatura(rst.getDouble(10));
                historia.setPeso(rst.getDouble(11));
                historia.setOcupacion(rst.getString(12));
                historia.setImagen(rst.getBytes(13));
                historia.setEnfermero(rst.getInt(14));
                historia.setCategoria(rst.getString(15));
                lista.add(historia);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.cebycam.dao.impl;

import ec.com.cebycam.accesodatos.*;
import ec.com.cebycam.dao.contrato.IMedicos;
import ec.com.cebycam.rnegocio.entidades.Medicos;
import java.sql.*;
import java.util.*;

/**
 *
 * @author lufeb
 */
public class MedicosImp implements IMedicos{
    @Override
    public List<Medicos> obtener() throws Exception {
        List<Medicos> lista = new ArrayList<>();
        ResultSet rst=null;
        String sql = "SELECT nombre, especialidad, direccion, telefono, cedula, sexo, clave, correo, recuperacion, codigo,"
                + " categoria, activo, fecha_inicio FROM public.medico where activo='SI'";
        Conexion con = new Conexion();
        con.conectar();
        try {
            rst = con.ejecutarQuery(sql);
            while (rst.next()) {
                Medicos medico = new Medicos();
                medico.setNombre(rst.getString(1));
                medico.setEspecialidad(rst.getString(2));
                medico.setDireccion(rst.getString(3));
                medico.setTelefono(rst.getString(4));
                medico.setCedula(rst.getString(5));
                medico.setSexo(rst.getString(6));
                medico.setClave(rst.getString(7));
                medico.setCorreo(rst.getString(8));
                medico.setRecuperacion(rst.getString(9));
                medico.setCodigo(rst.getInt(10));
                medico.setCategoria(rst.getString(11));
                medico.setActivo(rst.getString(12));
                medico.setFecha_inicio(rst.getDate(13));
                lista.add(medico);
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

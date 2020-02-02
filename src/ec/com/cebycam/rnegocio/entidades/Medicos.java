/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.cebycam.rnegocio.entidades;

import java.sql.Date;

/**
 *
 * @author lufeb
 */
public class Medicos {
    private String nombre;
    private String especialidad;
    private String direccion;
    private String telefono;
    private String cedula;
    private String sexo;
    private String clave;
    private String correo;
    private String recuperacion;
    private int codigo;
    private String categoria;
    private String activo;
    private Date fecha_inicio;

    public Medicos() {
    }

    public Medicos(String nombre, String especialidad, String direccion, String telefono, String cedula, String sexo, String clave, String correo, String recuperacion, int codigo, String categoria, String activo, Date fecha_inicio) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cedula = cedula;
        this.sexo = sexo;
        this.clave = clave;
        this.correo = correo;
        this.recuperacion = recuperacion;
        this.codigo = codigo;
        this.categoria = categoria;
        this.activo = activo;
        this.fecha_inicio = fecha_inicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setRecuperacion(String recuperacion) {
        this.recuperacion = recuperacion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public String getClave() {
        return clave;
    }

    public String getCorreo() {
        return correo;
    }

    public String getRecuperacion() {
        return recuperacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getActivo() {
        return activo;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    
}

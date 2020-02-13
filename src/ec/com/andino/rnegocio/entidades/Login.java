/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.andino.rnegocio.entidades;

/**
 *
 * @author lufeb
 */
public class Login {
    private String nombre;
    private String clave; 
    private String recuperacion;
    private String cedula;

    public Login() {
    }

    public Login(String nombre, String clave, String recuperacion, String cedula) {
        this.nombre = nombre;
        this.clave = clave;
        this.recuperacion = recuperacion;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setRecuperacion(String recuperacion) {
        this.recuperacion = recuperacion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getRecuperacion() {
        return recuperacion;
    }

    public String getCedula() {
        return cedula;
    }

    
}

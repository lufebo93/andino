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
public class AtencionPrevia {
    private int codigo;
    private String Paciente;
    private Date fecha;
    private String indicaciones;
    private String medico;
    private String especialidad;
    private String prescripcion;
    private String diagnostico;
    private String categoria;

    public AtencionPrevia() {
    }

    public AtencionPrevia(int codigo, String Paciente, Date fecha, String indicaciones, String medico, String especialidad, String prescripcion, String diagnostico, String categoria) {
        this.codigo = codigo;
        this.Paciente = Paciente;
        this.fecha = fecha;
        this.indicaciones = indicaciones;
        this.medico = medico;
        this.especialidad = especialidad;
        this.prescripcion = prescripcion;
        this.diagnostico = diagnostico;
        this.categoria = categoria;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setPrescripcion(String prescripcion) {
        this.prescripcion = prescripcion;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getPaciente() {
        return Paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public String getMedico() {
        return medico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getPrescripcion() {
        return prescripcion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getCategoria() {
        return categoria;
    }

    
}

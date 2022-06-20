/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Persona {
    protected String codigo ;
    protected String apellidos ;
    protected String nombres ;
    protected String correo ;
    protected String domicilio ;
    protected Date fechaNc ;
    protected String lugarNac ;
    protected String numcel ;
    protected String direccion ;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaNc() {
        return fechaNc;
    }

    public void setFechaNc(Date fechaNc) {
        this.fechaNc = fechaNc;
    }

    public String getLugarNac() {
        return lugarNac;
    }

    public void setLugarNac(String lugarNac) {
        this.lugarNac = lugarNac;
    }

    public String getNumcel() {
        return numcel;
    }

    public void setNumcel(String numcel) {
        this.numcel = numcel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

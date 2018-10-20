/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author fabia
 */
public class Listas {

    String nombre;
    String usuario;
    String descripcion;
    String numero_usuario;
    String fecha;
    String Estatus;

    public Listas(String nombre, String usuario, String descripcion, String numero_usuario, String fecha, String Estatus) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.numero_usuario = numero_usuario;
        this.fecha = fecha;
        this.Estatus = Estatus;
    }

    
    
    @Override
    public String toString() {
        return  nombre + "|" + usuario + "|" + descripcion + "|" + numero_usuario + "|" + fecha + "|" + Estatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumero_usuario() {
        return numero_usuario;
    }

    public void setNumero_usuario(String numero_usuario) {
        this.numero_usuario = numero_usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }
    
    

}

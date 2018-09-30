/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *  Solo sirve para ordenar de forma secuencial el archivo usuario
 * @author fabia
 */
public class Usuario {
    String usuario;
    String nombre;
    String apellido;
    String password;
    String rol;
    String fecha;
    String correo;
    String Telefono;
    String path;
    String status;

    @Override
    public String toString() {
        return  usuario + "|" + nombre + "|" + apellido + "|" + password + "|" + rol + "|" + fecha + "|" + correo + "|" + Telefono + "|" + path + "|" + status;
    }

    public Usuario(String usuario, String nombre, String apellido, String password, String rol, String fecha, String correo, String Telefono, String path, String status) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.rol = rol;
        this.fecha = fecha;
        this.correo = correo;
        this.Telefono = Telefono;
        this.path = path;
        this.status = status;
    }

    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}

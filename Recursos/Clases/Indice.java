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
public class Indice {
    String registro;
    String pos;
    String nombre;
    String usuario;
    String asociado;
    String siguiente;
    String estatus;

    public Indice(String registro, String pos, String nombre, String usuario, String asociado, String siguiente, String estatus) {
        this.registro = registro;
        this.pos = pos;
        this.nombre = nombre;
        this.usuario = usuario;
        this.asociado = asociado;
        this.siguiente = siguiente;
        this.estatus = estatus;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
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

    public String getAsociado() {
        return asociado;
    }

    public void setAsociado(String asociado) {
        this.asociado = asociado;
    }

    public String getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(String siguiente) {
        this.siguiente = siguiente;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return  registro + "|" + pos + "|" + nombre + "|" + usuario + "|" + asociado + "|" + siguiente+"|"+estatus;
    }
 
}

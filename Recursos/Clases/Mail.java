/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Erick Contreras
 */
public class Mail {

    private String registro;
    private String izquierdo;
    private String derecho;
    private String emisor;
    private String receptor;
    private String fecha;
    private String asunto;
    private String mensaje;
    private String adjunto;
    private String estatus;

    public Mail(String reg, String izq, String der, String emi, String rec, String f, String asu, String m, String adj, String e){
        registro = reg;
        izquierdo = izq;
        derecho = der;
        emisor = emi;
        receptor = rec;
        fecha = f;
        asunto = asu;
        mensaje = m;
        adjunto = adj;
        estatus = e;
    }
    
    public String obtenerLlave() {
        return emisor + "|" + receptor + "|" + fecha;
    }

    public String toString() {
        return registro + "|" + izquierdo + "|" + derecho + "|" + emisor
                + "|" + receptor + "|" + fecha + "|" + asunto + "|" + mensaje
                + "|" + adjunto + "|" + estatus;
    }

    /**
     * @return the registro
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    /**
     * @return the izquierdo
     */
    public String getIzquierdo() {
        return izquierdo;
    }

    /**
     * @param izquierdo the izquierdo to set
     */
    public void setIzquierdo(String izquierdo) {
        this.izquierdo = izquierdo;
    }

    /**
     * @return the derecho
     */
    public String getDerecho() {
        return derecho;
    }

    /**
     * @param derecho the derecho to set
     */
    public void setDerecho(String derecho) {
        this.derecho = derecho;
    }

    /**
     * @return the emisor
     */
    public String getEmisor() {
        return emisor;
    }

    /**
     * @param emisor the emisor to set
     */
    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    /**
     * @return the receptor
     */
    public String getReceptor() {
        return receptor;
    }

    /**
     * @param receptor the receptor to set
     */
    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the asunto
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * @param asunto the asunto to set
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the adjunto
     */
    public String getAdjunto() {
        return adjunto;
    }

    /**
     * @param adjunto the adjunto to set
     */
    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
    }

    /**
     * @return the estatus
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}

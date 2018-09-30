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
public class ClaseGeneral {

    public static boolean yaLogeado = false;  //Booleano para validar si ya esta logeado algun usuario
    public static boolean esAdmin = false;  //Booleano para validar si el usuario logeado/a logear es admin
    //Usuario logeado/a logear/a registrar para saber quien modifica los archivos
    public static String usuarioActual = "Erick";
    public static String usuario = "";
    public static String rol = "";
    public static String rutaFotografia = "";
    //Booleano para validar que exitan usuarios, y si no hay el primer registro se hace el admin
    public static boolean hayUsuarios = false;
    public static String[] datosUsuarioBuscado = null; //String para la busqueda de usuarios
    public static boolean busqueda = false; //Booleano para validar que se esta modificando un usario diferente al logeado
    //Variables de backup
    public static String rutaDestino = "";

}

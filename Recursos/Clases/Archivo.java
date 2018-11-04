/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Contreras
 */
public class Archivo {

    Date fecha = new Date();

    public String[] leerArchivo(String nombreArchivo) {
        File Archivo = new File("C:\\MEIA\\" + nombreArchivo + ".txt");

        int cont = 0;
        String[] split = null;
        try {
            if (Archivo.exists()) {
                FileReader LecturaArchivo, LecturaArchivo2;
                try {
                    LecturaArchivo = new FileReader(Archivo);
                    LecturaArchivo2 = new FileReader(Archivo);
                    BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                    BufferedReader LeerArchivo2 = new BufferedReader(LecturaArchivo2);
                    String Linea = ""; String temp = "";
                    try {
                        temp = LeerArchivo.readLine();
                        while (temp != null ) {
                            cont++;
                            temp = LeerArchivo.readLine();
                        }
                        
                        split = new String[cont + 1];
                        cont = 0;
                        Linea = LeerArchivo2.readLine();
                        while(Linea != null){
                            split[cont] = Linea;
                            Linea = LeerArchivo2.readLine();
                            cont++;
                        }

                        LecturaArchivo.close();
                        LeerArchivo.close();
                        LecturaArchivo2.close();
                        LeerArchivo2.close();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else {
                File ArchivoDescriptor = new File("C:\\MEIA\\desc_" + nombreArchivo + ".txt");
                Archivo.createNewFile();
                ArchivoDescriptor.createNewFile();
                escribirDescriptor(nombreArchivo);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return split;
    }

    public boolean escribirArchivo(String nombreArchivo, String contenido, String error) {
        File Archivo = new File("C:\\MEIA\\" + nombreArchivo + ".txt");

        try {
            FileWriter Escribir = new FileWriter(Archivo, true);
            BufferedWriter bw = new BufferedWriter(Escribir);
            bw.write(contenido + System.getProperty("line.separator"));
            bw.close();
            Escribir.close();

            return true;
        } catch (IOException ex) {
            error = ex.getMessage();
            return false;
        }
    }
    
     public boolean escribirArchivo2(String nombreArchivo, String contenido, String error) {
        
         File Archivo = new File("C:\\MEIA\\" + nombreArchivo + ".txt");

        try {
            FileWriter Escribir = new FileWriter(Archivo,true);
            BufferedWriter bw = new BufferedWriter(Escribir);
            bw.write(contenido + System.getProperty("line.separator"));
            bw.close();
            Escribir.close();

            return true;
        } catch (IOException ex) {
            error = ex.getMessage();
            return false;
        }
    }
    
    public boolean limpiarArchivo(String nombreArchivo){
        File archivo = new File("C:\\MEIA\\" + nombreArchivo + ".txt");
        try{
            archivo.delete();
            archivo.createNewFile();
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public void escribirDescriptor(String nombreArchivo) {
        String error = "";
        if (nombreArchivo.equals("bitacora")) {
            escribirArchivo("desc_"+nombreArchivo,"nombre_simbolico:" + nombreArchivo ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_creacion:" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_creacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_modificacion" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_modificacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"#_registros:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_activos:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_inactivos:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"max_reorganizacion:" + 3,error);
            
        } else if (nombreArchivo.equals("usuario")) {
            escribirArchivo("desc_"+nombreArchivo,"nombre_simbolico:" + nombreArchivo ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_creacion:" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_creacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_modificacion" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_modificacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"#_registros:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_activos:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_inactivos:" + 0 ,error);
        }else if (nombreArchivo.equals("bitacora_backup")) {
            escribirArchivo("desc_"+nombreArchivo,"nombre_simbolico:" + nombreArchivo ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_creacion:" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_creacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_modificacion" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_modificacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"#_registros:" + 0 ,error);
            
        }else if (nombreArchivo.equals("bitacora_lista")) {
            escribirArchivo("desc_"+nombreArchivo,"nombre_simbolico:" + nombreArchivo ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_creacion:" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_creacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_modificacion" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_modificacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"#_registros:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_activos:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_inactivos:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"max_reorganizacion:" + 3,error);            
        }else if (nombreArchivo.equals("lista")) {
            escribirArchivo("desc_"+nombreArchivo,"nombre_simbolico:" + nombreArchivo ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_creacion:" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_creacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_modificacion" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_modificacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"#_registros:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_activos:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_inactivos:" + 0 ,error);
        }else if(nombreArchivo.equals("lista_usuario")){
            escribirArchivo("desc_"+nombreArchivo,"nombre_simbolico:" + nombreArchivo ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_creacion:" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_creacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_modificacion" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_modificacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"#_registros:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_activos:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_inactivos:" + 0 ,error);
        }else if(nombreArchivo.equals("indice_lista_usuario")){
            escribirArchivo("desc_"+nombreArchivo,"nombre_simbolico:" + nombreArchivo ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_creacion:" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_creacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_modificacion" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_modificacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"inicio_registro:",error);
            escribirArchivo("desc_"+nombreArchivo,"#_registros:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_activos:" + 0 ,error);
            escribirArchivo("desc_"+nombreArchivo,"registros_inactivos:" + 0 ,error);
        }else if (nombreArchivo.equals("correo")) {
            escribirArchivo("desc_"+nombreArchivo,"nombre_simbolico:" + nombreArchivo ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_creacion:" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_creacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"fecha_modificacion" + fecha.toString() ,error);
            escribirArchivo("desc_"+nombreArchivo,"usuario_modificacion:" + ClaseGeneral.usuarioActual ,error);
            escribirArchivo("desc_"+nombreArchivo,"inicio_registro:0",error);
            escribirArchivo("desc_"+nombreArchivo,"#_registros:" + 0 ,error);
        }
        
        
    }
}

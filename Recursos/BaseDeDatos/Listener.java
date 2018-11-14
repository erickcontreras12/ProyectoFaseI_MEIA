/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

/**
 *
 * @author Erick Contreras
 */
import Clases.Archivo;
import Clases.ClaseGeneral;
import Clases.Mail;
import Interfaz.Correo;
import Interfaz.Notificacion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Listener extends Thread {

    Archivo archivo = new Archivo();
    int activos = 0;
    int inactivos = 0;
    int total = 0;

    private Connection Conexion;
    private final org.postgresql.PGConnection pgconn;
    private String id;
    private String GrupoReceptor;
    private String GrupoEmisor;
    private String Receptor;
    private String Emisor;
    private String Asunto;
    private String Mensaje;
    private Notificacion Not;

    Listener(Connection conn) throws SQLException {
        this.Conexion = conn;
        this.pgconn = (org.postgresql.PGConnection) conn;
        Statement stmt = conn.createStatement();
        stmt.execute("LISTEN q_event");
        stmt.close();
    }

    public void run() {
        while (true) {
            try {
                //Escucha en la base de Datos para ver si hay mensajes nuevos
                Statement stmt = Conexion.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT 1");
                rs.close();
                stmt.close();

                //Recibe las notificaciones de JDBC
                org.postgresql.PGNotification notifications[] = pgconn.getNotifications();
                if (notifications != null) {
                    for (int i = 0; i < notifications.length; i++) {
                        //Aca se recibe cada una de las notificaciones de Postgresql notifications[i] para luego descomponer el json que se recibe
                        String parameter = notifications[i].getParameter().replace("\\", "");
                        String action = parameter.split("\\{")[1].split(",")[1].split(":")[1].substring(2, 8);

                        if (action.equals("INSERT")) {
                            //Se comprueba si el correo es para mi
                            id = parameter.split("\\{")[2].replace("}", "").split(",")[0].split(":")[1];
                            GrupoEmisor = parameter.split("\\{")[2].replace("}", "").split(",")[1].split(":")[1];
                            GrupoReceptor = parameter.split("\\{")[2].replace("}", "").split(",")[2].split(":")[1];
                            Emisor = parameter.split("\\{")[2].replace("}", "").split(",")[3].split(":")[1];
                            Receptor = parameter.split("\\{")[2].replace("\\", "").split(",")[4].split(":")[1];
                            Asunto = parameter.split("\\{")[2].replace("}", "").split(",")[6].split(":")[1];
                            Mensaje = parameter.split("\\{")[2].replace("}", "").split(",")[7].split(":")[1];
                            boolean existe = false;

                            Emisor = Emisor.substring(1);
                            Emisor = Emisor.substring(0, Emisor.length() - 1);
                            
                            Receptor = Receptor.substring(1);
                            Receptor = Receptor.substring(0, Receptor.length() - 1);
                            
                            Asunto = Asunto.substring(1);
                            Asunto = Asunto.substring(0, Asunto.length() - 1);
                            
                            Mensaje = Mensaje.substring(1);
                            Mensaje = Mensaje.substring(0, Mensaje.length() - 1);

                            if (GrupoReceptor.equals("10")) {
                                //si es para mi se envia el update con la respuesta
                                BDD.getInstancia().setMensaje("El Grupo " + GrupoEmisor + " te ha enviado un Correo.");
                                Not = new Notificacion();
                                Not.setVisible(true);

                                //ACA USTEDES DEBEN GESTIONAR A DONDE ENVIAR LOS DATOS OBTENIDOS DE LA NOTIFICACION PARA MOSTRARLOS EN LA BANDEJA DE ENTRADA
                                //si es para mi enviar el update con la respuesta de que el usuario existe
                                //Deben de validar cada uno si el usuario existe o no en su ordenador y enviar la respuesta de esta forma al servidor
                                //Agregar buscarUsuario();
                                existe = buscarUsuario(Receptor);
                                if (existe) {
                                    BDD.getInstancia().Update(id, true);
                                    //Aca inserto en la bandeja
                                    insertarCorreo(Emisor, Receptor, Asunto, Mensaje);
                                    actualizarDescriptor("correo");
                                } else {
                                    BDD.getInstancia().Update(id, false);
                                }
                            }
                        } else {
                            //UPDATE

                            //comprobar si yo fui el que envie la solicitud
                            //Descomponer id, grupo emisor y grupo receptor en esta parte
                            id = parameter.split("\\{")[2].replace("}", "").split(",")[0].split(":")[1];
                            GrupoEmisor = parameter.split("\\{")[2].replace("}", "").split(",")[1].split(":")[1];
                            GrupoReceptor = parameter.split("\\{")[2].replace("}", "").split(",")[2].split(":")[1];
                            Emisor = parameter.split("\\{")[2].replace("}", "").split(",")[3].split(":")[1];
                            Receptor = parameter.split("\\{")[2].replace("}", "").split(",")[4].split(":")[1];
                            Asunto = parameter.split("\\{")[2].replace("}", "").split(",")[6].split(":")[1];
                            Mensaje = parameter.split("\\{")[2].replace("}", "").split(",")[7].split(":")[1];

                            
                            Emisor = Emisor.substring(1);
                            Emisor = Emisor.substring(0, Emisor.length() - 1);
                            
                            Receptor = Receptor.substring(1);
                            Receptor = Receptor.substring(0, Receptor.length() - 1);
                            
                            Asunto = Asunto.substring(1);
                            Asunto = Asunto.substring(0, Asunto.length() - 1);
                            
                            Mensaje = Mensaje.substring(1);
                            Mensaje = Mensaje.substring(0, Mensaje.length() - 1);
                            //Aca deben de colocar su numero de Grupo 
                            if (GrupoEmisor.equals("10")) {

                                String respuesta = parameter.split("\\{")[2].replace("}", "").split(",")[7].split(":")[1];
                                //Comprobar cual fue la respuesta
                                if (respuesta.equals("false")) {
                                    BDD.getInstancia().setMensaje("El grupo " + GrupoReceptor + " no ha encontrado el usuario al cual enviaste el correo.");
                                    Not = new Notificacion();
                                    Not.setVisible(true);
                                } else {
                                    BDD.getInstancia().setMensaje("El grupo " + GrupoReceptor + " ha recibido el mensaje.");
                                    Not = new Notificacion();
                                    Not.setVisible(true);

                                    //Inserto en mi archivo gg
                                    insertarCorreo(Emisor, Receptor, Asunto, Mensaje);
                                    actualizarDescriptor("correo");
                                }

                                //Para Eliminar la solicitud (NO ES NECESARIO, OPCIONAL)
                                BDD.getInstancia().Delete(id);
                            }
                        }
                    }
                }
                //Espera para la siguiente Notificacion
                Thread.sleep(500);
            } catch (SQLException | InterruptedException sqle) {
                sqle.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Listener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean buscarUsuario(String usuario) {
        Archivo archivo = new Archivo();
        String[] datos;
        //Lee la bitacora para hacer una busqueda en esta
        String[] usuarios = archivo.leerArchivo("bitacora");
        if (usuarios != null) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] != null) {
                    datos = usuarios[i].split("\\|");
                    if (usuario.equals(datos[0])) {
                        return true;
                    }
                }
            }
        }

        //Si no lo encontro en la bitacora lee usuarios
        usuarios = null;
        usuarios = archivo.leerArchivo("usuario");
        if (usuarios != null) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] != null) {
                    datos = usuarios[i].split("\\|");
                    if (usuario.equals(datos[0])) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private void insertarCorreo(String emisor, String receptor, String asunto, String mensaje) {

        String[] correos = archivo.leerArchivo("correo");
        Date fecha = new Date();
        String[] descriptor = archivo.leerArchivo("desc_correo");
        String registros = descriptor[6].substring(12);
        int numRegistro = Integer.valueOf(registros) + 1;

        String contenido = numRegistro + "|" + "0" + "|" + "0" + "|" + emisor + "|" + receptor + "|"
                + fecha.toString() + "|" + asunto + "|" + mensaje + "|"
                + "" + "|1";

        archivo.escribirArchivo("correo", contenido, "");

        reorganizarArbol(emisor, receptor, fecha.toString(), String.valueOf(numRegistro));
    }

    private void reorganizarArbol(String emisor, String receptor, String fecha, String numRegistro) {
        String[] correos = archivo.leerArchivo("correo");
        String[] descriptor = archivo.leerArchivo("desc_correo");
        String inicio = descriptor[5].substring(16);

        if (correos != null) {

            if (inicio.equals("0")) {
                ClaseGeneral.raiz = "1";
            } else {
                ClaseGeneral.raiz = inicio;
            }

            if (!inicio.equals("0")) {
                //Insercion interna
                int comparador = 10;
                String siguiente = inicio;
                boolean modificado = false;
                while (!modificado) {
                    String[] actual = obtenerActual(siguiente);
                    boolean esIzquierdo = false;

                    comparador = emisor.compareTo(actual[3]);
                    if (comparador == 0) {
                        //Emisor es el mismo valido ahora el receptor
                        comparador = receptor.compareTo(actual[4]);
                        if (comparador == 0) {
                            //Emisor y receptor iguales, valido la fecha
                            comparador = fecha.compareTo(actual[5]);
                            if (comparador <= -1) {
                                esIzquierdo = true;
                            }
                        } else if (comparador <= -1) {
                            esIzquierdo = true;
                        }
                    } else if (comparador <= -1) {
                        esIzquierdo = true;
                    }

                    /*Ahora que conozco la direccion valido si puede insertarse directo en la
                    posicion que sea, de lo contrario tomo el valor del siguiente nodo
                     */
                    if (esIzquierdo) {
                        //Puede ingresarse en el izquierdo
                        if (actual[1].equals("0")) {
                            actual[1] = numRegistro;
                            correos = modificarDatoEnCorreos(correos, actual);
                            modificado = true;
                        } else {
                            siguiente = actual[1];
                        }
                    } else {
                        //Puede ingresarse en el derecho
                        if (actual[2].equals("0")) {
                            actual[2] = numRegistro;
                            correos = modificarDatoEnCorreos(correos, actual);
                            modificado = true;
                        } else {
                            siguiente = actual[2];
                        }
                    }

                }

                archivo.limpiarArchivo("correo");
                for (int i = 0; i < correos.length; i++) {
                    if (correos[i] != null) {
                        archivo.escribirArchivo("correo", correos[i], "");
                    }
                }
            }
        }
    }

    private String[] obtenerActual(String registro) {
        String[] correos = archivo.leerArchivo("correo");
        String[] datos = null;
        for (int i = 0; i < correos.length; i++) {
            if (correos[i] != null) {
                datos = correos[i].split("\\|");
                if (datos[0].equals(registro)) {
                    return datos;
                }
            }
        }
        return datos;
    }

    public void actualizarDescriptor(String descriptor) {
        String[] split = archivo.leerArchivo("desc_" + descriptor);
        Date fecha = new Date();

        if (split[2].equals("usuario_creacion:")) {

            split[2] = "usuario_creacion:" + ClaseGeneral.usuarioActual;
        }
        split[3] = "fecha_modificacion:" + fecha.toString();
        split[4] = "usuario_modificacion:" + ClaseGeneral.usuarioActual;
        //calcula el total de usuarios en el archivo original
        contarCorreos();
        split[6] = "#_registros:" + total;
        split[7] = "registro_activos:" + activos;
        split[8] = "registro_inactivos:" + inactivos;

        //Valido la raiz
        if (activos == 0) {
            split[5] = "inicio_registro:" + 0;
        } else {
            split[5] = "inicio_registro:" + ClaseGeneral.raiz;
        }

        String error = "";
        archivo.limpiarArchivo("desc_" + descriptor);
        for (int i = 0; i < split.length; i++) {
            if (split[i] != null) {
                archivo.escribirArchivo("desc_" + descriptor, split[i], error);
            }
        }
    }

    private String[] modificarDatoEnCorreos(String[] cadena, String[] dato) {
        if (cadena != null) {
            for (int i = 0; i < cadena.length; i++) {
                if (cadena[i] != null) {
                    String[] aux = cadena[i].split("\\|");
                    if (aux[3].equals(dato[3]) && aux[4].equals(dato[4]) && aux[5].equals(dato[5])) {
                        cadena[i] = armarCadena(dato);
                        break;
                    }
                }
            }
        }

        return cadena;
    }

    private String armarCadena(String[] datos) {
        String cadena = "";
        for (int i = 0; i < datos.length; i++) {
            if (i == datos.length - 1) {
                cadena += datos[i];
                break;
            }
            cadena += datos[i] + "|";
        }
        return cadena;
    }

    private void contarCorreos() {
        String[] split = archivo.leerArchivo("correo");

        activos = 0;
        inactivos = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i] != null) {
                String[] datos = split[i].split("\\|");
                if (datos[9].equals("1")) {
                    activos++;
                } else if (datos[9].equals("0")) {
                    inactivos++;
                }
            }
        }
        total = activos + inactivos;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Archivo;
import Clases.ClaseGeneral;
import Clases.Usuario;
import java.awt.Color;
import javax.swing.*;
import java.io.*;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Erick Contreras
 */
public class Registro extends javax.swing.JFrame {

    List<Integer> inferiores = new ArrayList<>();
    List<Usuario> ordenar = new ArrayList<>();
    List<Integer> superiores = new ArrayList<>();
    List<Integer> puntuaciones = new ArrayList<>();
    File Archivo = new File("C:\\MEIA\\resultado.txt");
    File Archivo2 = new File("C:\\MEIA\\puntuacion.txt");
    File Archivo3 = new File("C:\\MEIA\\usuario.txt");
    int puntuacion = 0;
    public String[] split;
    public boolean hayError;    //booleano para saber si hay un error al ingresar los datos
    //Variables para llevar el conteo de los usuarios en ambos archivos
    int activos = 0;
    int inactivos = 0;
    int total = 0;

    /**
     * Creates new form Registro
     */
    public Registro() {
        split = null;
        hayError = false;
        initComponents();
        this.getContentPane().setBackground(Color.lightGray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jApellido = new javax.swing.JTextField();
        jPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jFechaNacimiento = new javax.swing.JTextField();
        jCorreo = new javax.swing.JTextField();
        jTelefono = new javax.swing.JTextField();
        jPathFoto = new javax.swing.JTextField();
        jBtnRutaFoto = new javax.swing.JButton();
        jBtnRegistrar = new javax.swing.JButton();
        jCBMes = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCBAnio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 500));

        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });
        jUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jUsuarioKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_MEIA2 p.png"))); // NOI18N

        jLabel2.setText("Usuario");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Password");

        jLabel6.setText("Fecha Nacimiento");

        jLabel7.setText("Correo alterno");

        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNombreKeyTyped(evt);
            }
        });

        jApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jApellidoActionPerformed(evt);
            }
        });
        jApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jApellidoKeyTyped(evt);
            }
        });

        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordKeyTyped(evt);
            }
        });

        jLabel8.setText("Teléfono");

        jLabel9.setText("Fotografía");

        jFechaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFechaNacimientoKeyTyped(evt);
            }
        });

        jCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCorreoKeyTyped(evt);
            }
        });

        jTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTelefonoKeyTyped(evt);
            }
        });

        jPathFoto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPathFotoKeyTyped(evt);
            }
        });

        jBtnRutaFoto.setText("...");
        jBtnRutaFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRutaFotoActionPerformed(evt);
            }
        });

        jBtnRegistrar.setText("Registrar");
        jBtnRegistrar.setActionCommand("");
        jBtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarActionPerformed(evt);
            }
        });

        jCBMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));

        jLabel10.setText("DD");

        jLabel11.setText("MM");

        jLabel12.setText("YYYY");

        jCBAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPathFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnRutaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jApellido, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCBMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCBAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtnRegistrar)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jCBAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jPathFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRutaFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jBtnRegistrar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsuarioActionPerformed

    private void jBtnRutaFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRutaFotoActionPerformed
        // TODO add your handling code here:
        JFileChooser dialogo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Foto de perfil", "jpg");
        File ficheroImagen;
        String rutaArchivo;
        dialogo.setFileFilter(filtro);
        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();
            jPathFoto.setText(rutaArchivo);
        }
    }//GEN-LAST:event_jBtnRutaFotoActionPerformed

    private void jBtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistrarActionPerformed
        // TODO add your handling code here:
        //Objeto para leer y escribir en los archivos
        Archivo archivo = new Archivo();

        //
        /*split representa los datos de la bitacora, esto para poder tener el control
        y hacer la reorganizacion cuando sea necesario*/
        split = archivo.leerArchivo("bitacora");
        String[] descriptor = archivo.leerArchivo("desc_bitacora");
        String contenido = ""; //variable para almacenar un error o los datos del nuevo usuario
        String error = ""; //variable para almacenar el error al escribir un archivo
        String maxReorganizacion = "";

        contenido = llenarContenido();

        if (!contenido.equals("")) {
            //Luego de que se obtuvo el contenido, valida si hubo algun error
            if (hayError) {
                JOptionPane.showMessageDialog(null, contenido);
                hayError = false;
            } else {

                //Valida si hay un usuario logeado
                if (ClaseGeneral.yaLogeado) {
                    maxReorganizacion = descriptor[8].substring(19);
                    //Valida si hay que hacer reorganizacion en la bitacora
                    if (split.length == Integer.valueOf(maxReorganizacion)) {
                        String[] usuariosaux = archivo.leerArchivo("bitacora");
                        if (usuariosaux != null) {
                            for (int i = 0; i < usuariosaux.length; i++) {
                                if (usuariosaux[i] != null) {
                                    archivo.escribirArchivo("usuario", usuariosaux[i], "");
                                }
                            }

                            archivo.limpiarArchivo("bitacora");
                            actualizarDescriptor("bitacora");
                            actualizarDescriptor("usuario");
                        }

                        String[] usuariosdesordenados = archivo.leerArchivo("usuario");

                        for (int i = 0; i < usuariosdesordenados.length; i++) {
                            if (usuariosdesordenados[i] != null) {
                                String[] datos = usuariosdesordenados[i].split("\\|");
                                ordenar.add(new Usuario(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9]));
                            }
                        }

                        Collections.sort(ordenar, (Usuario obj1, Usuario obj2) -> obj1.getUsuario().compareTo(obj2.getUsuario()));

                        archivo.limpiarArchivo("usuario");
                        for (int i = 0; i < ordenar.size(); i++) {
                            if (ordenar.get(i) != null) {
                                archivo.escribirArchivo("usuario", ordenar.get(i).toString(), "");
                            }
                        }
                        //Se da la reorganizacion
                    } else {

                    }

                    if (archivo.escribirArchivo("bitacora", contenido, error)) {
                        actualizarDescriptor("bitacora");
                        JOptionPane.showMessageDialog(null, "Se ingreso bien el registro", "Guardar", WIDTH);
                        Usuarios usuarios = new Usuarios();
                        usuarios.show();
                        this.hide();
                    } else {
                        JOptionPane.showMessageDialog(null, "Se produjo el siguiente el error  " + error, "Error", WIDTH);
                    }

                } else {

                    /*Ya que no hay ningun usuario logeado, es un registro por lo que no deberia tocarse
            la bitacora asi que la insercion del nuevo usuario se hace en el archivo usuario*/
                    if (archivo.escribirArchivo("usuario", contenido, error)) {
                        actualizarDescriptor("usuario");

                        String[] usuariosdesordenados = archivo.leerArchivo("usuario");

                        for (int i = 0; i < usuariosdesordenados.length; i++) {
                            if (usuariosdesordenados[i] != null) {
                                String[] datos = usuariosdesordenados[i].split("\\|");
                                ordenar.add(new Usuario(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9]));
                            }
                        }

                        Collections.sort(ordenar, (Usuario obj1, Usuario obj2) -> obj1.getUsuario().compareTo(obj2.getUsuario()));

                        archivo.limpiarArchivo("usuario");
                        for (int i = 0; i < ordenar.size(); i++) {
                            if (ordenar.get(i) != null) {
                                archivo.escribirArchivo("usuario", ordenar.get(i).toString(), "");
                            }
                        }

                        JOptionPane.showMessageDialog(null, "Se ingreso bien el registro, se redireccionara al login ", "Guardar", WIDTH);

                        Login log = new Login();
                        log.show();
                        this.hide();

                    } else {
                        JOptionPane.showMessageDialog(null, "Se produjo el siguiente el error  " + error, "Error", WIDTH);
                    }

                    //Se modifica el descriptor
                }

            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Revisar la informacion ingresada");
        }

    }//GEN-LAST:event_jBtnRegistrarActionPerformed

    public void actualizarDescriptor(String descriptor) {
        Archivo archivo = new Archivo();
        String[] split = archivo.leerArchivo("desc_" + descriptor);
        Date fecha = new Date();

        if (split[2].equals("usuario_creacion:")) {
            ClaseGeneral.usuarioActual = jUsuario.getText();
            split[2] = "usuario_creacion:" + ClaseGeneral.usuarioActual;
        }
        split[3] = "fecha_modificacion:" + fecha.toString();
        split[4] = "usuario_modificacion:" + ClaseGeneral.usuarioActual;
        //calcula el total de usuarios en el archivo original
        contarUsuarios(descriptor);
        split[5] = "#_registros:" + total;
        split[6] = "registro_activos:" + activos;
        split[7] = "registro_inactivos:" + inactivos;

        String error = "";
        archivo.limpiarArchivo("desc_" + descriptor);
        for (int i = 0; i < split.length; i++) {
            if (split[i] != null) {
                archivo.escribirArchivo("desc_" + descriptor, split[i], error);
            }
        }
    }

    public void contarUsuarios(String nombreArchivo) {
        Archivo archivo = new Archivo();
        String[] split = archivo.leerArchivo(nombreArchivo);

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


    private void jApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jApellidoActionPerformed

    private void jUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUsuarioKeyTyped
        // TODO add your handling code here:
        if (jUsuario.getText().length() == 20) {
            evt.consume();
        }

    }//GEN-LAST:event_jUsuarioKeyTyped

    private void jNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyTyped
        // TODO add your handling code here:
        if (jNombre.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_jNombreKeyTyped

    private void jApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jApellidoKeyTyped
        // TODO add your handling code here:
        if (jApellido.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_jApellidoKeyTyped

    private void jPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyTyped
        // TODO add your handling code here:
        if (jPassword.getText().length() == 40) {
            evt.consume();
        }
    }//GEN-LAST:event_jPasswordKeyTyped

    private void jFechaNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFechaNacimientoKeyTyped
        // TODO add your handling code here:
        if (jFechaNacimiento.getText().length() == 2) {
            evt.consume();
        }
    }//GEN-LAST:event_jFechaNacimientoKeyTyped

    private void jCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCorreoKeyTyped
        // TODO add your handling code here:
        if (jCorreo.getText().length() == 40) {
            evt.consume();
        }
    }//GEN-LAST:event_jCorreoKeyTyped

    private void jTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefonoKeyTyped
        // TODO add your handling code here:
        if (jTelefono.getText().length() == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_jTelefonoKeyTyped

    private void jPathFotoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPathFotoKeyTyped
        // TODO add your handling code here:
        if (jPathFoto.getText().length() == 200) {
            evt.consume();
        }
    }//GEN-LAST:event_jPathFotoKeyTyped

    /**
     * Metodo para validar que el usuario llene todo de forma correcta y obtener
     * los datos si se cumplen todas las restricciones
     *
     * @return
     */
    public String llenarContenido() {
        String nuevo = "";

        //Valida que no quede ningun campo vacio
        if (jUsuario.getText().equals("") || jNombre.getText().equals("") || jApellido.getText().equals("")
                || jPassword.getText().equals("") || jFechaNacimiento.getText().equals("")
                || jCorreo.getText().equals("") || jTelefono.getText().equals("") || jPathFoto.getText().equals("")) {
            hayError = true;
            return "No puede dejar ningun campo vacio";
        }

        //Valida que el usuario no exista
        if (existeUsuario()) {
            return "Este usuario ya existe, utilice otro";
        }

        //Valida la seguridad del password
        //ESTO TE TOCA GG
        leerArchivos();
        String pass = jPassword.getText();

        if (pass.length() < puntuaciones.get(0)) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese una contrasenia de minimo " + puntuaciones.get(0) + " caracteres", "Error", HEIGHT);
            jPassword.setText("");
        } else {
            puntuacion = puntuaciones.get(1) * pass.length();

            int mayus = 0;
            int letras = 0;
            int num = 0;
            int simb = 0;
            for (int i = 0; i < pass.length(); i++) {
                char c = pass.charAt(i);

                if (Integer.valueOf(c) > 64 && Integer.valueOf(c) < 91) {
                    mayus++;
                }

                if ((Integer.valueOf(c) > 64 && Integer.valueOf(c) < 91) || (Integer.valueOf(c) > 96 && Integer.valueOf(c) < 123)) {
                    letras++;
                }

                if (Integer.valueOf(c) > 47 && Integer.valueOf(c) < 58) {
                    num++;
                }

                if ((Integer.valueOf(c) > 34 && (Integer.valueOf(c) < 38)) || (Integer.valueOf(c) == 47) || (Integer.valueOf(c) == 63)) {
                    simb++;
                }

            }

            puntuacion += puntuaciones.get(2) * mayus;
            puntuacion += puntuaciones.get(3) + letras;
            puntuacion += puntuaciones.get(4) + num;
            puntuacion += simb * (pass.length() + puntuaciones.get(5));

            if (simb == 0 && num == 0) {
                puntuacion -= puntuaciones.get(6);
            }

            if (simb == 0 && letras == 0) {
                puntuacion -= puntuaciones.get(7);
            }

        }

        if (validarpass(puntuacion)) {
            //Ya que paso todas las validaciones y no hubo ningun error obtiene los datos
            //Valida si hay usuarios
            int rol = 10;
            hayAdmin();
            if (ClaseGeneral.hayUsuarios) {
                rol = 0;
            } else {
                rol = 1;
            }

            String encriptado = Encriptar(jPassword.getText());

            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
            String strFecha = jCBAnio.getSelectedItem().toString() + "/" + jCBMes.getSelectedItem().toString() + "/" + jFechaNacimiento.getText();
            Date fecha = null;
            try {

                fecha = formatoDelTexto.parse(strFecha);
                nuevo = jUsuario.getText() + "|" + jNombre.getText() + "|" + jApellido.getText() + "|"
                        + encriptado + "|" + rol + "|"
                        + formatoDelTexto.format(fecha)
                        + "|" + jCorreo.getText() + "|" + jTelefono.getText()
                        + "|" + jPathFoto.getText() + "|" + "1";

                return nuevo;

            } catch (ParseException ex) {

                JOptionPane.showMessageDialog(rootPane, "Ingrese nuevamente en este formato YYYY/MM/DD");
                return "";
            }

        } else {
            return nuevo;
        }
    }

    /**
     * Metodo que maneja el MD5 y por medio de un cifrador trabaja con base 64
     *
     * @param texto
     * @return
     */
    public static String Encriptar(String texto) {

        String cifrar = "MEIA"; //llave para encriptar datos
        String base64EncryptedString = "";

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(cifrar.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] plainTextBytes = texto.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);

            base64EncryptedString = new String(base64Bytes);

        } catch (Exception ex) {
        }
        return base64EncryptedString;
    }

    public void leerArchivos() {
        if (Archivo.exists() == true) {
            FileReader LecturaArchivo;
            try {
                LecturaArchivo = new FileReader(Archivo);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea = "";
                try {
                    Linea = LeerArchivo.readLine();
                    String[] split;
                    while (Linea != null) {
                        split = Linea.split(",");

                        int a = Integer.parseInt(split[0]);
                        int b;
                        if (split[1].equals("0") || split[0].equals("0")) {
                            b = 0;
                        } else {
                            b = Integer.parseInt(split[1]);
                        }

                        inferiores.add(a);
                        superiores.add(b);

                        Linea = LeerArchivo.readLine();
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();

                } catch (Exception e) {
                    System.out.println(e);
                }
            } catch (Exception e) {

            }
        }

        if (Archivo2.exists() == true) {
            FileReader LecturaArchivo1;
            try {
                LecturaArchivo1 = new FileReader(Archivo2);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo1);
                String Linea = "";
                try {
                    Linea = LeerArchivo.readLine();
                    String[] split;
                    while (Linea != null) {
                        split = Linea.split("\n");

                        for (int i = 0; i < split.length; i++) {
                            int a = Integer.parseInt(split[i]);
                            puntuaciones.add(a);
                        }

                        Linea = LeerArchivo.readLine();
                    }

                    LecturaArchivo1.close();
                    LeerArchivo.close();

                } catch (Exception e) {

                }
            } catch (Exception e) {

            }

        }
    }

    public boolean validarpass(int puntuacion) {
        if (puntuacion <= superiores.get(0)) {
            JOptionPane.showMessageDialog(rootPane, "Muy insegura su contraseña");
            jPassword.setText("");
            return false;
        } else if ((puntuacion >= inferiores.get(1) && puntuacion <= superiores.get(1))) {
            JOptionPane.showMessageDialog(rootPane, "Su contraseña es nivel seguridad medio");
        } else if ((puntuacion >= inferiores.get(2) && puntuacion <= superiores.get(2))) {
            JOptionPane.showMessageDialog(rootPane, "Su contraseña es nivel seguridad alta");
        } else if ((puntuacion >= inferiores.get(3))) {
            JOptionPane.showMessageDialog(rootPane, "Su contraseña es nivel seguridad muy alta");
        }
        return true;
    }

    public boolean existeUsuario() {
        Archivo archivo = new Archivo();
        String[] datos;
        //Lee la bitacora para hacer una busqueda en esta
        String[] usuarios = archivo.leerArchivo("bitacora");
        if (usuarios != null) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] != null) {
                    datos = usuarios[i].split("\\|");

                    if (jUsuario.getText().equals(datos[0])) {
                        return true;
                    }
                }
            }
        }

        //Si no lo encontro en la bitacora lee usuarios
        usuarios = archivo.leerArchivo("usuario");
        if (usuarios != null) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] != null) {
                    datos = usuarios[i].split("\\|");

                    if (jUsuario.getText().equals(datos[0])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void hayAdmin() {
        Archivo archivo = new Archivo();
        String[] datos;
        //Lee la bitacora para hacer una busqueda en esta
        String[] usuarios = archivo.leerArchivo("bitacora");
        if (usuarios != null) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] != null) {
                    ClaseGeneral.hayUsuarios = true;
                    break;
                }
            }
        }

        //Si no lo encontro en la bitacora lee usuarios
        usuarios = archivo.leerArchivo("usuario");
        if (usuarios != null) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] != null) {
                    datos = usuarios[i].split("\\|");
                    ClaseGeneral.hayUsuarios = true;
                    break;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jBtnRegistrar;
    private javax.swing.JButton jBtnRutaFoto;
    private javax.swing.JComboBox<String> jCBAnio;
    private javax.swing.JComboBox<String> jCBMes;
    private javax.swing.JTextField jCorreo;
    private javax.swing.JTextField jFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jPassword;
    private javax.swing.JTextField jPathFoto;
    private javax.swing.JTextField jTelefono;
    private javax.swing.JTextField jUsuario;
    // End of variables declaration//GEN-END:variables
}

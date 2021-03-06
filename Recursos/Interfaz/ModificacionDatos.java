/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import BaseDeDatos.BDD;
import Clases.Archivo;
import Clases.ClaseGeneral;
import Clases.Usuario;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Erick Contreras
 */
public class ModificacionDatos extends javax.swing.JFrame {
    int activos = 0;
    int inactivos = 0;
    int total = 0;
    List<Usuario> ordenar = new ArrayList<>();
    File ImagenCopiada;
    /**
     * Creates new form ModificacionDatos
     */
    public ModificacionDatos() throws ClassNotFoundException, SQLException {
        initComponents();
        if (!ClaseGeneral.busqueda) {
        jUsuario.setText(ClaseGeneral.usuarioActual);
        buscarUsuario(ClaseGeneral.usuarioActual);
        }else{
            jUsuario.setText(ClaseGeneral.usuariobuscado);
        }
        BDD.getInstancia().conexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtnVolver = new javax.swing.JButton();
        jBtnPassword = new javax.swing.JButton();
        jBtnCorreo = new javax.swing.JButton();
        jBtnFecha = new javax.swing.JButton();
        jBtnTelefono = new javax.swing.JButton();
        jBtnFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_MEIA2 p.png"))); // NOI18N

        jUsuario.setText("jLabel2");

        jLabel2.setText("Que desea modificar?");

        jBtnVolver.setText("Volver");
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });

        jBtnPassword.setText("Contraseña");
        jBtnPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPasswordActionPerformed(evt);
            }
        });

        jBtnCorreo.setText("Correo");
        jBtnCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCorreoActionPerformed(evt);
            }
        });

        jBtnFecha.setText("Fecha de nacimiento");
        jBtnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFechaActionPerformed(evt);
            }
        });

        jBtnTelefono.setText("Teléfono");
        jBtnTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTelefonoActionPerformed(evt);
            }
        });

        jBtnFoto.setText("Fotografía");
        jBtnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jUsuario)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jBtnVolver)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jBtnFecha)
                            .addGap(133, 133, 133)))
                    .addComponent(jBtnTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(25, 25, 25)
                .addComponent(jBtnPassword)
                .addGap(18, 18, 18)
                .addComponent(jBtnCorreo)
                .addGap(18, 18, 18)
                .addComponent(jBtnFecha)
                .addGap(18, 18, 18)
                .addComponent(jBtnTelefono)
                .addGap(18, 18, 18)
                .addComponent(jBtnFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jBtnVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        // TODO add your handling code here:
        ClaseGeneral.busqueda = false;
        Mantenimiento mante = null;
        try {
            mante = new Mantenimiento();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificacionDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModificacionDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        mante.show();
        this.hide();
    }//GEN-LAST:event_jBtnVolverActionPerformed

    private void jBtnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFotoActionPerformed
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Desea modificar la foto?");
        if (opc == 0) {
            JFileChooser dialogo = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Foto de perfil", "jpg");
            File ficheroImagen;
            String rutaArchivo = "";
            dialogo.setFileFilter(filtro);
            int valor = dialogo.showOpenDialog(this);
            if (valor == JFileChooser.APPROVE_OPTION) {
                ficheroImagen = dialogo.getSelectedFile();               
                Copiar(ficheroImagen);
                rutaArchivo = ImagenCopiada.getPath();
                ClaseGeneral.rutaFotografia = rutaArchivo;
            }
            modificarDatosBuscado("foto", rutaArchivo);
            JOptionPane.showMessageDialog(null, "cambio exitoso");
        }
    }//GEN-LAST:event_jBtnFotoActionPerformed

     public void Copiar(File origen) {

        String ruta_destino = "C:\\MEIA\\fotos";
        File ruta = new File(ruta_destino);
        if (!ruta.exists()) {
            ruta.mkdir();
        }

        File nuevo = new File(ruta_destino + "\\" + origen.getName());

        try {
            Files.copy(Paths.get(origen.getAbsolutePath()), Paths.get(nuevo.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
            ImagenCopiada = new File(ruta_destino + "\\" + origen.getName());
        } catch (Exception e) {

        }
    }
    
    private void jBtnPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPasswordActionPerformed
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Desea modificar la contraseña?");
        if (opc == 0) {
            String cambio = JOptionPane.showInputDialog(rootPane, "Ingrese la nueva contraseña");
            modificarDatosBuscado("pass", Encriptar(cambio));
            JOptionPane.showMessageDialog(null, "cambio exitoso");
        }
    }//GEN-LAST:event_jBtnPasswordActionPerformed

    private void jBtnCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCorreoActionPerformed
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Desea modificar el correo?");
        if (opc == 0) {
            String cambio = JOptionPane.showInputDialog(rootPane, "Ingrese el nuevo correo");
            modificarDatosBuscado("correo", cambio);
            JOptionPane.showMessageDialog(null, "cambio exitoso");
        }
    }//GEN-LAST:event_jBtnCorreoActionPerformed

    private void jBtnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFechaActionPerformed
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Desea modificar su fecha de nacimiento?");
        if (opc == 0) {
            String cambio = JOptionPane.showInputDialog(rootPane, "Ingrese la nueva fecha en formato YYYY/MM/DD");
            //Validar el formato de la fecha
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
            String strFecha = cambio;
            Date fecha = null;
            try {

                fecha = formatoDelTexto.parse(strFecha);
                 modificarDatosBuscado("fecha", formatoDelTexto.format(fecha));
                 JOptionPane.showMessageDialog(null, "cambio exitoso");

            } catch (ParseException ex) {

                JOptionPane.showMessageDialog(rootPane, "Ingrese nuevamente en este formato YYYY/MM/DD");
            }
           
        }
    }//GEN-LAST:event_jBtnFechaActionPerformed

    private void jBtnTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTelefonoActionPerformed
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Desea modificar su número de teléfono?");
        if (opc == 0) {
            String cambio = JOptionPane.showInputDialog(rootPane, "Ingrese el nuevo número");
            modificarDatosBuscado("tel", cambio);
            JOptionPane.showMessageDialog(null, "cambio exitoso");
        }
    }//GEN-LAST:event_jBtnTelefonoActionPerformed

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
    
    boolean encontrado = false;

    public void buscarUsuario(String usuario) {
        Archivo archivo = new Archivo();
        encontrado = false;
        String[] datos;
        //Lee la bitacora para hacer una busqueda en esta
        String[] usuarios = archivo.leerArchivo("bitacora");
        if (usuarios != null) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] != null) {
                    datos = usuarios[i].split("\\|");
                    if (usuario.equals(datos[0])) {
                        encontrado = true;
                        ClaseGeneral.datosUsuarioBuscado = datos;
                        break;
                    }
                }
            }
        }

        //Si no lo encontro en la bitacora lee usuarios
        if (!encontrado) {
            usuarios = null;
            usuarios = archivo.leerArchivo("usuario");
            if (usuarios != null) {
                for (int i = 0; i < usuarios.length; i++) {
                    if (usuarios[i] != null) {
                        datos = usuarios[i].split("\\|");
                        if (usuario.equals(datos[0])) {
                            encontrado = true;
                            ClaseGeneral.datosUsuarioBuscado = datos;
                            break;
                        }
                    }
                }
            }
        }
    }

    public void modificarDatosBuscado(String tipo, String nuevo) {
        Archivo archivo = new Archivo();
        boolean estaEnBitacora = false;
        String[] datosUsuario = null, split = null, splitaux = null, cambiar = null;

        int posicion = 0;
        split = archivo.leerArchivo("bitacora");
        splitaux = split;
        for (int i = 0; i < split.length; i++) {
            if (split[i] != null) {
                datosUsuario = split[i].split("\\|");
                if (datosUsuario[0].equals(ClaseGeneral.datosUsuarioBuscado[0])) {
                    posicion = i;
                    estaEnBitacora = true;
                    splitaux[posicion] = "";
                } else {
                    splitaux[i] = split[i];
                }
            }
        }

        if (!estaEnBitacora) {
            split = null;
            splitaux = null;
            split = archivo.leerArchivo("usuario");
            splitaux = split;
            for (int i = 0; i < split.length; i++) {
                if (split[i] != null) {
                    datosUsuario = split[i].split("\\|");
                    if (datosUsuario[0].equals(ClaseGeneral.datosUsuarioBuscado[0])) {
                        posicion = i;
                        splitaux[posicion] = "";
                        cambiar = datosUsuario;
                    } else {
                        splitaux[i] = split[i];
                    }
                }
            }
        }
        if (tipo.equals("pass")) {
            cambiar[3] = nuevo;
        } else if (tipo.equals("foto")) {
            cambiar[8] = nuevo;
        } else if (tipo.equals("tel")) {
            cambiar[7] = nuevo;
        } else if (tipo.equals("correo")) {
            cambiar[6] = nuevo;
        } else if (tipo.equals("fecha")) {
            cambiar[5] = nuevo;
        }

        //Rearma la linea de los datos del usuario
        String cadena = "";
        for (int i = 0; i < cambiar.length; i++) {
            if (i == cambiar.length - 1) {
                cadena += cambiar[i];
                break;
            }
            cadena += cambiar[i] + "|";
        }

        String nombreEscribir = "";
        if (estaEnBitacora) {
            nombreEscribir = "bitacora";
        } else {
            nombreEscribir = "usuario";
        }
        splitaux[posicion] = cadena;

        //Rearma todo el contenido del split para escribirlo en el archivo
        archivo.limpiarArchivo(nombreEscribir);
        String error = "";
        cadena = "";
        for (int i = 0; i < splitaux.length; i++) {
            if (splitaux[i] != null) {
                archivo.escribirArchivo2(nombreEscribir, splitaux[i], error);
            }
        }
        actualizarDescriptor2(nombreEscribir);
        
    }

    
    public void actualizarDescriptor2(String descriptor) {
        Archivo archivo = new Archivo();
        String[] split = archivo.leerArchivo("desc_" + descriptor);
        Date fecha = new Date();

        if (split[2].equals("usuario_creacion:")) {
            
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
            java.util.logging.Logger.getLogger(ModificacionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificacionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificacionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificacionDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificacionDatos().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ModificacionDatos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificacionDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCorreo;
    private javax.swing.JButton jBtnFecha;
    private javax.swing.JButton jBtnFoto;
    private javax.swing.JButton jBtnPassword;
    private javax.swing.JButton jBtnTelefono;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jUsuario;
    // End of variables declaration//GEN-END:variables
}

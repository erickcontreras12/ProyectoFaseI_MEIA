/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Archivo;
import Clases.ClaseGeneral;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Erick Contreras
 */
public class Mantenimiento extends javax.swing.JFrame {

    int activos = 0;
    int inactivos = 0;
    int total = 0;

    /**
     * Creates new form Mantenimiento
     */
    public Mantenimiento() {

         buscarUsuario(ClaseGeneral.usuarioActual);
        
        initComponents();
        this.getContentPane().setBackground(Color.lightGray);

        Image img = new ImageIcon(ClaseGeneral.rutaFotografia).getImage();
        ImageIcon img2 = new ImageIcon(img.getScaledInstance(78, 124, Image.SCALE_SMOOTH));

        jFotografia.setIcon(img2);
        jUsuario.setText(ClaseGeneral.usuarioActual);
        if (ClaseGeneral.rol.equals("1")) {
            jRol.setText("Administrador");
        } else {
            jRol.setText("Usuario");
        }
        //Falta la foto en el jFotografia

        if (ClaseGeneral.esAdmin) {
            jBtnBackup.show();
            jBtnUsuario.show();
        } else {
            jBtnBackup.hide();
            jBtnUsuario.hide();
        }

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
        jBtnActualizacion = new javax.swing.JButton();
        jBtnBaja = new javax.swing.JButton();
        jBtnUsuario = new javax.swing.JButton();
        jBtnLogOut = new javax.swing.JButton();
        jFotografia = new javax.swing.JLabel();
        jRol = new javax.swing.JLabel();
        jBtnBackup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_MEIA2 p.png"))); // NOI18N

        jUsuario.setText("Nombre usuario");

        jBtnActualizacion.setText("Actualizar/Modificar datos");
        jBtnActualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizacionActionPerformed(evt);
            }
        });

        jBtnBaja.setText("Baja");
        jBtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBajaActionPerformed(evt);
            }
        });

        jBtnUsuario.setText("Usuarios");
        jBtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUsuarioActionPerformed(evt);
            }
        });

        jBtnLogOut.setText("Cerrar sesion");
        jBtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogOutActionPerformed(evt);
            }
        });

        jRol.setText("Rol");

        jBtnBackup.setText("Realizar BackUp");
        jBtnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(jBtnLogOut)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jFotografia, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jUsuario)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBtnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtnActualizacion)
                                .addComponent(jBtnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtnBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRol))
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jRol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jBtnActualizacion)
                .addGap(26, 26, 26)
                .addComponent(jBtnBaja)
                .addGap(35, 35, 35)
                .addComponent(jBtnUsuario)
                .addGap(31, 31, 31)
                .addComponent(jBtnBackup)
                .addGap(53, 53, 53)
                .addComponent(jBtnLogOut)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jFotografia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogOutActionPerformed
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Seguro que desea cerrar sesion?");
        if (opc == 0) {
            ClaseGeneral.yaLogeado = false;
            Login login = new Login();
            login.show();
            this.hide();
        }
    }//GEN-LAST:event_jBtnLogOutActionPerformed

    private void jBtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUsuarioActionPerformed
        // TODO add your handling code here:
        Usuarios usuarios = new Usuarios();
        usuarios.show();
        this.hide();
    }//GEN-LAST:event_jBtnUsuarioActionPerformed

    private void jBtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBajaActionPerformed
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Seguro que desea darse de baja?");
        if (opc == 0) {
            if (ClaseGeneral.esAdmin) {
                JOptionPane.showMessageDialog(null, "Usted es un administrador no puede darse de baja");
            } else {
                JOptionPane.showMessageDialog(null, "Usted se ha dado de baja");
                actualizarDatos();
                actualizarDescriptor2("usuario");
                ClaseGeneral.yaLogeado = false;
                Login login = new Login();
                login.show();
                this.hide();
            }

        }
    }//GEN-LAST:event_jBtnBajaActionPerformed

    private void jBtnActualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizacionActionPerformed
        // TODO add your handling code here:
        ModificacionDatos cambio = new ModificacionDatos();
        cambio.show();
        this.hide();
    }//GEN-LAST:event_jBtnActualizacionActionPerformed

    private void jBtnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackupActionPerformed
        // TODO add your handling code here:
        JFileChooser dialogo = new JFileChooser();
        dialogo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        File FicheroDestino = null;

        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            FicheroDestino = dialogo.getSelectedFile();
        }
        if (FicheroDestino != null) {
            String destino = FicheroDestino.getAbsolutePath() + "\\MEIA_Backup\\";
            ClaseGeneral.rutaDestino = destino;
            String Origen = "C:\\MEIA";
            Archivo archivo = new Archivo();
            archivo.leerArchivo("bitacora_backup");
            if (archivo.escribirArchivo("bitacora_backup", llenarContenido(), "")) {
                actualizarDescriptor("bitacora_backup");
            }
            Copiar(new File(Origen), new File(destino));

        }


    }//GEN-LAST:event_jBtnBackupActionPerformed

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
                    if (usuario.equals(datos[1])) {
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
                        if (usuario.equals(datos[1])) {
                            encontrado = true;
                            ClaseGeneral.datosUsuarioBuscado = datos;
                            break;
                        }
                    }
                }
            }
        }
    }
    
    /**
     * Actualiza el descriptor del backup
     * @param descriptor 
     */
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
        //calcula el total de registros en el archivo original
        split[5] = "#_registros:" + (contarRegistros("bitacora_backup") - 1);

        String error = "";
        archivo.limpiarArchivo("desc_" + descriptor);
        for (int i = 0; i < split.length; i++) {
            if (split[i] != null) {
                archivo.escribirArchivo("desc_" + descriptor, split[i], error);
            }
        }
    }

    public int contarRegistros(String nombreArchivo) {
        Archivo archivo = new Archivo();
        String[] split = archivo.leerArchivo(nombreArchivo);

        return split.length;

    }

    public String llenarContenido() {
        String nuevo = "";
        Date fecha = new Date();
        nuevo = ClaseGeneral.rutaDestino + "|" + ClaseGeneral.usuarioActual + "|" + fecha.toString();
        return nuevo;
    }

    public void Copiar(File origen, File destino) {
        if (origen.isDirectory()) {
            String[] Rutas = origen.list();

            for (int i = 0; i < Rutas.length; i++) {

                if (!destino.exists()) {
                    destino.mkdir();
                }
                File viejo = new File(origen + "\\" + Rutas[i]);
                File nuevo = new File(destino + "\\" + Rutas[i]);

                try {
                    Files.copy(Paths.get(viejo.getAbsolutePath()), Paths.get(nuevo.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
                } catch (Exception e) {

                }
            }
        }

    }

    /**
     * Actualiza el archivo usuario
     */
    public void actualizarDatos() {
        Archivo archivo = new Archivo();
        String[] datosUsuario = null, split = null, splitaux = null, cambiar = null;

        int posicion = 0;

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

        cambiar[9] = "0";

        //Rearma la linea de los datos del usuario
        String cadena = "";
        for (int i = 0; i < cambiar.length; i++) {
            if (i == cambiar.length - 1) {
                cadena += cambiar[i];
                break;
            }
            cadena += cambiar[i] + "|";
        }

        splitaux[posicion] = cadena;

        //Rearma todo el contenido del split para escribirlo en el archivo
        archivo.limpiarArchivo("usuario");
        String error = "";
        cadena = "";
        for (int i = 0; i < splitaux.length; i++) {
            if (splitaux[i] != null) {
                archivo.escribirArchivo2("usuario", splitaux[i], error);
            }
        }

    }

    /**
     * Actualiza el descriptor de usuario
     *
     * @param descriptor
     */
    public void actualizarDescriptor2(String descriptor) {
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
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimiento().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActualizacion;
    private javax.swing.JButton jBtnBackup;
    private javax.swing.JButton jBtnBaja;
    private javax.swing.JButton jBtnLogOut;
    private javax.swing.JButton jBtnUsuario;
    private javax.swing.JLabel jFotografia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jRol;
    private javax.swing.JLabel jUsuario;
    // End of variables declaration//GEN-END:variables
}

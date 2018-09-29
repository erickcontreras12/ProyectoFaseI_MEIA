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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Contreras
 */
public class Mantenimiento extends javax.swing.JFrame {

    /**
     * Creates new form Mantenimiento
     */
    public Mantenimiento() {

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
            jBtnBackup.enable(true);
            jBtnUsuario.enable(true);
        } else {
            jBtnBackup.enable(false);
            jBtnUsuario.enable(false);
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

        jFotografia.setText("jLabel2");

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
                ClaseGeneral.yaLogeado = false;
                Login login = new Login();
                login.show();
                this.hide();
            }

        }
    }//GEN-LAST:event_jBtnBajaActionPerformed

    private void jBtnActualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnActualizacionActionPerformed

    private void jBtnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnBackupActionPerformed

    public void actualizarDatos() {
        Archivo archivo = new Archivo();
        String[] datosUsuario = null, split = null;
        split = archivo.leerArchivo("usuario");
        int posicion = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[i] != null) {
                datosUsuario = split[i].split("\\|");
                if (datosUsuario[0].equals(ClaseGeneral.usuarioActual)) {
                    posicion = i;
                    break;
                }
            }
        }

        datosUsuario[9] = "0";

        //Rearma la linea de los datos del usuario
        String cadena = "";
        for (int i = 0; i < datosUsuario.length; i++) {
            if (i == datosUsuario.length - 1) {
                cadena += datosUsuario[i];
                break;
            }
            cadena += datosUsuario[i] + "|";
        }

        split[posicion] = cadena;

        //Rearma todo el contenido del split para escribirlo en el archivo
        String error = "";
        cadena = "";
        for (int i = 0; i < split.length; i++) {
            if (split[i] != null) {
                archivo.escribirArchivo("usuario", cadena, error);
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

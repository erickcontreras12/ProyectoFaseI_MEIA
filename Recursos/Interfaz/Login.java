/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import BaseDeDatos.BDD;
import Clases.ClaseGeneral;
import Clases.Archivo;
import Interfaz.*;
import java.awt.Color;
import java.security.MessageDigest;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Erick Contreras
 */
public class Login extends javax.swing.JFrame {

    public String[] split;

    /**
     * Creates new form NewJFrame
     */
    public Login() throws ClassNotFoundException, SQLException {
        split = null;
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();
        jBtnLog = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_MEIA2 (2).png"))); // NOI18N

        jLabel1.setText("Usuario");

        jLabel3.setText("Contraseña");

        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });

        jBtnLog.setText("Iniciar sesión");
        jBtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnLog)
                    .addComponent(jLabel2))
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jBtnLog)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogActionPerformed
        // TODO add your handling code here:
        boolean usuarioEncontrado = false;
        Archivo archivo = new Archivo();
        split = archivo.leerArchivo("usuario");
        String[] datosUsuario = null;

        //Si split obtiene un valor nulo es porque no existe el archivo, por ende tampoco ningun usuario
        if (split == null) {
            mostrarMensaje();
        } else {
            //Busca en el archivo si el usuario que se ingreso existe
            for (int i = 0; i < split.length; i++) {
                if(split[i]!=null){
                datosUsuario = split[i].split("\\|");
                if (datosUsuario[0].equals(jUsuario.getText())) {
                    usuarioEncontrado = true;
                    break;
                }
                }
            }

            if (usuarioEncontrado) {
                
                    //Valida si el usuario esta activo o no
                    if (datosUsuario[9].equals("1")) {

                        //Ya que esta activo, valida si es admin o no
                        if (datosUsuario[4].equals("1")) {
                            ClaseGeneral.esAdmin = true;
                        } else {
                            ClaseGeneral.esAdmin = false;
                        }

                        String pass = Desencriptar(datosUsuario[3]);
  
                        //Valida si el password es correcto
                        if (pass.equals(jPassword.getText())) {
                            //Ya que valida que todo bien, todo correcto, ingresa
                            ClaseGeneral.usuarioActual = datosUsuario[0];
                            ClaseGeneral.rol = datosUsuario[4];
                            ClaseGeneral.rutaFotografia = datosUsuario[8];
                            ClaseGeneral.usuario = datosUsuario[0];
                            ClaseGeneral.yaLogeado = true;
                            Mantenimiento ingresando = null;
                            try {
                                ingresando = new Mantenimiento();
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            ingresando.show();
                            this.hide();
                        } else {
                            JOptionPane.showMessageDialog(null, "Password incorrecto");
                        }

                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Usuario inactivo, solicite a un admin que lo active");
                    }

            }else{
                mostrarMensaje();
            }
        }
    }//GEN-LAST:event_jBtnLogActionPerformed

           
      public static String Desencriptar(String textoEncriptado) {
 
        String secretKey = "MEIA"; //llave para desenciptar datos
        String base64EncryptedString = "";
 
        try {
            byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
 
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
 
            byte[] plainText = decipher.doFinal(message);
 
            base64EncryptedString = new String(plainText, "UTF-8");
 
        } catch (Exception ex) {
        }
        return base64EncryptedString;
}
    
    
    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsuarioActionPerformed

    /**
     * Metodo que muestra un mensaje para enviar al usuario
     */
    public void mostrarMensaje() {
        int opc = JOptionPane.showConfirmDialog(null, "El usuario no existe, desea registrarse?");
        if (opc == 0) {
            Registro cambio = new Registro();
            cambio.show();
            this.hide();
        } else {
            jUsuario.setText("");
            jPassword.setText("");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jUsuario;
    // End of variables declaration//GEN-END:variables
}

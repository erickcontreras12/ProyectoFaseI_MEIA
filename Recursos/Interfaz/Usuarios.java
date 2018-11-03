/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Archivo;
import Clases.ClaseGeneral;
import Clases.Usuario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Contreras
 */
public class Usuarios extends javax.swing.JFrame {
    List<Usuario> ordenar = new ArrayList<>();
    boolean encontrado = false;
    int activos = 0;
    int inactivos = 0;
    int total = 0;

    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
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
        jBtnBuscar = new javax.swing.JButton();
        jBtnDarBaja = new javax.swing.JButton();
        jBtnVolver = new javax.swing.JButton();
        jBtnCrearUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO_MEIA2 p.png"))); // NOI18N

        jBtnBuscar.setText("Buscar usuario");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jBtnDarBaja.setText("Dar de baja un usuario");
        jBtnDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDarBajaActionPerformed(evt);
            }
        });

        jBtnVolver.setText("Volver");
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });

        jBtnCrearUsuario.setText("Crear nuevo usuario");
        jBtnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnDarBaja)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jBtnVolver)
                            .addContainerGap()))
                    .addComponent(jBtnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jBtnCrearUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jBtnBuscar)
                .addGap(28, 28, 28)
                .addComponent(jBtnDarBaja)
                .addGap(26, 26, 26)
                .addComponent(jBtnVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        // TODO add your handling code here:
        Mantenimiento mante = new Mantenimiento();
        mante.show();
        this.hide();
    }//GEN-LAST:event_jBtnVolverActionPerformed

    private void jBtnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCrearUsuarioActionPerformed
        // TODO add your handling code here:
        Registro cambio = new Registro();
        cambio.show();
        this.hide();
    }//GEN-LAST:event_jBtnCrearUsuarioActionPerformed

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        // TODO add your handling code here:
        String buscado = JOptionPane.showInputDialog(rootPane, "Ingrese el usuario que desea buscar");

        buscarUsuario(buscado);
        if (encontrado) {
            int opc = JOptionPane.showConfirmDialog(null, "El usuario se encontro, desea modificarlo?");
            if (opc == 0) {
                ClaseGeneral.busqueda = true;
                ClaseGeneral.usuariobuscado=buscado;
                ModificacionDatos md = new ModificacionDatos();
                md.show();
                this.hide();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este usuario no existe, no fue encontrado");
        }
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jBtnDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDarBajaActionPerformed
        // TODO add your handling code here:
        String buscado = JOptionPane.showInputDialog(rootPane, "Ingrese el usuario que desea dar de baja");
        buscarUsuario(buscado);
        if (encontrado) {
            int opc = JOptionPane.showConfirmDialog(null, "El usuario se encontro, desea darle de baja?");
            if (opc == 0) {
                darBaja();                
                actualizarDescriptor2("usuario");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este usuario no existe, no fue encontrado");
        }
    }//GEN-LAST:event_jBtnDarBajaActionPerformed

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

    public void darBaja() {
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
                    cambiar = datosUsuario;
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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnCrearUsuario;
    private javax.swing.JButton jBtnDarBaja;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

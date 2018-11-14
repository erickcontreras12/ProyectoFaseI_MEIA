/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import BaseDeDatos.BDD;
import Clases.Archivo;
import Clases.ClaseGeneral;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Contreras
 */
public class Bandeja extends javax.swing.JFrame {

    Archivo archivo = new Archivo();
    int activos = 0;
    int inactivos = 0;
    int total = 0;

    /**
     * Creates new form Bandeja
     */
    public Bandeja() throws ClassNotFoundException, SQLException {
        initComponents();
        buscarCorreos(ClaseGeneral.bandejaEntrada);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jListCorreos = new javax.swing.JList<>();
        jBtnNuevoCorreo = new javax.swing.JButton();
        jBtnVolver = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnVerMensaje = new javax.swing.JButton();
        jBtnCorreoExterno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jScrollPane1.setViewportView(jListCorreos);

        jBtnNuevoCorreo.setText("Redactar");
        jBtnNuevoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoCorreoActionPerformed(evt);
            }
        });

        jBtnVolver.setText("Volver");
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnVerMensaje.setText("Ver");
        jBtnVerMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerMensajeActionPerformed(evt);
            }
        });

        jBtnCorreoExterno.setText("Enviar a grupo externo");
        jBtnCorreoExterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCorreoExternoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBtnVerMensaje)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnEliminar)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnNuevoCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnCorreoExterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnNuevoCorreo)
                    .addComponent(jBtnEliminar)
                    .addComponent(jBtnVerMensaje))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jBtnVolver)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnCorreoExterno)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        // TODO add your handling code here:
        Mantenimiento principio = null;
        try {
            principio = new Mantenimiento();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bandeja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Bandeja.class.getName()).log(Level.SEVERE, null, ex);
        }
        principio.show();
        this.hide();
    }//GEN-LAST:event_jBtnVolverActionPerformed

    private void jBtnNuevoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoCorreoActionPerformed
        // TODO add your handling code here:
        ClaseGeneral.esExterno = false;
        Correo nuevo_correo = null;
        try {
            nuevo_correo = new Correo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bandeja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Bandeja.class.getName()).log(Level.SEVERE, null, ex);
        }
        nuevo_correo.show();
        this.hide();
    }//GEN-LAST:event_jBtnNuevoCorreoActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        String correo = jListCorreos.getSelectedValue();
        if (correo == null || correo.equals("")) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada");
        } else {
            String[] split = correo.split(" - ");
            String[] datos = split[1].split(": ");
            int opc = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar el correo de " + datos[0] + "?");
            if (opc == 0) {
                eliminarCorreo(split[0], datos[0]);
                actualizarDescriptor("correo");
                JOptionPane.showMessageDialog(null, "Correo eliminado con éxito");
                buscarCorreos(ClaseGeneral.bandejaEntrada);
            }
        }
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnVerMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerMensajeActionPerformed
        // TODO add your handling code here:
        String correo = jListCorreos.getSelectedValue();
        if (correo == null || correo.equals("")) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado nada");
        } else {
            String[] split = correo.split(" - ");
            String[] datos = split[1].split(": ");

            String emisor, receptor;
            if (ClaseGeneral.bandejaEntrada) {
                emisor = datos[0];
                receptor = ClaseGeneral.usuarioActual;
            } else {
                emisor = ClaseGeneral.usuarioActual;
                receptor = datos[0];
            }
            ClaseGeneral.correo = buscarCorreoActual(emisor, receptor, split[0]);
            Mensaje ventana = null;
            try {
                ventana = new Mensaje();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Bandeja.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Bandeja.class.getName()).log(Level.SEVERE, null, ex);
            }
            ventana.show();
            this.hide();
        }
    }//GEN-LAST:event_jBtnVerMensajeActionPerformed

    private void jBtnCorreoExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCorreoExternoActionPerformed
        // TODO add your handling code here:
        ClaseGeneral.esExterno = true;
        Correo nuevo_correo = null;
        try {
            nuevo_correo = new Correo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bandeja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Bandeja.class.getName()).log(Level.SEVERE, null, ex);
        }
        nuevo_correo.show();
        this.hide();
    }//GEN-LAST:event_jBtnCorreoExternoActionPerformed

    private void eliminarCorreo(String fecha, String usuario_asociado) {
        String emisor, receptor;
        if (ClaseGeneral.bandejaEntrada) {
            emisor = usuario_asociado;
            receptor = ClaseGeneral.usuarioActual;
        } else {
            emisor = ClaseGeneral.usuarioActual;
            receptor = usuario_asociado;
        }

        String[] correos = archivo.leerArchivo("correo");
        String[] descriptor = archivo.leerArchivo("desc_correo");
        String inicio = descriptor[5].substring(16);

        String[] correo;
        //valido si es nodo hoja
        if (correos != null) {
            if (!inicio.equals("0")) {
                ClaseGeneral.raiz = inicio;
                int comparador = 10;
                String siguiente = inicio;
                String prev = "";
                boolean eliminado = false;
                boolean esIzquierdo = false;
                while (!eliminado) {
                    String[] actual = obtenerActual(siguiente);

                    comparador = emisor.compareTo(actual[3]);
                    if (comparador == 0) {
                        //Emisor es el mismo valido ahora el receptor
                        comparador = receptor.compareTo(actual[4]);
                        if (comparador == 0) {
                            //Emisor y receptor iguales, valido la fecha
                            comparador = fecha.compareTo(actual[5]);
                            if (comparador == 0) {
                                //Encontre el dato ahora tengo que validar
                                String[] aux = null;
                                //Es distinto de la raiz para que aux tome el valor del padre
                                if (!actual[0].equals(inicio)) {
                                    for (int i = 0; i < correos.length; i++) {
                                        if (correos[i] != null) {
                                            String[] datos = correos[i].split("\\|");
                                            if (datos[0].equals(prev)) {
                                                aux = datos;
                                                break;
                                            }
                                        }
                                    }
                                }

                                if (actual[1].equals("0") && actual[2].equals("0")) {
                                    //es hoja
                                    actual[9] = "0";
                                    correos = modificarDatoEnCorreos(correos, actual);
                                    if (esIzquierdo) {
                                        aux[1] = "0";
                                    } else {
                                        aux[2] = "0";
                                    }
                                    correos = modificarDatoEnCorreos(correos, aux);
                                    eliminado = true;
                                } else if (actual[1].equals("0") && !actual[2].equals("0")) {
                                    //tiene solo hijo derecho
                                    if (esIzquierdo) {
                                        aux[1] = actual[2];
                                    } else {
                                        aux[2] = actual[2];
                                    }
                                    correos = modificarDatoEnCorreos(correos, aux);
                                    actual[9] = "0";
                                    actual[2] = "0";
                                    correos = modificarDatoEnCorreos(correos, actual);
                                    eliminado = true;
                                } else if (!actual[1].equals("0") && actual[2].equals("0")) {
                                    //tiene solo hijo izquierdo
                                    if (esIzquierdo) {
                                        aux[1] = actual[1];
                                    } else {
                                        aux[2] = actual[1];
                                    }
                                    correos = modificarDatoEnCorreos(correos, aux);
                                    actual[9] = "0";
                                    actual[1] = "0";
                                    correos = modificarDatoEnCorreos(correos, actual);
                                    eliminado = true;
                                } else {
                                    //tiene 2 hijos
                                    String[] nuevo = null; // mas izquierdo
                                    String padre = "";
                                    boolean masIzquierdo = false;
                                    String izquierdo = actual[2];
                                    int cont = 0;
                                    while (!masIzquierdo) {
                                        nuevo = obtenerActual(izquierdo);
                                        if (!nuevo[1].equals("0")) {
                                            padre = nuevo[0];
                                            izquierdo = nuevo[1];
                                            cont++;
                                        } else {
                                            masIzquierdo = true;
                                        }
                                    }

                                    if (actual[0].equals(inicio)) {    //Es la raiz
                                        //La nueva raiz es el mas izquierdo
                                        ClaseGeneral.raiz = nuevo[0];
                                        //Si el contador avanzo quiere decir que es izquierdo
                                        if (cont > 0) {
                                            //aux toma el valor del padre del mas izquierdo
                                            aux = obtenerActual(padre);
                                            //El padre del mas izquierdo, tiene como hijos izquierdos a los hijos derechos del mas izquierdo
                                            aux[1] = nuevo[2];

                                            correos = modificarDatoEnCorreos(correos, aux);
                                            nuevo[2] = actual[2];
                                        }

                                        //El mas izquierdo toma los valores de los hijos del eliminado
                                        nuevo[1] = actual[1];

                                        correos = modificarDatoEnCorreos(correos, nuevo);

                                        //actual es eliminado
                                        actual[9] = "0";
                                        actual[1] = "0";
                                        actual[2] = "0";
                                        correos = modificarDatoEnCorreos(correos, actual);

                                    } else {
                                        //El padre del eliminado apunta al mas izquierdo
                                        if (esIzquierdo) {
                                            aux[1] = nuevo[0];
                                        } else {
                                            aux[2] = nuevo[0];
                                        }
                                        correos = modificarDatoEnCorreos(correos, aux);

                                        //Si el contador avanzo quiere decir que es izquierdo
                                        if (cont > 0) {
                                            //aux toma el valor del padre del mas izquierdo
                                            aux = obtenerActual(padre);
                                            //El padre del mas izquierdo, tiene como hijos izquierdos a los hijos derechos del mas izquierdo
                                            aux[1] = nuevo[2];

                                            correos = modificarDatoEnCorreos(correos, aux);
                                            nuevo[2] = actual[2];
                                        }

                                        //El mas izquierdo toma los valores de los hijos del eliminado
                                        nuevo[1] = actual[1];

                                        correos = modificarDatoEnCorreos(correos, nuevo);

                                        //actual es eliminado
                                        actual[9] = "0";
                                        actual[1] = "0";
                                        actual[2] = "0";
                                        correos = modificarDatoEnCorreos(correos, actual);
                                    }

                                    eliminado = true;
                                }
                            } else if (comparador <= -1) {
                                //busco a la izquierda
                                prev = siguiente;
                                siguiente = actual[1];
                                esIzquierdo = true;
                            } else {
                                //busco a la derecha
                                prev = siguiente;
                                siguiente = actual[2];
                                esIzquierdo = false;
                            }
                        } else if (comparador <= -1) {
                            //busco a la izquierda
                            prev = siguiente;
                            siguiente = actual[1];
                            esIzquierdo = true;
                        } else {
                            //busco a la derecha
                            prev = siguiente;
                            siguiente = actual[2];
                            esIzquierdo = false;
                        }
                    } else if (comparador <= -1) {
                        //busco a la izquierda
                        prev = siguiente;
                        siguiente = actual[1];
                        esIzquierdo = true;
                    } else {
                        //busco a la derecha
                        prev = siguiente;
                        siguiente = actual[2];
                        esIzquierdo = false;
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

    private String[] buscarCorreoActual(String emisor, String receptor, String fecha) {
        String[] correos = archivo.leerArchivo("correo");
        String[] descriptor = archivo.leerArchivo("desc_correo");
        String inicio = descriptor[5].substring(16);

        if (correos != null) {
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
                            if (comparador == 0) {
                                return actual;
                            } else if (comparador <= -1) {
                                esIzquierdo = true;
                            }
                        } else if (comparador <= -1) {
                            esIzquierdo = true;
                        }
                    } else if (comparador <= -1) {
                        esIzquierdo = true;
                    }

                    if (esIzquierdo) {
                        siguiente = actual[1];
                    } else {
                        siguiente = actual[2];
                    }
                }
            }
        }
        return null;
    }

    private void buscarCorreos(boolean entrada) {

        String[] correos = archivo.leerArchivo("correo");
        DefaultListModel modelo = new DefaultListModel();

        if (correos != null) {
            for (int i = 0; i < correos.length; i++) {
                if (correos[i] != null) {
                    String[] correo = correos[i].split("\\|");
                    /*Si el boolean de entrada es verdadero busca los correos donde el receptor sea el 
                    usuario actual, sino busca donde el emisor sea el usuario actual*/
                    if (entrada) {
                        if (correo[4].equals(ClaseGeneral.usuarioActual) && correo[9].equals("1")) {
                            modelo.addElement(construirMensaje(correo, entrada));
                        }
                    } else {
                        if (correo[3].equals(ClaseGeneral.usuarioActual) && correo[9].equals("1")) {
                            modelo.addElement(construirMensaje(correo, entrada));
                        }
                    }
                }
            }

            jListCorreos.setModel(modelo);
        }
    }

    private String construirMensaje(String[] data, boolean entrada) {
        String mensaje = "";
        if (entrada) {
            mensaje = data[5] + " - " + data[3] + ": " + data[6];
        } else {
            mensaje = data[5] + " - " + data[4] + ": " + data[6];
        }
        return mensaje;
    }

    private void actualizarDescriptor(String descriptor) {
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
            java.util.logging.Logger.getLogger(Bandeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bandeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bandeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bandeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Bandeja().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Bandeja.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Bandeja.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCorreoExterno;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnNuevoCorreo;
    private javax.swing.JButton jBtnVerMensaje;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JList<String> jListCorreos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.gui;

import com.ejemplo.dominio.Consultor;
import com.ejemplo.dominio.Empleado;
import com.ejemplo.dominio.Empresa;
import com.ejemplo.dominio.TrabajadorFijo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author MARTIN
 */
public class JDNuevoEmpleado extends javax.swing.JDialog {

    /**
     * Creates new form JDNuevoObjeto
     */
    private Empresa empresa;
    
    public JDNuevoEmpleado(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, modal);
        initComponents();
        this.empresa = empresa;
  
        jcbTipos.setSelectedIndex(0);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jcbTipos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtLegajo = new javax.swing.JTextField();
        jtFecha = new javax.swing.JTextField();
        jlbAnio = new javax.swing.JLabel();
        lblExtra1 = new javax.swing.JLabel();
        jtPuesto = new javax.swing.JTextField();
        jlbExtra2 = new javax.swing.JLabel();
        jtExtra1 = new javax.swing.JTextField();
        jbAceptar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlbPuest = new javax.swing.JLabel();
        jlbCampo1 = new javax.swing.JLabel();
        jlbCampo2 = new javax.swing.JLabel();
        jtExtra2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar nuevo empleado");
        setResizable(false);

        jLabel3.setText("Tipo:");

        jcbTipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1- Consultor", "2- Empleado Fijo" }));
        jcbTipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTiposItemStateChanged(evt);
            }
        });
        jcbTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTiposActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Legajo:");

        jtLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLegajoActionPerformed(evt);
            }
        });

        jtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaActionPerformed(evt);
            }
        });

        jlbAnio.setText("Fecha:");

        jtPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPuestoActionPerformed(evt);
            }
        });

        jtExtra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtExtra1ActionPerformed(evt);
            }
        });

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlbPuest.setText("Puesto:");

        jlbCampo1.setText("jLabel5");

        jlbCampo2.setText("jLabel5");

        jtExtra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtExtra2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbAnio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbPuest, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbCampo1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbCampo2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtExtra2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbAceptar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbCancelar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtPuesto)
                            .addComponent(jtFecha)
                            .addComponent(jtNombre)
                            .addComponent(jcbTipos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtExtra1)
                            .addComponent(jtLegajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbExtra2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExtra1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lblExtra1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbExtra2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcbTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbAnio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbPuest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtExtra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbCampo1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtExtra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbCampo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAceptar)
                    .addComponent(jbCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTiposItemStateChanged

    }//GEN-LAST:event_jcbTiposItemStateChanged

    private void jcbTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTiposActionPerformed
        if (jcbTipos.getSelectedIndex() != -1) {
            char t = jcbTipos.getSelectedItem().toString().charAt(0);
            if (t == '1') {
                jlbCampo1.setText("Valor Hora:");
                jlbCampo2.setText("Ctd Horas:");
            } else {
                jlbCampo1.setText("Sueldo:");
                jlbCampo2.setText("Hrs Extra:");
            }
        }
    }//GEN-LAST:event_jcbTiposActionPerformed

    private void jtLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLegajoActionPerformed

    private void jtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaActionPerformed

    private void jtPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPuestoActionPerformed

    private void jtExtra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtExtra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtExtra1ActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        String nom, puesto;
        int leg;
        Date fecha;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Empleado e;
        try {
            leg = Integer.parseInt(jtLegajo.getText());
            nom = jtNombre.getText();
            fecha = sdf.parse(jtFecha.getText());
            puesto = jtPuesto.getText();
            
            float campo1 = Float.parseFloat(jtExtra1.getText());
            int campo2 = Integer.parseInt(jtExtra2.getText());

            if (jcbTipos.getSelectedItem().toString().charAt(0) == '1') {
                
                e = new Consultor(campo1, campo2,leg, nom, fecha, puesto);
            } else {
                e = new TrabajadorFijo(campo1, campo2, leg, nom, fecha, puesto);
            }
            boolean aviso = empresa.agregarTrabajador(e);
            if(aviso)
                JOptionPane.showMessageDialog(this, "Empleado registrado!");
            else
                JOptionPane.showMessageDialog(this, "NO se ha podido registrar el empleado!");
            
            this.dispose();
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Error de números");
        }catch(ParseException pe){
            JOptionPane.showMessageDialog(this, "Fecha incorrecta");
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtExtra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtExtra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtExtra2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JComboBox jcbTipos;
    private javax.swing.JLabel jlbAnio;
    private javax.swing.JLabel jlbCampo1;
    private javax.swing.JLabel jlbCampo2;
    private javax.swing.JLabel jlbExtra2;
    private javax.swing.JLabel jlbPuest;
    private javax.swing.JTextField jtExtra1;
    private javax.swing.JTextField jtExtra2;
    private javax.swing.JTextField jtFecha;
    private javax.swing.JTextField jtLegajo;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPuesto;
    private javax.swing.JLabel lblExtra1;
    // End of variables declaration//GEN-END:variables
}

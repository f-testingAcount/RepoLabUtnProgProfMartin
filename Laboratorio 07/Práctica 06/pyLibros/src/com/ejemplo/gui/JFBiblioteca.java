/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.gui;

import com.ejemplo.dominio.Biblioteca;
import javax.swing.JOptionPane;

/**
 *
 * @author MARTIN
 */
public class JFBiblioteca extends javax.swing.JFrame {

    private Biblioteca biblioteca;

    /**
     * Creates new form JFBiblioteca
     */
    public JFBiblioteca() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Biblioteca");
        biblioteca = new Biblioteca();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbMostrar = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtTitulo = new javax.swing.JTextField();
        jbFiltrarTit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaNomina = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jtPaginas = new javax.swing.JTextField();
        jtFiltrarPag = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbMostrar.setText("Mostrar");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("T??tulo:");

        jbFiltrarTit.setText("Filtrar");
        jbFiltrarTit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltrarTitActionPerformed(evt);
            }
        });

        jtaNomina.setColumns(20);
        jtaNomina.setRows(5);
        jtaNomina.setEnabled(false);
        jScrollPane1.setViewportView(jtaNomina);

        jLabel3.setText("P??ginas: ");

        jtPaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPaginasKeyTyped(evt);
            }
        });

        jtFiltrarPag.setText("Filtrar");
        jtFiltrarPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFiltrarPagActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtTitulo)
                            .addComponent(jtPaginas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbFiltrarTit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtFiltrarPag, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFiltrarTit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFiltrarPag))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMostrar)
                    .addComponent(jbAgregar)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
        jtaNomina.setText(biblioteca.mostrarListado());
    }//GEN-LAST:event_jbMostrarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        JDNuevaPublicacion nuevo = new JDNuevaPublicacion(this, true, biblioteca);
        nuevo.setVisible(true);
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbFiltrarTitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltrarTitActionPerformed
        if (jtTitulo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe completar el campo 'T??tulo'");
        } else {
            String aux = biblioteca.buscarPublicacion(jtTitulo.getText());
            JOptionPane.showMessageDialog(this, aux);
            jtTitulo.setText("");
        }
    }//GEN-LAST:event_jbFiltrarTitActionPerformed

    private void jtPaginasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPaginasKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_jtPaginasKeyTyped

    private void jtFiltrarPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFiltrarPagActionPerformed
        if (jtPaginas.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe completar el campo 'P??ginas'");
        } else {
            int pag = 0;
            try {
                pag = Integer.parseInt(jtPaginas.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor incorrecto para el campo 'P??ginas'");
            }
            int total = biblioteca.contarLibros(pag);
            JOptionPane.showMessageDialog(this, "Total de libros con mas de " 
                    + pag + " p??ginas: " + total);
            jtPaginas.setText("");
        }

    }//GEN-LAST:event_jtFiltrarPagActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbFiltrarTit;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jtFiltrarPag;
    private javax.swing.JTextField jtPaginas;
    private javax.swing.JTextField jtTitulo;
    private javax.swing.JTextArea jtaNomina;
    // End of variables declaration//GEN-END:variables
}

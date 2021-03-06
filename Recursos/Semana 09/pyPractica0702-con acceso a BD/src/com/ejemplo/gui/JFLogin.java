/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MARTIN
 */
public class JFLogin extends javax.swing.JFrame {

    private final String USUARIO = "java";
    private final String PASS = "java";

    /**
     * Creates new form JFLogin
     */
    public JFLogin() {
        initComponents();
        setTitle("Login");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jtPassword = new javax.swing.JTextField();
        jbIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Password:");

        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbIngresar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbIngresar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        if (jtUsuario.getText().equals("") || jtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Los campos: Usuario y/o Password son requeridos!", "Login", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                /* if(jtUsuario.getText().equals(USUARIO) && jtPassword.getText().equals(PASS))
                JOptionPane.showMessageDialog(this,"Bienvenido <java> al sistema!", "Login", JOptionPane.INFORMATION_MESSAGE);
                else
                JOptionPane.showMessageDialog(this,"Usuario y/o Password incorrectos!", "Login", JOptionPane.ERROR_MESSAGE);
                 */

                //URL de conexi??n: base + usuario + pass
                String sql = "SELECT *"
                        + " FROM USUARIOS t"
                        + " WHERE t.NOMBRE = '" + jtUsuario.getText() + "'"
                        + " AND t.PASSWORD = '" + jtPassword.getText() + "'";
                //Crear conexion
                Connection cnn = DriverManager.getConnection("jdbc:derby://localhost:1527/Prueba", "administrador", "admin");
                //crear un comando
                Statement stmt = cnn.createStatement();

                //ejecutar y obtener un conjunto de resultados
                ResultSet rs = stmt.executeQuery(sql);

                if (rs.next()) {
                    //5. Acceder a cada campo de la fila:
                    JOptionPane.showMessageDialog(this, "Usuario validado!");
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario y/o password incorrectos!");
                }
                
                rs.close();
                stmt.close();
                cnn.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error. No se puede conectar con la BD");
            }
        }
    }//GEN-LAST:event_jbIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JTextField jtPassword;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectotenis;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class CrearUsuario extends javax.swing.JFrame {

    /**
     * Creates new form MiQuintaInterfazCrearUsuario
     */
    public CrearUsuario(String user, String contraseña) {
        initComponents();
        userinv.setText(user);
        continv.setText(contraseña);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userinv = new javax.swing.JTextField();
        continv = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Texto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        confcontraseña = new javax.swing.JPasswordField();
        apellidos = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nivel = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        correo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fechanac = new com.toedter.calendar.JDateChooser();
        apellidos1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        userinv.setText("jTextField1");

        continv.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 550));
        setSize(new java.awt.Dimension(400, 550));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(6, 215, 388, 10);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Nombre: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(37, 279, 110, 18);

        jPanel1.setBackground(new java.awt.Color(102, 153, 0));

        jPanel4.setBackground(new java.awt.Color(95, 122, 97));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 51));
        jLabel10.setText("X");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jLabel10.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jLabel10VetoableChange(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel11.setText("-");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setText("❐");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        Texto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Texto.setForeground(new java.awt.Color(214, 242, 230));
        Texto.setText("Rellene sus datos para registrarse:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 199, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 200, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 60);

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 510, 400, 40);

        jPanel3.setBackground(new java.awt.Color(188, 245, 39));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Usuario: ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 20, 130, 18);

        usuario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jPanel3.add(usuario);
        usuario.setBounds(220, 20, 150, 24);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Contraseña: ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 60, 120, 18);

        contraseña.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        jPanel3.add(contraseña);
        contraseña.setBounds(220, 60, 150, 24);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Confirmar contraseña: ");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 100, 180, 18);

        confcontraseña.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        confcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confcontraseñaActionPerformed(evt);
            }
        });
        jPanel3.add(confcontraseña);
        confcontraseña.setBounds(220, 100, 150, 24);

        apellidos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jPanel3.add(apellidos);
        apellidos.setBounds(190, 260, 137, 24);

        nombre.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel3.add(nombre);
        nombre.setBounds(190, 220, 137, 24);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Día de nacimiento:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(40, 300, 140, 18);

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setText("Apellidos: ");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(40, 260, 110, 18);
        jPanel3.add(nivel);
        nivel.setBounds(190, 340, 60, 22);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Correo: ");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 380, 110, 18);

        volver.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel3.add(volver);
        volver.setBounds(30, 410, 92, 25);

        agregar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel3.add(agregar);
        agregar.setBounds(270, 410, 93, 25);

        correo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jPanel3.add(correo);
        correo.setBounds(190, 380, 137, 24);

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setText("Nivel de tenis:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(40, 340, 110, 18);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("Agregar datos opcionales del nuevo usuario: ");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(40, 170, 330, 18);
        jPanel3.add(fechanac);
        fechanac.setBounds(190, 300, 140, 22);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 60, 400, 450);

        apellidos1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        getContentPane().add(apellidos1);
        apellidos1.setBounds(195, 321, 137, 24);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Apellidos: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(37, 321, 110, 18);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        inicio i = new inicio();
        i.show();
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (contraseña.getText().equals(confcontraseña.getText())) {
            login.comprobarvacio(usuario, contraseña, confcontraseña);
            login.registrar(usuario, contraseña, nombre, apellidos,fechanac,  nivel, correo);
            JOptionPane.showMessageDialog(null, "Creada con éxito", "Bien", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error, las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void confcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confcontraseñaActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jLabel10VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10VetoableChange

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Texto;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField apellidos1;
    private javax.swing.JPasswordField confcontraseña;
    private javax.swing.JTextField continv;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField correo;
    private com.toedter.calendar.JDateChooser fechanac;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner nivel;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField userinv;
    private javax.swing.JTextField usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
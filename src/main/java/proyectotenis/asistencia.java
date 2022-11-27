/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectotenis;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class asistencia extends javax.swing.JFrame {

    /**
     * Creates new form notasb
     */
    public asistencia(String user, String contraseña) {
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

        continv = new javax.swing.JTextField();
        userinv = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        atras = new javax.swing.JButton();
        subir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        grupo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nivel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        elegir = new javax.swing.JComboBox<>();

        continv.setText("jTextField1");

        userinv.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 300));
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));

        atras.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        subir.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        subir.setText("Subir a BD");
        subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(subir)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atras)
                    .addComponent(subir))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 240, 400, 60);

        jPanel1.setBackground(new java.awt.Color(188, 245, 39));
        jPanel1.setLayout(null);

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario);
        usuario.setBounds(200, 40, 150, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 50, 77, 20);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Grupo: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 90, 77, 18);

        grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoActionPerformed(evt);
            }
        });
        jPanel1.add(grupo);
        grupo.setBounds(200, 80, 150, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Nivel:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 130, 95, 18);

        nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelActionPerformed(evt);
            }
        });
        jPanel1.add(nivel);
        nivel.setBounds(200, 120, 150, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Asitencia:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 170, 95, 18);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel11.setText("-");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(340, 0, 12, 20);

        jLabel12.setText("❐");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(360, 6, 20, 20);

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
        jPanel1.add(jLabel10);
        jLabel10.setBounds(380, 0, 14, 26);

        elegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no" }));
        jPanel1.add(elegir);
        elegir.setBounds(200, 170, 110, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 240);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Profesor p = new Profesor(userinv.getText(), continv.getText());
        p.show();
        this.dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void subirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirActionPerformed
        int a = login.subir(nivel, grupo, elegir, usuario);
        if (a == 1) {
            JOptionPane.showMessageDialog(null, "Se han actualizado los datos", "Bien", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido actualizar", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_subirActionPerformed

    private void nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelActionPerformed

    private void grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jLabel10VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10VetoableChange

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
            java.util.logging.Logger.getLogger(asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asistencia(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JTextField continv;
    private javax.swing.JComboBox<String> elegir;
    private javax.swing.JTextField grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nivel;
    private javax.swing.JButton subir;
    private javax.swing.JTextField userinv;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
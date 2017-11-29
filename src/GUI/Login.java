package GUI;

import javax.swing.JOptionPane;
import GUI.*;
import Conexion.Conexion;
import Clases.*;

import UpperEssential.UpperEssentialLookAndFeel;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(java.awt.Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbtAdmin = new javax.swing.JRadioButton();
        rbtVendedor = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        admin = new javax.swing.JLabel();
        vende = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnManual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1600, 915));
        setMinimumSize(new java.awt.Dimension(1600, 915));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 915));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 220)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Rosa Belén");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 270, 1350, 270);

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 220)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Florería");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 30, 1000, 230);

        buttonGroup1.add(rbtAdmin);
        rbtAdmin.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        rbtAdmin.setText("Administrador");
        rbtAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAdminActionPerformed(evt);
            }
        });
        getContentPane().add(rbtAdmin);
        rbtAdmin.setBounds(810, 600, 380, 50);

        buttonGroup1.add(rbtVendedor);
        rbtVendedor.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        rbtVendedor.setText("Vendedor");
        rbtVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(rbtVendedor);
        rbtVendedor.setBounds(810, 720, 350, 50);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1430, 740, 110, 60);

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administrador.jpg"))); // NOI18N
        getContentPane().add(admin);
        admin.setBounds(760, 600, 170, 50);

        vende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vendedor.png"))); // NOI18N
        getContentPane().add(vende);
        vende.setBounds(760, 720, 160, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 560, 230, 220);

        btnManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manual.jpg"))); // NOI18N
        btnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualActionPerformed(evt);
            }
        });
        getContentPane().add(btnManual);
        btnManual.setBounds(120, 590, 150, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtVendedorActionPerformed
        // TODO add your handling code here:

        String user = JOptionPane.showInputDialog(null, "ID");
        String password = JOptionPane.showInputDialog(null, "Password");

        if ("vendedor".equals(user) && "5678".equals(password)) {
            EntradaVende entrar = new EntradaVende();
            entrar.setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Vuelva a Intentarlo");
        }


    }//GEN-LAST:event_rbtVendedorActionPerformed

    private void rbtAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAdminActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String user = JOptionPane.showInputDialog(null, "ID");
        String password = JOptionPane.showInputDialog(null, "Password");

        if ("admin".equals(user) && "1234".equals(password)) {
            //JOptionPane.showMessageDialog(null,"login ok");
            EntradaAdmin entrar = new EntradaAdmin();
            entrar.setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Vuelva a Intentarlo");
        }
    }//GEN-LAST:event_rbtAdminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        //        JOptionPane.showMessageDialog(null, "Hasta Luego");
    }//GEN-LAST:event_jButton1ActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualActionPerformed
        // TODO add your handling code here:
         JOptionPane pane = new JOptionPane();

        pane.showMessageDialog(this, "►ADMINISTRADOR "
                + "\n -Tiene permitido el ingreso  de arreglos (BOTON INGRESAR)"
                + "\n -Tiene permitido la modificacion de arreglos (BOTON MODIFICAR)"
                + "\n -Tiene permitido eliminar arreglos (BOTON ELIMINAR)"
                + "\n -Tiene permitido ver la lista de arreglos (BOTON LISTA)"
                + "\n -Tiene permitido registrar trabajadores (BOTON TRABAJADORES)"
                + "\n \t*BOTON TRABAJADORES:"
                + "\n \t ↕Tiene permitido el ingreso  de trabajadores (BOTON INGRESAR VENDEDOR)"
                + "\n \t ↕Tiene permitido la modificacion de trabajadores (BOTON MODIFICAR VENDEDOR)"
                + "\n \t ↕Tiene permitido eliminar trabajadores (BOTON ELIMINAR VENDEDOR)"
                + "\n \t ↕Tiene permitido ver la lista de ventas de cada trabajador (BOTON LISTA DE TRANSACCIONES)"
                + "\n\n►VENDEDOR"
                + "\n -Seleccionar la categoria (CATEGORIA)"
                + "\n -Seleccionar el arreglo deseado (ARREGLO)"
                + "\n -Seleccionar la cantidad de productos (CANTIDAD)"
                + "\n -Seleccionar agregar al carrito (BOTON AÑADIR A CARRITO)"
                + "\n -Si se quiere eliminar un producto (BOTON ELIMINAR ARREGLO)"
                + "\n -Para realizar la compra (BOTON COMPRAR)"
                + "\n -Seleccionar (BOLETA) O (FACTURA)"
                + "\n -Llenar los datos para efectuar el comprobante (BOTON GENERAR COMPROBANTE)", "MANUAL DE USUARIO", JOptionPane.INFORMATION_MESSAGE);
        
                pane.setBackground(Color.red);
    }//GEN-LAST:event_btnManualActionPerformed

    private void close() {
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea SALIR del Inicio?",
                "Cerrar Ventana", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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

        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\Janet\\Desktop\\26-11-17\\Lib UpperEssential\\Chocolate.theme"));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JButton btnManual;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rbtAdmin;
    private javax.swing.JRadioButton rbtVendedor;
    private javax.swing.JLabel vende;
    // End of variables declaration//GEN-END:variables
}

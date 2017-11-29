/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import Conexion.Conexion;
import UpperEssential.UpperEssentialLookAndFeel;
import java.sql.*;
import java.util.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Admin
 */
public class RegistrarArreglo extends javax.swing.JFrame {

    CallableStatement cst;
    Connection cn;
    Statement stm;
    ResultSet rs;
    
    public RegistrarArreglo() {
        initComponents();
        ListaCategorias();
        this.setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        cbxCate = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnIngresar1 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        btnLista1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 915));
        setMinimumSize(new java.awt.Dimension(1600, 915));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 915));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel1.setText("CODIGO:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 230, 210, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 230, 210, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel3.setText("DESCRIPCION:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 320, 240, 60);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel4.setText("PRECIO: S/.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 410, 210, 60);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel5.setText("STOCK:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 410, 200, 60);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel6.setText("CATEGORIA:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 500, 230, 60);

        txtCodigo.setAutoscrolls(false);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(190, 240, 230, 50);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(610, 240, 450, 50);
        getContentPane().add(txtDesc);
        txtDesc.setBounds(250, 330, 810, 50);
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(210, 420, 150, 50);
        getContentPane().add(txtStock);
        txtStock.setBounds(610, 420, 150, 50);

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnIngresar.setText("AGREGAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(770, 670, 250, 70);

        cbxCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCateActionPerformed(evt);
            }
        });
        getContentPane().add(cbxCate);
        cbxCate.setBounds(250, 510, 350, 50);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(63, 60));
        jButton1.setMinimumSize(new java.awt.Dimension(63, 60));
        jButton1.setPreferredSize(new java.awt.Dimension(63, 60));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1410, 780, 100, 50);

        btnIngresar1.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        btnIngresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8761.png"))); // NOI18N
        btnIngresar1.setText("Ingresar");
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar1);
        btnIngresar1.setBounds(1160, 300, 310, 70);

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit2_icon-icons.com_61199.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(1160, 390, 310, 70);

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(1160, 480, 310, 70);

        btnLista.setBackground(new java.awt.Color(255, 255, 255));
        btnLista.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        btnLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        btnLista.setText("Lista     ");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLista);
        btnLista.setBounds(1160, 570, 320, 70);

        btnLista1.setBackground(new java.awt.Color(255, 255, 255));
        btnLista1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        btnLista1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vendedor.png"))); // NOI18N
        btnLista1.setText("Trabajadores");
        btnLista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLista1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLista1);
        btnLista1.setBounds(1160, 660, 320, 70);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        jLabel7.setText("Bienvenido");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1190, 220, 280, 70);

        fondo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(fondo);
        fondo.setBounds(1130, 210, 380, 560);

        jLabel8.setFont(new java.awt.Font("Segoe Script", 3, 160)); // NOI18N
        jLabel8.setText("Rosa Belén");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 10, 960, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String codigo, nombre, descrip, cate ;
        int stock;
        double precio;

        codigo = this.txtCodigo.getText();
        nombre = this.txtNombre.getText();
        descrip = this.txtDesc.getText();
        cate = this.cbxCate.getSelectedItem().toString();
        precio = Double.parseDouble(this.txtPrecio.getText());
        stock = Integer.parseInt(this.txtStock.getText());
    
        try {
            cst = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
            + "database=Floreria;user=sa;password=123456;").prepareCall("{call sp_Registrar(?,?,?,?,?,?)}");            
            cst.setString("Cod", codigo);
            cst.setString("Nombre", nombre);
            cst.setString("Descrip", descrip);
            cst.setDouble("Precio", precio);
            cst.setInt("Stock", stock);
            cst.setString("Categ", cate);
            
            int rpta = cst.executeUpdate();
            if (rpta == 1) {
                JOptionPane.showMessageDialog(this,"* "+ nombre + " registrado correctamente!!", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
                
        EntradaAdmin entrar = new EntradaAdmin();
        entrar.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        //JOptionPane.showMessageDialog(null, "Hasta Luego");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        // TODO add your handling code here:
        RegistrarArreglo entrar = new RegistrarArreglo();
        entrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        ModificarArreglo entrar = new ModificarArreglo();
        entrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        EliminarArreglo entrar = new EliminarArreglo();
        entrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        // TODO add your handling code here:
        EntradaAdmin entrar = new EntradaAdmin();
        entrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnListaActionPerformed

    private void btnLista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLista1ActionPerformed

    private void cbxCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCateActionPerformed

    private void close(){
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea Volver al Inicio?",
                "Cerrar Ventana", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
//          Marca_salida();
          Login c = new Login();
          c.setVisible(true);
          dispose();
        }          
    } 
        
    private void ListaCategorias() {
        Vector carreras = null;
        try{
            stm = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
            + "database=Floreria;user=sa;password=123456;").createStatement();
            String query = "SELECT DISTINCT * FROM categoriaArreglo;";
            rs = stm.executeQuery(query);
            carreras = new Vector();
            while(rs.next()){
                cbxCate.addItem(rs.getString("nombre_cat"));
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
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
            java.util.logging.Logger.getLogger(RegistrarArreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarArreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarArreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarArreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\Janet\\Desktop\\26-11-17\\Lib UpperEssential\\Chocolate.theme"));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarArreglo().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnLista1;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxCate;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
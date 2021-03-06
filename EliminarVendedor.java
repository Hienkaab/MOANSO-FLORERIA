/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.Conexion;
import UpperEssential.UpperEssentialLookAndFeel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author HIENKA
 */
public class EliminarVendedor extends javax.swing.JFrame {

    /**
     * Creates new form EliminarVendedor
     */
    CallableStatement cst;
    Connection cn;
    Statement stm;
    ResultSet rs;
    PreparedStatement s;
    Connection con=null;
    Vector registros=null;
    
    public EliminarVendedor() {
        initComponents();
        txtCodigo.setEnabled(false);
        txtDni.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtEdad.setEnabled(false);
        txtTelf.setEnabled(false);
        txtCel.setEnabled(false);
        txtDirec.setEnabled(false);
        txtModo.setEnabled(false);
        txtPassword.setEnabled(false);
        
        cargarNombres();
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

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fondo1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDirec = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCel = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblVendedor = new javax.swing.JLabel();
        cbxVendedor = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtModo = new javax.swing.JTextField();
        btnEliminar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel4.setText("Volver al Inicio");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1220, 720, 200, 32);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        jLabel6.setText("Bienvenido ADMIN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1060, 230, 450, 70);

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8761.png"))); // NOI18N
        btnIngresar.setText("Ingresar Vendedor");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(1070, 320, 420, 70);

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit2_icon-icons.com_61199.png"))); // NOI18N
        btnModificar.setText("Modificar Vendedor");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(1070, 420, 420, 70);

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar Vendedor");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(1070, 520, 420, 70);

        btnLista.setBackground(new java.awt.Color(255, 255, 255));
        btnLista.setFont(new java.awt.Font("Segoe UI Semilight", 1, 30)); // NOI18N
        btnLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        btnLista.setText("Lista de Transacciones");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLista);
        btnLista.setBounds(1070, 620, 420, 70);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1400, 710, 100, 50);

        fondo1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        fondo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(fondo1);
        fondo1.setBounds(1030, 220, 500, 560);

        jLabel5.setFont(new java.awt.Font("Segoe Script", 3, 160)); // NOI18N
        jLabel5.setText("Rosa Belén");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 10, 960, 180);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel1.setText("CODIGO:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 290, 210, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel3.setText("NOMBRE COMPLETO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 360, 250, 60);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel7.setText("DNI:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 290, 60, 60);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel8.setText("TELÉFONO:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 440, 140, 60);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel9.setText("MODALIDAD:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 600, 230, 60);

        txtCodigo.setAutoscrolls(false);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(140, 300, 230, 50);
        getContentPane().add(txtApellido);
        txtApellido.setBounds(610, 370, 330, 50);
        getContentPane().add(txtDni);
        txtDni.setBounds(450, 300, 260, 50);
        getContentPane().add(txtTelf);
        txtTelf.setBounds(430, 450, 210, 50);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel10.setText("EDAD:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 440, 80, 60);
        getContentPane().add(txtEdad);
        txtEdad.setBounds(110, 450, 150, 50);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel11.setText("DIRECCIÓN:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 520, 150, 60);
        getContentPane().add(txtDirec);
        txtDirec.setBounds(160, 530, 850, 50);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel12.setText("CELULAR:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(660, 450, 110, 60);
        getContentPane().add(txtCel);
        txtCel.setBounds(780, 450, 230, 50);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel13.setText("CONTRASEÑA:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(500, 600, 170, 60);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(690, 610, 320, 50);

        lblVendedor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        lblVendedor.setText("Vendedor:");
        getContentPane().add(lblVendedor);
        lblVendedor.setBounds(50, 220, 130, 30);

        cbxVendedor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        cbxVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(cbxVendedor);
        cbxVendedor.setBounds(180, 210, 530, 50);

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(750, 240, 200, 70);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(270, 370, 330, 50);
        getContentPane().add(txtModo);
        txtModo.setBounds(190, 610, 260, 50);

        btnEliminar1.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar1.setText("ELIMINAR");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar1);
        btnEliminar1.setBounds(590, 680, 260, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        RegistrarVendedor entrar = new RegistrarVendedor();
        entrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        ModificarVendedor entrar = new ModificarVendedor();
        entrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        EliminarVendedor entrar = new EliminarVendedor();
        entrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        // TODO add your handling code here:
        EntradaAdmin entrar = new EntradaAdmin();
        entrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnListaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        close();
        //        JOptionPane.showMessageDialog(null, "Hasta Luego");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbxVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVendedorActionPerformed

    }//GEN-LAST:event_cbxVendedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        sacarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        String codigo;

        codigo = this.txtCodigo.getText();
        eliminarVendedor(codigo);

        RegistrarVendedor entrar = new RegistrarVendedor();
        entrar.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnEliminar1ActionPerformed


    private void sacarDatos() {
        try{
            con=Conexion.getConexion();
            Statement stm=con.createStatement();
            String query="SELECT * FROM Vendedor where [nombre + apellido]='"                
                +cbxVendedor.getSelectedItem()+"'"; 
            ResultSet rs=stm.executeQuery(query);
            registros=new Vector();
            while (rs.next()){
                txtCodigo.setText(rs.getString("codigo"));
                txtNombre.setText(rs.getString("nombre"));
                txtApellido.setText(rs.getString("apellido"));
                txtDni.setText(rs.getString(String.valueOf("dni")));
                txtDni.setText(rs.getString(String.valueOf("edad")));
                txtDni.setText(rs.getString(String.valueOf("telf")));
                txtDni.setText(rs.getString(String.valueOf("cel")));
                txtDirec.setText(rs.getString("direc"));
                txtModo.setText(rs.getString("modo"));
                txtPassword.setText(rs.getString("contra"));
                
            }
        }catch(SQLException e){
          JOptionPane.showMessageDialog(rootPane, e.getMessage());    
        } 
    }
    private void close(){
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea Volver al Inicio?",
                "Cerrar Ventana", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
//          Marca_salida();
          EntradaAdmin c = new EntradaAdmin();
          c.setVisible(true);
          dispose();
        }          
    } 

    private void cargarNombres() {
                Connection cn=null;
        Vector registros=null;
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=Floreria;"
               +"user=sa;password=123456");
            Statement stm=cn.createStatement();
            String query2="Select distinct * from Vendedor";
            ResultSet rs=stm.executeQuery(query2);
            registros=new Vector();
            while(rs.next()){
                cbxVendedor.addItem(rs.getString("nombre + apellido"));                
            }
        }catch(SQLException e){
          JOptionPane.showMessageDialog(rootPane, e.getMessage());    
        }catch(ClassNotFoundException e){}

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
            java.util.logging.Logger.getLogger(EliminarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\Docente\\Downloads\\Lib UpperEssential\\Chocolate.theme"));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxVendedor;
    private javax.swing.JLabel fondo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtModo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelf;
    // End of variables declaration//GEN-END:variables

    private void eliminarVendedor(String codigo) {
            try {
            cst = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
            + "database=Floreria;user=sa;password=123456;").prepareCall("{call sp_EliminarVendedor(?)}");            
            cst.setString("Cod", codigo);
                        
            int rpta = cst.executeUpdate();
            if (rpta == 1) {
                JOptionPane.showMessageDialog(this,"* "+ codigo+ " eliminado correctamente!!", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } }


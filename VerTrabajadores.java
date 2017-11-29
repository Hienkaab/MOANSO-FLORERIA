package GUI;
import Conexion.Conexion;
import UpperEssential.UpperEssentialLookAndFeel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class VerTrabajadores extends javax.swing.JFrame {

    /**
     * Creates new form Lista_Transacciones
     */
    public VerTrabajadores() {
        initComponents();
        
        cbxAnio.setVisible(false);
        cbxMes.setVisible(false);
        cbxDia.setVisible(false);
        cbxVendedor.setVisible(false);
        lblVendedor.setVisible(false);
        btnConsultarAnio.setVisible(false);
        btnConsultarMes.setVisible(false);
        btnConsultarDia.setVisible(false);
        
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

        lblVendedor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        cbxVendedor = new javax.swing.JComboBox<>();
        cbxDia = new javax.swing.JComboBox<>();
        btnConsultarAnio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cbxAnio = new javax.swing.JComboBox<>();
        cbxMes = new javax.swing.JComboBox<>();
        btnAnual = new javax.swing.JButton();
        btnMensual = new javax.swing.JButton();
        btnDiario = new javax.swing.JButton();
        btnConsultarMes = new javax.swing.JButton();
        btnConsultarDia = new javax.swing.JButton();
        fondo1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 915));
        setMinimumSize(new java.awt.Dimension(1600, 915));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 915));
        getContentPane().setLayout(null);

        lblVendedor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        lblVendedor.setText("Vendedor:");
        getContentPane().add(lblVendedor);
        lblVendedor.setBounds(60, 800, 130, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel4.setText("Volver al Inicio");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1220, 720, 200, 32);

        tblLista.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblLista.setEnabled(false);
        jScrollPane2.setViewportView(tblLista);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 400, 910, 380);

        cbxVendedor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        cbxVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxVendedorActionPerformed(evt);
            }
        });
        getContentPane().add(cbxVendedor);
        cbxVendedor.setBounds(200, 790, 330, 50);

        cbxDia.setFont(new java.awt.Font("Segoe UI Light", 1, 22)); // NOI18N
        cbxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbxDia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Día", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 1, 18))); // NOI18N
        cbxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDiaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxDia);
        cbxDia.setBounds(440, 290, 150, 90);

        btnConsultarAnio.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultarAnio.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        btnConsultarAnio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        btnConsultarAnio.setText("CONSULTAR");
        btnConsultarAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarAnioActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarAnio);
        btnConsultarAnio.setBounds(640, 300, 230, 60);

        jLabel5.setFont(new java.awt.Font("Segoe Script", 3, 160)); // NOI18N
        jLabel5.setText("Rosa Belén");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 10, 960, 180);

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

        cbxAnio.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        cbxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2017" }));
        cbxAnio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Año", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 1, 18))); // NOI18N
        cbxAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAnioActionPerformed(evt);
            }
        });
        getContentPane().add(cbxAnio);
        cbxAnio.setBounds(30, 290, 150, 90);

        cbxMes.setFont(new java.awt.Font("Segoe UI Light", 1, 22)); // NOI18N
        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));
        cbxMes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 1, 18))); // NOI18N
        cbxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMesActionPerformed(evt);
            }
        });
        getContentPane().add(cbxMes);
        cbxMes.setBounds(230, 290, 150, 90);

        btnAnual.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        btnAnual.setText("Lista Anual");
        btnAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnualActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnual);
        btnAnual.setBounds(30, 200, 200, 60);

        btnMensual.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        btnMensual.setText("Lista Mensual");
        btnMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensualActionPerformed(evt);
            }
        });
        getContentPane().add(btnMensual);
        btnMensual.setBounds(290, 200, 200, 60);

        btnDiario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        btnDiario.setText("Lista Diaria");
        btnDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiario);
        btnDiario.setBounds(560, 200, 200, 60);

        btnConsultarMes.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultarMes.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        btnConsultarMes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        btnConsultarMes.setText("CONSULTAR");
        btnConsultarMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMesActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarMes);
        btnConsultarMes.setBounds(640, 300, 230, 60);

        btnConsultarDia.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultarDia.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        btnConsultarDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        btnConsultarDia.setText("CONSULTAR");
        btnConsultarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarDia);
        btnConsultarDia.setBounds(640, 300, 230, 60);

        fondo1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        fondo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(fondo1);
        fondo1.setBounds(1030, 220, 500, 560);

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/list-on-a-notebook-stroke-symbol_icon-icons.com_57808.png"))); // NOI18N
        jButton1.setText("Ver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(580, 790, 150, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxVendedorActionPerformed
       listar();
    }//GEN-LAST:event_cbxVendedorActionPerformed

    private void cbxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDiaActionPerformed
           listarDia();
    }//GEN-LAST:event_cbxDiaActionPerformed

    private void btnConsultarAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarAnioActionPerformed
        // TODO add your handling code here:
        LlenarAnio();
        lblVendedor.setVisible(true);
        cbxVendedor.setVisible(true);
        cargarVendedor();
        
        
    }//GEN-LAST:event_btnConsultarAnioActionPerformed

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

    private void cbxAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAnioActionPerformed
        // TODO add your handling code here:
        listarAnio();
    }//GEN-LAST:event_cbxAnioActionPerformed

    private void cbxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMesActionPerformed
        // TODO add your handling code here:
        listarMes();
    }//GEN-LAST:event_cbxMesActionPerformed

    private void btnAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnualActionPerformed
        // TODO add your handling code here:
        cbxAnio.setVisible(true);
        cbxMes.setVisible(false);
        cbxDia.setVisible(false);
        btnConsultarAnio.setVisible(true);
        btnConsultarMes.setVisible(false);
        btnConsultarDia.setVisible(false);
        cbxVendedor.setVisible(false);
        lblVendedor.setVisible(false);

    }//GEN-LAST:event_btnAnualActionPerformed

    private void btnMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensualActionPerformed
        // TODO add your handling code here:
        cbxAnio.setVisible(true);
        cbxMes.setVisible(true);
        cbxDia.setVisible(false);
        btnConsultarAnio.setVisible(false);
        btnConsultarMes.setVisible(true);
        btnConsultarDia.setVisible(false);
        cbxVendedor.setVisible(false);
        lblVendedor.setVisible(false);
    }//GEN-LAST:event_btnMensualActionPerformed

    private void btnDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiarioActionPerformed
        // TODO add your handling code here:
        cbxAnio.setVisible(true);
        cbxMes.setVisible(true);
        cbxDia.setVisible(true);
        btnConsultarAnio.setVisible(false);
        btnConsultarMes.setVisible(false);
        btnConsultarDia.setVisible(true);
        cbxVendedor.setVisible(false);
        lblVendedor.setVisible(false);
    }//GEN-LAST:event_btnDiarioActionPerformed

    private void btnConsultarMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMesActionPerformed
        // TODO add your handling code here:
        llenarMes();        
        lblVendedor.setVisible(true);
        cbxVendedor.setVisible(true);
        cargarVendedor();
    }//GEN-LAST:event_btnConsultarMesActionPerformed

    private void btnConsultarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDiaActionPerformed
        // TODO add your handling code here:
        llenarDia();
        lblVendedor.setVisible(true);
        cbxVendedor.setVisible(true);
        cargarVendedor();
    }//GEN-LAST:event_btnConsultarDiaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cbxAnio.setVisible(false);
        cbxMes.setVisible(false);
        cbxDia.setVisible(false);
        btnConsultarAnio.setVisible(false);
        btnConsultarMes.setVisible(false);
        btnConsultarDia.setVisible(false);
        llenarVendedor();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void close(){
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea Volver al Inicio?",
                "Cerrar Ventana", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
//          Marca_salida();
          EntradaAdmin c = new EntradaAdmin();
          c.setVisible(true);
          dispose();
        }          
    } 
        
    private Vector listarAnio() {
         Connection con=null;
         Statement stm=null;
         Vector reg=null;
         try{
         con = Conexion.getConexion();
         stm=con.createStatement();
         ResultSet rs = stm.executeQuery("SELECT * FROM Ventas where year(fecha) = "
                + cbxAnio.getSelectedItem()+"' ");
         reg = new Vector();

             while(rs.next()){
             Vector item = new Vector();
             item.add(rs.getString("codVenta"));
             item.add(rs.getTimestamp("fecha"));
             item.add(rs.getString("vendedor"));
             item.add(rs.getFloat("total"));
             item.add(rs.getString("tipo"));
             item.add(rs.getString("pago"));
             reg.add(item);
             }
         }
         catch(Exception e){
         System.out.print(e);
         }
         return reg;
    }
    
    private Vector listarMes() {
         Connection con=null;
         Statement stm=null;
         Vector reg=null;
         try{
         con = Conexion.getConexion();
         stm=con.createStatement();
         ResultSet rs = stm.executeQuery("SELECT * FROM Ventas where year(fecha) = '"
                + cbxAnio.getSelectedItem()+"' and "
                         + "motnh(fecha)='"+ cbxMes.getSelectedIndex()+1 +"' ");
         reg = new Vector();

             while(rs.next()){
             Vector item = new Vector();
             item.add(rs.getString("codVenta"));
             item.add(rs.getTimestamp("fecha"));
             item.add(rs.getString("vendedor"));
             item.add(rs.getFloat("total"));
             item.add(rs.getString("tipo"));
             item.add(rs.getString("pago"));
             reg.add(item);
             }
         }
         catch(Exception e){
         System.out.print(e);
         }
         return reg;
    }
        
    private Vector listarDia() {
           Connection con=null;
         Statement stm=null;
         Vector reg=null;
         try{
         con = Conexion.getConexion();
         stm=con.createStatement();
         ResultSet rs = stm.executeQuery("SELECT * FROM Ventas where year(fecha) = '"
                + cbxAnio.getSelectedItem()+"' and "
                    + "motnh(fecha)='"+ cbxMes.getSelectedIndex()+1 +"' and "
                        + "day(fecha) = '"+ cbxDia.getSelectedItem() + "' ");
         reg = new Vector();

             while(rs.next()){
             Vector item = new Vector();
             item.add(rs.getString("codVenta"));
             item.add(rs.getTimestamp("fecha"));
             item.add(rs.getString("vendedor"));
             item.add(rs.getFloat("total"));
             item.add(rs.getString("tipo"));
             item.add(rs.getString("pago"));
             reg.add(item);
             }
         }
         catch(Exception e){
         System.out.print(e);
         }
         return reg;
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
            java.util.logging.Logger.getLogger(VerTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerTrabajadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

         UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\Janet\\Desktop\\26-11-17\\Lib UpperEssential\\Chocolate.theme"));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerTrabajadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnual;
    private javax.swing.JButton btnConsultarAnio;
    private javax.swing.JButton btnConsultarDia;
    private javax.swing.JButton btnConsultarMes;
    private javax.swing.JButton btnDiario;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnMensual;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxAnio;
    private javax.swing.JComboBox<String> cbxDia;
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox<String> cbxVendedor;
    private javax.swing.JLabel fondo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JTable tblLista;
    // End of variables declaration//GEN-END:variables

    private void llenarMes() {
        Vector colu = new Vector();
        colu.addElement("Codigo");
        colu.addElement("Fecha");
        colu.addElement("Vendedor");
        colu.addElement("Total");
        colu.addElement("Tipo de Comprobante");
        colu.addElement("Tipo de Pago");        
        Vector reg = new Vector();
        reg = listarMes();
        DefaultTableModel dtm = new DefaultTableModel(reg, colu);
        this.tblLista.setModel(dtm);
    }

    private void llenarDia() {
        Vector colu = new Vector();
        colu.addElement("Codigo");
        colu.addElement("Fecha");
        colu.addElement("Vendedor");
        colu.addElement("Total");
        colu.addElement("Tipo de Comprobante");
        colu.addElement("Tipo de Pago");        
        Vector reg = new Vector();
        reg = listarDia();
        DefaultTableModel dtm = new DefaultTableModel(reg, colu);
        this.tblLista.setModel(dtm);
    }

    private void LlenarAnio() {
        Vector colu = new Vector();
        colu.addElement("Codigo");
        colu.addElement("Fecha");
        colu.addElement("Vendedor");
        colu.addElement("Total");
        colu.addElement("Tipo de Comprobante");
        colu.addElement("Tipo de Pago");        
        Vector reg = new Vector();
        reg = listarAnio();
        DefaultTableModel dtm = new DefaultTableModel(reg, colu);
        this.tblLista.setModel(dtm);
    }

    private void cargarVendedor() {
        Connection cn=null;
        Vector registros=null;
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=Floreria;"
               +"user=sa;password=123456");
            Statement stm=cn.createStatement();
            String query2="Select distinct * from Vendedor order by nombre";
            ResultSet rs=stm.executeQuery(query2);
            registros=new Vector();
            while(rs.next()){
                cbxVendedor.addItem(rs.getString("nombre"));                
            }
        }catch(SQLException e){
          JOptionPane.showMessageDialog(rootPane, e.getMessage());    
        }catch(ClassNotFoundException e){}
    }

    private void llenarVendedor() {
        Vector colu = new Vector();
        colu.addElement("Codigo");
        colu.addElement("Fecha");
        colu.addElement("Vendedor");
        colu.addElement("Total");
        colu.addElement("Tipo de Comprobante");
        colu.addElement("Tipo de Pago");        
        Vector reg = new Vector();
        reg = listar();
        DefaultTableModel dtm = new DefaultTableModel(reg, colu);
        this.tblLista.setModel(dtm);
    }
    
    private Vector listar() {
         Connection con=null;
         Statement stm=null;
         Vector reg=null;
         try{
         con = Conexion.getConexion();
         stm=con.createStatement();
         ResultSet rs = stm.executeQuery("SELECT * FROM Ventas where vendedor = "
                + cbxVendedor.getSelectedItem()+"' order by fecha");
         reg = new Vector();

             while(rs.next()){
             Vector item = new Vector();
             item.add(rs.getString("codVenta"));
             item.add(rs.getTimestamp("fecha"));
             item.add(rs.getString("vendedor"));
             item.add(rs.getFloat("total"));
             item.add(rs.getString("tipo"));
             item.add(rs.getString("pago"));
             reg.add(item);
             }
         }
         catch(Exception e){
         System.out.print(e);
         }
         return reg;
    }
}
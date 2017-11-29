/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Conexion.Conexion;
import Clases.GenerarCodigo;
import UpperEssential.UpperEssentialLookAndFeel;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


public class EntradaVende extends javax.swing.JFrame implements Printable{
    static ResultSet rs=null;
    PreparedStatement s;
    Connection con=null;
    Vector registros=null;
    double sum=0, suma=0;
        
    //Declaramos los campos que tendra nuestra tabla - Si se omite esto.. saldran los compos propios de la tabla en la base de datos (nom_producto, etc)
    String[] titulos={"Arreglo","Precio Unitario","Cantidad","Precio Total"};
    //Mandas los campos a la tabla
    DefaultTableModel modelo = new DefaultTableModel(null,titulos); 
    
    String clav;
    /**
     * Creates new form Compras
     */
    public EntradaVende() {
        initComponents();
        setLocationRelativeTo(null);  
        Actualizar();
        Llenar_categoria();
        
        //Muestras la tabla la tabla con los campos que le diste al inicio
        this.tblCarrito.setModel(modelo);  
        
        txtUsuario.setEditable(false);
        txtPrecio.setEditable(false);
        txtStock.setEditable(false);
        txtUsuario.setEditable(false); 
        txtHora_Actual.setEditable(false);
        
    //Agregamos consulta al Boton "X"
//        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
// 
//        addWindowListener(new java.awt.event.WindowAdapter() {
//            @Override
//            public void windowClosing(java.awt.event.WindowEvent evt) {
//                close();
//            }
//        });
    }   
    
    private void close(){
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea Volver al Inicio?",
                "Cerrar Ventana", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
//          Marca_salida();
          Login c = new Login();
          c.setVisible(true);
          dispose();
        }                 
    } 
    
    public void Actualizar(){
        Timer timer = new Timer (1000, new ActionListener () 
        { 
            public void actionPerformed(ActionEvent e) 
            { 
                Llenar_Hora();
            } 
        }); 
        timer.start();   
    };
    
    void Llenar_Hora(){
        java.util.Date d = new java.util.Date(); 
        Timestamp timestamp1 = new Timestamp(d.getTime());
        txtHora_Actual.setText(String.valueOf(timestamp1));
    }    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHora_Actual = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        txtStock = new javax.swing.JTextField();
        btnAñadir_Arreglo = new javax.swing.JButton();
        txtCompra = new javax.swing.JTextField();
        cbx_Arreglo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnConfirmar_Compra = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtRUC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCodVenta = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        btnComprobante = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        fondoVenta = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Comprobante = new javax.swing.JPanel();
        prefondo = new javax.swing.JLabel();

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 915));
        setMinimumSize(new java.awt.Dimension(1600, 915));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 915));
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel7.setText("Vendedor :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 240, 150, 60);

        txtUsuario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        txtUsuario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtUsuarioPropertyChange(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(340, 240, 350, 60);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel9.setText("Hora actual:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(760, 240, 200, 60);

        txtHora_Actual.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        txtHora_Actual.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtHora_ActualPropertyChange(evt);
            }
        });
        getContentPane().add(txtHora_Actual);
        txtHora_Actual.setBounds(910, 240, 350, 60);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel1.setText("Cantidad:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(630, 490, 120, 30);

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(650, 420, 100, 40);

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCarrito.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tblCarrito);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 480, 560, 330);

        jLabel19.setFont(new java.awt.Font("Segoe Script", 3, 160)); // NOI18N
        jLabel19.setText("Rosa Belén");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(280, 50, 960, 180);

        cbxCategoria.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--" }));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxCategoria);
        cbxCategoria.setBounds(180, 370, 330, 40);

        txtStock.setEditable(false);
        txtStock.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        getContentPane().add(txtStock);
        txtStock.setBounds(650, 370, 100, 40);

        btnAñadir_Arreglo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        btnAñadir_Arreglo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito-de-compras.png"))); // NOI18N
        btnAñadir_Arreglo.setText("Añadir a Carrito");
        btnAñadir_Arreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadir_ArregloActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadir_Arreglo);
        btnAñadir_Arreglo.setBounds(630, 560, 250, 50);

        txtCompra.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        getContentPane().add(txtCompra);
        txtCompra.setBounds(750, 480, 100, 40);

        cbx_Arreglo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        cbx_Arreglo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--" }));
        cbx_Arreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_ArregloActionPerformed(evt);
            }
        });
        getContentPane().add(cbx_Arreglo);
        cbx_Arreglo.setBounds(180, 420, 330, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel4.setText("Precio S/.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 420, 120, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel6.setText("Stock");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(540, 370, 90, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel3.setText("RUC:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1080, 430, 50, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel5.setText("Arreglo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 420, 130, 40);

        btnConfirmar_Compra.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        btnConfirmar_Compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprado.png"))); // NOI18N
        btnConfirmar_Compra.setText("Comprar");
        btnConfirmar_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar_CompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar_Compra);
        btnConfirmar_Compra.setBounds(630, 700, 250, 50);

        btnEliminar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar Arreglo");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(630, 630, 250, 50);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 20)); // NOI18N
        jLabel8.setText("Registro del Comprador");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(910, 390, 230, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel10.setText("Categoria");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 370, 140, 40);

        txtDNI.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(txtDNI);
        txtDNI.setBounds(960, 430, 100, 30);
        getContentPane().add(txtRUC);
        txtRUC.setBounds(1130, 430, 100, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel11.setText("DNI:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(910, 430, 70, 25);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel12.setText("NOMBRE DEL CLIENTE: ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(910, 470, 220, 25);
        getContentPane().add(txtCliente);
        txtCliente.setBounds(910, 500, 320, 30);
        getContentPane().add(txtRazonSocial);
        txtRazonSocial.setBounds(910, 570, 320, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel14.setText("Importe:  S/. ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(910, 660, 120, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel13.setText("RAZÓN SOCIAL: ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(910, 540, 170, 25);
        getContentPane().add(txtSubTotal);
        txtSubTotal.setBounds(1030, 610, 100, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        jLabel15.setText("VENTA N.");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(1070, 370, 90, 20);

        txtCodVenta.setEditable(false);
        txtCodVenta.setBorder(null);
        getContentPane().add(txtCodVenta);
        txtCodVenta.setBounds(1150, 370, 90, 20);
        getContentPane().add(txtCambio);
        txtCambio.setBounds(1030, 730, 100, 30);

        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel16.setText("SubTotal: S/.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(910, 620, 120, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel17.setText("Cambio:   S/. ");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(910, 740, 120, 20);
        getContentPane().add(txtImporte);
        txtImporte.setBounds(1030, 650, 100, 30);

        btnComprobante.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        btnComprobante.setText("GENERAR COMPROBANTE");
        btnComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprobante);
        btnComprobante.setBounds(910, 780, 340, 40);

        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel18.setText("Total:      S/.");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(910, 700, 120, 20);
        getContentPane().add(txtTotal);
        txtTotal.setBounds(1030, 690, 100, 30);

        fondoVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(fondoVenta);
        fondoVenta.setBounds(900, 350, 370, 480);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1290, 770, 110, 60);

        prefondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Comprobante.add(prefondo);

        getContentPane().add(Comprobante);
        Comprobante.setBounds(20, 40, 1260, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null,"Ingresa Solo Numeros");
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        txtPrecio.setText(null);
        txtStock.setText(null);
        Llenar_Arreglo();
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void cbx_ArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_ArregloActionPerformed
        Sacar_Datos();
    }//GEN-LAST:event_cbx_ArregloActionPerformed

    private void btnAñadir_ArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadir_ArregloActionPerformed
        String pre;     
        DecimalFormat df2 = new DecimalFormat("####.00");        

        if(Integer.parseInt(txtStock.getText())<Integer.parseInt(txtCompra.getText())){
           JOptionPane.showMessageDialog(null, "Cantidad excede al disponible");
        }else {
            String datos[]=new String[4];   
        double precio=(Double.parseDouble(txtPrecio.getText())* Double.parseDouble(txtCompra.getText()));
        datos[0]=(String) cbx_Arreglo.getSelectedItem();
        datos[1]=(String) txtPrecio.getText();
        datos[2]=txtCompra.getText();
        pre=df2.format(precio);
        datos[3]=pre;
        modelo.addRow(datos);
        caltot();
//        Double pago = suma(Double.parseDouble(df2.format(precio)));
//        txtPago.setText(String.valueOf(pago));
//        double pro1,pro2,vup1,vup2,vtp1,vtp2,Subtotal,IGV,TOTAL;
//        vtp1=Double.parseDouble(df2.format(precio));
//        String valt1=vtp1+"";
//        txtTotal.setText(valt1);
//        Subtotal=vtp1;
//        String st=Subtotal+"";
//        txtSubTotal.setText(st);
//        IGV=Subtotal*0.12;
//        TOTAL=Subtotal+IGV;
//        String t=TOTAL+"";
//        txtTotal.setText(t);
        
        txtCompra.setText(null);
            Vaciar();
        }
    }//GEN-LAST:event_btnAñadir_ArregloActionPerformed

      private void caltot(){
    
            double S=0, igv,tot;
            for (int i=0;i<tblCarrito.getRowCount();i++){
            S = S + Double.parseDouble(modelo.getValueAt(i,3).toString());
            }
            S=redondear(S);
            txtSubTotal.setText(String.valueOf(S));
            igv=0.09*S;
            igv=redondear(igv);
            tot=S*1.09;
            tot=redondear(tot);
            txtTotal.setText(String.valueOf(tot));
            
        }
    
    private double redondear(double num){
        return Math.rint(num*100)/100;
    }
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int fila= tblCarrito.getSelectedRow();
        if(fila>=0)
           modelo.removeRow(fila);    
        else{
        JOptionPane.showMessageDialog(null,"No seleciono fila");
        }  
    }//GEN-LAST:event_EliminarActionPerformed

    private void btnConfirmar_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar_CompraActionPerformed
        int cant,venta;
        String nom,ganancia,cant_anterior; 
        
        int seleccion = JOptionPane.showOptionDialog(null,"Boleta o Factura?", "Comprobante de Pago",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null, new Object[] {"Boleta", "Factura"},null);
        if (seleccion == 0){
            txtDNI.setEnabled(true);
            txtCliente.setEnabled(true);
            txtRUC.setEnabled(false);
            txtRazonSocial.setEnabled(false);
        }    
        else if(seleccion == 1){
            txtDNI.setEnabled(false);
            txtCliente.setEnabled(false);
            txtRUC.setEnabled(true);
            txtRazonSocial.setEnabled(true);
        }
        
        cargarcodigo();
        
        for (int fila=0;fila<tblCarrito.getRowCount();fila++){
            nom=tblCarrito.getValueAt(fila, 0).toString();
            venta=Integer.parseInt(tblCarrito.getValueAt(fila, 2).toString());
            cant_anterior=tblCarrito.getValueAt(fila, 1).toString();            
            cant=(Integer.parseInt(cant_anterior))-venta;
            
            ganancia=tblCarrito.getValueAt(fila, 3).toString();
            
            //Actualizamos stock en DB
            Actualizar_Stock(nom,cant);
            
            //iNGRESAMOS vENTA A db
//            Ingresar_Venta(nom,venta,ganancia);            
        }                   
        //JOptionPane.showMessageDialog(null,"Compra exitosa");
        Limpiar_tabla(); 
    }//GEN-LAST:event_btnConfirmar_CompraActionPerformed

    private void txtUsuarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtUsuarioPropertyChange
        txtUsuario.setHorizontalAlignment(txtUsuario.CENTER);//left izquierda - right derecha
    }//GEN-LAST:event_txtUsuarioPropertyChange

    private void txtHora_ActualPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtHora_ActualPropertyChange
        txtHora_Actual.setHorizontalAlignment(txtHora_Actual.CENTER);//left izquierda - right derecha
    }//GEN-LAST:event_txtHora_ActualPropertyChange

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblCarrito.getModel();
        dtm.removeRow(tblCarrito.getSelectedRow());
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobanteActionPerformed
        try
       {
           PrinterJob gap= PrinterJob.getPrinterJob();
           gap.setPrintable(this);
           boolean top = gap.printDialog();
           if(top)
           {
               gap.print();
           }
       }
       catch(PrinterException pex){
           JOptionPane.showMessageDialog(null, "ERROR DE PROGRAMA", "Error\n" + pex, JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnComprobanteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        close();
        //        JOptionPane.showMessageDialog(null, "Hasta Luego");
    }//GEN-LAST:event_jButton2ActionPerformed
         
    void cargarcodigo(){
       
        con = Conexion.getConexion();
        int j;
        String c="";
        
       try{
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select max(numero)from numeros"); 
           
        if(rs.next()){
            c=rs.getString(1);
        }
           
        if(c==null){
            txtCodVenta.setText("CDOO1");
        }else{
            char r1=c.charAt(2);
            char r2=c.charAt(3);
            char r3=c.charAt(4);

           String r ="";
           r=""+r1+r2+r3;
           j=Integer.parseInt(r);
           
           GenerarCodigo gen = new GenerarCodigo();
           gen.generar(j);
           txtCodVenta.setText(" CD"+gen.serie());
        }
           
       }
       catch (Exception e){
           
       }
   }
       
    void Actualizar_Stock(String nom, int cant){         
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=Floreria;"
               +"user=sa;password=123456");
            Statement stm=con.createStatement();
            String query2="Select distinct * from categoriaArreglo";
            s=con.prepareStatement("UPDATE Arreglo SET stock='"                
                +cant+"'"+"where nombre='"                
                +nom+"'");  
            s.executeUpdate(); 
        }catch(SQLException e){
          JOptionPane.showMessageDialog(rootPane, e.getMessage());    
        }catch(ClassNotFoundException e){}
    }
    
//    void Ingresar_Venta(String nom,int cant, String ganancia){
//    java.util.Date d = new java.util.Date(); 
//    Timestamp timestamp1 = new Timestamp(d.getTime());
//        try {
//           // main miconexion = new main();
//           conn=JpAlmacenProyectoDB.Enlace(conn);
//           String sqlinsertar="insert into ventas values (?,?,?,?)";
//           PreparedStatement psta=conn.prepareStatement(sqlinsertar);
//           psta.setString(1,nom);
//           psta.setInt(2, cant);
//           psta.setString(3,ganancia);
//           psta.setTimestamp(4,timestamp1);
//           psta.execute();
//           psta.close();
//        }catch (SQLException e){
//            //Si se produce error al conectar o no existe la tabla
//            JOptionPane.showMessageDialog(null, "Error de Conexion");
//        }
//      
//    }
    
    void Limpiar_tabla(){
        for (int i = 0; i < tblCarrito.getRowCount(); i++) {
           modelo.removeRow(i);//Eliminamos fila por fila
           i=-1;
       }
    }
    
    void Llenar_categoria(){                   
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=Floreria;"
               +"user=sa;password=123456");
            Statement stm=con.createStatement();
            String query2="Select distinct * from categoriaArreglo";
            ResultSet rs=stm.executeQuery(query2);
            registros=new Vector();
            while(rs.next()){
                cbxCategoria.addItem(rs.getString("nombre_cat"));                
            }
        }catch(SQLException e){
          JOptionPane.showMessageDialog(rootPane, e.getMessage());    
        }catch(ClassNotFoundException e){}
    }   
    
    void Llenar_Arreglo(){    
        cbx_Arreglo.removeAllItems();
        cbx_Arreglo.addItem("--Seleccione--");
        try{
            con=Conexion.getConexion();
            Statement stm=con.createStatement();
            String query="Select distinct * from Arreglo A join categoriaArreglo C"
                    + " on(A.categ = C.cod_cat)where c.nombre_cat ='"+cbxCategoria.getSelectedItem()+"'";
            ResultSet rs=stm.executeQuery(query);
            registros=new Vector();
            while (rs.next()){
                cbx_Arreglo.addItem(rs.getString("nombre"));
            }
        }catch(SQLException e){
          JOptionPane.showMessageDialog(rootPane, e.getMessage());    
        }  
    }   
    
    void Sacar_Datos(){
        try{
            con=Conexion.getConexion();
            Statement stm=con.createStatement();
            String query="SELECT * FROM Arreglo where nombre='"                
                +cbx_Arreglo.getSelectedItem()+"'"; 
            ResultSet rs=stm.executeQuery(query);
            registros=new Vector();
            while (rs.next()){
                txtStock.setText(rs.getString("stock"));
                txtPrecio.setText(rs.getString("precio"));
            }
        }catch(SQLException e){
          JOptionPane.showMessageDialog(rootPane, e.getMessage());    
        } 
    }
    
    void Usuario(String user, Timestamp ingreso, String clave){
        txtUsuario.setText(user);
        clav=clave;
    }
    
//    void Marca_salida(){
//        java.util.Date d2 = new java.util.Date(); 
//        Timestamp timestamp2 = new Timestamp(d2.getTime());   
//        try {
//            main miconexion = new main();
//           conn=JpAlmacenProyectoDB.Enlace(conn);
//           String sqlinsertar="insert into contro_usuarios values (?,?,?)";
//           PreparedStatement psta=conn.prepareStatement(sqlinsertar);
//           psta.setString(1,txtUsuario.getText());
//           psta.setTimestamp(3, timestamp2);
//           psta.execute();
//           psta.close();           
//        }catch (SQLException e){  
//            Si se produce error al conectar o no existe la tabla
//            JOptionPane.showMessageDialog(null, "Error de Conexion");
//        }
//    }
    
       private void imprimir(java.awt.event.ActionEvent evt) {                          
       try
       {
           PrinterJob gap= PrinterJob.getPrinterJob();
           gap.setPrintable(this);
           boolean top = gap.printDialog();
           if(top)
           {
               gap.print();
           }
       }
       catch(PrinterException pex){
           JOptionPane.showMessageDialog(null, "ERROR DE PROGRAMA", "Error\n" + pex, JOptionPane.INFORMATION_MESSAGE);
       }
    } 
       
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException 
    {
        if(index>0){
            return NO_SUCH_PAGE;
        }
        Graphics2D grp = (Graphics2D) graf;
        grp.translate(pagfor.getImageableX() + 30, pagfor.getImageableY() + 30);
        grp.scale(1.0, 1.0);
        Comprobante.printAll(graf);
        return PAGE_EXISTS;
    }
    public static void setEnableContainer(java.awt.Container c, boolean band) {
         
        Component[] components = c.getComponents();
        c.setEnabled(band);
            for(int i = 0; i < components.length; i++){            
                components[i].setEnabled(band);

                if(components[i] instanceof java.awt.Container){
                 setEnableContainer((java.awt.Container)components[i], band);
                }
            }        
    } 
    
    void Vaciar(){
        cbxCategoria.setSelectedIndex(0);
        cbx_Arreglo.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(EntradaVende.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaVende.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaVende.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaVende.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EntradaVende.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaVende.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaVende.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaVende.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\Janet\\Desktop\\26-11-17\\Lib UpperEssential\\Chocolate.theme"));
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaVende().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Comprobante;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JButton btnAñadir_Arreglo;
    private javax.swing.JButton btnComprobante;
    private javax.swing.JButton btnConfirmar_Compra;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbx_Arreglo;
    private javax.swing.JLabel fondoVenta;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel prefondo;
    private javax.swing.JTable tblCarrito;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodVenta;
    private javax.swing.JTextField txtCompra;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtHora_Actual;
    public static javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtStock;
    public static javax.swing.JTextField txtSubTotal;
    public static javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private double suma(double sum) {
        suma = suma + suma;
        return suma;
    }
}
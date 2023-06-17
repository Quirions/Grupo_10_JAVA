/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;


import control.ClienteData;
import control.DetalleVentaData;
import control.ProductoData;
import control.VentaData;
import entidades.Cliente;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.awt.Color;
import java.awt.Component;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mauri
 */
public class JIFAdminVenta extends javax.swing.JInternalFrame {

    private ClienteData cd = new ClienteData();
    private ProductoData pd = new ProductoData();
    private VentaData vd = new VentaData();
    private DetalleVentaData dvd = new DetalleVentaData();
    private DefaultComboBoxModel comboModelCliente ; 
    private SpinnerNumberModel snm = new SpinnerNumberModel();
    private DefaultTableModel dtm = new DefaultTableModel() ;
    
    public JIFAdminVenta() {
        initComponents();
        llenarCBCliente();
        setSpinner(0);
        modeloTabla();
        llenarTablaProdcuto();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();
        jBGenerarVenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jTID = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jDateDiaVenta = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFCodigoProd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaProductos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTFStock = new javax.swing.JTextField();
        jTFDescripcion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTFPrecioUnidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        JTFPrecioTotal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jBBuscarProducto = new javax.swing.JButton();
        jSpinnerCantidad = new javax.swing.JSpinner();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("Nueva Venta");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBGenerarVenta.setText("Generar venta");
        jBGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenerarVentaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("NUEVA VENTA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("CLIENTE:");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jTID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDActionPerformed(evt);
            }
        });

        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ingrese el ID del Cliente");

        jComboBoxCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("PRODUCTO:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("CODIGO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("CANTIDAD");

        jTFCodigoProd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTableListaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableListaProductos.setEnabled(false);
        jScrollPane1.setViewportView(jTableListaProductos);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("LISTA DE PRODUCTOS");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("STOCK");

        JTFStock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTFStock.setDisabledTextColor(new java.awt.Color(0, 102, 51));
        JTFStock.setEnabled(false);

        jTFDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFDescripcion.setDisabledTextColor(new java.awt.Color(0, 102, 51));
        jTFDescripcion.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("DESCRIPCION");

        JTFPrecioUnidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTFPrecioUnidad.setDisabledTextColor(new java.awt.Color(0, 102, 51));
        JTFPrecioUnidad.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("PRECIO UNIDAD");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("FECHA");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("$");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("PRECIO TOTAL");

        JTFPrecioTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTFPrecioTotal.setDisabledTextColor(new java.awt.Color(0, 102, 51));
        JTFPrecioTotal.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("$");

        jBBuscarProducto.setText("BUSCAR");
        jBBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarProductoActionPerformed(evt);
            }
        });

        jSpinnerCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCantidadStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 379, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(jTID)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jDateDiaVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jBLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(jLabel12)
                                            .addComponent(JTFPrecioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel14))
                                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15)
                                    .addComponent(jBGenerarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(JTFStock)
                                    .addComponent(jLabel9)
                                    .addComponent(JTFPrecioTotal)))
                            .addComponent(jLabel11)
                            .addComponent(jTFDescripcion)
                            .addComponent(jTFCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFStock, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(jSpinnerCantidad))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTFPrecioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTFPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(14, 14, 14)
                        .addComponent(jDateDiaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenerarVentaActionPerformed
        
        double precioT = Double.parseDouble(JTFPrecioTotal.getText());
        
        Venta v = new Venta();
        
        Date fechaSeleccionada = jDateDiaVenta.getDate();
        Instant instant = fechaSeleccionada.toInstant();
        LocalDate EnLocalDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        
        v.setCliente((Cliente) jComboBoxCliente.getSelectedItem());
        v.setFecha(EnLocalDate);
        
        vd.insertar(v);
       
        DetalleVenta dv = new DetalleVenta();
        
        dv.setVenta(v);
        dv.setProducto((Producto) pd.obtenerUno(Integer.parseInt(jTFCodigoProd.getText())));
        dv.setCantidad((int) jSpinnerCantidad.getValue());
        dv.setPrecioVenta(Double.parseDouble(JTFPrecioTotal.getText()));
        
        dvd.insertar(dv);
        
        JIFDetalleVenta jifDV = new JIFDetalleVenta(v.getIdVenta(),v.getCliente().toString()
                ,dv.getProducto().toString(),dv.getPrecioVenta(),dv.getCantidad(),
                precioT,EnLocalDate);
        jifDV.setVisible(true);
        
        //falta confirmacion....
        
        controlStock(dv.getProducto(), dv.getCantidad());
        clear();

    }//GEN-LAST:event_jBGenerarVentaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        clear();       
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDActionPerformed
        
    }//GEN-LAST:event_jTIDActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

          if(!jTID.getText().equals("")){
              
              Cliente c = (Cliente) cd.obtenerUno(Integer.parseInt(jTID.getText()));
              ArrayList<Object> ListaClientes = cd.obtenerTodo();
              for (Object cliente : ListaClientes) {
                  Cliente clienteCasteado = (Cliente)cliente; 
              if(clienteCasteado.getIdCliente()==c.getIdCliente()){
                      jComboBoxCliente.setSelectedItem(c);
                      
                      break;
                 }
              }
          }else{
              JOptionPane.showMessageDialog(null, "Debe ingresar un numero ");
          }

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarProductoActionPerformed
        
        if(!jTFCodigoProd.getText().equals("")){
            jSpinnerCantidad.setValue(0);
            Producto p = (Producto) pd.obtenerUno(Integer.parseInt(jTFCodigoProd.getText()));
            jTFDescripcion.setText(p.getDescripcion());
            JTFStock.setText(String.valueOf(p.getStock()));
            JTFPrecioUnidad.setText(String.valueOf(p.getPrecioActual()));
            JTFPrecioTotal.setText(String.valueOf(precioTotal()));
            setSpinner(p.getStock());
            
        }else{
              JOptionPane.showMessageDialog(null, "Debe ingresar un numero ");
          }

    }//GEN-LAST:event_jBBuscarProductoActionPerformed

    private void jSpinnerCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCantidadStateChanged
       
        if(!JTFPrecioUnidad.getText().equals("")){
            JTFPrecioTotal.setText(String.valueOf(precioTotal()));
        }
        
    }//GEN-LAST:event_jSpinnerCantidadStateChanged

    public void clear(){
        
 Component[] componentes = getContentPane().getComponents();
        for (Component componente : componentes) {
            if (componente instanceof JTextField ) {
                 JTextField textField = (JTextField) componente;
                textField.setText("");
            }
        }
        jSpinnerCantidad.setValue(0);
    }
    
    public void llenarCBCliente(){
     ArrayList<Object> ListaClientes = cd.obtenerTodo();
     comboModelCliente = new DefaultComboBoxModel(ListaClientes.toArray()); 
     jComboBoxCliente.setModel(comboModelCliente);
    }
    
    public double precioTotal(){
        double precioTotal = Integer.parseInt( jSpinnerCantidad.getValue().toString())*Double.parseDouble(JTFPrecioUnidad.getText());
        return precioTotal;
    }
    
    public void setSpinner(int max){
      
        snm.setMinimum(0);
        snm.setMaximum(max);
        jSpinnerCantidad.setModel(snm);

    }
    
    private void modeloTabla(){
        
        String [] cabecera = {"ID","DESCRIPCION","PRECIO ACTUAL","STOCK"};
        dtm.setColumnIdentifiers(cabecera);
        jTableListaProductos.setModel(dtm);
        
    }
    
    private void llenarTablaProdcuto(){
        dtm.setRowCount(0);
        Cliente c = (Cliente) jComboBoxCliente.getSelectedItem();
        ArrayList<Object> ListaProductos = (ArrayList<Object>) pd.obtenerTodo();
        for (Object aux : ListaProductos) {
            Producto producto = (Producto)aux;
            dtm.addRow(new Object[]{producto.getIdProducto(),producto.getDescripcion(),producto.getPrecioActual(),producto.getStock()});
        }
    }
    private void controlStock(Producto p, int cantidad){
        
        Producto PStockActual = p;
        PStockActual.setStock(p.getStock()-cantidad);
        Producto PStockActualizado  = (Producto) pd.actualizar(p );

    }    
        
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFPrecioTotal;
    private javax.swing.JTextField JTFPrecioUnidad;
    private javax.swing.JTextField JTFStock;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscarProducto;
    private javax.swing.JButton jBGenerarVenta;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Cliente> jComboBoxCliente;
    private com.toedter.calendar.JDateChooser jDateDiaVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTextField jTFCodigoProd;
    private javax.swing.JTextField jTFDescripcion;
    private javax.swing.JTextField jTID;
    private javax.swing.JTable jTableListaProductos;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

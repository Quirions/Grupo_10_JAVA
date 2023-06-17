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
public class JIFAdminProveedor extends javax.swing.JInternalFrame {

    private ClienteData cd = new ClienteData();
    private ProductoData pd = new ProductoData();
    private VentaData vd = new VentaData();
    private DetalleVentaData dvd = new DetalleVentaData();
    private DefaultComboBoxModel comboModelCliente ; 
    private SpinnerNumberModel snm = new SpinnerNumberModel();
    private DefaultTableModel dtm = new DefaultTableModel() ;
    
    public JIFAdminProveedor() {
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
        jBRealizarCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jTProveedor = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxProveedor = new javax.swing.JComboBox<>();
        jDateDiaVenta = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLPrecioTotal = new javax.swing.JLabel();
        jTFCodigoProd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaProductos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jBBuscarProducto = new javax.swing.JButton();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaProductos1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("Nueva Venta");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBRealizarCompra.setText("Realizar compra");
        jBRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRealizarCompraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("COMPRA PROVEEDOR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("RAZON SOCIAL");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jTProveedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTProveedorActionPerformed(evt);
            }
        });

        jBBuscar.setText("BUSCAR");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("CONSULTA PROVEEDOR");

        jComboBoxProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("CODIGO");

        jLPrecioTotal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLPrecioTotal.setText("-");

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
        jLabel8.setText("LISTA DE PRODUCTOS A SOLICITAR");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("FECHA");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("$");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("PRECIO TOTAL");

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

        jTableListaProductos1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableListaProductos1.setEnabled(false);
        jScrollPane2.setViewportView(jTableListaProductos1);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("LISTA DE INVENTARIO");

        jBAgregar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBAgregar.setText("<---");

        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBEliminar.setText("X");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("CANTIDAD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jLPrecioTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSpinnerCantidad)
                                            .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jBRealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jTFCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jBBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jDateDiaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateDiaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(13, 13, 13)
                        .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTFCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(jLPrecioTotal))
                .addGap(16, 16, 16)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRealizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        getAccessibleContext().setAccessibleName("Nueva Compra");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRealizarCompraActionPerformed
        
//        double precioT = Double.parseDouble(JTFPrecioTotal.getText());
//        
//        Venta v = new Venta();
//        
//        Date fechaSeleccionada = jDateDiaVenta.getDate();
//        Instant instant = fechaSeleccionada.toInstant();
//        LocalDate EnLocalDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
//        
//        v.setCliente((Cliente) jComboBoxProveedor.getSelectedItem());
//        v.setFecha(EnLocalDate);
//        
//        vd.insertar(v);
//       
//        DetalleVenta dv = new DetalleVenta();
//        
//        dv.setVenta(v);
//        dv.setProducto((Producto) pd.obtenerUno(Integer.parseInt(jTFCodigoProd.getText())));
//        dv.setCantidad((int) jSpinnerCantidad.getValue());
//        dv.setPrecioVenta(Double.parseDouble(JTFPrecioTotal.getText()));
//        
//        dvd.insertar(dv);
//        
//        JIFDetalleVenta jifDV = new JIFDetalleVenta(v.getIdVenta(),v.getCliente().toString()
//                ,dv.getProducto().toString(),dv.getPrecioVenta(),dv.getCantidad(),
//                precioT,EnLocalDate);
//        jifDV.setVisible(true);
//        
//        //falta confirmacion....
//        
//        controlStock(dv.getProducto(), dv.getCantidad());
//        clear();
//
    }//GEN-LAST:event_jBRealizarCompraActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        clear();       
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTProveedorActionPerformed
        
    }//GEN-LAST:event_jTProveedorActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

          if(!jTProveedor.getText().equals("")){
              
              Cliente c = (Cliente) cd.obtenerUno(Integer.parseInt(jTProveedor.getText()));
              ArrayList<Object> ListaClientes = cd.obtenerTodo();
              for (Object cliente : ListaClientes) {
                  Cliente clienteCasteado = (Cliente)cliente; 
              if(clienteCasteado.getIdCliente()==c.getIdCliente()){
                      jComboBoxProveedor.setSelectedItem(c);
                      
                      break;
                 }
              }
          }else{
              JOptionPane.showMessageDialog(null, "Debe ingresar un numero ");
          }

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarProductoActionPerformed
        
//        if(!jTFCodigoProd.getText().equals("")){
//            jSpinnerCantidad.setValue(0);
//            Producto p = (Producto) pd.obtenerUno(Integer.parseInt(jTFCodigoProd.getText()));
//            jTFDescripcion.setText(p.getDescripcion());
//            JTFStock.setText(String.valueOf(p.getStock()));
//            JTFPrecioUnidad.setText(String.valueOf(p.getPrecioActual()));
//            JTFPrecioTotal.setText(String.valueOf(precioTotal()));
//            setSpinner(p.getStock());
//            
//        }else{
//              JOptionPane.showMessageDialog(null, "Debe ingresar un numero ");
//          }

    }//GEN-LAST:event_jBBuscarProductoActionPerformed

    private void jSpinnerCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCantidadStateChanged
       
//        if(!JTFPrecioUnidad.getText().equals("")){
//            JTFPrecioTotal.setText(String.valueOf(precioTotal()));
//        }
        
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
     jComboBoxProveedor.setModel(comboModelCliente);
    }
    
    public double precioTotal(){
//        double precioTotal = Integer.parseInt( jSpinnerCantidad.getValue().toString())*Double.parseDouble(JTFPrecioUnidad.getText());
        return 2;
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
        Cliente c = (Cliente) jComboBoxProveedor.getSelectedItem();
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
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscarProducto;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBRealizarCompra;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Cliente> jComboBoxProveedor;
    private com.toedter.calendar.JDateChooser jDateDiaVenta;
    private javax.swing.JLabel jLPrecioTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTextField jTFCodigoProd;
    private javax.swing.JTextField jTProveedor;
    private javax.swing.JTable jTableListaProductos;
    private javax.swing.JTable jTableListaProductos1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

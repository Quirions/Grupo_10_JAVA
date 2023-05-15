package vistas;


import entidades.Cliente;
import java.util.Locale;
import javax.swing.JOptionPane;

public class FormularioCliente extends javax.swing.JInternalFrame {


    public FormularioCliente() {
        initComponents();
        this.setTitle("Formulario de Cliente");
        this.setSize(750,650);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtApellido1 = new javax.swing.JTextField();
        jtDni1 = new javax.swing.JTextField();
        jtNombre1 = new javax.swing.JTextField();
        jtCiudad1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtTelefono1 = new javax.swing.JTextField();
        jBAgregar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setTitle("Formulario de Cliente");
        setToolTipText("Formulario de Cliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FORMULARIO DE CLIENTES");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setAlignmentY(0.0F);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("DNI:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText("DIRECCION:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));
        getContentPane().add(jtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 250, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("NOMBRE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("APELLIDO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jtApellido1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtApellido1.setPreferredSize(new java.awt.Dimension(110, 26));
        jtApellido1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellido1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 250, -1));

        jtDni1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtDni1.setPreferredSize(new java.awt.Dimension(110, 26));
        jtDni1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jtDni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 250, -1));

        jtNombre1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtNombre1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 250, -1));

        jtCiudad1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtCiudad1.setPreferredSize(new java.awt.Dimension(110, 26));
        jtCiudad1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jtCiudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 250, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("CIUDAD:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12.setText("TELEFONO:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jtTelefono1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtTelefono1.setPreferredSize(new java.awt.Dimension(110, 26));
        jtTelefono1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 250, -1));

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jBAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 469, 140, 60));

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jBNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 469, 140, 60));

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 140, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellido1ActionPerformed
       
      
    }//GEN-LAST:event_jtApellido1ActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        try{
        int dni = Integer.parseInt(jtDni1.getText());
        String nombre = jtNombre1.getText();
        String apellido = jtApellido1.getText();
        String direccion = jtDireccion.getText();
        String ciudad= jtCiudad1.getText();
        String telefono = jtTelefono1.getText();
        
        Cliente c = new Cliente(dni,apellido,nombre,direccion,telefono,ciudad); 
        
        if(!MenuDirectorio.directorio.getClientes().containsKey(c.getTelefono())){
            JOptionPane.showMessageDialog(this, "cliente registrado exitosamente");
            MenuDirectorio.directorio.agregarCliente(telefono,c);
            clear();
        }else{
            JOptionPane.showMessageDialog(this, "telefono de cliente duplicado, por favor asigne otro");
            
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Datos incorrectos");
        }
        
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
     
        dispose();
        
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
       clear();
    }//GEN-LAST:event_jBNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtApellido1;
    private javax.swing.JTextField jtCiudad1;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDni1;
    private javax.swing.JTextField jtNombre1;
    private javax.swing.JTextField jtTelefono1;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        jtApellido1.setText("");
        jtCiudad1.setText("");
        jtDireccion.setText("");
        jtTelefono1.setText("");
        jtDni1.setText("");
        jtNombre1.setText("");
        
        
    }
}

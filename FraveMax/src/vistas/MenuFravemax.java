
package vistas;


import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;


public class MenuFravemax extends javax.swing.JFrame {
    PCliente pc = new PCliente(this); 
    public MenuFravemax() {
        initComponents();
        mostrarJpanel(new PPrincipal());
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIconos = new javax.swing.JPanel();
        jBClientes = new javax.swing.JButton();
        jBProducots = new javax.swing.JButton();
        jBVentas = new javax.swing.JButton();
        jBInventario = new javax.swing.JButton();
        jBProveedores = new javax.swing.JButton();
        jBCalendario = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        JEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jNuevoCliente = new javax.swing.JMenuItem();
        jAdministrarCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelIconos.setBackground(new java.awt.Color(255, 255, 255));

        jBClientes.setBackground(new java.awt.Color(0, 0, 204));
        jBClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBClientes.setForeground(new java.awt.Color(255, 255, 255));
        jBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/growth_evolve_success_achieve_development_person_personal_icon_252436.png"))); // NOI18N
        jBClientes.setText("    Clientes");
        jBClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBClientesMouseEntered(evt);
            }
        });
        jBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClientesActionPerformed(evt);
            }
        });

        jBProducots.setBackground(new java.awt.Color(255, 255, 0));
        jBProducots.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBProducots.setForeground(new java.awt.Color(255, 255, 255));
        jBProducots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print_cubes_scheme_modular_color_edit_products_miscellaneous_icon_252420.png"))); // NOI18N
        jBProducots.setText("    Productos");
        jBProducots.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBProducots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProducotsActionPerformed(evt);
            }
        });

        jBVentas.setBackground(new java.awt.Color(0, 204, 51));
        jBVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBVentas.setForeground(new java.awt.Color(255, 255, 255));
        jBVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chart_statistics_infographic_analytics_finance_business_bubbles_icon_252405.png"))); // NOI18N
        jBVentas.setText("     Ventas");
        jBVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBInventario.setBackground(new java.awt.Color(204, 0, 51));
        jBInventario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBInventario.setForeground(new java.awt.Color(255, 255, 255));
        jBInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/analytics_statistics_abc_infographic_seo_stats_web_icon_252397.png"))); // NOI18N
        jBInventario.setText("    Inventario");
        jBInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBProveedores.setBackground(new java.awt.Color(204, 0, 204));
        jBProveedores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBProveedores.setForeground(new java.awt.Color(255, 255, 255));
        jBProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elements_right_diagram_graph_element_infographic_icon_252438.png"))); // NOI18N
        jBProveedores.setText("Proveedores");
        jBProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBCalendario.setBackground(new java.awt.Color(0, 204, 204));
        jBCalendario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCalendario.setForeground(new java.awt.Color(255, 255, 255));
        jBCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar_30000.png"))); // NOI18N
        jBCalendario.setText("Calendario");
        jBCalendario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalendarioActionPerformed(evt);
            }
        });

        Logo.setFont(new java.awt.Font("Tahoma", 0, 52)); // NOI18N
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelIconosLayout = new javax.swing.GroupLayout(jPanelIconos);
        jPanelIconos.setLayout(jPanelIconosLayout);
        jPanelIconosLayout.setHorizontalGroup(
            jPanelIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIconosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBProducots, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanelIconosLayout.setVerticalGroup(
            jPanelIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIconosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBProducots, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JEscritorio.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout JEscritorioLayout = new javax.swing.GroupLayout(JEscritorio);
        JEscritorio.setLayout(JEscritorioLayout);
        JEscritorioLayout.setHorizontalGroup(
            JEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2475, Short.MAX_VALUE)
        );
        JEscritorioLayout.setVerticalGroup(
            JEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1392, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenu1.setText("Archivo");

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cliente");

        jNuevoCliente.setText("Nuevo Cliente");
        jNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jNuevoCliente);

        jAdministrarCliente.setText("Administrar Clientes ");
        jAdministrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdministrarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jAdministrarCliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Producto");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Registrar Producto");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Administrar Prodcuto");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ventas");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Proveedores");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Inventario");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIconos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelIconos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JEscritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClientesMouseEntered
      
    }//GEN-LAST:event_jBClientesMouseEntered

    private void jBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClientesActionPerformed
      mostrarJpanel(pc);
    }//GEN-LAST:event_jBClientesActionPerformed

    private void jBProducotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProducotsActionPerformed
      PProducto pp = new PProducto();
      mostrarJpanel(pp);
    }//GEN-LAST:event_jBProducotsActionPerformed

    private void jBCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalendarioActionPerformed
     
      JCalendario jc = new JCalendario();
      mostrarJIF(jc);
    }//GEN-LAST:event_jBCalendarioActionPerformed

    private void jNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoClienteActionPerformed

      JIFNuevoCliente jif = new JIFNuevoCliente();
      mostrarJIF(jif);
    }//GEN-LAST:event_jNuevoClienteActionPerformed

    private void jAdministrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdministrarClienteActionPerformed
      JIFAdminCliente jif = new JIFAdminCliente();
      mostrarJIF(jif);
    }//GEN-LAST:event_jAdministrarClienteActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    private void LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseClicked
        mostrarJpanel(new PPrincipal());
    }//GEN-LAST:event_LogoMouseClicked

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
            java.util.logging.Logger.getLogger(MenuFravemax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFravemax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFravemax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFravemax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFravemax().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JDesktopPane JEscritorio;
    private javax.swing.JLabel Logo;
    private javax.swing.JMenuItem jAdministrarCliente;
    private javax.swing.JButton jBCalendario;
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBInventario;
    private javax.swing.JButton jBProducots;
    private javax.swing.JButton jBProveedores;
    private javax.swing.JButton jBVentas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private static javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jNuevoCliente;
    private javax.swing.JPanel jPanelIconos;
    private javax.swing.JMenuItem jmSalir;
    // End of variables declaration//GEN-END:variables

    public void mostrarJIF(JInternalFrame jif){
       
         if (comprobarJIFExistente(jif)==false) {
            jif.setVisible(true);
            JEscritorio.add(jif);
            JEscritorio.moveToFront(jif);
         }else{
             jif=null;
         }
        
    }

    public void mostrarJpanel(JPanel p) {
     
        p.setSize(JEscritorio.getSize());
        p.setLocation(0, 0);
        JEscritorio.removeAll();
        JEscritorio.add(p,BorderLayout.CENTER);
        JEscritorio.revalidate();
        JEscritorio.repaint();
    }
    
    public boolean comprobarJIFExistente(JInternalFrame j){

        JInternalFrame[] frames = JEscritorio.getAllFrames();
        boolean existe = false;
        
        for (JInternalFrame frame : frames) {
        if (frame.getClass() == j.getClass()) {
        existe = true;
        break;
        }
    }
        return existe;
    
    } 
    
    
   
}

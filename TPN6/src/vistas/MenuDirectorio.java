package vistas;

import entidades.Directorio;


public class MenuDirectorio extends javax.swing.JFrame {

    public static Directorio directorio = new Directorio();

    public MenuDirectorio() {
        initComponents();
        this.setTitle("Directorio Telefonico");
 
    }

    public Directorio getDirectorio() {
        return directorio;
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAdm = new javax.swing.JMenu();
        jmAgregarC = new javax.swing.JMenuItem();
        jmBuscarC = new javax.swing.JMenuItem();
        jmBorrarC = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEscritorio.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jmAdm.setText("Administrar");

        jmAgregarC.setText("Agregar Cliente");
        jmAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarCActionPerformed(evt);
            }
        });
        jmAdm.add(jmAgregarC);

        jmBuscarC.setText("Buscar Cliente");
        jmBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBuscarCActionPerformed(evt);
            }
        });
        jmAdm.add(jmBuscarC);

        jmBorrarC.setText("Borrar Cliente");
        jmBorrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBorrarCActionPerformed(evt);
            }
        });
        jmAdm.add(jmBorrarC);

        jMenuBar1.add(jmAdm);

        jmSalir.setText("Salir");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmBorrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBorrarCActionPerformed
       
        jEscritorio.removeAll();
        jEscritorio.repaint();
        BorrarCliente bc = new BorrarCliente();
        bc.setVisible(true);
        jEscritorio.add(bc);
        jEscritorio.moveToFront(bc);
    }//GEN-LAST:event_jmBorrarCActionPerformed

    private void jmAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarCActionPerformed
        
        jEscritorio.removeAll();
        jEscritorio.repaint();
        FormularioCliente fc = new FormularioCliente();
        fc.setVisible(true);
        jEscritorio.add(fc);
        jEscritorio.moveToFront(fc);
        
        
    }//GEN-LAST:event_jmAgregarCActionPerformed

    private void jmBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBuscarCActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        BuscarCliente bc = new BuscarCliente();
        bc.setVisible(true);
        jEscritorio.add(bc);
        jEscritorio.moveToFront(bc);
    }//GEN-LAST:event_jmBuscarCActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        
    
        
        
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
            System.exit(0);
    }//GEN-LAST:event_jmSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDirectorio().setVisible(true);
            }
        });
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAdm;
    private javax.swing.JMenuItem jmAgregarC;
    private javax.swing.JMenuItem jmBorrarC;
    private javax.swing.JMenuItem jmBuscarC;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}

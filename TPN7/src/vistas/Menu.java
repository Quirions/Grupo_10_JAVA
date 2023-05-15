
package vistas;

import entidades.Alumno;
import static entidades.Colegio.alumnos;
import java.util.Map;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author mauri
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAdm = new javax.swing.JMenu();
        jmAltaAlumn = new javax.swing.JMenuItem();
        jmAltaMateria = new javax.swing.JMenuItem();
        jmFormuInsc = new javax.swing.JMenuItem();
        jMostrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio ULP");

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jmAdm.setText("Administrar");

        jmAltaAlumn.setText("Alta Alumno");
        jmAltaAlumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAltaAlumnActionPerformed(evt);
            }
        });
        jmAdm.add(jmAltaAlumn);

        jmAltaMateria.setText("Alta Materia");
        jmAltaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAltaMateriaActionPerformed(evt);
            }
        });
        jmAdm.add(jmAltaMateria);

        jmFormuInsc.setText("Formulario de Inscripcion");
        jmFormuInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormuInscActionPerformed(evt);
            }
        });
        jmAdm.add(jmFormuInsc);

        jMostrar.setText("Mostrar Alumnos");
        jMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMostrarActionPerformed(evt);
            }
        });
        jmAdm.add(jMostrar);

        jMenuBar1.add(jmAdm);

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

    private void jmAltaAlumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAltaAlumnActionPerformed
        
        jEscritorio.removeAll();
        jEscritorio.repaint();
        FormularioAlumno fa = new FormularioAlumno();
        fa.setVisible(true);
        jEscritorio.add(fa);
        jEscritorio.moveToFront(fa);
        
    }//GEN-LAST:event_jmAltaAlumnActionPerformed

    private void jmAltaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAltaMateriaActionPerformed
         jEscritorio.removeAll();
        jEscritorio.repaint();
        FormularioMateria  fm = new FormularioMateria();
        fm.setVisible(true);
        jEscritorio.add(fm);
        jEscritorio.moveToFront(fm);
    }//GEN-LAST:event_jmAltaMateriaActionPerformed

    private void jmFormuInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormuInscActionPerformed
        
        jEscritorio.removeAll();
        jEscritorio.repaint();
        FormularioInscripcion  fi = new FormularioInscripcion();
        fi.setVisible(true);
        jEscritorio.add(fi);
        jEscritorio.moveToFront(fi);
        
        
    }//GEN-LAST:event_jmFormuInscActionPerformed

    private void jMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMostrarActionPerformed
       
        jEscritorio.removeAll();
        jEscritorio.repaint();
        MostrarAlumnos ma = new MostrarAlumnos();
        ma.setVisible(true);
        jEscritorio.add(ma);
        jEscritorio.moveToFront(ma);

    }//GEN-LAST:event_jMostrarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMostrar;
    private javax.swing.JMenu jmAdm;
    private javax.swing.JMenuItem jmAltaAlumn;
    private javax.swing.JMenuItem jmAltaMateria;
    private javax.swing.JMenuItem jmFormuInsc;
    // End of variables declaration//GEN-END:variables
}


package vistas;

import entidades.Alumno;
import entidades.Colegio;
import static entidades.Colegio.alumnos;
import static entidades.Colegio.materias;
import entidades.Materia;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author mauri
 */
public class FormularioInscripcion extends javax.swing.JInternalFrame {

    public FormularioInscripcion() {
        initComponents();

        DefaultComboBoxModel comboModelM = new DefaultComboBoxModel(materias.toArray());
        
          jComboBoxMateria.setModel(comboModelM );
          
        DefaultComboBoxModel comboModelA = new DefaultComboBoxModel(alumnos.toArray());
        
          jComboBoxAlumno.setModel(comboModelA );
          
           Alumno al = (Alumno) jComboBoxAlumno.getSelectedItem();
           Materia mat = (Materia) jComboBoxMateria.getSelectedItem();
          
          jtIDMate.setText(String.valueOf(mat.getIdMaterias()));
          jtLegajo.setText(String.valueOf(al.getLegajo()));
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlFMaterias = new javax.swing.JLabel();
        jlLegajo = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jComboBoxMateria = new javax.swing.JComboBox<>();
        jComboBoxAlumno = new javax.swing.JComboBox<>();
        jbSalir = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();
        jlApellido1 = new javax.swing.JLabel();
        jtLegajo = new javax.swing.JTextField();
        jID = new javax.swing.JLabel();
        jtIDMate = new javax.swing.JTextField();

        jlFMaterias.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlFMaterias.setText("FORMULARIO DE INSCRIPCION");

        jlLegajo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlLegajo.setText("ELIJA UNA MATERIA:");

        jlApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlApellido.setText("ELIJA UN ALUMNO:");

        jComboBoxMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMateriaItemStateChanged(evt);
            }
        });
        jComboBoxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMateriaActionPerformed(evt);
            }
        });

        jComboBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlumnoActionPerformed(evt);
            }
        });

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbInscribir.setText("INSCRIBIR");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jlApellido1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlApellido1.setText("LEGAJO:");

        jtLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLegajoActionPerformed(evt);
            }
        });

        jID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jID.setText("ID");

        jtIDMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIDMateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlFMaterias)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlLegajo)
                    .addComponent(jlApellido))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtIDMate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlApellido1)
                        .addGap(18, 18, 18)
                        .addComponent(jtLegajo))
                    .addComponent(jComboBoxAlumno, 0, 202, Short.MAX_VALUE)
                    .addComponent(jComboBoxMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jlFMaterias)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLegajo)
                    .addComponent(jComboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jID)
                    .addComponent(jtIDMate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlApellido)
                    .addComponent(jComboBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlApellido1)
                    .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMateriaActionPerformed
     
      Materia mat = (Materia) jComboBoxMateria.getSelectedItem();
        jtIDMate.setText(String.valueOf(mat.getIdMaterias()));
        
    }//GEN-LAST:event_jComboBoxMateriaActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed

        
       Alumno al = (Alumno) jComboBoxAlumno.getSelectedItem();
       Materia mat = (Materia) jComboBoxMateria.getSelectedItem();
        
        if(al.getMateriasInscripto().contains(mat)){
            
            JOptionPane.showMessageDialog(this, "El alumno ya esta inscripto en la materia");
            
        }else{
            al.agregarMateria( mat);
            JOptionPane.showMessageDialog(this, "Alumno inscripto exitosamente");
        }
       
        System.out.println(al.cantidadMaterias());
        
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jComboBoxMateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMateriaItemStateChanged
        
     
        
    }//GEN-LAST:event_jComboBoxMateriaItemStateChanged

    private void jtLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLegajoActionPerformed

        
    }//GEN-LAST:event_jtLegajoActionPerformed

    private void jComboBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlumnoActionPerformed
        
       Alumno al = (Alumno) jComboBoxAlumno.getSelectedItem();
        jtLegajo.setText(String.valueOf(al.getLegajo()));
        
        
    }//GEN-LAST:event_jComboBoxAlumnoActionPerformed

    private void jtIDMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDMateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIDMateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAlumno;
    private javax.swing.JComboBox<String> jComboBoxMateria;
    private javax.swing.JLabel jID;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlApellido1;
    private javax.swing.JLabel jlFMaterias;
    private javax.swing.JLabel jlLegajo;
    private javax.swing.JTextField jtIDMate;
    private javax.swing.JTextField jtLegajo;
    // End of variables declaration//GEN-END:variables
}

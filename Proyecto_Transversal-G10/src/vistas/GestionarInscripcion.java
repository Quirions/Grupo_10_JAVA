/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import control.AlumnoData;
import control.InscripcionData;
import control.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class GestionarInscripcion extends javax.swing.JInternalFrame {
    
    private AlumnoData ad = new AlumnoData();
    private MateriaData md = new MateriaData();
    private InscripcionData id = new InscripcionData();
    private ArrayList <Alumno> ListaAlumnos = ad.alumnosActivo();
    private ArrayList <Materia> ListaMaterias = new ArrayList<>();
    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultComboBoxModel comboModelA = new DefaultComboBoxModel(ListaAlumnos.toArray());
    
    public GestionarInscripcion() {
        initComponents();
        dtm = (DefaultTableModel) jTableMaterias.getModel();
        llenarJTMaterias();
        llenarCBAlumnos();
        SelectInscripto();
        jRadioBInscriptas.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMaterias = new javax.swing.JTable();
        jRadioBInscriptas = new javax.swing.JRadioButton();
        jRadioBNoInscriptas = new javax.swing.JRadioButton();
        jBInscribirAlumno = new javax.swing.JButton();
        jBAnularInscripcion = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jComboBoxAlumno = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Crear Inscripcion");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Alumno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Lista de Materias:");

        jTableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMaterias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTableMaterias);

        jRadioBInscriptas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioBInscriptas.setText("Inscriptas");
        jRadioBInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBInscriptasActionPerformed(evt);
            }
        });

        jRadioBNoInscriptas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioBNoInscriptas.setText("No Inscriptas");
        jRadioBNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBNoInscriptasActionPerformed(evt);
            }
        });

        jBInscribirAlumno.setText("Inscribir");
        jBInscribirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirAlumnoActionPerformed(evt);
            }
        });

        jBAnularInscripcion.setText("Anular Inscripcion");
        jBAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInscripcionActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jComboBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jRadioBInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioBNoInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jBInscribirAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(jBAnularInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioBInscriptas)
                    .addComponent(jRadioBNoInscriptas))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribirAlumno)
                    .addComponent(jBAnularInscripcion)
                    .addComponent(jBSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioBInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBInscriptasActionPerformed
        SelectInscripto();
    }//GEN-LAST:event_jRadioBInscriptasActionPerformed

    private void jRadioBNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBNoInscriptasActionPerformed
        
        SelectNoInscripto();
    }//GEN-LAST:event_jRadioBNoInscriptasActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBInscribirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirAlumnoActionPerformed
        

        Alumno al = (Alumno) jComboBoxAlumno.getSelectedItem();
        int filaSeleccionada = jTableMaterias.getSelectedRow();

        TableModel model = jTableMaterias.getModel();
        
        if(filaSeleccionada != -1){
            
        Integer id_Materia = (Integer) model.getValueAt(filaSeleccionada, 0);
        String nombre = (String) model.getValueAt(filaSeleccionada, 1);
        Integer anio = (Integer) model.getValueAt(filaSeleccionada, 2);

        Materia m = new Materia(id_Materia,nombre,anio,true);
        
        Inscripcion i = new Inscripcion(al,m,0);
            id.inscribirAlumno(i);
            JOptionPane.showMessageDialog(null, "Alumno inscripto correctamente");
             SelectNoInscripto();
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jBInscribirAlumnoActionPerformed

    private void jBAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInscripcionActionPerformed

       Alumno al = (Alumno) jComboBoxAlumno.getSelectedItem();
        int filaSeleccionada = jTableMaterias.getSelectedRow();
        TableModel model = jTableMaterias.getModel();
        
        if(filaSeleccionada != -1){
            
        Integer id_Materia = (Integer) model.getValueAt(filaSeleccionada, 0);
        String nombre = (String) model.getValueAt(filaSeleccionada, 1);
        Integer anio = (Integer) model.getValueAt(filaSeleccionada, 2);
        
        Materia m = new Materia(id_Materia,nombre,anio,true);
        Inscripcion i = new Inscripcion(al,m,0);
        
            id.bajaInscripcion(i);
            
            JOptionPane.showMessageDialog(null, "Inscripcion de Alumno Eliminada");
            SelectInscripto();
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
       
    }//GEN-LAST:event_jBAnularInscripcionActionPerformed

    private void jComboBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlumnoActionPerformed
        
       SelectInscripto();
        
    }//GEN-LAST:event_jComboBoxAlumnoActionPerformed
    public void llenarCBAlumnos(){
        jComboBoxAlumno.setModel(comboModelA);
    }
    public void llenarJTMaterias(){
       String [] cabecera = {"ID","NOMBRE","AÑO"};
        dtm.setColumnIdentifiers(cabecera);
        jTableMaterias.setModel(dtm); 
    }
    public void SelectInscripto(){
          
        dtm.setRowCount(0);
        jBAnularInscripcion.setEnabled(true);
        jBInscribirAlumno.setEnabled(false);
        jRadioBNoInscriptas.setSelected(false);
        Alumno al = (Alumno) jComboBoxAlumno.getSelectedItem();
        ListaMaterias = id.materiasCursadas(al.getID());
        Materia m = new Materia();
        for (Materia aux : ListaMaterias) {
             dtm.addRow(new Object[]{aux.getId_materia(),aux.getNombre(),aux.getAnio()});
        }
        jRadioBInscriptas.setSelected(true);
    }
    public void SelectNoInscripto(){
           dtm.setRowCount(0);
        jBAnularInscripcion.setEnabled(false);
        jBInscribirAlumno.setEnabled(true);
        jRadioBInscriptas.setSelected(false);
        Alumno al = (Alumno) jComboBoxAlumno.getSelectedItem();
        ListaMaterias = id.materiasNoCursadas(al.getID());
        Materia m = new Materia();
        for (Materia aux : ListaMaterias) {
             dtm.addRow(new Object[]{aux.getId_materia(),aux.getNombre(),aux.getAnio()});
        }
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnularInscripcion;
    private javax.swing.JButton jBInscribirAlumno;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jComboBoxAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioBInscriptas;
    private javax.swing.JRadioButton jRadioBNoInscriptas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMaterias;
    // End of variables declaration//GEN-END:variables
}

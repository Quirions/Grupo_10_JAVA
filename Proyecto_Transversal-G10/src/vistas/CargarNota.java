
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


public class CargarNota extends javax.swing.JInternalFrame {
    
    private AlumnoData ad = new AlumnoData();
    private MateriaData md = new MateriaData();
    private InscripcionData id = new InscripcionData();
    private ArrayList <Alumno> ListaAlumnos = ad.alumnosActivo();
    private ArrayList <Materia> ListaMaterias = new ArrayList<>();
    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultComboBoxModel comboModelA = new DefaultComboBoxModel(ListaAlumnos.toArray());
    
    
    
    public CargarNota() {
        initComponents();
        dtm = (DefaultTableModel) jTableMaterias.getModel();    
        llenarJTMaterias();
        llenarCBAlumnos();
        llenarMateriasIns();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMaterias = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jComboBoxAlumno = new javax.swing.JComboBox<>();
        jbGuardar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cargar Nota");

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

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jComboBoxAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAlumnoItemStateChanged(evt);
            }
        });

        jbGuardar.setText("Modificar nota");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jbGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jComboBoxAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAlumnoItemStateChanged

        llenarMateriasIns();
    }//GEN-LAST:event_jComboBoxAlumnoItemStateChanged

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
     if(jTableMaterias.getSelectedRow() != -1){
          Alumno al = (Alumno) jComboBoxAlumno.getSelectedItem();
    
     int filaSeleccionada = jTableMaterias.getSelectedRow();
    
     int id_materia = (Integer) dtm.getValueAt(filaSeleccionada, 0);

     String input = JOptionPane.showInputDialog("Ingrese nueva nota:");
    int nota = Integer.parseInt(input);
    id.actualizarNota( al.getID(),id_materia, nota);
    
    JOptionPane.showMessageDialog(null, "Nota guardada");
    llenarMateriasIns();
     }else{
         JOptionPane.showMessageDialog(null, "Debe seleccionar una materia");
     }
        
    
    }//GEN-LAST:event_jbGuardarActionPerformed
    public void llenarCBAlumnos(){
        jComboBoxAlumno.setModel(comboModelA);
    }
    public void llenarJTMaterias(){
       String [] cabecera = {"ID","MATERIA","NOTA"};
        dtm.setColumnIdentifiers(cabecera);
        jTableMaterias.setModel(dtm); 
    }
    public void llenarMateriasIns(){
        
        dtm.setRowCount(0);
       ArrayList<Inscripcion> ListaInsc = id.alumnosInscriptos();
       Alumno al = (Alumno) jComboBoxAlumno.getSelectedItem();
        for (Inscripcion aux : ListaInsc) {
            if(aux.getAlumno().getID()==al.getID()){
            
            dtm.addRow(new Object[]{aux.getMateria().getId_materia(),aux.getMateria().getNombre(),aux.getNota()});
            
            }
        }
            
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jComboBoxAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMaterias;
    private javax.swing.JButton jbGuardar;
    // End of variables declaration//GEN-END:variables
}

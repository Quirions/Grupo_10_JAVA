package control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.util.ArrayList;

public class InscripcionData {

    private final Connection con;
    private MateriaData md = new MateriaData();
    private AlumnoData ad = new AlumnoData();

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void inscribirAlumno(Inscripcion ins) {

        String query = "INSERT INTO Inscripcion (nota,id_alumno,id_materia) VALUES (?,?,?);";

        try {
            PreparedStatement st = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, ins.getNota());
            st.setInt(2, ins.getAlumno().getID());
            st.setInt(3, ins.getMateria().getId_materia());

            st.executeUpdate();

            ResultSet resultado = st.getGeneratedKeys();

            if (resultado.next()) {
                ins.setId_inscripto(resultado.getInt(1));
                
            } 

            st.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al inscribir alumno ");
            e.getMessage();
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e.getMessage());
        }
    }

    public void bajaInscripcion(Inscripcion ins) {

        try{
            String query = "DELETE FROM inscripcion WHERE id_alumno = ? and id_materia = ?;";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, ins.getAlumno().getID());
            st.setInt(2, ins.getMateria().getId_materia());
            int resultado = st.executeUpdate();

            st.close();
            
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null,"Error de acceso a tabla Inscripcion ");
                e.getMessage();
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e.getMessage() );
            }
    }

    public Inscripcion buscarInscripcion(int id_inscripcion) {
        Inscripcion i = null;

        String query = "SELECT * FROM inscripcion WHERE id_inscripcion = ?;";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, id_inscripcion);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                i = new Inscripcion();
                i.setId_inscripto(id_inscripcion);
                i.setNota(rs.getInt("nota"));
                Alumno a = ad.buscarAlumno(rs.getInt("id_alumno"));
                i.setAlumno(a);
                Materia m = md.buscarMateria(rs.getInt("id_materia"));
                
            }
            st.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con tabla Inscripcion");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e.getMessage());
        }
        return i;

    }

    public void actualizarNota(Inscripcion i, int NuevaNota) {

        try {
            String queryUpdate = "UPDATE inscripcion SET nota=? WHERE id_alumno = ? AND id_materia= ? ";
            PreparedStatement stUpdate = con.prepareStatement(queryUpdate);
            stUpdate.setInt(1, NuevaNota);
            stUpdate.setInt(2, i.getAlumno().getID());
            stUpdate.setInt(3, i.getMateria().getId_materia());
            int exito = stUpdate.executeUpdate();
            stUpdate.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla inscripciones");
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }

    }

    public ArrayList<Inscripcion> alumnosInscriptos() {
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        try {
            String sql = "SELECT * FROM inscripcion;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion ins = new Inscripcion();
                ins.setId_inscripto(rs.getInt("id_inscripcion"));
                ins.setAlumno(ad.buscarAlumno(rs.getInt("id_alumno")));
                ins.setMateria(md.buscarMateria(rs.getInt("id_materia")));
                ins.setNota(rs.getInt("nota"));

                inscripciones.add(ins);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "Error Inscripcion " + ex.getMessage());
        }
        return inscripciones;
    }
    
    public ArrayList<Materia> materiasCursadas(int id){
       ArrayList<Materia> materias = new ArrayList<Materia>();
            Materia materia=null;
        try {
            String sql = "SELECT * FROM materia WHERE estado = true"
                    + " AND id_materia in (SELECT id_materia FROM inscripcion WHERE id_alumno = ?);";
                   
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
          
            
            while(rs.next()){
                materia = new Materia();
                materia.setId_materia(rs.getInt("id_materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
                
            }   

            st.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Inscripcion "+ex.getMessage());
        }
        
        return materias;  
       
   }  

    public ArrayList<Materia> materiasNoCursadas(int id) {

        ArrayList<Materia> materias = new ArrayList<Materia>();
        Materia materia = null;
        try {
            String sql = "SELECT * FROM materia WHERE estado = true"
                    + " AND id_materia not in (SELECT id_materia FROM inscripcion WHERE id_alumno = ?);";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                materia = new Materia();
                materia.setId_materia(rs.getInt("id_materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);

            }
            st.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Inscripcion " + ex.getMessage());
        }

        return materias;

    }

    public ArrayList<Alumno> alumnosActivos(int materiaId) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno alumno = null;
        try {
            String sql = "SELECT * FROM alumno WHERE estado = true"
                    + " AND id_alumno in (SELECT id_alumno FROM inscripcion WHERE id_materia = ?);";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, materiaId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                alumno = new Alumno();
                alumno.setID(rs.getInt("id_alumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setFecha_nac(rs.getDate("fecha_nacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            st.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Inscripcion " + ex.getMessage());
        }
        return alumnos;
    }
    
     public void actualizarNota(int id_Alumno,int id_materia,int NuevaNota){
       
        try { 
            String queryUpdate = "UPDATE inscripcion SET nota=? WHERE id_alumno = ? AND id_materia= ? ";
            PreparedStatement stUpdate = con.prepareStatement(queryUpdate);
            stUpdate.setInt(1, NuevaNota);
            stUpdate.setInt(2, id_Alumno);
            stUpdate.setInt(3, id_materia);
            int exito = stUpdate.executeUpdate();
        
            stUpdate.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a tabla inscripciones");
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }       
}
}
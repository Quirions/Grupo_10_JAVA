
package control;
//esta es la testeada

import Conexion.Conexion;
import modelo.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AlumnoData {
    
    private final Connection con ;

    public AlumnoData() {
        
        con = Conexion.getConexion();
        
    }
    
    public void agregarAlumno (Alumno alumno){
        
        String query = "INSERT INTO alumno (nombre,apellido,dni,fecha_nacimiento,estado) VALUES (?,?,?,?,?);";
          
        try{
            PreparedStatement st = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            st.setString(1, alumno.getNombre());
            st.setString(2, alumno.getApellido());
            st.setInt(3, alumno.getDni());
            st.setDate(4,Date.valueOf(alumno.getFecha_nac()));
            st.setBoolean(5, alumno.isEstado());
        
            st.executeUpdate();
            
            ResultSet resultado = st.getGeneratedKeys();
            
            if(resultado.next()){
                alumno.setID(resultado.getInt(1));
            }
            
            JOptionPane.showMessageDialog(null, "El alumno se guardo correctamente");
            
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null,"Error al guardar alumno ");
                e.getMessage();
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e.getMessage() );
            }
            }
    
    public void buscarAlumno(){
        
    }
    
    
}

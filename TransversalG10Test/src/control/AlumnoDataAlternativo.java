
package control;

import modelo.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;




//public class AlumnoData {
//    private Connection connection = null;
//    
//   public AlumnoData(Conexion1 conexion){
//       
//     connection = conexion.getConexion();
//       
//   }
//           
//    public void agregarAlumno(Alumno alumno){
//        
//        try{
//            
//            String sql = "INSERT INTO alumno (nombre,apellido,dni,fecha_nacimiento,estado) VALUES (?,?,?);";
//            
//            PreparedStatement st = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//            st.setString(1, alumno.getNombre());
//            st.setString(2, alumno.getApellido());
//            st.setInt(3, alumno.getDni());
//            st.setDate(4,Date.valueOf(alumno.getFecha_nac()));
//            st.setBoolean(5, true);
//                    
//            st.executeUpdate();
//            
//            ResultSet rs = st.getGeneratedKeys();
//            
//            if(rs.next()){
//                alumno.setID(rs.getInt(1));
//            }
//            
//            
//            
//        }catch(Exception e){
//            
//        }
//        
//        
//        
//        
//        
//    }
//    
//    
    
//}


package control;


import entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import entidades.Materia;


public class MateriaData {
    
    private final Connection con ;

    public MateriaData() {
        
        con = Conexion.getConexion();
        
    }
    
    public void agregarMateria (Materia materia){
        
        String query = "INSERT INTO materia (nombre,anio,estado) VALUES (?,?,?);";
          
        try{
            PreparedStatement st = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            st.setString(1, materia.getNombre());
            st.setInt(2, materia.getAnio());
            st.setBoolean(3,materia.isEstado() );

            st.executeUpdate();

            ResultSet resultado = st.getGeneratedKeys();
            
            if(resultado.next()){
                materia.setId_materia(resultado.getInt(1));
            }
            
//            JOptionPane.showMessageDialog(null, "La Materia se guardo correctamente");
            st.close();
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null,"Error al guardar Materia ");
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e.getMessage() );
            }
            }
    
    public Materia buscarMateria(int id_materia){
        
         Materia materia=null ;
        String query = "SELECT nombre,anio FROM materia WHERE id_materia = ? ;";
          
        try{
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,id_materia);
 
            ResultSet resultado = st.executeQuery();
            
            if(resultado.next()){
                Materia m = new Materia();
                m.setId_materia(id_materia);
                m.setNombre(resultado.getString("nombre"));
                m.setAnio(resultado.getInt("anio"));
                materia=m;
            }
            st.close();
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null,"Error al guardar Materia ");
                e.getMessage();
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e.getMessage() );
            }
        return materia;
        
    }
    
    public void actualizarMateria(Materia materia){
        
         try { 
            String queryUpdate = "UPDATE materia SET nombre=?,anio=? WHERE id_materia = ? ";
            PreparedStatement stUpdate = con.prepareStatement(queryUpdate);
            stUpdate.setString(1, materia.getNombre());
            stUpdate.setInt(2, materia.getAnio());
             
            int exito = stUpdate.executeUpdate();
            
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "nombre de Materia modificada");
                
            }else{
                 JOptionPane.showMessageDialog(null, "Año de materia modificado");
            }
            stUpdate.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a tabla materia");
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }       
        
        
        
    }
    
    public void bajaMateria(int id_materia){

            try{    
            String bajaLogica = "UPDATE materia SET estado = false WHERE id_materia = ? ";
            PreparedStatement st_delete = con.prepareStatement(bajaLogica);
            st_delete.setInt(1, id_materia);
            int resultado = st_delete.executeUpdate();
            if(resultado==1){
              JOptionPane.showMessageDialog(null, "registro eliminado");
            }else{
              JOptionPane.showMessageDialog(null, "ID Materia no encontrado");
            }
            st_delete.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void altaMateria(int id_materia){
        
        String query = "UPDATE materia SET estado = true WHERE id_materia = ?";
        
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, id_materia);
            int resultado = st.executeUpdate();
            if(resultado == 1){
                JOptionPane.showMessageDialog(null, "Materia dada de alta");
                
            }else{
                 JOptionPane.showMessageDialog(null, "Materia no encontrada");
            }
           st.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al ingresar a Tabla Materia");
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}


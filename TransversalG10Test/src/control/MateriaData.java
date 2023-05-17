
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
import modelo.Materia;


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
            
            JOptionPane.showMessageDialog(null, "La Materia se guardo correctamente");
            
            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null,"Error al guardar Materia ");
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e.getMessage() );
            }
            }
    
    
}


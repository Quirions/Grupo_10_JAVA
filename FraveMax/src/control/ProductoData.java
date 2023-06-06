package control;

import Interfaces.SqlCrud;
import entidades.Producto;
import java.sql.Connection;
import java.util.List;


public class ProductoData implements SqlCrud{
    
    private final String INSERT = "INSERT INTO";
    private final String UPDATE = "";
    private final String DELETE = "";
    private final String OBTENER_UNO = "";
    private final String OBTENER_TODO = "";
    private final Connection con ;
    
    public ProductoData() {
        con = Conexion.getConexion();
    }
    @Override
    public void insertar(Object object) {
        object = new Producto();
    }


    @Override
    public void borrar(int id) {
        
    }

    @Override
    public Object actualizar(Object object) {
        
        return null;
        
    }

    @Override
    public Object obtenerUno(int id) {
     
        return null;
     
    }

    @Override
    public List<Object> obtenerTodo() {
     
        return null;
     
    }

    
   
}

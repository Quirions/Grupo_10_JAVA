package control;

import Interfaces.SqlCrud;
import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProductoData implements SqlCrud{
    
    private final String INSERT = "INSERT INTO (idProducto,descripcion,precioActual,stock,estado)VALUES = (?,?,?,?,?)";
    private final String UPDATE = "UPDATE producto SET descripcion=?,precioActual=?,stock=?,estado=? WHERE producto =?";
    private final String DELETE = "DELETE FROM producto WHERE idProducto = ? ";
    private final String OBTENER_UNO = "SELECT * FROM producto WHERE idProducto = ?";
    private final String OBTENER_TODO = "SELECT * FROM producto ";
    private final Connection con ;
    
    public ProductoData() {
        con = Conexion.getConexion();
    }

    
    @Override
    public void insertar(Object object) {
        
        Producto producto = (Producto) object;  
        
        try {
            PreparedStatement st = con.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, producto.getIdProducto());
            st.setString(2, producto.getDescripcion());
            st.setDouble(3,producto.getPrecioActual());
            st.setInt(4, producto.getStock());
            st.executeUpdate();
            
            ResultSet rs = st.getGeneratedKeys();
            
            if(rs.next()){
               producto.setIdProducto(rs.getInt(1));
            }
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, "Error al conectarse a base de datos", ex.getMessage());
        }
    }


    @Override
    public void borrar(int id) {
        
        try {
            PreparedStatement ps = con.prepareCall(DELETE);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();                     
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error al conectar con base de datos", ex.getMessage());
        }
        
                    
    }

    @Override
    public Object actualizar(Object object) {
        
        Producto producto = (Producto) object;
        
        Producto productoActualizado = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(UPDATE);
            ps.setInt(1, producto.getIdProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3,producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            productoActualizado=producto;
            ps.executeUpdate();
            ps.close();
                     
        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        
        return productoActualizado;
                          

    }

    @Override
public Object obtenerUno(int id) {
    Producto producto = null;
    try {
        PreparedStatement ps = con.prepareStatement(OBTENER_UNO);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            producto = new Producto();
            producto.setIdProducto(id);
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecioActual(rs.getDouble("precioActual"));
            producto.setStock(rs.getInt("stock"));
            producto.setEstado(rs.getBoolean("estado"));
        }

        rs.close();
        ps.close();
    } catch (SQLException ex) {
        Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, "Error al conectarse a base de datos:", ex.getMessage());
    }

    return producto;
}

                  
     
    

    @Override
public List<Object> obtenerTodo() {
    ArrayList<Object> listaProductos = new ArrayList<>();

    try {
        PreparedStatement ps = con.prepareStatement(OBTENER_TODO);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Producto producto = new Producto();
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecioActual(rs.getDouble("precioActual"));
            producto.setStock(rs.getInt("stock"));
            producto.setEstado(rs.getBoolean("estado"));
            listaProductos.add(producto);
        }
        ps.close();
        rs.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto: " + ex.getMessage());
    }

    return listaProductos;
}


    
   
}
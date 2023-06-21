package control;
import Interfaces.SqlCrud;
import control.Conexion;
import entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProveedorData implements SqlCrud {

    private final String INSERT = "INSERT INTO proveedor (idProveedor, nombre, direccion, telefono) VALUES (?, ?, ?, ?)";
    private final String UPDATE = "UPDATE proveedor SET nombre = ?, direccion = ?, telefono = ? WHERE idProveedor = ?";
    private final String DELETE = "DELETE FROM proveedor WHERE idProveedor = ?";
    private final String OBTENER_UNO = "SELECT * FROM proveedor WHERE idProveedor = ?";
    private final String OBTENER_TODO = "SELECT * FROM proveedor";
    private final Connection con;

    public ProveedorData() {
        con = Conexion.getConexion();
    }

    @Override
    public void insertar(Object object) {
        Proveedor proveedor = (Proveedor) object;

        try {
            PreparedStatement st = con.prepareStatement(INSERT);
            st.setInt(1, proveedor.getIdProveedor());
            st.setString(2, proveedor.getRazonSocial());
            st.setString(3, proveedor.getDomicilio());
            st.setInt(4, proveedor.getTelefono());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, "Error al conectarse a la base de datos", ex);
        }
    }

    @Override
    public void borrar(int id) {
        try {
            PreparedStatement ps = con.prepareStatement(DELETE);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, "Error al conectar con la base de datos", ex);
        }
    }

    @Override
    public Object actualizar(Object object) {
        Proveedor proveedor = (Proveedor) object;
        try {
            PreparedStatement ps = con.prepareStatement(UPDATE);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setInt(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, "Error al actualizar el proveedor en la base de datos", ex);
        }
        return proveedor;
    }

    @Override
    public Object obtenerUno(int id) {
        Proveedor proveedor = null;
        try {
            PreparedStatement ps = con.prepareStatement(OBTENER_UNO);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getInt("telefono"));
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorData.class.getName()).log(Level.SEVERE, "Error al obtener el proveedor de la base de datos", ex);
        }

        return proveedor;
    }

    @Override
    public List<Object> obtenerTodo() {
        ArrayList<Object> listaProveedores = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(OBTENER_TODO);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProveedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getInt("telefono"));
                
                listaProveedores.add(proveedor);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor: " + ex.getMessage());
        }

        return listaProveedores;
    }
}

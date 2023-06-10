package control;

import Interfaces.SqlCrud;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class DetalleVentaData implements SqlCrud{
    private final Connection conexion;

    public DetalleVentaData() {
        conexion = Conexion.getConexion();
    }
    

    @Override
    public void insertar(Object object) {
        DetalleVenta detalleCompra = (DetalleVenta) object;
        String query = "INSERT INTO detalleventa (cantidad, precioVenta, idVenta, idProducto)VALUES (?,?,?,?)";
        try{
            PreparedStatement ps = conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleCompra.getCantidad());
            ps.setDouble(2, detalleCompra.getPrecioVenta());
            ps.setInt(3, detalleCompra.getVenta().getIdVenta());
            ps.setInt(4, detalleCompra.getProducto().getIdProducto());
            ps.executeUpdate();
            ResultSet rs =ps.getGeneratedKeys();
            if(rs.next()){
                detalleCompra.setIdDetalleVenta(rs.getInt(1));
            }
            ps.close();
            rs.close();
        }catch(SQLException e){
            System.out.println("Error en la bd" + e);
        }
    }

    @Override
    public void borrar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object actualizar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object obtenerUno(int id) {
        DetalleVenta detalleVenta = null;
        String query = "SELECT * FROM detalleventa WHERE idDetalleVenta = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                DetalleVenta dc = new DetalleVenta();
                dc.setIdDetalleVenta(id);
                dc.setCantidad(resultado.getInt("cantidad"));
                dc.setVenta(new Venta());
                dc.setPrecioVenta(resultado.getDouble("precioVenta"));
                dc.getVenta().setIdVenta(resultado.getInt("idVenta"));
                dc.setProducto(new Producto());
                dc.getProducto().setIdProducto(resultado.getInt("idProducto"));
                detalleVenta = dc;
            }
            ps.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd"+ e);
        }
        return detalleVenta;
    }

    @Override
    public List<Object> obtenerTodo() {
        ArrayList<Object> lista = new ArrayList<>();
        String query = "SELECT * FROM detalleventa";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                DetalleVenta dc = new DetalleVenta();
                dc.setIdDetalleVenta(resultado.getInt("idDetalleVenta"));
                dc.setCantidad(resultado.getInt("cantidad"));
                dc.setPrecioVenta(resultado.getDouble("precioVenta"));
                dc.setVenta(new Venta());
                dc.getVenta().setIdVenta(resultado.getInt("idVenta"));
                dc.setProducto(new Producto());
                dc.getProducto().setIdProducto(resultado.getInt("idProducto"));
                lista.add(dc);
            }
            ps.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error en la bd" + e);
        }
        return lista;
    }

    
  
}

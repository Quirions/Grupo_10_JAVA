/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author alejo
// */
//public class Conexion1 {
//    
//    private  String url;//="jdbc:mysql://localhost/universidad";
//    private  String usuario;//="root";
//    private  String password;//="";
//    private  Connection conexion;//=null
//
//    public Conexion1(String url, String usuario, String password) {
//        this.url = url;
//        this.usuario = usuario;
//        this.password = password;
//        try {
//            Class.forName("org.mariadb.jdbc.Driver");
//            
//        } catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver");
//        }
//    }
//
//             
//    public  Connection getConexion() {
//        
//      if(conexion == null){
//  
//        }
//        try {
//            // Setup the connection with the DB
////            connection = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);
//            conexion=DriverManager.getConnection(url,usuario,password);
//        }catch (SQLException ex) {
//            Logger.getLogger(Conexion1.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        return conexion;
//    }
//
//}

package entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author mauri
 */
public class Directorio {
    
    private HashMap <String,Cliente > clientes = new HashMap<>();

    public HashMap<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashMap<String, Cliente> clientes) {
        this.clientes = clientes;
    }

   public void agregarCliente(String telefono, Cliente c) {
        
        if (!clientes.containsKey(telefono)) {
            clientes.put(telefono, c);
            
        }
       
    }   
    
    
   public Cliente buscarTelefono (String telefono){
       
       
       for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            String key = entry.getKey();
            Cliente v = entry.getValue();
           
           if (key.equals(telefono)){
               return v;   
           }
       }
       return null;
       
   } 
   
    public ArrayList<Cliente> buscarClienteNombre (String nombre){
       
       ArrayList <Cliente> nombreClientes = new ArrayList<>();
       
       for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            String key = entry.getKey();
            Cliente v = entry.getValue();
           
           if (v.getApellido().equals(nombre)){
               nombreClientes.add(v);

           }
       }
        
        return nombreClientes;

   } 
   
    public ArrayList<Cliente> buscarClientes (String ciudad){
       
        ArrayList <Cliente> ciudadClientes = new ArrayList<>();
        
       for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            String key = entry.getKey();
            Cliente v = entry.getValue();
           
           if (v.getCiudad().equals(ciudad)){
             ciudadClientes.add(v);
           }
       }
        
       return ciudadClientes;

   } 
        
    
    public void BorrarCliente(String telefono){
        
        for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            String key = entry.getKey();
            Cliente value = entry.getValue();
            
            if(telefono.equals(key)){
                
                clientes.remove(key, value);
                
            }
            
        }
        
    }
    
    
}

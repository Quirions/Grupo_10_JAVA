package modelo;

import java.time.LocalDate;

public abstract class Persona {

    private String nombre;

    private String apellido;

    private int dni;

   private LocalDate fecha_nac;

    public Persona(String nombre, String apellido, int dni, LocalDate fecha_nac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nac = fecha_nac;
    }
   
   
    
    
    
    
    
    
}

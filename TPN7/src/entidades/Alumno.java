package entidades;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Alumno {

    private int legajo;

    private String apellido;

    private String nombre;
    
    private ArrayList <Materia> materiasInscripto=new ArrayList() ;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        
    }

    public ArrayList<Materia> getMateriasInscripto() {
        return materiasInscripto;
    }

    public void setMateriasInscripto(ArrayList<Materia> materiasInscripto) {
        this.materiasInscripto = materiasInscripto;
    }

    
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public void agregarMateria(Materia materia) {
        
        materiasInscripto.add(materia);
        
    }

    public int cantidadMaterias() {
        
        return materiasInscripto.size();
        
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    public String mostrarAlumno(){
        
        return legajo+" - "+nombre + " " + apellido + " materias:" + materiasInscripto.toString() ;
        
    }
    
    
}

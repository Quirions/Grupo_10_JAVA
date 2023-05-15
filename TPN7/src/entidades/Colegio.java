package entidades;


import java.util.ArrayList;
import java.util.HashMap;
import vistas.Menu;


public class Colegio {

    public static ArrayList<Alumno> alumnos = new ArrayList(); 
    public static ArrayList<Materia> materias = new ArrayList(); 

    public static void main(String[] args) {
        
//        //se crean las 3 materias
    
        materias.add(new Materia(1,"Ingles",2023));
        materias.add(new Materia(2,"Matematica",2023));
        materias.add(new Materia(3,"Laboratorio 1",2023));
       
//        // se crean 2 alumnos
      
        alumnos.add(new Alumno (1001,"Lopez","Martin"));
        alumnos.add(new Alumno (1002,"Martinez","Brenda")) ;
  
//        //inicializamos las vistas
        
        Menu m = new Menu();
        m.setVisible(true);
   
    }
    
}

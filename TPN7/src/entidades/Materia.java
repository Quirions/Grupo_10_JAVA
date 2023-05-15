package entidades;

public class Materia {

    private int idMaterias;

    private String nombre;

    private int anio;
    

    public int getIdMaterias() {
        return idMaterias;
    }

    public void setIdMaterias(int idMaterias) {
        this.idMaterias = idMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
    
    public Materia(int idMaterias, String nombre, int anio) {
        this.idMaterias = idMaterias;
        this.nombre = nombre;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return nombre;
    }

  
}

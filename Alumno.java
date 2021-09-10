package Tarea8;

public class Alumno {
    private String carne;
    private String nombre;
    private int edad;

    public Alumno(String carne, String nombre, int edad) {
        this.carne = carne;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getCarne() {
        return carne;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
  
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //get para poder obtener el precio desde Comparador
    public int getEdad() {
        return edad;
    }
}

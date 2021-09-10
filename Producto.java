package Tarea8;

public class Producto {
    //atributos
    private int id;
    private String nombre;
    private double precio;

    //nuestro constructor para llamar a los atributos
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    
    //get para poder obtener el precio desde Comparador
    public double getPrecio(){
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}

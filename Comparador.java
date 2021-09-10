package Tarea8;

public class Comparador {
    //atributos
    private double precio;
    private int edad;

    //constructor
    public Comparador() {
        this.precio = 0;
        this.edad = 0;
    }

    //set para precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //set para edad
    public void setEdad(int edad) {
        this.edad = edad;
    }    
    
    
  
    //metodos de comparacion para el PRECIO del producto
    public boolean igualQue(Object p){
        Producto prod = (Producto) p;
        return prod.getPrecio() == this.precio;
    }
    
    public boolean menorQue(Object p){
        Producto prod = (Producto) p;
        return prod.getPrecio() < this.precio;
    }
    
    public boolean menorIgualQue(Object p){
        Producto prod = (Producto) p;
        return prod.getPrecio() <= this.precio;
    }
    
    public boolean mayorQue(Object p){
        Producto prod = (Producto) p;
        return prod.getPrecio() > this.precio;
    }
    
    public boolean mayorIgualQue(Object p){
        Producto prod = (Producto) p;
        return prod.getPrecio() >= this.precio;
    }
    
    
    //metodos de comparacion para la EDAD del alumno
    public boolean igualQueAl(Object a){
        Alumno al = (Alumno) a;
        return al.getEdad() == this.edad;
    }
    
    public boolean menorQueAl(Object a){
        Alumno al = (Alumno) a;
        return al.getEdad() < this.edad;
    }
    
    public boolean menorIgualQueAl(Object a){
        Alumno al = (Alumno) a;
        return al.getEdad() <= this.edad;
    }
    
    public boolean mayorQueAl(Object a){
        Alumno al = (Alumno) a;
        return al.getEdad() > this.edad;
    }
    
    public boolean mayorIgualQueAl(Object a){
        Alumno al = (Alumno) a;
        return al.getEdad() >= this.edad;
    }
}

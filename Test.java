package Tarea8;

import java.util.Scanner;

public class Test {
    
    private static void Menu(){
        
    }

 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String nombreP, nombreA,carne;
        int id, edad, edadCom;
        Double precio, precioCom;
        
        Comparador com = new Comparador();
        
        System.out.println("************Bienvenido, escoge tu opcion!************");
        
        int opcion = 0;
        do{
            System.out.println("\n//////////");
            System.out.println("1. Ingresar Producto");
            System.out.println("2. Ingresar Alumno");
            System.out.println("3. Salir");
            System.out.println("//////////");
            opcion = s.nextInt();
            //datos solicitados al usuario
            switch (opcion){
                case 1:
                    s.nextLine();
                    System.out.println("\nIngresa el Id del Producto: ");
                    id = s.nextInt();
                    System.out.println("Ingresa el Nombre del Producto: ");
                    nombreP = s.nextLine();
                    s.nextLine();
                    System.out.println("Ingresa el Precio del Producto: ");
                    precio = s.nextDouble();
                    //segundo precio para su comparacion
                    System.out.println("Ingresa Segundo Precio para Comparar");
                    precioCom = s.nextDouble();
                    
                    Producto salida = new Producto(id, nombreP, precio);
                    com.setPrecio(precioCom);
                    
                    //condiciones
                    if(com.igualQue(salida) == true){
                        System.out.println("Los precios son iguales");
                    }
                    if(com.menorQue(salida) == true){
                        System.out.println("El primer precio ingresado es menor al segundo precio");
                    }
                    if(com.menorIgualQue(salida) == true){
                        System.out.println("El primer precio ingresado es menor o igual al segundo precio");
                    }
                    if(com.mayorQue(salida) == true){
                        System.out.println("El primer precio ingresado es mayor al segundo precio");
                    }
                    if(com.mayorIgualQue(salida) == true){
                        System.out.println("El primer precio ingresado es mayor o igual al segundo precio");
                    }        
                    break;
                case 2:
                    s.nextLine();
                    System.out.println("\nIngresa el Carne del Alumno: ");
                    carne = s.nextLine();
                    System.out.println("Ingresa el Nombre del Alumno: ");
                    nombreA = s.nextLine();
                    System.out.println("Ingresa la edad del Alumno: ");
                    edad = s.nextInt();
                    //segunda edad para su comparacion
                    System.out.println("Ingresa segunda edad para Comparar");
                    edadCom = s.nextInt();
                    
                    Alumno salida2 = new Alumno(carne, nombreA, edad);
                    com.setEdad(edadCom);
                    
                    //condiciones
                    if(com.igualQueAl(salida2) == true){
                        System.out.println("Las edades son iguales");
                    }
                    if(com.menorQueAl(salida2) == true){
                        System.out.println("La primer edad ingresada es menor a la segunda edad");
                    }
                    if(com.menorIgualQueAl(salida2) == true){
                        System.out.println("La primer edad ingresada es menor o igual a la segunda edad");
                    }
                    if(com.mayorQueAl(salida2) == true){
                        System.out.println("La primer edad ingresada es mayor a la segunda edad");
                    }
                    if(com.mayorIgualQueAl(salida2) == true){
                        System.out.println("La primer edad ingresada es mayor o igual a la segunda edad");
                    }
                        break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion Invalida!");
                    break;
            }
        } while(opcion !=3);
        
    }
    
}

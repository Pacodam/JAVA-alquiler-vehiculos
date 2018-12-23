
package alquilervehiculos;

import java.util.*;

public class AlquilerVehiculos {
    
    public static ArrayList<Vehiculo> vehiculosEmpresa = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        int option;
        
        //introducimos en el arraylist un vehiculo de cada tipo, añadimos PMA o plazas dependiendo si es 
        //vehiculo de transporte o de pasajeros:
        vehiculosEmpresa.add(new Camion("CAMION111", 3.5));
        vehiculosEmpresa.add(new Coche("COCHE111", 4));
        vehiculosEmpresa.add(new FurgonetaCarga("FCARGA111", 1.5));
        vehiculosEmpresa.add(new Microbus("MICROBUS111", 10));
        
        //Vehiculo moto = new Vehiculo("n4567"); Vemos que una clase abstracta no puede ser instanciada, da error.
        
        do{
            
            System.out.println("\n1. Ver vehiculos de la empresa");
            System.out.println("2. Obtener precio alquiler");
            System.out.println("0. Salir");
            
            option = input.nextInt();
            
            switch(option){
                case 1: 
                    verVehiculos();
                    break;
                case 2:
                    calculoAlquiler();
                    break;
            }
        }while(option != 0);
        
       
    }
    //comprobación de javadoc
    
    /**
     * Function that does nothing at all
     * @param a
     * @param b 
     */
    public static void pruebaJavaDoc(int a, double b){
        a = 2;
        b = 5;
    }
    
    public static void verVehiculos(){
        for(Vehiculo index: vehiculosEmpresa){
            System.out.println("tipo vehiculo:"+ index.getClass());
            System.out.println("matricula:"+ index.getMatricula());
            System.out.println("\n");
        }
    }
     public static void verMatriculas(){
         
        System.out.println("Vehiculos disponibles:");
        for(Vehiculo index: vehiculosEmpresa){
            System.out.println("matricula:"+ index.getMatricula());
            System.out.println("\n");
        }
    }
    
    public static void calculoAlquiler(){
        
       
        
        verMatriculas();
        System.out.println("Introduzca la matricula del vehiculo:");
        String matricula = input.next();
        //obtenemos el index de la matricula introducida y lo enviamos para calculo presupuesto
        boolean existe = false;
        for(Vehiculo index: vehiculosEmpresa){
            if(index.getMatricula().equals(matricula)){
                 System.out.println("Introduzca el numero total de dias de alquiler:");
                 int dias = input.nextInt();
                 double total = index.calcularPrecio(dias);
                 System.out.println(index.generarDetalle(dias));
                 System.out.println("PRECIO TOTAL: "+ total + " euros");
                 existe = true;
            }
        }
            if(!existe){
                System.out.println("No existe ningun vehiculo con esa matricula");
            }
        }   
        
    }
    


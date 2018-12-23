/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculos;

public abstract class Vehiculo {
    
    private String matricula;
    final double precioBaseDia = 50; //es un atributo general para todos los hijos

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

   //polimorfismo. El metodo de la superclase vehiculo calcula el precioBase
   //mediante override, los hijos añadiran sus cálculos específicos segun tipo vehiculo
   public double calcularPrecio(int dias){
       double precioBase = this.precioBaseDia * dias;
       return this.precioBaseDia * dias; 
   } 
   
   public String generarDetalle(int dias){
       String detalle = "Precio base de vehiculo: " + precioBaseDia + " euros dia X " +  dias + " dias = " + precioBaseDia * dias + " euros.";
       detalle += "\n";
       return detalle;
   } 
    
    
    
}

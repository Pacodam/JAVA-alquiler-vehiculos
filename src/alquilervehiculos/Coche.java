/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculos;


public class Coche extends Transporte {
    
    
    private double precioPlazaDia = 1.5; 
    
    public Coche(String matricula, int plazas) {
        super(plazas, matricula);
        
    }
    
     //aquí trabajamos el concepto de polimorfismo
     @Override
    public double calcularPrecio(int dias){
        double totalEspecifico = this.precioPlazaDia * dias * getPlazas();
        double total = super.calcularPrecio(dias) + totalEspecifico;
        return total;
       
    }
    @Override
    public String generarDetalle(int dias){
        String detalle = super.generarDetalle(dias);
        detalle += "Precio especifico coche: " + precioPlazaDia + " precio plaza por dia X "+ 
                    dias + " dias X "+ getPlazas() +" plazas = "+ precioPlazaDia*dias*getPlazas() + " euros.";
        detalle += "\n";
        return detalle;
    }
      
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculos;

/**
 *
 * @author alu2017454
 */
public class Microbus extends Transporte {
    
    
    private final double precioPlaza = 2;  //fijo, no importa numero dias alquiler
    
    public Microbus(String matricula, int plazas){
        super(plazas, matricula); //herencia
        
    }

    //aquí trabajamos el concepto de polimorfismo
     @Override
    public double calcularPrecio(int dias){
        
        double total = super.calcularPrecio(dias) + precioPlaza * super.getPlazas();
        return total;
       
    }
    
    @Override
    public String generarDetalle(int dias){
        String detalle = super.generarDetalle(dias);
        detalle += "Precio especifico microbus: " + precioPlaza + " precio plaza X "+ getPlazas() + " plazas = "+ precioPlaza*getPlazas() + " euros.";
        detalle += "\n";
        return detalle;
    }
    
    
}

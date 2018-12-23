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
public class Camion extends Carga {
    
    private final double fijoCamion = 40;
    
    public Camion(String matricula, double pma){
        super(pma,matricula); 
    }

   
     //aquí trabajamos el concepto de polimorfismo
     @Override
    public double calcularPrecio(int dias){
        
        double total = super.calcularPrecio(dias) + fijoCamion;
        return total;
    }
    
    @Override
     public String generarDetalle(int dias){
        String detalle = super.generarDetalle(dias);
        detalle += "Suplemento camion: " + fijoCamion + " euros.";
        detalle += "\n";
        return detalle;
    }
}

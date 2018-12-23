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
public class FurgonetaCarga extends Carga {
    
    private final double precioBasePMA = 20;
    
    public FurgonetaCarga(String matricula, double pma){
        super(pma, matricula);
          
    }
    
    @Override
    public double calcularPrecio(int dias){
        double total = super.calcularPrecio(dias);
        return total;
    }
    @Override
    public String generarDetalle(int dias){
        String detalle = super.generarDetalle(dias);
        return detalle;
    }
    
    
    
}

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
public abstract class Transporte extends Vehiculo {
    
    private int plazas;
    
    public Transporte(int plazas, String matricula){
        super(matricula);
        this.plazas = plazas;
    }
    
    public int getPlazas(){
        return this.plazas;
    }
    public void setPlazas(int plazas){
        this.plazas = plazas;
    }
    
    
    
}

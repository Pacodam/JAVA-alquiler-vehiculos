
package alquilervehiculos;


public abstract class Carga extends Vehiculo {
    
    private double pma;
    private final double precioBasePMA = 20;
    
    public Carga(double pma, String matricula){
        super(matricula);
        this.pma = pma;
    }
    
    public double getPma(){
        return this.pma;
    }
    
    public void setPma(double pma){
        this.pma = pma;
    }
    
     //aquí trabajamos el concepto de polimorfismo
     @Override
    public double calcularPrecio(int dias){
        double totalEspecifico = this.precioBasePMA * this.pma;
        double total = super.calcularPrecio(dias) + totalEspecifico;
        /*System.out.println("Precio especifico furgoneta carga: "+ 
                           this.precioBasePMA + " euros PMA X " + 
                           this.pma + " PMA = "+ totalEspecifico ); */
        return total;
    }
    
     @Override
     public String generarDetalle(int dias){
        String detalle = super.generarDetalle(dias);
        detalle += "Precio especifico carga: " + this.pma + " Peso Maximo Autorizado  X 20 euros = "+ this.pma*20 + " euros.";
        detalle += "\n";
        return detalle;
    }
    
}

package FabricaOO.vehiculos;

public class Vehiculo_Electrico {
    // Atributo
    private double potencia;

    // Constructor
    public Vehiculo_Electrico (double potencia){
        this.potencia = potencia;
    }

    // get-sets
    public double getPotencia () {return potencia;}

    public void setPotencia (double potencia) { this.potencia = potencia;}
}

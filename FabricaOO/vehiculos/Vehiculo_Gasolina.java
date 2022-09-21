package FabricaOO.vehiculos;

public class Vehiculo_Gasolina {
    // Atributos
    private String contaminacion;
    private double deposito;

    // Constructor
    public Vehiculo_Gasolina(String contaminacion, double deposito){
        this.contaminacion = contaminacion;
        this.deposito = deposito;
    }

    public String getContaminacion(){return contaminacion;}

    public void setContaminacion(String contamincacion) {this.contaminacion = contamincacion;}

    public double getDeposito() {return deposito;}

    public void setDeposito(double deposito) {this.deposito = deposito;} 
}

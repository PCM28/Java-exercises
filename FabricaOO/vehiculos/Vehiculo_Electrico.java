package FabricaOO.Vehiculos;

public class Vehiculo_Electrico extends Vehiculo{
    // Atributo
    private float potencia;

    // Constructor
    public Vehiculo_Electrico (){
        this.potencia = 0.0f;
    }

    // Get-Sets
    public float getPotencia () {return potencia;}

    public void setPotencia (float potencia) { this.potencia = potencia;}

    @Override
    public String mostrarInfo(){ //Siempre que se llame al método padre, siendo este in String, estás invocando un string así que primero llamas al return luego esta invocación String y luego agregar los atributos de la clase hija
        return super.mostrarInfo() +
        "\", \n \"tipo\" = \"" + "Eléctrico" +
        "\", \n \"potencia\" = \"" + this.potencia + "\" \n}";
    }
}

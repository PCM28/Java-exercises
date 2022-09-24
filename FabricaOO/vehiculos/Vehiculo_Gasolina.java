package FabricaOO.Vehiculos;

public class Vehiculo_Gasolina extends Vehiculo{
    // Atributos
    private String contaminacion;
    private float tamanyo_deposito;

    // Constructor
    public Vehiculo_Gasolina(){//Solucion al tener varios parámetros por herencia, al constructor del padre no pasar parámentros sino inicializarlos de manera directa con valores netro así no acumularás parámetros a las clases hijas
        this.contaminacion = "";
        this.tamanyo_deposito = 0.0f;
    }

    public String getContaminacion(){return contaminacion;}

    public void setContaminacion(String contamincacion) {this.contaminacion = contamincacion;}

    public float getTamanyo_deposito() {return tamanyo_deposito;}

    public void setTamanyo_deposito(float tamanyo_deposito) {this.tamanyo_deposito = tamanyo_deposito;} 

    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() +
                "\", \n\"tipo\" = \"" + "Eléctrico" +
                "\", \n\"contaminación\" = \"" + this.contaminacion +
                "\", \n\"Tamaño de deposito\" = \"" + this.tamanyo_deposito + "\" }";
    }
}
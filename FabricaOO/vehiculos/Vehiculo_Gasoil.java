package FabricaOO.Vehiculos;

public class Vehiculo_Gasoil extends Vehiculo{
    public Vehiculo_Gasoil(){
    }
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() +
                "\", \n\"tipo\" = \"" + "Gasoil" + "\" }";
    }
}

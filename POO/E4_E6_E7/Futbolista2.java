package POO.E4_E6_E7;

public class Futbolista2 extends Deportista{
    protected int dorsal;

    public Futbolista2(String nombre, int dni, int edad, int dorsal){
        super(nombre, dni, edad);
        this.dorsal = dorsal;
    }

    public int getDorsal() {return dorsal;}

    public void setDorsal(int dorsal) {this.dorsal=dorsal;}
    // E5
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.print("Dorsal: " + getDorsal());
    }
    // E6
    @Override
    public String descriptionDeporte(){
        return "Natación...";
    }
    // E7
    @Override
    public String mostrarInfo(){
        return this.dorsal + "";//Tiene que ver un String por cojones, sino salta error
    }
}

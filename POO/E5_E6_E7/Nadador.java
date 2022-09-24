package POO.E5_E6_E7;

import POO.E4_E6_E7.Deportista;

public class Nadador extends Deportista{
    protected float altura;
    protected float peso;
    
    public Nadador(String nombre, int dni, int edad, float altura, float peso){
        super(nombre, dni, edad);
        this.altura = altura;
        this.peso = peso;
    }

    public float getAltura() {return altura;}

    public void setAltura(float altura) {this.altura=altura;}

    public float getPeso() {return peso;}

    public void setPeso(float peso) {this.peso=peso;}
    // E5
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
    }

    // E6
    @Override
    public String descriptionDeporte(){
        return "Natación...";
    }

    // E7
    @Override
    public String mostrarInfo(){
        return this.altura + " - " + this.peso;
    }

}

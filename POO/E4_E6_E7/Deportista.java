package POO.E4_E6_E7;

import POO.E7.IDeporte;

public abstract class Deportista implements IDeporte{
    protected String nombre;
    protected int dni;
    protected int edad;

    public Deportista(String nombre, int dni, int edad){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre=nombre; }

    public int getDni() { return dni; }

    public void setDni(int dni) { this.dni=dni; }

    public int getEdad() { return edad; }

    public void setEdad(int edad) { this.edad=edad; }

    public void mostrar(){
        System.out.println("Nombre: " + getNombre() + 
                            "\nDni: " + getDni() + 
                            "\nEdad: " + getDni());
    }

    // E6
    public abstract String descriptionDeporte();

}

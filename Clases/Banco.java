package Clases;

public class Banco {
    final private String nombre;//Invisible, no modificable (siempre es que no tiene acceso otras clases -> usar private)
    public double capital = 5.2;
    public String direccion;

    public Banco(String nombre){//Crea un banco solo con el nombre
        this(nombre,0,"No asignado");
    }


    public Banco(String nombre,double capital,String direccion){//Crea otro banco con todos los datos
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Capital: " + capital);
        System.out.println("Dirección: " + direccion);
        System.out.println();
    }
}

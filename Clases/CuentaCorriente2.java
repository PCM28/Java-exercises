package Clases;

public class CuentaCorriente2 {
    double saldo = 0;//Si pongo datos aquí sería de tipo static
    double limite;
    String nombre;
    String dni;

    //CuentaCorriente2 c = new CuentaCorriente2();
    CuentaCorriente2(String nombre, String dni){//Constructor cuando vaya a crear el objeto tipo cuentaCorriente2 lo deja
        this.nombre = nombre;
        this.dni = dni;
        saldo = 0;//Es lo mismo que poner static double saldo = 0, te ahorras una línea
        limite = -50;
    }

    boolean sacarDinero(double cantidad){ //Los atributos pueden ser usados como parámetros como también dentro de los métodos
        boolean resultado = false;
        saldo-=cantidad;
        /*if(){

        } else {

        }*/
        return (resultado);
    }

    void ingresarDinero(double cantidad){
        saldo+=cantidad;
    }

    void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
        System.out.println("Límite descubierto: "+limite);
    }
}

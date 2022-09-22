package Clases;

public class Main2 {
    public static void main(String [] args){
        CuentaCorriente2 c = new CuentaCorriente2("Leo","1234Q"); //Este objeto tiene aceso a todos los métodos y atributos de la clase cuentaCorriente2
        c.ingresarDinero(125000);
        c.mostrarDatos();
    }
}

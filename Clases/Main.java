package Clases;

public class Main {
    public static void main(String[]args){
        //CREAMOS EL OBJETO, INICIALIZANDO SUS VALORES (USAMOS CONSTRUCTOR)
        //CuentaCorriente c1 = new CuentaCorriente("Pierre","03502195P");//Puede crear el objeto por ser clases vecinas pueden acceder a sus clases y miembros. Primera parte la referencia variable tipo class segunda parte el objeto
        //Cuenta corriete para Pierre con dni. Aquí se crea la cuenta corriente para la primera persona, felicidades


        //SIEMPRE EN ORDEN(UNO SEGUIDO DEL OTRO SIN ESPACIOS) AL IGUAL QUE LOS CONSTRUCTORES SOBRECARGADOS, SINO SALTA ERROR
        CuentaCorriente c1 = new CuentaCorriente("Pierre","03502195P");


        c1.limite = -100;
        c1.ingresarDinero(125000);
        c1.sacarDinero(5000);

        //MÉTODOS
        c1.mostrarInformacion();
        System.out.println("Puedo sacar 12000€: " + c1.sacarDinero(12000));//Resta 12000
        System.out.println("Puedo sacar 200000€: " + c1.sacarDinero(200000));//Resta 200000 ->pasa del límite

        //VAMOS USAR SOLO EL CONSTRUCTOR CON SOLO SALDO
        c1 = new CuentaCorriente(100000);
        c1.mostrarInformacion();

        //VAMOS USAR SOLO EL CONSTRUCTOR CON SALDO,LÍMITE Y DNI
        c1 = new CuentaCorriente(100000,50,"123456789W");
        c1.mostrarInformacion();

        //Son los otros 2 objetos
        CuentaCorriente c2 = new CuentaCorriente("Leo","1234566789Q");//Cuenta de objeto 2
        CuentaCorriente c3 = new CuentaCorriente("Rose","123456789W");//Cuenta de objeto 3

        c2.mostrarInformacion();
        c2.nombreBanco = "BBVA";
        c3.mostrarInformacion();
        CuentaCorriente.nombreBanco = "Do.While"; // Cambia nombre no al atributo del objeto sino al toda la clase
        c3.mostrarInformacion();
        CuentaCorriente.nombreBanco = "If-Else";
        c3.mostrarInformacion();
        c2.mostrarInformacion();

        /*c1.limiteDescubierto = -100;// Establecemos un límite (Podemos modificar atributos de otras clases vecinas, teoría y este es el ejm)

        c1.ingresarDinero(125000);
        c1.sacarDinero(5000);
        c1.mostrarInformacion();

        System.out.println("Puedo sacar 12000€: " + c1.sacarDinero(12000));//Resta 12000
        System.out.println("Puedo sacar 200000€: " + c1.sacarDinero(200000));//Resta 200000 ->pasa del límite
        */

    }
}

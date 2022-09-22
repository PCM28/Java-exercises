package Clases;

public class CuentaCorriente {
    //ATRIBUTOS
    double saldo;
    double limite;
    public String nombre;
    String DNI;

    static String nombreBanco = "Java Bank";

    Banco banco;

    CuentaCorriente(String nombre, String DNI, Banco banco){
        this(0,-50,DNI); //3er Constructor
        this.nombre = nombre;
        this.banco = banco;
    }

    //(Manera eficaz)
    CuentaCorriente(String nombre, String DNI){
        this(0,-50,DNI);
        this.nombre = nombre;
    }

    CuentaCorriente(double saldo, double limite, String DNI){
        this.saldo = saldo;
        this.limite = limite;
        this.DNI = DNI;
        this.nombre = "Sin asignar";
    }

    CuentaCorriente(double saldo){
        this(saldo,0,"Sin dni");
    }



    //----------------------------------------------------------------------------------------------------------------------------------------------
    //MÉTODOS
    void cambiarBanco(Banco banco){//Variable tipo banco
        this.banco = banco;
    }

    void mostrarInformacion2(){//Muestra estado de la cuenta incluido el banco
        System.out.println("Información del banco");
    }

    /*if(banco==null){
        System.out.println("Cuenta no asociada a ningún banco");
    } else {
        banco.mostrarDatos();
    }*/


    //----------------------------------------------------------------------------------------------------------------------------------------------
    //Método como debe ser
    boolean sacarDinero(double cant){ //Cantidad a sacar,no public son los atributos llamados ya que para que se objeto se ha tenido que usar new
        boolean operacionPosible;

        if((saldo-cant)>=limite){//cant variable no local, es de parámetro
            saldo -= cant;
            operacionPosible = true;
        } else{
            System.out.println("No hay suficiente");
            operacionPosible = false;
        }

        return (operacionPosible);//Sino se coloca la inicialización se deberá de colocar ambos casos de los cuales sea true y false sino saltará error. Indica si se ha hecho la operación o no
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------


    //Método como debe ser(Falta poco, 2 cosas valor por parámetro y el aumento(cálculo))
    void ingresarDinero(double cant){
        saldo+=cant;
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------


    //Método como debe ser(Primera parte bien)
    void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + DNI);
        System.out.println("Saldo: " + saldo);
        System.out.println("Límite descubierto: "+limite);
        System.out.println("Banco: " + nombreBanco);
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------
    static void cambiarBanco(String nombre){
        nombreBanco = nombre; // es un atributo puede estar dentro de cualquier método. Como es de tipo static banco, este no puede usar this sinio salta error

    }
}

package ProyectoBanco.Inicial;
import java.util.Scanner;
public class Cobros {
    private double dineroCobros;
    private boolean existenciaCobros=false;//No hace falta boolean por el null

    public Cobros(double dineroCobros, boolean existenciaCobros){
        this.dineroCobros = dineroCobros;
        this.existenciaCobros = existenciaCobros;
    }

    public double getDineroCobros(){
        return dineroCobros;
    }

    public void setDineroCobros(double dineroCobros){
        this.dineroCobros = dineroCobros;
    }

    public boolean getExistenciaCobros(){
        return existenciaCobros;
    }

    public void setExistenciaCobros(boolean existenciaCobros){
        this.existenciaCobros = existenciaCobros;
    }

    //MÉTODOS PÚBLICOS
    public void imprimirCobros(){
        System.out.printf("\nÚltimo dinero depositado: %.2f€",dineroCobros);
    }

    //MÉTODOS ESTÁTICOS

    //Función principal
    static Cobros Deposito(Cobros cobros, Cuenta cuenta, Scanner input){
        //do{
            //Depósitos
            System.out.print("Ingrese la cantidad a depositar: ");//COBROS (INGRESOS)
            cobros.dineroCobros = input.nextDouble();
        //} while(!validacionDineroCobros(cobros));//!validacionDineroCobros(dineroCobros) = validacionDineroCobros(dineroCobros)==false
        cuenta.dineroCuenta = cuenta.dineroCuenta + cobros.dineroCobros;
        return new Cobros(cobros.dineroCobros, cobros.existenciaCobros);//cobros.existenciaCobros=true;
    }
}

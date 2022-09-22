package ProyectoBanco.Inicial;
import java.util.Scanner;
public class Pagos {
    private double dineroPagos;

    private boolean existenciaPagos=false;

    public Pagos(double dineroPagos, boolean existenciaPagos){
        this.dineroPagos = dineroPagos;
        this.existenciaPagos = existenciaPagos;
    }

    public double getDineroPagos(){
        return dineroPagos;
    }

    public void setDineroPagos(double dineroPagos){
        this.dineroPagos = dineroPagos;
    }

    public boolean getExistenciaPagos(){
        return existenciaPagos;
    }

    public void setExistenciaPagos(boolean existenciaPagos){
        this.existenciaPagos = existenciaPagos;
    }

    //MÉTODOS PÚBLICOS
    public void imprimirPagos(){
        System.out.printf("\nÚltimo dinero extraido: %.2f€",pagos.dineroPagos);
    }

    //MÉTODOS ESTÁTICOS

    //Función principal
    static Pagos Extraccion(Pagos pagos, Cuenta cuenta, Scanner input){
        //do{
            //Extracciones
            System.out.print("Ingrese la cantidad a extraer: ");//PAGOS (GASTOS)
            pagos.dineroPagos=input.nextDouble();
        //} while(!validacionDineroPagos(pagos));//!validacionDineroPagos(dineroPagos) = validacionDineroPagos(dineroPagos)==false, ! coloca el lado opuesto
        cuenta.dineroCuenta = cuenta.dineroCuenta - pagos.dineroPagos;
        return new Pagos(pagos.dineroPagos, pagos.existenciaPagos);//pagos.existenciaPagos=true;
    }
}

package ProyectoBanco.Inicial;
import java.util.Scanner;
public class Traspaso {
    private String cuentaDestino;
    private double dineroTraspaso;
    private boolean existenciaTraspaso=false;

    public Traspaso(String cuentaDestino, double dineroTraspaso, boolean existenciaTraspaso){
        this.cuentaDestino = cuentaDestino;
        this.dineroTraspaso = dineroTraspaso;
        this.existenciaTraspaso = existenciaTraspaso;
    }

    public String getCuentaDestino(){
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino){
        this.cuentaDestino = cuentaDestino;
    }

    public double getDineroTraspaso(){
        return dineroTraspaso;
    }

    public void setDineroTraspaso(double dineroTraspaso){
        this.dineroTraspaso = dineroTraspaso;
    }

    public boolean getExistenciaTraspaso(){
        return existenciaTraspaso;
    }

    public void setExistenciaTraspaso(boolean existenciaTraspaso){
        this.existenciaTraspaso = existenciaTraspaso;
    }

    //MÉTODOS PÚBLICOS
    public void imprimirPagos(){
        if(cuenta.dc==0) System.out.printf("\nTRANSFERENCIA:\nCuenta origen: 0 Cuenta destino: %s  Último Dinero transferido: %.2f€",cuentaDestino,dineroTraspaso);
            else System.out.printf("\nTRANSFERENCIA:\nCuenta origen: %d%04d%d%d  Cuenta destino: %s  Último Dinero transferido: %.2f€",cuenta.ce,cuenta.cs,cuenta.dc,cuenta.nc,cuentaDestino,dineroTraspaso);
    }

    //MÉTODOS ESTÁTICOS

    //Función principal
    static Traspaso Transferencia(Traspaso traspaso, Cuenta cuenta, Scanner input){
        //do{
            //Traspasos (this for 2nd part)
            System.out.print("Ingrese la cuenta destino IBAN(20 digitos): ");
            traspaso.cuentaDestino=input.next();
            System.out.print("Ingrese la cantidad a transferir: ");
            traspaso.dineroTraspaso = input.nextDouble();
        //} while(!validacionDineroTraspaso(traspaso));
        cuenta.dineroCuenta = cuenta.dineroCuenta - traspaso.dineroTraspaso ;
        return new Traspaso(traspaso.cuentaDestino, traspaso.dineroTraspaso, traspaso.existenciaTraspaso);//traspaso.existenciaTraspaso=true;
    }
}

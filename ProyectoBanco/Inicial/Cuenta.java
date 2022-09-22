package ProyectoBanco.Inicial;
import java.util.Random;
import java.util.Scanner;
public class Cuenta {
    //Cuenta Corriente
    private String cuentaTipo;
    private String cuenta;

    private double dineroCuenta = 0.0;

    private final int ce=9010;
    private final int cs=201;

    private long dc;//lo inicializaste a cero
    private long nc;//lo inicializaste a cero

    private boolean existenciaCuenta=false;

    public Cuenta(String cuentaTipo, String cuenta, double dineroCuenta, int ce, int cs, long dc, long nc, boolean existenciaCuenta){
        this.cuentaTipo = cuentaTipo;
        this.cuenta = cuenta;
        this.dineroCuenta = dineroCuenta;
        //this.ce = ce;---> estas líneas no son necesarias por que se han declarado como atributs estáticos
        //this.cs = cs;---> estas líneas no son necesarias por que se han declarado como atributs estáticos
        this.dc = dc;
        this.nc = nc;
        this.existenciaCuenta = existenciaCuenta;
    }

    public String getCuentaTipo(){
        return cuentaTipo;
    }

    public void setCuentaTipo(String cuentaTipo){
        this.cuentaTipo = cuentaTipo;
    }

    public String  getCuenta(){
        return cuenta;
    }

    public void setCuenta(String cuenta){
        this.cuenta = cuenta;
    }

    public double getDineroCuenta(){
        return dineroCuenta;
    }

    public void setDineroCuenta(double dineroCuenta){
        this.dineroCuenta = dineroCuenta;
    }

    public long getDc(){
        return dc;
    }

    public void setDc(long dc){
        this.dc = dc;
    }

    public long getNc(){
        return nc;
    }

    public void setNc(){
        this.nc=nc;
    }

    public boolean getExistenciaCuenta(){
        return existenciaCuenta;
    }

    public void setExistenciaCuenta(boolean existenciaCuenta){
        this.existenciaCuenta = existenciaCuenta;
    }

    //VER EL EJEMPLO, PASAR CADA MÉTODO A SU RESPECTIVA CLASE Y CONVERTIRLO DE MANERA ESTÁTICA YA QUE TODO LO QUE SEA ESTÁTICO ES NECESARIO PARA PODER CREAR EL OBJETO NO ANTES EJM: CE Y CS AMBOS CONSTANTES(PRIVATE FINAL) Y LOS UTILISAS PARA CREAR EL OBJETO CUENTA POR ESO EL MÉTODO ES TIPO ESTÁTICO

    //MÉTODOS PÚBLICOS
    public void imprimirCuenta(){
        //System.out.printf("\nCliente de la cuenta: %s",Cliente.nombre);
        System.out.printf("\nTipo de cuenta: %s",cuenta);
        //validacionMostrarCuentaOrigen(cuenta);
        System.out.printf("\nCantidad en la cuenta: %.2f€",cuenta);
    }

    //MÉTODOS ESTÁTICOS

    //Función tipo cuenta, Cuenta
    static String tipoCuenta(String cuentaTipo){
        String tipo="";
        switch(cuentaTipo) {
            case "a":
                tipo = "Ahorro";
                break;
            case "c":
                tipo = "Corriente";
                break;
            case "r":
                tipo = "Remunerado";
                break;
            default:
                System.out.println("Carácter no válido");
        }
        return tipo;
    } // DONE

    //Función generar DC, Cuenta
    static int generarDC(Cuenta cuenta){
        long c1=0,c2=0;
        //NºCuenta
        //DC=C1,C2
        int csSuma = 6*(cuenta.cs%10) + 3*(cuenta.cs%100)/10 + 7*((cuenta.cs%1000)/10) + 9*cuenta.cs/1000;
        int ceSuma = 5*(cuenta.ce%100)/10 + 8*(cuenta.ce%1000)/10 + 4*cuenta.ce/1000;//10*(ce%10)+5*(ce%100)/10+8*(ce%1000)/10+4*ce/1000; (fórmula 2nd part)

        c1=11-((csSuma+ceSuma)%11);
        c2=11-(((cuenta.nc/1000000000)+(2*((cuenta.nc/100000000)%10))+(4*((cuenta.nc/10000000)%10))+(8*((cuenta.nc/1000000)%10))+(5*((cuenta.nc/100000)%10))+(10*((cuenta.nc/10000)%10))+(9*((cuenta.nc/1000)%10))+(7*((cuenta.nc/100)%10))+(3*((cuenta.nc/10)%10))+(6*(cuenta.nc%10)))%11);
        int dc=(int)(c1*10+c2);
        return dc;
    } // DONE

    //Función principal
    static Cuenta TipoCuenta(Cuenta cuenta, Scanner input){
        //Tipo de Cuenta
        System.out.print("\nIntroduce tipo de cuenta (a/c/r): ");//a->ahorro, c->corriente, r->remunerada
        cuenta.cuentaTipo = input.next();//String saca la primera letra -->cuentaTipo = input.next().charAt(0);

        cuenta.cuenta = tipoCuenta(cuenta);

        //Generación Cuenta Origen
        cuenta.nc = new Random().nextLong();
        if(cuenta.nc<0) cuenta.nc*=-1;//PONER PRIMERO QUE SI ES NEGATIVO PASARLO POSITIVO Y PARA LA LINEA 241 SI PASA DEL LÍMITE APLICAR PORCENTAJE
        if(cuenta.nc>10000000000L) cuenta.nc%=10000000000L;//L para longs siempre y nc%100(0-99), nc%10(0-9) siempre es el valor que se coloca (estos casos 100 o 10) -1 = rango(0-99)
        cuenta.dc = generarDC(cuenta);

        return new Cuenta(cuenta.cuentaTipo,cuenta.cuenta,cuenta.dineroCuenta,cuenta.ce,cuenta.cs,cuenta.dc,cuenta.nc,cuenta.existenciaCuenta);//cuenta.existenciaCuenta=true;
    }
    }

    static int generarDC(int cs,int ce,long nc){
        long c1=0,c2=0;
        //NºCuenta
        //DC=C1,C2
        int csSuma = 6*(cs%10) + 3*(cs%100)/10 + 7*((cs%1000)/10) + 9*cs/1000;
        int ceSuma = 5*(ce%100)/10 + 8*(ce%1000)/10 + 4*ce/1000;//10*(ce%10)+5*(ce%100)/10+8*(ce%1000)/10+4*ce/1000; (fórmula 2nd part)

        c1=11-((csSuma+ceSuma)%11);
        c2=11-(((nc/1000000000)+(2*((nc/100000000)%10))+(4*((nc/10000000)%10))+(8*((nc/1000000)%10))+(5*((nc/100000)%10))+(10*((nc/10000)%10))+(9*((nc/1000)%10))+(7*((nc/100)%10))+(3*((nc/10)%10))+(6*(nc%10)))%11);
        int dc=(int)(c1*10+c2);
        return dc;
    }

}

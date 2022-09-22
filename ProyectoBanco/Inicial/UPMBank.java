import java.util.Random;
import java.util.Scanner;

public class UPMBank {
    public static void main(String[]args){
        //menu();
    }

    //Funciones validación de datos
    /*static boolean validacionAltaCliente(Cliente cliente){
        boolean resultado = true;
        if(!cliente.existenciaAltaCliente) resultado = false;
        return resultado;
    } // DONE

    static boolean validacionCuenta (Cuenta cuenta){
        boolean resultado = true;
        if(!cuenta.existenciaCuenta) resultado = false;
        return resultado;
    } // DONE Existencia de tipo de cuenta

    static boolean validacionCobros (Cobros cobros){
        boolean resultado = true;
        if(!cobros.existenciaCobros) resultado = false;
        return resultado;
    } // DONE Existencia de Cobros

    static boolean validacionPagos (Pagos pagos){
        boolean resultado = true;
        if(!pagos.existenciaPagos) resultado = false;
        return resultado;
    } // DONE Existencia de Extracción

    static boolean validacionTraspaso (Traspaso traspaso){
        boolean resultado = true;
        if(!traspaso.existenciaTraspaso) resultado = false;
        return resultado;
    } // DONE Existencia de traspaso

    static boolean validacionPrestamo (Prestamo prestamo){
        boolean resultado = true;
        if(!prestamo.existenciaPrestamo) resultado = false;
        return resultado;
    } // DONE

    static void validacionMostrarTraspaso(Cuenta cuenta, Traspaso traspaso){//CUANDO NO DAS ALTA DEL CLIENTE DC = 0, POR ESTO ESTO
        if(cuenta.dc==0) System.out.printf("\nTRANSFERENCIA:\nCuenta origen: 0 Cuenta destino: %s  Último Dinero transferido: %.2f€",traspaso.cuentaDestino,traspaso.dineroTraspaso);
            else System.out.printf("\nTRANSFERENCIA:\nCuenta origen: %d%04d%d%d  Cuenta destino: %s  Último Dinero transferido: %.2f€",cuenta.ce,cuenta.cs,cuenta.dc,cuenta.nc,traspaso.cuentaDestino,traspaso.dineroTraspaso);
    } // DONE

    static void validacionMostrarCuentaOrigen(Cuenta cuenta){
        if(cuenta.dc==0)System.out.print("\nNºCuenta: 0"); //o System.out.printf("\nNºCuenta: %d-%04d-%d-%d",ce,cs,dc,nc);
            else System.out.printf("\nNºCuenta: %d%04d%d%d",cuenta.ce,cuenta.cs,cuenta.dc,cuenta.nc);
    } // DONE

    static boolean validacionAnios(Prestamo prestamo){
        boolean resultado = true;
        if(prestamo.anios<0 || prestamo.anios>65) {//negativos o mayor a 65 años salta error
            System.out.println("Año no admitible");
            resultado = false;
        }
        return resultado;
    } // DONE

    static boolean validacionCapital(Prestamo prestamo){
        boolean resultado = true;
        if(prestamo.capital<0){
            System.out.println("Dinero ingresado no admitible");
            resultado = false;
        }
        return resultado;
    }// DONE

    static boolean validacionInteresAnual(Prestamo prestamo){
        boolean resultado = true;
        if(prestamo.interesAnual<0 || prestamo.interesAnual>100) {
            System.out.println("Interés anual no admitible");
            resultado = false;
        }
        return resultado;
    } // DONE

    static boolean validacionDineroTraspaso(Traspaso traspaso){
        boolean resultado = true;
        if(traspaso.dineroTraspaso<0) {
            System.out.println("Dinero ingresado no admitible");
            resultado = false;
        }
        return resultado;
    } // DONE

    static boolean validacionDineroPagos(Pagos pagos){
        boolean resultado = true;
        if(pagos.dineroPagos<0) {
            System.out.println("Dinero ingresado no admitible");
            resultado = false;
        }
        return resultado;
    } // DONE

    static boolean validacionDineroCobros(Cobros cobros){
        boolean resultado = true;
        if(cobros.dineroCobros<0) {
            System.out.println("Dinero ingresado no admitible");
            resultado = false;
        }
        return resultado;
    } // DONE

    /*static boolean validacionAnio(Cliente cliente){
        //CONDICIONES
        //Comenzar por el año-> luego mes->luego dia es un algoritmo hay un orden no se comienza por mes luegoanio y luego día x
        boolean resultado = true;
        if (cliente.fAnio<1900 || cliente.fAnio>2003){
            System.out.println("Fecha de nacimiento ingresada incorrecta");
            resultado = false;
        } else if(cliente.fAnio%4==0 && cliente.fAnio%100!=0 || cliente.fAnio%400==0){//Años Bisiestos<29
            if(cliente.fMes==2){
                if(cliente.fDia>29){
                    System.out.println("Fecha de nacimiento ingresada incorrecta");
                    resultado = false;
                }
            }
        } else { //Años no bisiestos <28
            if(cliente.fMes<1 || cliente.fMes>12){//(fMes<1 || fMes>12) && fDia<1 && (fAnio<1900 || fAnio>2003)
                System.out.println("Fecha introducida incorrecta");
                resultado = false;
            } else if(cliente.fMes==1 || cliente.fMes==3 || cliente.fMes==5 || cliente.fMes==7 || cliente.fMes==8 ||cliente.fMes==10||cliente.fMes==12) {
                if (cliente.fDia > 31 || cliente.fDia<1) {
                    System.out.println("Fecha de nacimiento ingresada incorrecta");
                    resultado = false;
                }
            } else if (cliente.fMes==4||cliente.fMes==6||cliente.fMes==9||cliente.fMes==11){
                if(cliente.fDia>30 || cliente.fDia<1){
                    System.out.println("Fecha de nacimiento ingresada incorrecta");
                    resultado = false;
                }
            } else {
                if((cliente.fAnio%4==0)&&((cliente.fAnio%100!=0)||(cliente.fAnio%400==0))){//Es bisiesto
                    if(cliente.fDia>29|| cliente.fDia<1) System.out.println("Fecha de nacimiento ingresada incorrecta");
                    resultado = false;
                } else if(cliente.fDia>28|| cliente.fDia<1) {
                    System.out.println("Fecha de nacimiento ingresada incorrecta");
                    resultado = false;
                }
            }
        }
        return resultado;
<<<<<<< HEAD
    } // DONE*/
    } */// DONE


    //---------------------------------------------------------------------------------------------------------------------
    public static int menu(Scanner input){
        System.out.println("BIENVENIDO A UPMBank");
        System.out.println(
                "1.Alta Cliente\n" +
                "2.Crear Cuenta Bancaria\n" +
                "3.Realizar Depósito\n" +
                "4.Realizar Extracción\n" +
                "5.Realizar Transferencia\n" +
                "6.Solicitar Préstamo Hipotecario\n" +
                "7.Mostrar datos\n" +
                "0.Salir");
        System.out.print("Digito: ");
        int control = input.nextInt();
        return control;
    }

    public static Cliente crearCliente(Scanner input){
        //Nombre+Apellidos
        System.out.print("Introduce el nombre: ");
        String nombre = input.next();
        System.out.print("Introduce el apellidos: ");
        String apellidos = input.nextLine();// ver el caso de agregar los 2 apellidos(Antes se colocaba 2 string nextline)

        //Cumpleaños
        System.out.println("Introduce fecha de cumpleaños:");
        System.out.print("Dia: ");
        int fDia = input.nextInt();
        System.out.print("Mes: ");
        int fMes = input.nextInt();
        System.out.print("Año: ");
        int fAnio = input.nextInt();

        //DNI
        System.out.print("Introduce DNI: ");
        long dni = input.nextLong();
        System.out.print("introduce letra (en mayúscula): ");
        char letraDNIAux = input.next().charAt(0);//Ver aquí que cumpla la condició que si coincide con el algoritmo (método obtenerLetraDni )

        //Correo
        System.out.print("Introduce correo: ");
        String correo = input.next();

        return new Cliente(nombre,apellidos,fDia,fMes,fAnio,dni,letraDNIAux,correo);
    }

    //Función obtener letra DNI, Alta Cliente
    /*static char ObtenerLetraDNI(Cliente cliente){
        char letraDNI2=' ';
        switch(cliente.numDNI){
            case 0:
                letraDNI2='T';//CHAR siempre entre ' ", Strings con " "
                break;
            case 1:
                letraDNI2='R';//CHAR siempre entre ' ", Strings con " "
                break;
            case 2:
                letraDNI2='W';//CHAR siempre entre ' ", Strings con " "
                break;
            case 3:
                letraDNI2='A';//CHAR siempre entre ' ", Strings con " "
                break;
            case 4:
                letraDNI2='G';//CHAR siempre entre ' ", Strings con " "
                break;
            case 5:
                letraDNI2='M';//CHAR siempre entre ' ", Strings con " "
                break;
            case 6:
                letraDNI2='Y';//CHAR siempre entre ' ", Strings con " "
                break;
            case 7:
                letraDNI2='F';//CHAR siempre entre ' ", Strings con " "
                break;
            case 8:
                letraDNI2='P';//CHAR siempre entre ' ", Strings con " "
                break;
            case 9:
                letraDNI2='D';//CHAR siempre entre ' ", Strings con " "
                break;
            case 10:
                letraDNI2='X';//CHAR siempre entre ' ", Strings con " "
                break;
            case 11:
                letraDNI2='B';//CHAR siempre entre ' ", Strings con " "
                break;
            case 12:
                letraDNI2='N';//CHAR siempre entre ' ", Strings con " "
                break;
            case 13:
                letraDNI2='J';//CHAR siempre entre ' ", Strings con " "
                break;
            case 14:
                letraDNI2='Z';//CHAR siempre entre ' ", Strings con " "
                break;
            case 15:
                letraDNI2='S';//CHAR siempre entre ' ", Strings con " "
                break;
            case 16:
                letraDNI2='Q';//CHAR siempre entre ' ", Strings con " "
                break;
            case 17:
                letraDNI2='V';//CHAR siempre entre ' ", Strings con " "
                break;
            case 18:
                letraDNI2='H';//CHAR siempre entre ' ", Strings con " "
                break;
            case 19:
                letraDNI2='L';//CHAR siempre entre ' ", Strings con " "
                break;
            case 20:
                letraDNI2='C';//CHAR siempre entre ' ", Strings con " "
                break;
            case 21:
                letraDNI2='K';//CHAR siempre entre ' ", Strings con " "
                break;
            case 22:
                letraDNI2='E';//CHAR siempre entre ' ", Strings con " "
                break;
        }
        return letraDNI2;
    } *///DONE

    //Función tipo cuenta, Cuenta
    /*static String tipoCuenta(Cuenta cuenta){
        String tipo="";
        switch(cuenta.cuentaTipo) {
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
    } */// DONE

    //Función generar DC, Cuenta
    /*static int generarDC(Cuenta cuenta){
        long c1=0,c2=0;
        //NºCuenta
        //DC=C1,C2
        int csSuma = 6*(cuenta.cs%10) + 3*(cuenta.cs%100)/10 + 7*((cuenta.cs%1000)/10) + 9*cuenta.cs/1000;
        int ceSuma = 5*(cuenta.ce%100)/10 + 8*(cuenta.ce%1000)/10 + 4*cuenta.ce/1000;//10*(ce%10)+5*(ce%100)/10+8*(ce%1000)/10+4*ce/1000; (fórmula 2nd part)

        c1=11-((csSuma+ceSuma)%11);
        c2=11-(((cuenta.nc/1000000000)+(2*((cuenta.nc/100000000)%10))+(4*((cuenta.nc/10000000)%10))+(8*((cuenta.nc/1000000)%10))+(5*((cuenta.nc/100000)%10))+(10*((cuenta.nc/10000)%10))+(9*((cuenta.nc/1000)%10))+(7*((cuenta.nc/100)%10))+(3*((cuenta.nc/10)%10))+(6*(cuenta.nc%10)))%11);
        int dc=(int)(c1*10+c2);
        return dc;
    } */// DONE

    //Función tabla amortización, Préstamo
    /*static void tablaAmortizacion(Prestamo prestamo){
        for(int i=1;i<=(prestamo.anios*12);i++){
            prestamo.interesesAbonados= prestamo.capital*prestamo.interesMensual;
            prestamo.capitalAmortizado = prestamo.pagoMensual-prestamo.interesesAbonados;
            prestamo.capital-=prestamo.capitalAmortizado;
            System.out.printf("%3d %16.2f %19.2f %17.2f %21.2f\n",i,prestamo.pagoMensual,prestamo.interesesAbonados,prestamo.capitalAmortizado,prestamo.capital);///
        }
    } */// DONE

    //---------------------------------------------------------------------------------------------------------------------

    //Funciones principales
    static void menu(){

        //INICIALIZACIÓN DE SCANNER Y LOS OBJETOS (Inicializar los constructores)
        Scanner input = new Scanner(System.in);
       /* Cliente cliente = new Cliente();
        Cuenta cuenta = new Cuenta();
        Prestamo prestamo = new Prestamo();
        Cobros cobros = new Cobros();
        Pagos pagos = new Pagos();
        Traspaso traspaso = new Traspaso();*/

        Cliente cliente = null;
        Cuenta cuenta = null;
        Prestamo prestamo = null;
        Cobros cobros = null;
        Pagos pagos = null;
        Traspaso traspaso = null;

        //MENÚ
        int control;
        do{
            System.out.println("BIENVENIDO A UPMBank");
            System.out.println("1.Alta Cliente\n2.Crear Cuenta Bancaria\n3.Realizar Depósito\n4.Realizar Extracción\n5.Realizar Transferencia\n6.Solicitar Préstamo Hipotecario\n7.Mostrar datos\n0.Salir");
            System.out.print("Digito: ");
            control = input.nextInt();
            /*switch(control){
                case 1://Alta cliente
                    Cliente.AltaCliente(cliente, input);
                    break;
                case 2://Crear Cuenta Bancaria
                    if(cliente.existenciaAltaCliente) Cuenta.TipoCuenta(cuenta, input);//if(cliente.existenciaAltaCliente) Cuenta.TipoCuenta(cuenta, input);
                    else System.out.println("\nNO EXISTE DATOS ALTA CLIENTE");
                    break;
                case 3://Realizar Depósito
                    if(cuenta.existenciaCuenta) Cobros.Deposito(cobros, cuenta, input);//if(cuenta.existenciaCuenta) Cobros.Deposito(cobros, cuenta, input);
                    else System.out.println("\nNO EXISTE DATOS TIPO DE CUENTA");
                    break;
                case 4://Realizar Extracción
                    if(!cuenta.existenciaCuenta) System.out.println("\nNO EXISTE DATOS CUENTA");//if(!cuenta.existenciaCuenta) System.out.println("\nNO EXISTE DATOS CUENTA");
                    else if(!cobros.existenciaCobros && !prestamo.existenciaPrestamo) System.out.println("\nNO EXISTE DATOS DEPÓSITO");//else if(!cobros.existenciaCobros && !prestamo.existenciaPrestamo) System.out.println("\nNO EXISTE DATOS DEPÓSITO");
                    else Pagos.Extraccion(pagos, cuenta, input);
                    break;
                case 5://Realizar Transferencia
                    if(!cuenta.existenciaCuenta) System.out.println("\nNO EXISTE DATOS CUENTA");//if(!cuenta.existenciaCuenta) System.out.println("\nNO EXISTE DATOS CUENTA");
                    else if(!cobros.existenciaCobros && !prestamo.existenciaPrestamo) System.out.println("\nNO EXISTE DATOS DEPÓSITO");//else if(!cobros.existenciaCobros && !prestamo.existenciaPrestamo) System.out.println("\nNO EXISTE DATOS DEPÓSITO");
                    else Traspaso.Transferencia(traspaso, cuenta, input);
                    break;
                case 6://Solicitar Préstamo Hipotecario
                    if(cuenta.existenciaCuenta) Prestamo.Prestamo(prestamo, cuenta, input);
                    else System.out.println("\nNO EXISTE DATOS CUENTA");
                    break;
                case 7://Mostrar Datos
                    MostrarDatos(cliente,cuenta,cobros,pagos,traspaso,prestamo);
                    break;
                default://Dato ninguno de los anteriores
                    if(control!=0) System.out.println("Dígito ingresado no válido");
                    break;
            }*/
            System.out.println();
        }while(control!=0);
        System.out.println("Gracias por usar UPMBank!!, Nos vemos en una próxima operación!");
    }

    /*static void MostrarDatos(Cliente cliente, Cuenta cuenta, Cobros cobros, Pagos pagos, Traspaso traspaso,Prestamo prestamo){
        *//*MOSTRAR POR PANTALLA*//*

        *//*if(!validacionAltaCliente(cliente)){
            System.out.println("\nNO EXISTE DATOS DEL CLIENTE");
        } else {
            //ALTA CLIENTE
            System.out.printf("\nNombre del cliente: %s %s",cliente.nombre,cliente.apellidos);
            System.out.printf("\nFecha nacimiento: %02d/%02d/%02d",cliente.fDia,cliente.fMes,cliente.fAnio);
            System.out.printf("\nDNI: %08d%c",cliente.dni,cliente.letraDNI);
            System.out.printf("\nCorreo: %s",cliente.correo);
            if(!validacionCuenta(cuenta)){
                System.out.println("\n\nNO EXISTE DATOS DE LA CUENTA");
            } else {
                //CUENTA BANCARIA
                System.out.printf("\nCliente de la cuenta: %s",cliente.nombre);
                System.out.printf("\nTipo de cuenta: %s",cuenta.cuenta);
                validacionMostrarCuentaOrigen(cuenta);
                System.out.printf("\nCantidad en la cuenta: %.2f€",cuenta.dineroCuenta);

                if(validacionCobros(cobros)) System.out.printf("\nÚltimo dinero depositado: %.2f€",cobros.dineroCobros);
                if(validacionPagos(pagos)) System.out.printf("\nÚltimo dinero extraido: %.2f€",pagos.dineroPagos);
                if(validacionTraspaso(traspaso)) validacionMostrarTraspaso(cuenta,traspaso);

                if(!validacionPrestamo(prestamo)){
                    System.out.println("\n\nNO EXISTE DATOS DEL PRÉSTAMO");
                } else {
                    //PRÉSTAMO HIPOTECARIO
                    System.out.printf("\nPréstamo hipotecario: %.2f€",prestamo.capitalAux);
                    System.out.print("\nTipo de interés: "+prestamo.interesAnual+"%");
                    System.out.printf("\nAños a pagar: %d\n",prestamo.anios);
                }
            }
        }*//*
*/
    }

}
package ProyectoBanco.Inicial;
import java.util.Scanner;
public class Cliente {
    private String nombre;
    private String apellidos;
    private int fDia;
    private int fMes;
    private int fAnio;
    private long dni;
    private int numDNI;
    private char letraDNI;//Se debe de inicializar por que no se le va a ingresar un dato por teclado, sino por un cálculo
    private String correo;

    public Cliente(String nombre, String apellidos, int fDia, int fMes, int fAnio, long dni, int numDNI, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fDia = fDia;
        this.fMes = fMes;
        this.fAnio = fAnio;
        this.dni = dni;//8 dígitos
        this.numDNI = numDNI;//letra que se ingresa al final
        this.letraDNI = ObtenerLetraDNI();//Devuelve residuo (letra comprobar si es cierta)
        this.correo = correo;
    }
    //Clic derecho -> Generate -> Constructor -> y seleccionas los atributos que quieras que el constructor lo haga
    //No siempre se coloca public al constructor hay que ver si se considera o no en el desarrollo del software aunque en la mayoría de las veces es usado con acceso public
    //Protected -> es solo acceso de los del mismo package, no extenas, public sí, private solo las de su misma clase, espectacular....

    //Verificar que la existencias no son necesarias -> ver ejemplo del moodle, además las existencia que has inicializado en los atributos y no en el constructor deben ser tipo static y en estás ver que no son necesarios poner quitándolas al igual que sus get/set
    //También hacer la correcciones de la primera revisión (Entrega 1)
    public String getNombre(){ // Tipo pubñic para que pueda tener acceso clases externas
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getfDia() {
        return fDia;
    }

    public void setfDia(int fDia) {
        this.fDia = fDia;
    }

    public int getfMes() {
        return fMes;
    }

    public void setfMes(int fMes) {
        this.fMes = fMes;
    }

    public int getfAnio() {
        return fAnio;
    }

    public void setfAnio(int fAnio) {
        this.fAnio = fAnio;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getNumDNI() {
        return numDNI;
    }

    public void setNumDNI(int numDNI) {
        this.numDNI = numDNI;
    }

    public char getLetraDNI() {
        return letraDNI;
    }//único con get

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //MÉTODOS PÚBLICOS
    public void imprimirCliente(){
        System.out.printf("\nNombre del cliente: %s %s",nombre,apellidos);
        System.out.printf("\nFecha nacimiento: %02d/%02d/%02d",fDia,fMes,fAnio);
        System.out.printf("\nDNI: %08d%c",dni,letraDNI);
        System.out.printf("\nCorreo: %s",correo);
    }

    //MÉTODOS ESTÁTICOS

    //Función principal
    static Cliente AltaCliente(Cliente cliente, Scanner input){//static void AltaCliente(Cliente cliente, Scanner input){
        /*ALTA CLIENTE*/
        //Nombre+Apellidos
        System.out.print("Introduce el nombre: ");
        cliente.nombre = input.next();
        System.out.print("Introduce el apellidos: ");
        cliente.apellidos = input.nextLine();
        cliente.apellidos = input.nextLine();//USAR 2 NEXTLINE PORQUE EL PRIMERO GUARDA EL SALTO DE LINE Y EL SEGUNDO GUARDA EL APELLIDO

        //Cumpleaños
        //do{
            System.out.println("Introduce fecha de cumpleaños:");
            System.out.print("Dia: ");
            cliente.fDia = input.nextInt();
            System.out.print("Mes: ");
            cliente.fMes = input.nextInt();
            System.out.print("Año: ");
            cliente.fAnio = input.nextInt();
        //} while(!validacionAnio(cliente));//CONDICIÓN FECHA NACIMIENTO VÁLIDA

        //DNI
        System.out.print("Introduce DNI: ");
        cliente.dni = input.nextLong();
        System.out.print("introduce letra (en mayúscula): ");
        cliente.letraDNIAux = input.next().charAt(0);
        //DNI
        cliente.numDNI = (int)(cliente.dni%23);
        cliente.letraDNI = ObtenerLetraDNI(cliente);

        while(cliente.letraDNI!= cliente.letraDNIAux){
            System.out.println("El número DNI no coincide con la letra");
            System.out.print("Introduce DNI: ");
            cliente.dni = input.nextInt();
            System.out.print("Introduce letra (en mayúscula): ");
            cliente.letraDNIAux = input.next().charAt(0);
            //DNI
            cliente.numDNI = (int)(cliente.dni%23);
            cliente.letraDNI = ObtenerLetraDNI(cliente);
        }

        //Correo (ver la parte de la condición)
        System.out.print("Introduce correo: ");//Hacer que el sufijo (@..) salga por defecto escogiendo si es alumno o profe o tal como está
        cliente.correo = input.next();

        return new Cliente(cliente.nombre,cliente.apellidos,cliente.fDia,cliente.fMes,cliente.fAnio,cliente.letraDNI,cliente.numDNI,cliente.letraDNI,cliente.letraDNIAux,cliente.correo,cliente.existenciaAltaCliente);//cliente.existenciaAltaCliente=true;

    }


    //MÉTODOS MEJORADOS
    //Muestra valor de una persona
    public String toString(){
        return "Cliente{ nombre = " + this.getNombre() +
                ", apellidos = " + this.getApellidos() +
                ", fecha de nacimiento = " + this.getfDia()+"/"+this.getfMes()+"/"+this.getfAnio() +
                ", dni = " +  this.getDni()+this.getLetraDNI() +
                ", correo = " + this.getCorreo() +
                "}";
    }

    //Función obtener letra DNI, Alta Cliente
    public char ObtenerLetraDNI(){
        char letraDNI2=' ';
        int numDNI= Math.round(getDni()%23);

    public void setExistenciaAltaCliente(boolean existenciaAltaCliente) {
        this.existenciaAltaCliente = existenciaAltaCliente;
    }
    //MÉTODOS ESTÁTICOS
    public static boolean validacionAnio(int fDia, int fMes, int fAnio){
        boolean resultado = true;
        if (fAnio<1900 || fAnio>2003){
            System.out.println("Fecha de nacimiento ingresada incorrecta");
            resultado = false;
        } else if(fAnio%4==0 && fAnio%100!=0 || fAnio%400==0){//Años Bisiestos<29
            if(fMes==2){
                if(fDia>29){
                    System.out.println("Fecha de nacimiento ingresada incorrecta");
                    resultado = false;
                }
            }
        } else { //Años no bisiestos <28
            if(fMes<1 || fMes>12){//(fMes<1 || fMes>12) && fDia<1 && (fAnio<1900 || fAnio>2003)
                System.out.println("Fecha introducida incorrecta");
                resultado = false;
            } else if(fMes==1 || fMes==3 || fMes==5 || fMes==7 || fMes==8 ||fMes==10||fMes==12) {
                if (fDia > 31 || fDia<1) {
                    System.out.println("Fecha de nacimiento ingresada incorrecta");
                    resultado = false;
                }
            } else if (fMes==4||fMes==6||fMes==9||fMes==11){
                if(fDia>30 || fDia<1){
                    System.out.println("Fecha de nacimiento ingresada incorrecta");
                    resultado = false;
                }
            } else {
                if((fAnio%4==0)&&((fAnio%100!=0)||(fAnio%400==0))){//Es bisiesto
                    if(fDia>29|| fDia<1) System.out.println("Fecha de nacimiento ingresada incorrecta");
                    resultado = false;
                } else if(fDia>28|| fDia<1) {
                    System.out.println("Fecha de nacimiento ingresada incorrecta");
                    resultado = false;
                }
            }
        }
        return resultado;
    }

    static char ObtenerLetraDNI(int numDNI){
        char letraDNI2=' ';

        switch(numDNI){
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
    } //DONE

    }
}

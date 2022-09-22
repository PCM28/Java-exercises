package ProyectoBanco.Inicial;
import java.util.Scanner;
public class Prestamo {
    private double capital;
    private double capitalAux;
    private double interesAnual=0;
    private double interesMensual=0;
    private int anios=0;
    private double pagoMensual= 0;
    private double interesesAbonados=0;
    private double capitalAmortizado=0;
    private boolean existenciaPrestamo=false;

    public Prestamo (double capital, double capitalAux, double interesAnual, double interesMensual, int anios, double pagoMensual, double interesesAbonados, double capitalAmortizado, boolean existenciaPrestamo){
        this.capital = capital;
        this.capitalAux = capitalAux;
        this.interesAnual = interesAnual;
        this.interesMensual = interesMensual;
        this.anios = anios;
        this.pagoMensual = pagoMensual;
        this.interesesAbonados = interesesAbonados;
        this.capitalAmortizado = capitalAmortizado;
        this.existenciaPrestamo = existenciaPrestamo;
    }
    //Para comparar punteros (objetos) no compara los datos sino su referencia de memoria (tipo de objeto que es y su nombre(interpretación))


    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getCapitalAux() {
        return capitalAux;
    }

    public void setCapitalAux(double capitalAux) {
        this.capitalAux = capitalAux;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public double getInteresesAbonados() {
        return interesesAbonados;
    }

    public void setInteresesAbonados(double interesesAbonados) {
        this.interesesAbonados = interesesAbonados;
    }

    public double getCapitalAmortizado() {
        return capitalAmortizado;
    }

    public void setCapitalAmortizado(double capitalAmortizado) {
        this.capitalAmortizado = capitalAmortizado;
    }

    public boolean isExistenciaPrestamo() {
        return existenciaPrestamo;
    }

    public void setExistenciaPrestamo(boolean existenciaPrestamo) {
        this.existenciaPrestamo = existenciaPrestamo;
    }


    //MÉTODOS PÚBLICOS
    public void imprimirPrestamo(){
        System.out.printf("\nPréstamo hipotecario: %.2f€",capitalAux);
        System.out.print("\nTipo de interés: " + interesAnual + "%");
        System.out.printf("\nAños a pagar: %d\n",anios);
    }

    //MÉTODOS ESTÁTICOS
    //Función tabla amortización, Préstamo
    static void tablaAmortizacion(Prestamo prestamo){
        for(int i=1;i<=(prestamo.anios*12);i++){
            prestamo.interesesAbonados= prestamo.capital*prestamo.interesMensual;
            prestamo.capitalAmortizado = prestamo.pagoMensual-prestamo.interesesAbonados;
            prestamo.capital-=prestamo.capitalAmortizado;
            System.out.printf("%3d %16.2f %19.2f %17.2f %21.2f\n",i,prestamo.pagoMensual,prestamo.interesesAbonados,prestamo.capitalAmortizado,prestamo.capital);///
        }
    } // DONE

    //Función principal
    static Prestamo Prestamo(Prestamo prestamo, Cuenta cuenta, Scanner input){
        /*PRÉSTAMO HIPOTECARIO*/
        //do{
            System.out.print("\nIngrese el capital: ");//Monto a pedir
            prestamo.capital=input.nextDouble();
        //}while(!validacionCapital(prestamo));

        cuenta.dineroCuenta = cuenta.dineroCuenta + prestamo.capital;

        //do{
            System.out.print("Ingrese el interés anual(usar coma para decimales y entre 0-100): ");
            prestamo.interesAnual=input.nextDouble(); //ENTRE 0 Y 100
        //} while(!validacionInteresAnual(prestamo));

        //do{
            System.out.print("Ingrese cantidad años: ");
            prestamo.anios=input.nextInt();
        //}while(!validacionAnios(prestamo));

        /*OPERACIONES + CONDICIONES PRÉSTAMO HIPOTECARIO*/
        prestamo.interesMensual= (prestamo.interesAnual/100)/12;//Pasar de % ->decimal ->mensual
        prestamo.pagoMensual = prestamo.capital*prestamo.interesMensual*(Math.pow(1+prestamo.interesMensual,prestamo.anios*12)/(Math.pow(1+prestamo.interesMensual,prestamo.anios*12)-1));//Tiene sentido para obtener ago mensual usamos interés mensual

        prestamo.capitalAux = prestamo.capital;

        //PRÉSTAMO HIPOTECARIO
        System.out.printf("\nPréstamos hipotecario: %.2f€",prestamo.capitalAux);
        System.out.print("\nTipo de interés: "+prestamo.interesAnual+"%");
        System.out.printf("\nAños a pagar: %d\n",prestamo.anios);
        System.out.println("\t\t\tPAGO MENSUAL\t\t INTERESES\t\t   AMORTIZADO\t\t  CAPITAL VIVO");
        System.out.printf("  0  \t\t\t0,00\t\t\t\t%.2f\t\t\t  %3.2f\t\t\t   %.2f\n",prestamo.interesesAbonados,prestamo.capitalAmortizado,prestamo.capital);
        tablaAmortizacion(prestamo);
        return new Prestamo(prestamo.capital, prestamo.capitalAux, prestamo.interesAnual, prestamo.interesMensual, prestamo.anios, prestamo.pagoMensual, prestamo.interesesAbonados, prestamo.capitalAmortizado, prestamo.existenciaPrestamo);//prestamo.existenciaPrestamo=true;

    //MÉTODOS
    static void tablaAmortizacion(int anios, double capital, double interesesAbonados, double interesMensual, double capitalAmortizado, double pagoMensual){
        for(int i=1;i<=(anios*12);i++){
            interesesAbonados= capital*interesMensual;
            capitalAmortizado = pagoMensual-interesesAbonados;
            capital-=capitalAmortizado;
            System.out.printf("%3d %16.2f %19.2f %17.2f %21.2f\n",i,pagoMensual,interesesAbonados,capitalAmortizado,capital);///
        }

    }
}

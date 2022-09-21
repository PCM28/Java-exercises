package Condiciones;
import java.util.Scanner;
import java.util.Locale; //Line 9
public class Exercise16 {
    public static void main (String[]args){
        double num =0.0;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.UK);//Para usar el punto en el double-->line9

        System.out.println("Introduzca el numero: ");
        num = input.nextDouble() ;

        if(-1<num && num!=0 && num<1) System.out.println("Es casi cero");
            else System.out.println("No es casi cero");
    }
}

package EntradasYSalidasDatos;
import java.util.Locale;//Libreria de line 9
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[]args){
        double number = 0;
        int entero = 0;
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.UK);

        System.out.println("Introduzca el decimal: ");
        number = input.nextDouble();

        entero = (int) (number+0.5);
        System.out.println("el valor entero proximo es: " + entero);
    }
}

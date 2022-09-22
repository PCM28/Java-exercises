package Arrays;
import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;//Para usar comandos de arrays llamamos a esta librería
public class Exercise6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);//Para añadir en vez de comas, con puntos --> siempre muestra en punto excepto si le añades coma después de su porcentaje en el System.out.printf -> %,7f
        double num[] = new double[5];
        for(int i=0;i<5;i++){
            System.out.print("Introduce " + (i+1) + ". número: ");
            num[i] = input.nextDouble();
        }

        //Esta manera aparece por línea
        /*for(int i=0;i<5;i++){
            System.out.println(num[i]);
        }*/

        //New method, método más eficiente, aparecen en 1 línea y entre llaves
        System.out.println(Arrays.toString(num));
    }
}

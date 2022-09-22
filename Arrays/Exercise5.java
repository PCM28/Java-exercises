package Arrays;
import java.util.Scanner;
import java.util.Locale;
public class Exercise5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.UK);

        System.out.print("Cuantos números deseas introducir: ");
        int num = input.nextInt();

        double list[] = new double [num];
        for(int i=0;i<num;i++){
            list[i] = input.nextDouble();
        }
        //Mostrar de manera inversa
        for(int i=num-1;i>=0;i--){
            System.out.println(list[i]);
        }

        //Este tipo de ejercicios Arrays.toString(list); solo muestr orden como lo has introducido no al revés como es este caso

    }
}

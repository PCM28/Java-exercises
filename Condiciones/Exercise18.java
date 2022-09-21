package Condiciones;
import java.util.Scanner;
public class Exercise18 {
    public static void main (String[]args){
        int num =0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca el numero: ");
        num = input.nextInt() ;

        if(num%2==0) System.out.println("El numero es par");
            else System.out.println("El numero es impar");

    }
}

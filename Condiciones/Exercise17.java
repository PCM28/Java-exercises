package Condiciones;
import java.util.Scanner;
public class Exercise17 {
    public static void main (String[]args){
        int num1 =0, num2=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca el numero 1: ");
        num1 = input.nextInt() ;

        System.out.println("Introduzca el numero 2: (distinto del primero)");
        num2 = input.nextInt();

        if(num1<num2) System.out.println("El segundo es mayor");
            else if (num1>num2) System.out.println("El primero es mayor");
                else System.out.println("Son iguales");
    }
}

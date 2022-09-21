package Condiciones;
import java.util.Scanner;
public class Exercise15 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca el num1: ");
        num1 = input.nextInt();

        System.out.println("Introduzca el num2: ");
        num2 = input.nextInt();

        if (num1 < num2) System.out.println(num2 + (" < ") + num1);
            else if (num1 > num2) System.out.println(num1 + (" < ") + num2);
                else System.out.println("Ambos son iguales");

    }
}

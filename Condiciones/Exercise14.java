package Condiciones;
import java.util.Scanner;
public class Exercise14 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, mayor=0, menor=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca el num1: ");
        num1 = input.nextInt();

        System.out.println("Introduzca el num2: ");
        num2 = input.nextInt();

        mayor = num1 > num2 ? num1 : num2;// operador ternario '?' estructura: resultado = (condicion) ? valor1:valor2
        menor = num1 < num2 ? num1 : num2;

        System.out.println("El mayor es: " + mayor + " el menor es: " + menor);

    }
}

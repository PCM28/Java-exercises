package Condiciones;
import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args) {
        double a=0.0, b=0.0, c=0.0, x1=0.0, x2=0.0, existencia = 0.0;

        Scanner input = new Scanner (System.in);

        System.out.println("Introduzca a: ");
        a = input.nextDouble();
        System.out.println("Introduzca b: ");
        b = input.nextDouble();
        System.out.println("Introduzca c: ");
        c = input.nextDouble();

        existencia = Math.pow(b,2)-(4*a*c);

        x1 = (-b + Math.sqrt(existencia))/(2*a); // or (-b + Math.pow(existencia,0.5))/2*a;
        x2 = (-b - Math.sqrt(existencia))/(2*a); // or (-b - Math.pow(existencia,0.5))/2*a;

        if(existencia < 0) System.out.println("No tiene valores reales");
            else if (existencia > 0) System.out.println("Tiene 2 valores reales,  x1: " + x1 + " y x2: " + x2);
                else System.out.println("x: " + x1);
    }
}

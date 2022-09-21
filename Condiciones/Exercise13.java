package Condiciones;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        //VARIABLES
        int num1=0, num2=0, num3=0, mayor=0, menor=0, medio=0;

        //INICIALIZACIÓN DE SCANNER
        Scanner input = new Scanner(System.in);

        //PEDIDO DE DATOS
        System.out.println("Introduzca el num1: ");
        num1 = input.nextInt();
        System.out.println("Introduzca el num2: ");
        num2 = input.nextInt();
        System.out.println("Introduzca el num3: ");
        num3 = input.nextInt();

        //CONDICIÓN
        if (num3 > num2 && num2 > num1) {mayor = num3; medio = num2; menor = num1;}
        else if (num3 > num2 && num1> num2) {mayor = num3; medio = num1; menor = num2;}
        else if (num2 > num1 && num1 > num3) {mayor = num2; medio = num1; menor = num3;}
        else if(num2 > num1 && num3 > num1) {mayor = num2; medio = num3; menor = num1;}
        else if(num1 > num3 && num3> num2) {mayor = num1; medio = num3; menor =num2;}
        else {mayor = num1; medio = num2; menor = num3;} // else if(num1 > num3 && num2 > num3)

        //MUESTRA LOS RESULTADOS
        System.out.println("El mayor es: " + mayor + " el medio es: " + medio + " el menor es: " + menor);

    }
}

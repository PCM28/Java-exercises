package EntradasYSalidasDatos;
import java.util.Scanner;
import java.util.Locale;//Just por the line 15

public class Exercise2 {
    public static void main(String[]args){

        //Se pedirá los kilos vendidos para luego obtener los beneficios totales

        int vMan1=0,vMan2=0,vMan3=0,vMan4=0;
        int vPer1=0,vPer2=0,vPer3=0,vPer4=0;

        double total= 0.0, apple= 0.0, pear = 0.0;

        Scanner input = new Scanner(System.in);
        input = input.useLocale(Locale.UK);// WHY?-> ask to teacher

        //Pedimos datos
        System.out.println("Introduzca el precio (por kilo) de la manzana: ");
        apple = input.nextDouble();
        System.out.println("Introduzca el precio (por kilo) de la pera: ");
        pear = input.nextDouble();

        System.out.println("1er TRIMESTRE: ");
        System.out.println("Introduzca las ventas de manzanas: ");
        vMan1 = input.nextInt();
        System.out.println("Introduzca las ventas de peras: ");
        vPer1 = input.nextInt();

        System.out.println("\n2do TRIMESTRE:");
        System.out.println("Introduzca las ventas de las manzas: ");
        vMan2 = input.nextInt();
        System.out.println("Introduzca las ventas de las peras: ");
        vPer2 = input.nextInt();

        System.out.println("\n3er TRIMESTRE:");
        System.out.println("Introduzca las ventas de las manzanas: ");
        vMan3 = input.nextInt();
        System.out.println("Introduzca las ventas de las peras: ");
        vPer3 = input.nextInt();

        System.out.println("\n4to TRIMESTRE: ");
        System.out.println("Introduzca las ventas de las manzanas: ");
        vMan4 = input.nextInt();
        System.out.println("Introduzca las ventas de las peras: ");
        vPer4 = input.nextInt();

        //Hacemos el cálculo
        total = (vMan1 + vMan2 + vMan3 + vMan4)*apple;
        total += (vPer1 + vPer2 + vPer3 + vPer4)*pear;

        //Mostramos los beneficios totales
        System.out.println("\nLos beneficios totales son: "+ total + "€");
    }
}

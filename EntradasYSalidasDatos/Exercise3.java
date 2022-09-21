package EntradasYSalidasDatos;
import java.util.Scanner;
import java.util.Locale;//Just por the line 17

public class Exercise3 {
    public static void main(String[]args){
        //Creamos las constantes y creamos variables(inicializamos)
        final double APPLE = 2.35;//Precio por kilo de manzanas (con final y en mayúscula)
        final double PEAR= 1.95;// Precio por kilo de peras (cuando son cte)
        //Se pedirá los kilos vendidos para luego obtener los beneficios totales

        int vMan1=0,vMan2=0,vMan3=0,vMan4=0;
        int vPer1=0,vPer2=0,vPer3=0,vPer4=0;

        double total=0.0;

        Scanner input = new Scanner(System.in);
        input = input.useLocale(Locale.UK);// WHY?-> ask to teacher

        //Pedimos datos
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
        total = (vMan1 + vMan2 + vMan3 + vMan4)*APPLE;
        total += (vPer1 + vPer2 + vPer3 + vPer4)*PEAR;

        //MOstramos los beneficios totales
        System.out.println("\nLos beneficios totales son: "+ total + "€");
    }
}

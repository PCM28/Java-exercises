package Bucles;
import java.util.Scanner;
import java.util.Random;
public class Execise15 {
    public static void main(String[]args){
        String posicion ="";

        Scanner input = new Scanner(System.in);

        Random r = new Random();//ASK TO TEACHER SI SEMILLA ESCONTADA O NO
        int numRandom = r.nextInt(101)+1;//0->100, al añadir +1 -> 1->100
        // int numRandom = (int) (Math.random()*100+1);entre 1 y 100

        System.out.println("Introduzca numero (-1 para salir): ");
       int  num = input.nextInt();
        while(num!=numRandom && num!=-1){
            if(num>numRandom) posicion ="Mayor";
                else posicion = "Menor";
            System.out.println("El numero introducido es: " + posicion);
            System.out.print("Introduzca numero (-1 para salir): ");
            num = input.nextInt();
        }

        if(num==numRandom) System.out.println("\nFelicidades has ganado!!");
            else System.out.println("\nSuerte para la próxima");

    }
}

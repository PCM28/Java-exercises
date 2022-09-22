package Bucles;
import java.util.Scanner;
public class Execise5 {
    public static void main(String[]args){
        int notas = 0, aprobados=0, condicionados=0,suspensos=0;
        Scanner input = new Scanner(System.in);

        for(int i=0;i<6;i++){
            System.out.print("Introduce la nota: ");
            notas = input.nextInt();
            if(notas>4) aprobados++;
                else if(notas==4) condicionados++;
                    else suspensos++;
        }
        System.out.println();
        System.out.printf("Hay %d aprobados, %d condicionados y %d suspensos",aprobados,condicionados,suspensos);

    }
}

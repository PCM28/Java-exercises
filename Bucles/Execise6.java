package Bucles;
import java.util.Scanner;
public class Execise6 {
    public static void main(String[]args){
        int calificaciones=0, numSuspensos=0;
        boolean suspenso=false;
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Introduzca las calificaciones: ");
            calificaciones = input.nextInt();
            if(calificaciones<5) {
                suspenso = true;
                numSuspensos++;
            }
        }
        if(suspenso) System.out.printf("Hay suspensos: %b, numero de suspensos: %d",suspenso,numSuspensos);
            else System.out.println("Todos están aprobados");
    }
}

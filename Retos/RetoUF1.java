package Retos;
import java.util.Scanner;
public class RetoUF1 {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean correct = false;
        System.out.println("Introduce la hora: ");
        int hora = entrada.nextInt();
        System.out.println("Introduce el minuto: ");
        int minuto = entrada.nextInt();
        System.out.println("Introduce el segundo: ");
        int segundo = entrada.nextInt();
        entrada.close();
        if((hora<24 && hora>=0) && (minuto<60 && minuto>=0) && (segundo<60 && segundo>=0)) correct = true; 
        if(correct) System.out.println("La hora es correcta");
        else System.out.println("La hora NO es incorrecta");
    }
}
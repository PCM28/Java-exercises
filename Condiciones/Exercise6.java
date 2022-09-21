package Condiciones;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        int hora,minutos,seg;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce hora: ");//Entre 0-24
        hora=input.nextInt();
        System.out.println("Introduce minutos: ");//Entre 0-59
        minutos=input.nextInt();
        System.out.println("Introduce segundos: ");//Entre 0-59
        seg = input.nextInt();

        seg++;

        if (hora==23 && minutos==59 && seg==60){
            hora=0;
            minutos=0;
            seg=0;
        } else if (minutos==59 && seg==60){
            hora++;
            minutos=0;
            seg=0;
        } else if (seg==60){//Mejor colocar los corchetes al usar más de 1 comando
            minutos++;
            seg=0;
        }

        System.out.printf("Hora: [%02d %02d %02d]",hora,minutos,seg);

    }
}

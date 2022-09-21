package Condiciones;
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        //Nota 0 a 10.Insuficiente(0-4),suficiente(5), bien(6), notable(7-8)
        //sobresaliente(9-10)

        //CREACIÓN DE VARIABLES + SCANNER
        int note;

        Scanner input = new Scanner(System.in);

        //INTRODUCIR DATOS
        System.out.println("Introduzca la nota: ");
        note = input.nextInt();

        //CONDICIONES + MOSTRAR POR PANTALLA one way
        if(note<5) System.out.println("Insuficiente");
        else if (note==5) System.out.println("Suficiente");
        else if (note==6) System.out.println("Bien");
        else if(note<9) System.out.println("Notable");
        else System.out.println("Sobresaliente");
        //second way
        /* Quitar esta and line after the last }
        switch(note) {
                case 1://si son por carácteres ' '
                case 2:
                case 3:
                case 4:
                System.out.println("Insuficiente");
                break;
                case 5:
                System.out.println("Suficiente");
                break;
                case 6:
                System.out.println("Bien");
                break;
                case 7:
                case 8:
                System.out.println("Notable");
                break;
                case 9:
                case 10:
                System.out.println("Sobresaliente");
                break;
        }*/
    }
}
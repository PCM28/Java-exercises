package Condiciones;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        int num;
        String dia="0";
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca el numero: ");
        num=input.nextInt();

        switch(num){
            case 1:
                dia="lunes";
                break;
            case 2:
                dia="Martes";
                break;
            case 3:
                dia="Miercoles";
                break;
            case 4:
                dia="Jueves";
                break;
            case 5:
                dia="Viernes";
                break;
            case 6:
                dia="Sabado";
                break;
            case 7:
                dia="Domingo";
                break;
            default:
        }

        System.out.println("El dia es: "+ dia);
    }
}

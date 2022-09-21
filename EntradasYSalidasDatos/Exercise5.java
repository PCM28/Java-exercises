package EntradasYSalidasDatos;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[]args){
        int n1=0, n2=0, n3=0; //Puedes poner average=0; como int o-->
        double average=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca la nota1: ");
        n1 = input.nextInt();
        System.out.println("Introduzca la nota2: ");
        n2 = input.nextInt();
        System.out.println("Introduzca la nota3: ");
        n3 = input.nextInt();

        average = (int) ((n1+n2+n3)/3.0);//Colocar delante de la operacion (int)
        //Para convertirlo de double -> int
        System.out.println("La media es: " + average);

    }
}

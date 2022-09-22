package Bucles;
import java.util.Scanner;
public class Execise9 {
    public static void main(String[]args){
        int num=0, resultado=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el factorial: ");
        num = input.nextInt();
        //for(int i=num;i>0;i--) Otra manera
            //resultado*=i;
        for(int i=1;i<=num;i++)
                resultado*=i;

                System.out.println("Resultado es: " + resultado);
    }
}

package Bucles;
import java.util.Scanner;
public class Execise14 {
    public static void main(String[]args){
        int n=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el numero: ");
        n = input.nextInt();

        for(int i=1;i<=n;i++)
            System.out.println(i);
    }
}

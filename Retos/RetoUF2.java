package Retos;
import java.util.Scanner;
public class RetoUF2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        primo(entrada);
    }
    public static void primo(Scanner entrada){
        System.out.println("*****Números Primos*****");
        System.out.println("************************");
        System.out.println("Introduzca un número: ");
        int num = entrada.nextInt();
        entrada.close();
        int j=0;
        for(int i=1;i<=num;i++){
            if(num%i==0) j++;
        }
        if(j<3) System.out.println("El número SI es primo");
        else System.out.println("El número NO es primo");
    }
}
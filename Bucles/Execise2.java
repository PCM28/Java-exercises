package Bucles;
import java.util.Scanner;
public class Execise2 {
    public static void main(String[]args){
        int num=0,resto=0,numPrimos=0;

        Scanner input = new Scanner(System.in);
        System.out.print("introduce numero: ");
        num = input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0) resto++;
            }
            if(resto>2) System.out.println(i + " No es primo");
                else {
                System.out.println(i + " Es primo");
                numPrimos++;
                }
            resto=0;//Volver a inicializar en cero sino estará llevando lo del anterior,IMPORTANT!
        }
        System.out.printf("\nHay %d primos",numPrimos);

    }
}

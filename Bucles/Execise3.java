package Bucles;
import java.util.Scanner;
public class Execise3 {
    public static void main(String[]args){
        int num=0, numPrimos=0, resto=0;

        Scanner input = new Scanner(System.in);
        System.out.print("introduce numero: ");
        num = input.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<i;j++){
                if(i%j==0) resto++;
            }
            if(resto>2)numPrimos++;
        }
        System.out.printf("Hay %d números primos",numPrimos);
    }
}

package Condiciones;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        int num=0, aux=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca el numero (entre 0 y 99.999): ");
        num = input.nextInt();

        if(num>=0 && num<=9) aux=1; // or if(num<10) aux = 1;
        else if(num>=10 && num<=99) aux= 2;// or if(num<100) aux=2;
        else if(num>=100 && num<=999) aux=3;// or if(num<1000) aux=3;
        else if(num>=1000 && num<=9999) aux=4;// or if(num<10000) aux=4;
        else if (num>=10000 && num<=99999) aux=5;// or if(num<100000) aux=5;

        System.out.println("Tiene " + aux + " cifras");
    }
}

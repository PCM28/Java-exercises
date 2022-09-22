package Bucles;
import java.util.Scanner;
public class Exercise17 {
    public static void main(String[]args){

        boolean par, positivo;//Se debe inicializar ya que no se vaa introducir por teclado
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca numero: ");
        int num = input.nextInt();

        while(num!=0){

            par = num%2==0 ? true:false;//New technic
            positivo = num>0 ? true:false;

            System.out.printf("Es par:%b  Es positivo:%b  Cuadro:%d",par,positivo,num*num);

            System.out.print("\n\nIntroduzca numero: ");
            num = input.nextInt();

        }

    }
}

package Bucles;
import java.util.Scanner;
public class Execise13 {
    public static void main(String[]args){
        int num=0,max=0,min=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el máxmimo: ");
        max = input.nextInt();
        System.out.println("Introduce el mínimo: ");
        min = input.nextInt();


        /*Usando While
           while(num>max || num<min){
            System.out.print("Valor no está dentro del rango\nIntroduce el numero: ");
            num = input.nextInt();
        }*/
        do{//Aquí no puedes dar la advertencia de que no está en el rango encambio en while sí
            System.out.println("Introduce el numero: ");
            num = input.nextInt();
        } while(!(num<=max && num>=min));//también while(num>max || num<min)
        System.out.println("El valor está dentro del rango");
    }
}

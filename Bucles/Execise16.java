package Bucles;
import java.util.Scanner;
public class Execise16 {
    public static void main(String[]args){

        int edades=0, mayores=0,total=0,cont=0, media=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca edad: ");
        edades = input.nextInt();

        while(edades>=0){
            if(edades>=18) mayores++;
            total+=edades;
            cont++;
            System.out.print("Introduzca edad: ");
            edades = input.nextInt();
        }
        media = total/cont;

        System.out.printf("Hay %d alumnos, %d son mayores de edad, la media es de %d y la suma total es: %d",cont,mayores,media,total);

    }
}

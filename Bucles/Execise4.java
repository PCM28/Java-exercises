package Bucles;
import java.util.Scanner;
public class Execise4 {
    public static void main(String[]args){
        int asteriscos=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número de asteriscos: ");
        asteriscos = input.nextInt();

        for(int i=0;i<asteriscos;i++){
            for(int j=asteriscos;j>i;j--){//Relación entre j y i mientras i sube j baja por eso 1ºfila 4(dej)0(i),2º fila 3(j) y 1(de i) así hasta terminar figura, hacerlo con hoja en caso de hacerlo a mano
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

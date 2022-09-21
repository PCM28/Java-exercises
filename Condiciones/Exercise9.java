package Condiciones;
import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        //INGRESO DE DATOS + INICIALIZACIÓN DE SCANNER
        int num=0,aux1=0;
        boolean capicua=false;

        Scanner input = new Scanner(System.in);

        //INGRESO DE DATOS
        System.out.println("Introduzca el valor: ");//Entre 0 y 9999
        num = input.nextInt();

        //OPERACION + CONDICIONES + CÁLCULOS
        if (num<=9) aux1=1;//Puedes quitarlo por que al ser 1 dígito no será capicúa
        else if(num>=10 && num<=99) aux1=2;
        else if (num>=100 && num<=999) aux1=3;
        else if (num>=1000 && num<=9999) aux1=4;

        if(aux1==1) capicua=false; //Mismo que el comentario line 16
        else if(aux1==2) if(num%10==num/10) capicua=true; //else aux2=0;
        else if (aux1==3) if(num%10==num/100) capicua=true; //else aux2=0;
        else if (aux1==4) if(num%10==num/1000 && ((num%100)/10==(num/100)%10)) capicua=true; //else aux2=0;

        //MUESTRA RESULTADOS
        if (!capicua) System.out.println("El numero no es capicua");
        else System.out.println("El numero es capicua");

    }
}

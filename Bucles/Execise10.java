package Bucles;

public class Execise10 {
    public static void main(String[]args){
        int resultado = 1;
        for(int i=1;i<=20;i++)
            if(!(i%2==0)) resultado*=i;
        System.out.println("Resultado es: " + resultado);
    }
}

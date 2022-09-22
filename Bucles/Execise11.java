package Bucles;

public class Execise11 {
    public static void main(String[]args){
        int i =1, multiplicar=1, impares=1;
        while(impares<=10){
            if(!(i%2==0)) {
                multiplicar *=i;
                impares++;
            }
            i++;
        }
        System.out.println("Resultado: " + multiplicar);
    } 
}

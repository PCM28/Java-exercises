package Calculadora;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int control;
        float num1 =0,num2=0, num3=0, resultado=0;
        int num;
        String numS;
        boolean resul = false;
        do{
            System.out.print("--------------------------------");
            System.out.println("\nCalculadora de Calculator S.A");
            System.out.println("--------------------------------");
            System.out.println("Introduzca una opción del menú:\n");
            System.out.print(
                            "1. Sumar \n" +
                            "2. Restar \n" +
                            "3. Multiplicar \n" +
                            "4. Dividir \n" +
                            "5. Número mayor de 3 números \n" +
                            "6. Capicúa \n" +
                            "0. Salir\n");
            System.out.print("Introduzca una opción: ");
            control = entrada.nextInt();
            switch (control){
                case 1:
                    System.out.println("Introduzca el primer número flotante a sumar:");
                    num1 = entrada.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a sumar:");
                    num2 = entrada.nextFloat();
                    resultado = num1+num2;
                    System.out.println("La suma de " +num1+" y "+num2+" es: "+resultado);
                    break;
                case 2:
                    System.out.println("Introduzca el primer número flotante a restar:");
                    num1 = entrada.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a restar:");
                    num2 = entrada.nextFloat();
                    resultado = num1-num2;
                    System.out.println("La resta de " +num1+" y "+num2+" es: "+resultado);
                    break;
                case 3:
                    System.out.println("Introduzca el primer número flotante a multiplicar:");
                    num1 = entrada.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a multiplicar:");
                    num2 = entrada.nextFloat();
                    resultado = num1*num2;
                    System.out.println("La multiplicación de " +num1+" y "+num2+" es: "+resultado);
                    break;
                case 4:
                    System.out.println("Introduzca el primer número flotante a dividir:");
                    num1 = entrada.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a dividir:");
                    num2 = entrada.nextFloat();
                    if(num2!=0) {
                        resultado = num1/num2;
                        System.out.println("La división de " +num1+" y "+num2+" es: "+resultado);
                    } else System.out.println("Error división por 0");
                    break;
                case 5:
                    System.out.println("Introduzca el primer número flotante de los 3:");
                    num1 = entrada.nextFloat();
                    System.out.println("Introduzca el segundo número flotante de los 3:");
                    num2 = entrada.nextFloat();
                    System.out.println("Introduzca el tercer número flotante de los 3:");
                    num3 = entrada.nextFloat();
                    resultado = (num1>num2 && num1>num3)?num1:((num2>num1 && num2>num3)?num2:num3);
                    System.out.println("El número "+ resultado +" es el mayor de los 3 números");
                    break;
                case 6:
                    System.out.println("Introduzca un número para saber si es capicúa:");
                    num = entrada.nextInt();
                    numS = Integer.toString(num);
                    int j = numS.length();
                    for(int i=0;i<j/2;i++){
                        if(numS.charAt(i)==numS.charAt(j-1)) resul = true;
                    }
                    if(resul)System.out.println("SÍ es capicúa");
                    else System.out.println("NO es capicúa");
                    break;
                case 0:
                    System.out.println("\nEl programa a finalizado");
                    break;
                default:
                    System.out.println("\nOpción errónea");
            }
            System.out.println("");
        }while(control!=0);
    }
}
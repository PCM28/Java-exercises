package CalculadoraTextual;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu,num;
        float num1,num2,num3;
        do{
            menu = menu(entrada);
            switch(menu){
                case 1:
                    System.out.println("Introduzca el primer número flotante a sumar:");
                    num1 = entrada.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a sumar:");
                    num2 = entrada.nextFloat();
                    System.out.println("La suma de NUM1 y NUM2 es RESULTADO: " + suma(num1, num2));
                    break;
                case 2:
                    System.out.println("Introduzca el primer número flotante a restar:");
                    num1 = entrada.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a restar:");
                    num2 = entrada.nextFloat();
                    System.out.println("La resta de NUM1 y NUM2 es RESULTADO: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("Introduzca el primer número flotante a multiplicar:");
                    num1 = entrada.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a multiplicar:");
                    num2 = entrada.nextFloat();
                    System.out.println("La multiplicación de NUM1 y NUM2 es RESULTADO: " + multiplicacion(num1, num2));
                    break;
                case 4:
                    System.out.println("Introduzca el primer número flotante a dividir:");
                    num1 = entrada.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a dividir:");
                    num2 = entrada.nextFloat();
                    System.out.println("La división de NUM1 y NUM2 es RESULTADO: " + division(num1, num2));
                    break;
                case 5:
                    System.out.println("Introduzca el primer número flotante de los 3:");
                    num1 = entrada.nextFloat();
                    System.out.println("Introduzca el segundo número flotante de los 3: ");
                    num2 = entrada.nextFloat();
                    System.out.println("Introduzca el tercer número flotante de los 3: ");
                    num3 = entrada.nextFloat();
                    System.out.println("EL número "+ mayor(num1, num2, num3) +" es el mayor de los 3 números");
                    break;
                case 6:
                    System.out.println("Introduzca un número para calcular el factorial:");
                    num = entrada.nextInt();
                    System.out.println("El factorial de NUM es: " + factorial(num));
                    break;
                case 0:
                    System.out.println("El programa a finalizado");
                    break;
                default:
                    System.out.println("Opción errónea");
            }
            System.out.println("");
        }while(menu!=0);
    }
    public static int menu(Scanner entrada){
        System.out.println("Introduzca una opción del menú: ");
        System.out.print(
                            "1. Función Sumar \n" +
                            "2. Función Restar \n" +
                            "3. Función Multiplicar \n" +
                            "4. Función Dividir \n" +
                            "5. Función Número mayor de 3 números \n" +
                            "6. Función Factorial \n" +
                            "0. Salir\n");
        System.out.print("Introduzca una opción: ");
        return entrada.nextInt();
    }
    public static float suma(float num1,float num2){
        return num1+num2;
    }
    public static float resta(float num1,float num2){
        return num1-num2;
    }
    public static float multiplicacion(float num1,float num2){
        return num1*num2;
    }
    public static float division(float num1,float num2){
        if(num2!=0) return num1/num2;
        else return -1.0f;
    }
    public static float mayor(float num1,float num2, float num3){
        return (num1>num2 && num1>num3) ? num1 :((num2>num1 && num2>num3)?num2:num3);
    }
    public static int factorial(int num1){
        int factorial = 1;
        if(num1<0) return -1;
        else{
            for(int i=num1;i>0;i--){
                factorial = factorial * i;
            }
            return factorial;
        }
    }
}

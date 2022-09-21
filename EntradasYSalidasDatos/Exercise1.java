package EntradasYSalidasDatos;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[]args){
        //Creamos la constante PI y las variables
        //final double PI = 3.14;// También podemos usar Math.PI en vez de crear la cte
        //Pertene dentro de la libreria Math
        double radio= 0.0, longitud=0.0, area=0.0;
        Scanner input = new Scanner(System.in);

        //Pedimos introducir los datos
        System.out.println("Introduzca el radio: ");
        radio = input.nextDouble();

        //Hacemos los cálculos
        longitud = 2*Math.PI*radio;//Math.PI = PI (si creamos la constante)
        area = Math.pow(radio,2) * Math.PI;//Lo mismo aquí que la linea 16 (line before)

        //Mostramos los resultados(longitud y area)
        System.out.println("La longitud es: " + longitud + " y el area es: " + area);
    }
}

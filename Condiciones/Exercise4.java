package Condiciones;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        final int maxSpeed=80;
        double speed;
        boolean sancionable=false;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca velocidad: ");
        speed = input.nextInt();//si es de tipo double usar comas al ingresar datos

        if(speed>maxSpeed*1.1) sancionable=true;
            else sancionable = false;

        speed = ((speed-maxSpeed)/maxSpeed)*100;// No deja colocarlo ((speed-maxSpeed)/maxSpeed), el *100 no hay incoveniente---> Solución
        //Solución linea anterior, speed es la variable principal esta debe ser double no int por que el resultado se obtendrá como real no entero
        //La cte no pasa nada ya que es un entero pero al que se le va aplicar esa sí debe ser double
        System.out.println("Exceso: " + speed +"%, Sancionable: " + sancionable);
        //input.close();
    }
}

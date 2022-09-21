package Condiciones;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        int dia, mes, anio, diasAux=0;//Si ha diasAux no la inicializas te salta exception
        //por que es una variable que no vas a ingresar el valor sino le asignas el valor (class 20/09/21)

        Scanner input = new Scanner(System.in);

        System.out.println("Introducir dia: ");
        dia = input.nextInt();
        System.out.println("Introduir mes: ");
        mes = input.nextInt();
        System.out.println("Introducir anio: ");
        anio = input.nextInt();

        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasAux=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasAux=30;
                break;
            case 2:
                diasAux=28;
                break;
        }
        if (dia<=diasAux) System.out.printf("Fecha: %d %02d %d", dia,mes,anio);
            else System.out.println("Fecha incorrecta");
    }
}

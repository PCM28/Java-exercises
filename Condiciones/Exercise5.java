package Condiciones;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {

        int dia, mes, anio, diaAux = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca dia: ");
        dia = input.nextInt();
        System.out.println("Introduzca mes: ");
        mes = input.nextInt();
        System.out.println("Introduzca anio: ");
        anio = input.nextInt();

        dia++;
        /* ONE WAY
        if(mes==12 && dia==32){
            anio++;
            mes=1;
            dia=1;
        } else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10){
            if(dia==32){
                mes++;
                dia=1;
            }
        } else if(mes==4 || mes==6||mes==9||mes==11){
            if(dia==31){
                mes++;
                dia=1;
            }
        } else if(mes==2 && dia==29){
            mes++;
            dia=1;
        }*/
        //Second way (Mejor usar if*else is para dar un valor a un aux y con ello trabajar en otro if y no meter dentro de otro haciéndolo largo)
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10) diaAux = 31;
            else if (mes==4 || mes==6 || mes==9 || mes==11) diaAux = 30;
                else if (mes==2) diaAux = 28;

        if (dia > diaAux) {
            dia = 1;
            mes++;
            if (mes > 12) {//Si pasa de 12 <> si es exactamente 12
                mes = 1;
                anio++;
            }
        }
        if (anio == 0) anio=1;

        System.out.printf("Fecha: %02d %02d %d", dia, mes, anio);
    }
}

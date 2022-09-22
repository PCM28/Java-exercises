package Arrays;
import java.util.Scanner;
import java.util.Locale;
public class Exercise4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.UK);

        System.out.print("Introduce el número de elementos: ");
        int num = input.nextInt();

        int contP=0,contN=0,cont=0;
        double sumaP=0,sumaN=0;//Siempre que se tenga que calcular y no introducir por teclado se inicializa

        double list[] = new double[num];

        //Introduce los datos, colocar el límite como list.length (total de elementos que hay en el array)
        for(int i=0;i<list.length;i++){ //No olvider la inicialización en 0 si se quiere introducir datos, las operaciones de un array hacerlas de manera interna al for
            list[i] = input.nextDouble();
            if(list[i]>0){
                sumaP+=list[i];
                contP++;
            } else if(list[i]<0){
                sumaN+=list[i];
                contN++;
            } else cont++;
        }

        //Cálculo del promedio
        sumaP/=contP;
        sumaN/=contN;

        //IMPORTANTE AL HACER PROMEDIO CONSIDERAR LA DIVISIÓN DE ALGO ENTRE CERO-> GENERA ERROR <----------------------------LEER ESTO, IMPORTANTE EN LA MEDIA, EL DIVISOR JAMÁS PUEDE SER 0
        if(contP>0 && contN>0 && cont>0){
            System.out.println("Promedio de positivos: " + sumaP);//Sino poner ln aparecen seguido y no con salto de línea
            System.out.println("Promedio de negativos: " + sumaN);
            System.out.println("Total de ceros: " + cont);
        } else if(contN>0 && cont>0){
            System.out.println("No hay números positivos");
            System.out.println("Promedio de negativos: " + sumaN);
            System.out.println("Total de ceros: " + cont);
        } else if(cont>0){
            System.out.println("No hay números positivos");
            System.out.println("No hay números negatios");
            System.out.println("Total de ceros: " + cont);
        } else{
            System.out.println("No hay números positivos");
            System.out.println("No hay números negatios");
            System.out.println("No hay ceros");
        }
    }
}

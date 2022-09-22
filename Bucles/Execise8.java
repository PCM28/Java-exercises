package Bucles;
import java.util.Scanner;
import java.util.Locale;
public class Execise8 {
    public static void main(String[]args){
        double altura = 0, masAlto=0;//Creaste un auxiliar para hallar la altura más alta
        int i=0, etiquetaAlta=0;//Usar otro auxiliar para hallar la posición del árbol más alto(etiqueta del árbol)

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.UK);

        System.out.print("Introduce altura (salir con -1): ");
        altura = input.nextDouble();
        masAlto = altura;

        while(altura!=-1){
            //masAlto=Math.max(masAlto,altura);//Aux(este caso es masAlto), se inicializa en el primer valor paro luego compararlo con los otros
            if(altura>masAlto) {
                masAlto = altura;
                etiquetaAlta = i;
            }
            i++;
            System.out.print("Introduce altura (salir con -1): ");
            altura = input.nextDouble();
        }
        //Siempre colocar un condició para la advertencia de que si no hay resultado salte un mensaje indicándolo
        if(i==0) System.out.println("No se ha introducido árboles");
            else System.out.println("El árbol más alto es: " + etiquetaAlta + ". con "+masAlto+" cm de alto");
    }
}

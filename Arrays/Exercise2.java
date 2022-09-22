package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de elementos del Array(Distinto de cero): ");//Con 5
        int elements = input.nextInt();
        int list[] = new int[elements];
        int cont=0,j=1;

        int numElem = list.length;
        //Recorrer para hacer una operación, cálculo, modificación o alteración a los elementos
        recorrerArray(list);
        //Acertar elementos
        acertarElementos(list,input,cont,j,numElem);

    }
    //NO OLVIDAR LLAMAR TIPO STATIC A LOS MÉTODOS, SOLO SE LLAMAN ENTRE ELLOS
    //NO OLVIDAR int numero = (int)(Math.random()*10+1), para aleatorio 0->9 ---> 1->10
    static void recorrerArray(int list[]){
        for(int i=0;i<list.length;i++){
            list[i] = (int) (Math.random()*5+1); // No olvidar el (int) ya que el Math.random() devuelve un double
        }
    }
    static void acertarElementos(int list[], Scanner input,int cont,int j, int numElem){
        do{
            System.out.printf("Introduce %d elemento: ",j);
            int numInt = input.nextInt();
            if(list[cont]==numInt){ cont++; j++;}
            else pista(numInt,list,cont);
            System.out.println();
        }while(cont!=numElem);
        System.out.println("Well done! Has termino The Chamber of Secrets");
        System.out.println(Arrays.toString(list));
    }
    static void pista(int numInt,int list[], int cont){
        if(numInt>list[cont]) System.out.println("Elemento introducido es mayor");
        else System.out.println("Elemento introducido es menor");
    }
}

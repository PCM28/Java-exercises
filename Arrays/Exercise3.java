package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese numElem del Array: ");//entre 0->(num-1)
        int num = input.nextInt();
        int list [] = new int [num];

        // int list[] = {1,2,3,4,5};

        int numElem = list.length;

        Arrays.fill(list,9);//5--> 0-4

        while(numElem>0){
            System.out.print("Ingrese valor a eliminar: ");//entre 0->(num-1)
            int elem = input.nextInt();
            int pos = Arrays.binarySearch(list,elem);//Devuelve el índice de su posicion -> sumarle 1 para ver su orden, aquí se coloca el valor no el indice
            if(pos>=0){
                for(int i=pos;i<(numElem-1);i++){
                    list[i] = list[i+1];
                }
                numElem--;
            } else System.out.println("Indice ingresado no existe");
        }
        System.out.println("No quedan elementos en la array, well done");

    }
}

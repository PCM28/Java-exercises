package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise1 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int notas[] = new int[8];
        int numElem = notas.length;
        for(int i=0;i<numElem-3;i++){
            System.out.printf("Introduce la nota %d: ",i+1);
            notas[i] = input.nextInt();
            //if(notas[i]==-1) break;
        }

        System.out.println();
        //Si colocas esto Arrays.sort(notas); en línea 32 obtendrás[-1, 0, 0, 1, 5, 6, 8, 23], para evitar esto ordenar de manera parcial
        Arrays.sort(notas,0,5);

        for(int i=5;i<numElem;i++){
            System.out.printf("Introduce la nota exhibición %d: ",i-4);
            notas[i] = input.nextInt();
            if(notas[i]==-1){
                notas[i]=notas[i+1];//Quitas el elemento que tiene -1
                numElem--;//Restas la cantidad de ese array
                break;
            } else Arrays.sort(notas);
        }
        /*int pos = Arrays.binarySearch(notas,-1);
        if(pos>=0){//Imprimir posicion y demuestra que existe
            for(int i=pos;i<numElem-1;i++){
                notas[i] = notas[i+1];
            }
            numElem--;
        }*/

        System.out.println("Las notas ordenadas son: " + Arrays.toString(notas));

    }
}

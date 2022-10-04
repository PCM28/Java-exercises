package Retos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class RetoUF3 {
    public static void main(String[] args) {
        String linea="";
        String sumaS="";
        int numNotas = 0;
        float suma = 0.0f;
        File fichero = new File("notasPepe.txt");
        if(fichero.exists()) {
            System.out.println("notasPepe.txt\n");
            try {
                FileReader fr = new FileReader(fichero);//Importante
                BufferedReader br = new BufferedReader(fr);//Importante
                while(linea!=null){
                    linea= br.readLine();
                    if(linea!=null){
                        System.out.println(linea);
                        sumaS = linea.substring(linea.indexOf(" "), linea.length());
                        suma = suma + Float.parseFloat(sumaS);
                        numNotas++;
                    } 
                }   
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Fichero no puede leerse");   
            }
        } else System.out.println("Fichero no existe");
        System.out.println("\nLa nota media del alumno es: " + suma/numNotas);
    }
}

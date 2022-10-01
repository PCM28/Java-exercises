package Retos;
import java.io.File;
import java.io.IOException;
public class RetoUF3 {
    public static void main(String[] args) {
        File fichero = new File("notasPepe");
        if(fichero.exists()) System.out.println("Fichero existe");
        else System.out.println("Fichero no existe");
    }
}

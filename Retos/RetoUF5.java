package Retos;
import java.util.Scanner;

public class RetoUF5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float suma=0.0f;
        System.out.print("Introduzca el número de empleados: ");
        int numEmpleados = entrada.nextInt();
        String listaEmpleados [] []= new String[numEmpleados][2];
        for(int i=0;i<numEmpleados;i++){
            System.out.printf("\nIntroduzca el nombre del empleado %d: ", (i+1));
            listaEmpleados[i][0] = entrada.next();
            System.out.printf("\nIntroduzca el salario del empleado %d: ", (i+1));
            listaEmpleados[i][1] = entrada.next();
            suma= suma + Float.parseFloat(listaEmpleados[i][1]);
        }
        entrada.close();
        System.out.printf("\nLa media de salarios es: %.2f", suma/numEmpleados);
        System.out.println("\n");
    }
}

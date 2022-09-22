package ProyectoPOO;
import java.util.Scanner;
public class Part1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); //Crea objeto tipo Scanner
        Persona persona = null; //Crea variable tipo Persona inicializada a null
        int control;//Crea variable tipo int para almacenar el método menú que es de tipo int (línea 8)
        do{
            control = menu(entrada);
            switch (control){
                case 1:
                    persona = crearPersona(entrada);//Se llama al método crearPersona
                    break;
                case 2:
                    mostrarPersona(persona);//Se llama al método mostrarPersona
                    break;
            }
            System.out.println();
        }while(control!=0);//Se crea un do-while para el uso del menú, cuando sea 0 sale del bucle
        System.out.println("FIN DEL PROGRAMA");
    }

    //MÉTODOS-SESIÓN01
    //Muestra el menú
    public static int menu(Scanner entrada){//Más eficiente
        System.out.println("MENÚ DE LA PRÁCTICA 3:");
        System.out.println("1. Insertar Persona.");
        System.out.println("2. Listar Personas.");
        System.out.println("0. Finalizar programa.");
        System.out.print("Introduzca una opción del menu: ");//(println por cada linea) siempre
        int resultado = entrada.nextInt();
        return resultado;
    }

    //Crea la persona, se ingresa los datos por teclado
    public static Persona crearPersona(Scanner entrada){
        System.out.print("\nIntroduzca nombre: ");
        String nombre = entrada.next();//Siempre luego de introducir un dato hace un salto de línea por defecto<-------- IMPORTANTE
        System.out.print("Introduzca género: ");
        char genero = entrada.next().charAt(0);
        System.out.print("Introduzca edad: ");
        int edad = entrada.nextInt();
        System.out.print("Introduzca altura: ");//Se introduce con , ---> sale con punto, a no ser que se añade util.Locale.UK
        double altura = entrada.nextDouble();
        System.out.print("Introduzca peso: ");
        double peso = entrada.nextDouble();
        return new Persona(nombre,genero,edad,altura,peso);
    }

    //Muestra los datos de la persona
    public static void mostrarPersona(Persona persona){
        if(persona==null) System.out.println("\nNo existe datos de persona");//Aquí hay ln -> no es necesario \n al final
        else{
            System.out.printf("\nNombre: %s; " +
                    "género: %c; " +
                    "edad: %d años; " +
                    "altura: %.2f m; " +
                    "peso: %.1f Kg; " +
                    "IMC: %.0f; " +
                    "estado: %s\n",persona.getNombre(),persona.getGenero(),persona.getEdad(),persona.getAltura(),persona.getPeso(),persona.getImc(),persona.getEstado());
        }
    }
}

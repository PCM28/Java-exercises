package ProyectoPOO;
import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        final int MAXIMOPERSONAS = 10;//Constante, hasta 10 personas
        Scanner entrada = new Scanner(System.in);//Crea objeto tipo Scanner
        Persona persona = null; //Crea variable tipo Persona inicializada a null
        ListaPersonas listaPersonas = new ListaPersonas(MAXIMOPERSONAS);//Crea objeto tipo ListaPersonas
        int menu;//Crea variable tipo int para almacenar el método menú que es de tipo int (línea 10)
        do {
            menu = Part1.menu(entrada);
            switch (menu) {
                case 1:
                    persona = Part1.crearPersona(entrada);//Se llama al método de la sesión01 crearPersona
                    if(listaPersonas.existePersona(persona.getNombre())) System.out.println("Existe otra persona con ese nombre");//Comprueba si existe otra persona con el mismo nombre
                    else listaPersonas.insertarPersona(persona);
                    break;
                case 2:
                    listaPersonas.mostrarListaPersonas();//Se llama al método mostrar ListaPersonas, muestra la lista total con todas las personas ingresadas en la lista
                    break;
            }
            System.out.println();
        } while (menu != 0);//Se crea un do-while para el uso del menú, cuando sea 0 sale del bucle
        System.out.println("FIN DEL PROGRAMA");
    }
}

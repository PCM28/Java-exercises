package ProyectoPOO;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class Part3 {
    public static void main (String[]args){
        final int MAXIMOPERSONAS = 10;
        Scanner entrada = new Scanner(System.in);

        //Crear objetos de cada clase antes de usar
        Persona persona = null;//Crea objeto persona
        ListaPersonas listaPersonas = new ListaPersonas(MAXIMOPERSONAS);//Crea objeto listaPersonas

        int menu;//Crea variable tipo int para almacenar el método menú que es de tipo int (línea 17)

        do{
            menu = menu(entrada);
            switch (menu){
                case 1:
                    persona = Part1.crearPersona(entrada);//Crea la persona (Introduzco datos), se llama desde la Sesión01
                    if(listaPersonas.existePersona(persona.getNombre())) System.out.println("\nExiste otra persona con ese nombre");////Comprueba si existe otra persona con el mismo nombre
                    else listaPersonas.insertarPersona(persona);//Insertar persona en la lista Personas
                    break;
                case 2:
                    listaPersonas.mostrarListaPersonas();//Mostrar lista Persona
                    break;
                case 3:
                    buscarPersonas(entrada,listaPersonas);//Muestra los datos de una persona específica, pasando solo su nombre
                    break;
                case 4:
                    eliminarPersona(entrada,listaPersonas);//Elimina una persona específica, pasando su nombre
                    break;
                case 5://Escribe los datos de la lista al fichero.csv
                    try{
                        escribirPersonasFicheroTexto(listaPersonas);
                    } catch(IOException ex){
                        ex.printStackTrace();
                    }
                    System.out.println("Se ha escrito en el fichero");
                    break;
                case 6://Lee los datos del fichero.csv a la consola
                    try{
                        leerPersonasFicheroCsv(MAXIMOPERSONAS);
                    }catch(IOException ex){
                        ex.printStackTrace();
                    }
                    break;
            }
            System.out.println();
        }while(menu!=0);//Se crea un do-while para el uso del menú, cuando sea 0 sale del bucle
        System.out.println("FIN DEL PROGRAMA");
    }

    //Muestra el menú
    public static int menu(Scanner entrada){
        System.out.println("MENÚ DE LA PRÁCTICA 3:\n\t1. Insertar Persona.\n\t2. Listar Personas.\n\t3. Buscar Personas. \n\t4. Eliminar Personas.\n\t5. Escribir Personas a fichero de texto csv.\n\t6. Leer Personas desde fichero de texto csv.\n\t0. Finalizar programa.");
        System.out.print("Introduzca una opción del menu: ");
        int resultado = entrada.nextInt();
        return resultado;
    }

    //Busca una persona en la lista apartir de su nombre
    public static void buscarPersonas(Scanner entrada, ListaPersonas listaPersonas){
        int i=0;//Posición
        boolean eliminado = false;
        System.out.print("Escriba el nombre de la persona a buscar: ");
        String nombreBuscar = entrada.next();

        if(listaPersonas.existePersona(nombreBuscar)) listaPersonas.mostrarListaPersonaNombre(nombreBuscar);
        else System.out.println("No existe una persona con ese nombre");
    }

    //Elimina un objeto persona de la lista apartir de su nombre
    public static void eliminarPersona(Scanner entrada, ListaPersonas listaPersonas){//int pos
        System.out.print("Escribe el nombre de la persona a eliminar: ");
        String nombreAEliminar = entrada.next();

        int pos = listaPersonas.posicionPersona(nombreAEliminar);
        int numeroPersona = listaPersonas.getNumPersonas();

        if(!(listaPersonas.existePersona(nombreAEliminar))){
            System.out.println("\nNo existe una persona con ese nombre");
        }else {
            if(pos<numeroPersona && pos>=0){
                for(int i=pos+1;i<numeroPersona;i++){
                    listaPersonas.lista[i-1] = listaPersonas.lista[i];
                }
            }
            listaPersonas.numeroPersonas--;
            System.out.println("Se ha eliminado la persona de la lista");
        }
    }

    //Escribe los datos de la lista al fichero Personas.csv
    public static void escribirPersonasFicheroTexto(ListaPersonas listaPersonas) throws IOException {

        FileWriter out = new FileWriter("Personas.csv");//Por defecto

        BufferedWriter output = new BufferedWriter(out);

        for(int i=0;i< listaPersonas.getNumPersonas();i++){
            output.write(listaPersonas.lista[i].getNombre() + ";" + listaPersonas.lista[i].getGenero() + ";" + listaPersonas.lista[i].getEdad() + ";" + listaPersonas.lista[i].getAltura() + ";" + listaPersonas.lista[i].getPeso() + "\n");
        }
        output.close();
    }

    //Muestra los datos del fichero Personas.csv a la consola
    public static ListaPersonas leerPersonasFicheroCsv(int maxpersonas) throws IOException{
        Persona persona = null;
        ListaPersonas lista = new ListaPersonas(maxpersonas);

        FileReader out = new FileReader("Personas.csv");
        BufferedReader output = new BufferedReader(out);

        String lineas;
        while((lineas=output.readLine())!=null){
            String [] linea = lineas.split(";");
            String nombrePersona = linea[0];
            char generoPersona = linea[1].charAt(0);
            int edadPersona = Integer.parseInt(linea[2]);
            double alturaPersona = Double.parseDouble(linea[3]);
            double pesoPersona = Double.parseDouble(linea[4]);
            persona = new Persona(nombrePersona,generoPersona,edadPersona,alturaPersona,pesoPersona);
            lista.insertarPersona(persona);
        }
        lista.mostrarListaPersonas();
        out.close();
        return lista;
    }
}

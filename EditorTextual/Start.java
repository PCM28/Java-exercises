package EditorTextual;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Start {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("La ruta es: `texto.txt`");
        
        String ruta="";
        String respuesta;
        File fichero = null;
        // FileWriter nuevoFichero;

        int menu;
        do{
            menu = menu(entrada);
            switch(menu){
                case 1:
                    System.out.println("Introduzca el nombre del nuevo fichero: ");
                    ruta = entrada.next();
                    fichero = new File(ruta);//Aquí crea el fichero. Ya existe
                    if(fichero.exists()){
                        System.out.println("Fichero existente ¿Desea sobrescribirlo? (Si o No)");
                        respuesta = entrada.next();
                        if(respuesta=="si"){
                            try{
                                FileWriter ficheroMachacador = new FileWriter(fichero);
                                ficheroMachacador.close();
                            } catch(IOException ex) {
                                ex.printStackTrace();
                                System.out.println("No se machacó el fichero");
                            }   
                        }  
                    } else {
                        try{
                            FileWriter nuevoFichero = new FileWriter(fichero);
                            nuevoFichero.close();
                        } catch(IOException ex) {
                            ex.printStackTrace();
                            System.out.println("Error al crear el fichero");
                        }
                    }

                    break;
                case 2:
                    System.out.println("Introduzca el nombre del fichero a editar: ");
                    ruta = entrada.next();
                    fichero = new File(ruta);//Aquí crea el fichero. Ya existe
                    if(!fichero.exists()) System.out.println("Fichero no existente");
                    else {
                        System.out.println("Introduzca el texto que desea añadir al fichero: ");
                        String texto = entrada.next();
                        //Código para añadir al fichero
                        try {
                            FileWriter fw = new FileWriter(fichero);//Transforma el fichero a tipo escritura (lo abre)
                            PrintWriter pw = new PrintWriter(fw);//Crea un pluma para escribir sobre ese fichero abierto
                            pw.println(texto);
                            pw.close();//Cierra la pluma
                            fw.close();//Cierra el fichero, y así tiene el fichero escrito el texto. De locosss
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Documento editado correctamente");
                    }
                    break;
                case 3:
                    System.out.println("Introduzca el nombre del fichero a borrar: ");
                    ruta = entrada.next();
                    fichero = new File(ruta);
                    if(!fichero.exists()) System.out.println("Fichero no existente");
                    else{
                        System.out.println("¿Está seguro de que desea borrarlo (Afirmación S)?");
                        String texto = entrada.next();
                        if(texto.toUpperCase().equals("S")){
                            if(fichero.delete()) System.out.println("El fichero eliminado correctamente");
                            else System.out.println("El fichero no se borró del sistema");
                        } else System.out.println("El fichero no se borró del sistema");
                    }
                    break;
                case 4:
                    System.out.println("Introduzca el nombre de la carpeta a crear: ");
                    ruta = entrada.next();
                    fichero = new File(ruta);
                    if(fichero.exists()) System.out.println("Carpeta ya existe");
                    else {
                        if(fichero.mkdirs()) System.out.println("Carpeta creada correctamente");
                    }
                    break;
                case 5:
                    System.out.println("Introduzca el nombre de la carpeta a borrar: ");
                    ruta = entrada.next();
                    fichero = new File(ruta);
                    if(!fichero.exists()) System.out.println("La carpeta no existe");
                    else {
                        System.out.println("¿Está seguro de que desea borrarlo (Afirmación S)?");
                        String texto = entrada.next();
                        if(texto.toUpperCase().equals("S")){
                            if(fichero.delete()) System.out.println("Carpeta Borrada correctamente");
                            else System.out.println("La carpeta no se borró del sistema");
                        } else System.out.println("La carpeta no se borró del sistema");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opción errónea");
            }

        }while(menu!=0);
    }

    public static int menu (Scanner entrada){
        System.out.println("********************************");
        System.out.println("EDITOR DE TEXTO");
        System.out.println("********************************");
        System.out.println("Seleccione una opción: ");
        System.out.print(
                            "1) Crear un fichero \n" +
                            "2) Editar un fichero \n" +
                            "3) Borrar un fichero \n" +
                            "4) Crear una carpeta \n" +
                            "5) Borrar un carpeta \n" +
                            "0) Salir\n");
        System.out.print("Opción: ");
        return entrada.nextInt();
    }
}

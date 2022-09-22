package ProyectoPOO;
public class ListaPersonas {
    //ATRIBUTOS
    private final int MAXIMOPERSONAS;//QUITAR LINE 9 Y PONER private static final int MAXIMOPERSONAS = 10
    public Persona [] lista;//Está bien colocarlo así----> ask
    public int numeroPersonas;//Variable de tipo int es la cantidad de personas que hay en la lista


    //CONSTRUCTOR (SIEMPRE HAY UN CONSTRUCTOR (SIN PARÁMETROS) POR DEFECTO QUE PONE LOS ATRIBUTOS CON VALORES POR DEFECTO, SI EXISTE UN CONSTRUCTOR LA CLASE DEJA DE TENER AL CONSTRUCTOR POR DEFECTO
    public ListaPersonas(int MAXIMOPERSONAS){//CONSTRUCTOR SIEMPRE SE INICIALIZA LOS VALORES, CONSTANTES, VARIABLES, ARRAYS(DE CLASES COMO PRIMITIVOS)
        this.MAXIMOPERSONAS = MAXIMOPERSONAS;
        lista = new Persona[this.MAXIMOPERSONAS];//Poner constante
        this.numeroPersonas = 0;
    }

    /*MÉTODOS (DONE)*/
    //------------------------------------------------------------------------>
    //InsertarPersona(2nd Method)
    public boolean insertarPersona(Persona persona){
        boolean insertado = false;
        if(numeroPersonas < MAXIMOPERSONAS) {
            lista[numeroPersonas++] = persona;
            insertado = true;
        }
        return insertado;
    }

    //Devuelve el numéro de objetos de personas existentes de la lista
    public int getNumPersonas(){
        return numeroPersonas;
    }

    //Mostrar lista persona existentes completa
    public void mostrarListaPersonas(){
        if(numeroPersonas!=0){
            System.out.println("Lista: ");
            for(int i=0;i<numeroPersonas;i++){
                System.out.println((i+1)+". " + lista[i].toString());
            }
        } else System.out.println("No existe niguna persona");
    }

    //Comprueba existencia del nombre persona
    public boolean existePersona(String nombrePersona){//Parámetro nombre de la persona a buscar
        int i=0;//" contadores 1 para el bule y otro para contar las veces que aparece el nombre. Como recorre al array desde la posición 0 contará el mismo su nombre entoncs debe de contar más de 1 vez (cont>1) para que la variable boolean(existaPersona) sea true
        boolean existeNombrePersona = false;
        while(i<numeroPersonas && !existeNombrePersona){//&& !existeNombrePersona
            if(lista[i].getNombre().equals(nombrePersona)) {
                existeNombrePersona = true;
            }else i++;

        }
        return existeNombrePersona;
    }

    //Devuelve posición de la persona que está dentro de la lista. Se pasa como parámetro su nombre
    public int posicionPersona(String nombrePersonaABuscar){//Parámetro nombre de la persona a buscar
        int total = 0;
        for(int i=0;i<numeroPersonas;i++){
            if(lista[i].getNombre().equals(nombrePersonaABuscar)) total=i;
        }
        return total;
    }

    //Muestra las personas para un (nombre) en concreto
    public void mostrarListaPersonaNombre(String nombreBuscar){// Muestra lista de las personas con el mismo nombre (cmbiar por el día, fechas y otra caractrística)
        if(numeroPersonas!=0){
            System.out.println("Nombre de la lista: ");
            for(int i=0; i<numeroPersonas ; i++){//Poner un while
                if(lista[i].getNombre().equals(nombreBuscar)) System.out.println( (i+1) + ". " + lista[i].toString());
            }
        } else System.out.println("No existe ninguna persona (Con ese nombre)");
    }

    //----------------------------------------------------------------------->
}
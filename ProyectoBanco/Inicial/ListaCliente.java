package ProyectoBanco.Inicial;

public class ListaCliente {
    //ATRIBUTOS
    private final int MAXIMOCLIENTES;
    public Cliente [] lista;
    public int numeroClientes;

    //CONSTRUCTOR
    public ListaCliente(int MAXIMOCLIENTES){
        this.MAXIMOCLIENTES = MAXIMOCLIENTES;
        lista = new Cliente[this.MAXIMOCLIENTES];
        this.numeroClientes = 0;
    }

    //MÉTODOS
    //InsertarPersona(1nd Method)
    public boolean insertarCliente(Cliente cliente){
        boolean insertado = false;
        if(numeroClientes<MAXIMOCLIENTES){
            lista[numeroClientes++] = cliente;
            insertado = true;
        }
        return insertado;
    }

    //Devuelve el numéro de objetos de personas existentes de la lista
    public int getNumeroClientes(){
        return numeroClientes;
    }

    //Mostrar lista persona existentes completa
    public void mostrarListaCliente(){
        if(numeroClientes!=0){
            System.out.println("Lista cliente:");
            for(int i=0;i<numeroClientes;i++){
                System.out.println((i+1) + ". " + lista[i].toString());
            }
        }else System.out.println("No existe ningún cliente");
    }

    //Comprueba existencia del nombre persona
    public boolean existeCliente(String nombreCliente){//Se usa dni y correo, de momento con nombre
        int i=0;
        boolean existeNombreCLiente = false;
        while(i<numeroClientes && !existeNombreCLiente){
            if(lista[i].getNombre().equals(nombreCliente)){
                existeNombreCLiente = true;
            } else i++;
        }
        return existeNombreCLiente;
    }

    //Devuelve posición de la persona que está dentro de la lista. Se pasa como parámetro su nombre
    public int posicionCLiente(String nombreCliente){
        int total = 0;
        for(int i=0;i<numeroClientes;i++){
            if(lista[i].getNombre().equals(nombreCliente)) total = i;
        }
        return total;
    }

    //Muestra las personas para un (nombre) en concreto
    public void mostrarListaClienteNombre(String nombreClienteABuscar){
        if(numeroClientes!=0){
            System.out.println("Nombre de la lista: ");
            for(int i=0;i<numeroClientes;i++){
                if(lista[i].getNombre().equals(nombreClienteABuscar)) System.out.println((i+1) + ". " + lista[i].toString());
            }
        }else System.out.println("No existe ninguna cliete (Con ese nombre)");
    }
}

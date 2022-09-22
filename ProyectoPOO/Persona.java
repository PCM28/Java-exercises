package ProyectoPOO;
public class Persona {
    //ATRIBUTOS
    private String nombre;
    private char genero;
    private int edad;
    private double altura;
    private double peso;
    private double imc;
    private String estado;

    //CONSTRUCTOR POR DEFECTO
    Persona(){ //CONSTRUCTOR POR DEFECTO, no tiene parámetros los llamas directo los atributos con this
        this(" ",' ',0,0,0);
        this.imc = 0;
        this.estado = " ";
    }

    //CONSTRUCTOR PRINCIPAL
    Persona(String nombre, char genero, int edad, double altura, double peso){//CONSTRUCTOR PRINCIPAL
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.estado = calcularIMC();//
    }

    //GETS-SETS DE ATRIBUTOS
    public String getNombre() {
        return nombre;
    }//Obtiene valor de nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//Set para modificarlo

    public char getGenero() {
        return genero;
    }//Obtiene valor de género

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }//Obtiene valor de edad

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }//Obtiene valor de altura

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }//Obtiene valor de peso

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }//Obtiene valor de imc

    public String getEstado() {
        return estado;
    }//Obtiene valor de estado

    //MÉTODOS-SESIÓN02

    //Cálcula IMC de cada persona
    public String calcularIMC(){
        String estado = "";
        this.imc = getPeso()/(Math.pow(getAltura(),2)); //ASK THIS <--------
        if(this.imc<18) estado = "Delgadez";//Siempre el menor el primero
        else if (this.imc<25.0) estado = "Peso ideal";
        else if(this.imc<30.0) estado = "Sobrepeso";
        else if(this.imc>=30.0) estado = "Obesidad";
        return estado;//Que no detecte un negativo y devuelva delgadez, añadir nueva condición
    }

    //Muestra los valores almacenados en los atributas de una peronsa en un formato específico
    public String toString(){
        return "Persona{ \"nombre\" = \"" + this.getNombre() +
                "\", \"genero\" = \"" + this.getGenero() +
                "\", \"edad\" = \"" + this.getEdad() +
                "\", \"altura\" = \"" + this.getAltura() +
                "\", \"peso\" = \"" + this.getPeso() +
                "\", \"imc\" = \"" + Math.round(this.getImc()) +
                "\", \"estado\" = \"" + this.getEstado() + "\" }";
    }
}

package POO.E1;

public class Futbolista {
    // Atributos -> Como uni 
    // private int dorsal;
    // private String nombre;
    // private String apodo;
    // private float altura;

    // Atributoa -> Como Fp
    protected int dorsal;
    protected String nombre;
    protected String apodo;
    protected float altura;

    // Cosntructor -> Como Uni
    // public Futbolista(String dorsal, String nombre, String apodo, String altura){
    //     this.dorsal=dorsal;
    //     this.nombre=nombre;
    //     this.apodo=apodo;
    //     this.altura=altura;
    // }

    // Constructor -> Como Fp
    public Futbolista(int dorsal, String nombre, String apodo, float altura){
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.apodo = apodo;
        this.altura = altura;
    }
    // gets-sets
    public int getDorsal() { return dorsal; }

    public void setDorsal(int dorsal) { this.dorsal=dorsal; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre=nombre; }

    public String getApodo() { return apodo; }

    public void setApodo(String apodo) { this.apodo=apodo; }

    public float getAltura() { return altura; }

    public void setAltura(float altura) { this.altura=altura; }

    //Métodos
    public String mostrarInfo(){
        return "Futbolista{ \"dorsal\" =\" " + this.getDorsal() + 
        "\", \"nombre\" =\"" + this.getNombre() +
        "\", \"apodo\" =\"" + this.getApodo() +
        "\", \"altura\" =\"" + this.getAltura() + "\"}";
    }
}

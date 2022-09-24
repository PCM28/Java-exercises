package POO.E2;

public class Aula {
    // Atributos
    protected String nombre;
    protected int aforo;

    // Num Sillas
    protected Silla silla1;
    protected Silla silla2;
    protected Silla silla3;
    protected Silla silla4;
    // Num Mesas
    protected Mesa mesa1;
    protected Mesa mesa2;

    // Construtor
    public Aula(String nombre, int aforo){
        this.nombre = nombre;
        this.aforo = aforo;
        silla1 = null;
        silla2 = null;
        silla3 = null;
        silla4 = null;
        mesa1=null;
        mesa2=null;
    }

    // Gets-Sets
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getAforo() { return aforo; }

    public void setAforo(int aforo) { this.aforo = aforo; }

    public Silla getSilla1() {return silla1;}

    public void setSilla1(Silla silla1) {this.silla1=silla1;}

    public Silla getSilla2() {return silla2;}

    public void setSilla2(Silla silla2) {this.silla2=silla2;}

    public Silla getSilla3() {return silla3;}

    public void setSilla3(Silla silla3) {this.silla3=silla3;}

    public Silla getSilla4() {return silla4;}

    public void setSilla4(Silla silla4) {this.silla4=silla4;}

    public Mesa getMesa1() {return mesa1;}

    public void setMesa1(Mesa mesa1) {this.mesa1=mesa1;}

    public Mesa getMesa2() {return mesa2;}

    public void setMesa2(Mesa mesa2) {this.mesa2=mesa2;}

    // Métodos
    public String mostrar(){
        System.out.println("Información del aula es: ");
        return 
        "Aula{\n \"Nombre\" =\" " + this.getNombre() +
        "\", \n \"Aforo\" =\" " + this.getAforo() + 
        "\", \n \"Silla1\" =\" " + silla1.mostrar() +
        "\", \n \"Silla2\" =\" " + silla2.mostrar() +
        "\", \n \"Silla3\" =\" " + silla3.mostrar() +
        "\", \n \"Silla4\" =\" " + silla4.mostrar() +
        "\", \n \"Mesa1\" =\" " + mesa1.mostrar() +
        "\", \n \"Mesa2\" =\" " + mesa2.mostrar() + "\"\n}";
    }
}

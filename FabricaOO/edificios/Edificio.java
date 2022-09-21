package FabricaOO.edificios;

public class Edificio {
    // Atributos
    private double anchura;
    private double altura;
    private double profundidad;
    private String funcionalidad;
    enum EdificioTipo {Fabrica, Almacen, Oficina};
    EdificioTipo edificioTipo;

    // Constructor
    public Edificio(double anchura, double altura, double profundidad, String funcionalidad, EdificioTipo edificioTipo){
        this.anchura = anchura;
        this.altura = altura;
        this.profundidad = profundidad;
        this.funcionalidad = funcionalidad;
        this.edificioTipo = edificioTipo;
    }

    // Gets-Sets
    public double getAnchura () {return anchura;}

    public void setAnchura(double anchura) {this.anchura = anchura;}

    public double getAltura () {return altura;}

    public void setAltura(double altura) {this.altura = altura;}

    public double getProfundidad() {return profundidad;}

    public void setProfundidad(double profundidad) {this.profundidad = profundidad;}

    public String getFuncionalidad() {return funcionalidad;}

    public void setFuncionalidad(String funcionalidad) {this.funcionalidad = funcionalidad;}

    public EdificioTipo getEdificioTipo() {return edificioTipo;}

    public void setEdificioTipo(EdificioTipo edificioTipo) {this.edificioTipo=edificioTipo;}

    // Métodos
    public float costePintura(String color, double precio){
        
        return 1;
    }
}
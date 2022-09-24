package FabricaOO.Productos;

import FabricaOO.Empresa.Empresa;

public class Producto extends Empresa{
    protected int id;
    protected String nombre;
    protected String tipo;
    protected float anchura;
    protected float profundidad;
    protected float altura;

    public Producto(){
        this.id = 0;
        this.nombre = "";
        this.tipo = "";
        this.anchura = 0.0f;
        this.profundidad = 0.0f;
        this.altura = 0.0f;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id=id;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre=nombre;}

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo=tipo;}

    public float getAnchura() {return anchura;}

    public void setAnchura(float anchura) {this.anchura=anchura;}

    public float getProfundidad() {return profundidad;}

    public void setProfundidad(float profundidad) {this.profundidad=profundidad;}

    public float getAltura() {return altura;}

    public void setAltura(float altura) {this.altura=altura;}

    @Override
    public String mostrarInfo(){
        return "\nProducto{ \n \"id\" = \"" + this.id + 
                "\", \n \"nombre\" = \"" + this.nombre +
                "\", \n \"tipo\" = \"" + this.tipo +
                "\", \n \"anchura\" = \"" + this.anchura +
                "\", \n \"profundidad\" = \"" + this.profundidad + 
                "\", \n \"altura\" = \"" + this.altura + "\" \n}";
    }

}

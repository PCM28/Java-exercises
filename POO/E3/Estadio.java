package POO.E3;

public class Estadio {
    protected String nombre;
    protected int asientos;
    protected float precio;
    protected float ganancias;

    public Estadio(String nombre, int asientos, float precio,float ganancias){
        this.nombre = nombre;
        this.asientos = asientos;
        this.precio = precio;
        this.ganancias = ganancias;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getAsientos() {return asientos;}

    public void setAsientos(int asientos) {this.asientos = asientos;}

    public float getPrecio() {return precio;}

    public void setPrecio(float precio) {this.precio = precio;}

    public float getGanacias() {return ganancias;}

    public void setGanancias(Float ganancias) {this.ganancias = ganancias;}

    
}

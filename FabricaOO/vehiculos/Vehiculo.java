package FabricaOO.vehiculos;

public class Vehiculo {
    // Atributos
    private String marca;
    private double precio;
    private double peso;
    private String color;
    private double longitud;
    enum VehiculoTipo {Vehiculo_Electrico, Vehiculo_Gasoil, Vehiculo_Gasolina};
    VehiculoTipo vehiculoTipo;
    // Constructor
    public Vehiculo(String marca, double precio, double peso, String color, double longitud, VehiculoTipo vehiculoTipo) {
        this.marca = marca;
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.longitud = longitud;
        this.vehiculoTipo = vehiculoTipo;
    }

    // Gets - Sets
    public String getMarca() {return marca;}

    public void setMarca(String marca){this.marca = marca;}

    public double getPrecio() {return precio;}

    public void setPrecio(double precio) {this.precio = precio;}

    public double getPeso() {return peso;}

    public void setPeso(double peso) {this.peso = peso;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public double getLongitud () {return longitud;}

    public void setLongitud (double longitud) {this.longitud = longitud;}

    public VehiculoTipo getVehiculoTipo() {return vehiculoTipo;}

    public void setVehiculoTipo(VehiculoTipo vehiculoTipo) {this.vehiculoTipo=vehiculoTipo;}

    // Métodos
    public String mostrarInfo(){
        return "Vehiculo{ \"marca\" =\"" + this.getMarca() + 
                "\", \"tipo\" = \"" + this.getVehiculoTipo() +
                "\", \"precio\" = \"" + this.getPrecio() +
                "\", \"peso\" = \"" + this.getPeso() +
                "\", \"color\" = \"" + this.getColor() +
                "\", \"longitud\" = \"" + this.getLongitud() + "\" }";
    }
}

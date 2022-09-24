package POO.E3;

public class Main {
    public static void main(String[] args) {
        Estadio e1 = new Estadio("nombre", 0, 0f, 0f);
        CalculosMatematicos c = new CalculosMatematicos();
        e1.setAsientos(250);
        e1.setPrecio(25.5f);
        e1.setGanancias(c.multiplicaciones(e1.getPrecio(), e1.getAsientos()));
        System.out.println("Las ganancias totales son: " + e1.getGanacias());
    }
}

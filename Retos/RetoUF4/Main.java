package Retos.RetoUF4;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Pierre");
        p1.setEdad(26);
        p1.setDni("123456P");
        p1.setSexo("Masculino");
        p1.setPeso(65.0f);
        p1.setAltura(1.6f);
        p1.mostrar();

        Persona p2 = new Persona();
        p2.setNombre("Carlos");
        p2.setEdad(47);
        p2.setDni("67890P");
        p2.setSexo("Masculino");
        p2.setPeso(85.5f);
        p2.setAltura(1.7f);
        p2.mostrar();

        Persona p3 = new Persona();
        p3.setNombre("Guianina");
        p3.setEdad(46);
        p3.setDni("09876P");
        p3.setSexo("Femenino");
        p3.setPeso(60.0f);
        p3.setAltura(1.55f);
        p3.mostrar();
    }
}

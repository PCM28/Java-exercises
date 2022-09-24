package POO.E4_E6_E7;

public class Main {
    public static void main(String[] args) {
        Futbolista2 f1 = new Futbolista2("", 0, 0, 0);
        
        f1.setNombre("Queee está pasaaando aquiii");
        f1.setDni(12345678);
        f1.setEdad(30);
        f1.setDorsal(50);
        
        System.out.println(f1.getNombre());
        System.out.println(f1.getDni());
        System.out.println(f1.getEdad());
        System.out.println(f1.getDorsal());
    }
}

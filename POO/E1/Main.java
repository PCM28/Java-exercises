package POO.E1;
public class Main {
    public static void main(String[] args) {
        
        Futbolista f1 = new Futbolista(50, "A", "apodo1", 1.6f);//siempre en un flotat colocar ".f"
        Futbolista f2 = new Futbolista(70, "J", "apodo2", 1.62f);//siempre en un flotat colocar ".f"
        
        System.out.println(f1.mostrarInfo());
        System.out.println("Datos deel jugador 1: ");
        System.out.println("Dorsal: " + f1.getDorsal());
        System.out.println("Nombre: " + f1.getNombre());
        System.out.println("Apodo: " + f1.getApodo());
        System.out.println("Altura: " + f1.getAltura());

        System.out.println();

        System.out.println(f2.mostrarInfo());
        System.out.println("Datos deel jugador 2: ");
        System.out.println("Dorsal: " + f2.getDorsal());
        System.out.println("Nombre: " + f2.getNombre());
        System.out.println("Apodo: " + f2.getApodo());
        System.out.println("Altura: " + f2.getAltura());

        f1.setDorsal(100);
        f1.setNombre("Que Pasaa");
        f1.setApodo("Brooo");
        f1.setAltura(1.63f);

        System.out.println();

        System.out.println(f1.mostrarInfo());
    }
}

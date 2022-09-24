package POO.E5_E6_E7;

public class Main {
    public static void main(String[] args) {
        Nadador n1 = new Nadador("", 0, 0, 0f, 0f);
        n1.setNombre("Queee Pasaaa");
        n1.setDni(6789);
        n1.setEdad(40);
        n1.setAltura(1.7f);//Siempre se coloca f en cada valor añadido de un float
        n1.setPeso(75.0f);
        n1.mostrar();//Al estar usando println dentro de los métodos mostrar de las clases (padres como hijas)
        //Con tan solo hacer el llamado al método imprime, pero si para mostrar los datos usas el método String (en cada clase)
        //El llamado al método estará dentro un println, en el main, para mostrar los datos
        System.out.println(n1.descriptionDeporte());
        System.out.println(n1.mostrarInfo());
    }
}

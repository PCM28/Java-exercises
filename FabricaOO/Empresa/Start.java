package FabricaOO.Empresa;

import FabricaOO.Edificios.Almacen;
import FabricaOO.Edificios.Fabrica;
import FabricaOO.Edificios.Oficina;
import FabricaOO.Productos.Puerta;
import FabricaOO.Productos.Silla;
import FabricaOO.Vehiculos.Vehiculo_Electrico;
import FabricaOO.Vehiculos.Vehiculo_Gasoil;

public class Start {
    public static void main(String[] args) {
        Empresa e1 = new Empresa();

        Vehiculo_Electrico ve = new Vehiculo_Electrico();
        ve.setMarca("Seat Altea");
        ve.setPrecio(20000.0f);
        ve.setPeso(3000.0f);
        ve.setColor("Rojo");
        ve.setLongitud(3.0f);
        ve.setPotencia(4000.0f);

        e1.setVehiculo1(ve);//Mama huevooo chavalll diosss, esa es nueva hijo putaaa, Bien ahii. E s p e c t a c u l a r.......

        Vehiculo_Gasoil vg = new Vehiculo_Gasoil();
        vg.setMarca("Renault Kadjar");
        vg.setPrecio(28000.0f);
        vg.setPeso(4000.0f);
        vg.setColor("Azul");
        vg.setLongitud(3.5f);

        e1.setVehiculo2(vg);

        Fabrica f = new Fabrica();
        f.setAnchura(400.0f);
        f.setAltura(400.0f);
        f.setProfundidad(500.0f);
        f.setFuncionalidad("Lugar donde se crean los productos");
        f.setTipo("Fabrica");
        e1.setEdificio1(f);

        Oficina o = new Oficina();
        o.setAnchura(600.f);
        o.setAltura(400.0f);
        o.setProfundidad(700.0f);
        o.setFuncionalidad("Lugar donde se gestionan los productos");
        o.setTipo("Oficina");
        e1.setEdificio2(o);

        Almacen a = new Almacen();
        a.setAnchura(600.0f);
        a.setAltura(400.0f);
        a.setProfundidad(700.0f);
        a.setFuncionalidad("Lugar donde se almacenan los productos");
        a.setTipo("Almacén");
        e1.setEdificio3(a);
        
        Silla s1 = new Silla();
        s1.setId(1);
        s1.setNombre("Silla N20");
        s1.setTipo("Silla");
        s1.setAnchura(1.0f);
        s1.setAltura(0.5f);
        s1.setProfundidad(0.5f);
        e1.setProducto1(s1);

        Silla s2 = new Silla();
        s2.setId(2);
        s2.setNombre("Silla M100");
        s2.setTipo("Silla");
        s2.setAnchura(1.5f);
        s2.setAltura(0.5f);
        s2.setProfundidad(1.5f);
        e1.setProducto2(s2);

        Puerta p1 = new Puerta();
        p1.setId(3);
        p1.setNombre("Puerta P9");
        p1.setTipo("Puerta");
        p1.setAnchura(1.5f);
        p1.setAltura(2.25f);
        p1.setProfundidad(0.25f);
        e1.setProducto3(p1);

        Puerta p2 = new Puerta();
        p2.setId(4);
        p2.setNombre("Puerta F50");
        p2.setTipo("Puerta");
        p2.setAnchura(1.25f);
        p2.setAltura(1.25f);
        p2.setProfundidad(0.25f);
        e1.setProducto4(p2);

        System.out.println(e1.mostrarInfo());
        System.out.printf("El precio de pintar la fábrica completa con precio por metro 30 euros es = %.2f", a.costePintura(30.0f));
        //Si usas print o println el resultado te lo mostrará como 5,04E^9, en cambio si usas printf te lo imprime sin exponencial -> 5040000000,000000 (Usas %.2f para mantener 2 decimales)
        // Well Done boss
    }
    //Ask to Javier: el para que el segundo método de edicio para calcular el coste de pintar, sino habría inconveniente de colocar el precio al final y porque pide pasar como parámetro el color en el primer método para calcular el coste de pintar el edificio
}
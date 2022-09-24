package POO.E2;

public class Main {
    public static void main(String[] args) {
        
        Aula aula1 = new Aula("nombre", 0);
        aula1.setNombre("Aula 1");
        aula1.setAforo(300);
        
        Silla s1 = new Silla("", 0, 0.f, 0.f, 0f);
        s1.setTipo("tipo");
        s1.setPatas(4);
        s1.setAncho(10.f);
        s1.setLargo(10.f);
        s1.setAlto(1.f);
        aula1.setSilla1(s1);
        s1.mostrar();

        Silla s2 = new Silla("", 0, 0.f, 0.f, 0f);
        s2.setTipo("tipo");
        s2.setPatas(4);
        s2.setAncho(10.f);
        s2.setLargo(10.f);
        s2.setAlto(1.f);
        aula1.setSilla2(s2);

        Silla s3 = new Silla("", 0, 0.f, 0.f, 0f);
        s3.setTipo("tipo");
        s3.setPatas(4);
        s3.setAncho(10.f);
        s3.setLargo(10.f);
        s3.setAlto(1.f);
        aula1.setSilla3(s3);

        Silla s4 = new Silla("", 0, 0.f, 0.f, 0f);
        s4.setTipo("tipo");
        s4.setPatas(4);
        s4.setAncho(10.f);
        s4.setLargo(10.f);
        s4.setAlto(1.f);
        aula1.setSilla4(s4);

        Mesa m1 = new Mesa("", 0, 0.f, 0.f, 0f);
        m1.setTipo("tipo");
        m1.setPatas(4);
        m1.setAncho(10.f);
        m1.setLargo(10.f);
        m1.setAlto(1.f);
        aula1.setMesa1(m1);

        Mesa m2 = new Mesa("", 0, 0.f, 0.f, 0f);
        m2.setTipo("tipo");
        m2.setPatas(4);
        m2.setAncho(10.f);
        m2.setLargo(10.f);
        m2.setAlto(1.f);
        aula1.setMesa2(m2);

        System.out.println(aula1.mostrar());
        
    }   
}

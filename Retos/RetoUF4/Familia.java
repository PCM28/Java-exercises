package Retos.RetoUF4;

public abstract class Familia {
    protected int numFamilia;
    protected String direccion;
    protected String poblacion;
    protected String provincia;

    public Familia(){
        this.numFamilia=123456789;
        this.direccion="Calle Alcalá";
        this.poblacion="Alcalá de Henares";
        this.provincia="Madrid";
    }

    public int getNumFamilia() { return numFamilia; }

    public void setNumFamilia(int numFamilia) { this.numFamilia=numFamilia; } 

    public String getDireccion() { return direccion;}

    public void setDireccion(String direccion) { this.direccion=direccion; }

    public String getPoblacion() { return poblacion; }

    public void setPoblacion(String poblacion) { this.poblacion=poblacion; }

    public String getProvincia() { return provincia; }

    public void setProvincia(String provincia) { this.provincia=provincia; }

    public abstract float imc();

    public void mostrar(){
        System.out.println("   número de familia = " + this.numFamilia);
        System.out.println("   dirección = " + this.direccion);
        System.out.println("   población = " + this.poblacion);
        System.out.println("   provincia = " + this.provincia);

    }

}

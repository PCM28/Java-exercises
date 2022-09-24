package POO.E2;

public class Silla {
    protected String tipo;
    protected int patas;
    protected float ancho;
    protected float largo;
    protected float alto;

    public Silla (String tipo, int patas, float ancho, float largo, float alto){
        this.tipo = tipo;
        this.patas = patas;
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getPatas() { return patas; }

    public void setPatas(int patas) { this.patas = patas; }

    public float getAncho() { return ancho; }

    public void setAncho(float ancho) { this.ancho = ancho; }

    public float getLargo() { return largo; }

    public void setLargo(float largo) { this.largo = largo; }

    public float getAlto() { return alto; }

    public void setAlto(float alto) { this.alto = alto; }

    public String mostrar() {
        return 
        "Mesa{ \"Tipo\"=\"" + this.getTipo() +
        "\", \"Patas\" =\"" + this.getPatas() + 
        "\", \"Ancho\" =\"" + this.getAncho() +
        "\", \"Largo\" =\"" + this.getLargo() + 
        "\", \"Alto\" =\"" + this.getAlto() +"\"}";
    }
}

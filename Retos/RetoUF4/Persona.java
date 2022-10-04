package Retos.RetoUF4;
public class Persona extends Familia{

    protected String nombre;
    protected int edad;
    protected String dni;
    protected String sexo;
    protected float peso;
    protected float altura;

    public Persona(){
        this.nombre="";
        this.edad=0;
        this.dni="";
        this.sexo="";
        this.peso=0.0f;
        this.altura=0.0f;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre=nombre; }
    
    public int getEdad() { return edad;}

    public void setEdad(int edad) { this.edad=edad;}

    public String getDni() { return dni; }

    public void setDni(String dni) { this.dni=dni; }

    public String getSexo() { return sexo; }

    public void setSexo(String sexo) { this.sexo=sexo; }

    public float getPeso() { return peso; }

    public void setPeso(float peso){ this.peso=peso; }

    public float getAltura() {return altura;}

    public void setAltura(float altura){ this.altura=altura; }

    @Override
    public float imc(){
        return this.peso/(this.altura*this.altura);
    }
    @Override
    public void mostrar(){
        System.out.println("Persona {");
        super.mostrar();
        System.out.println("   nombre: " + this.nombre);   
        System.out.println("   edad: " + this.edad);   
        System.out.println("   dni: " + this.dni);
        System.out.println("   sexo: " + this.sexo);
        System.out.println("   peso: " + this.peso + " kg");
        System.out.println("   altura: " + this.altura + " cm");
        System.out.printf("   imc: %.2f",imc());
        System.out.println("\n}");
    }
}
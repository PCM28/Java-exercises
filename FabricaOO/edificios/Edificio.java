package FabricaOO.Edificios;

import FabricaOO.Empresa.Empresa;

public abstract class Edificio extends Empresa{
    // Atributos
    private float anchura;
    private float altura;
    private float profundidad;
    private String funcionalidad;
    private String tipo;

    // Constructor
    public Edificio(){
        this.anchura = 0.0f;
        this.altura = 0.0f;
        this.profundidad = 0.0f;
        this.funcionalidad = "";
        this.tipo = "";
    }

    // Gets-Sets
    public float getAnchura () {return anchura;}

    public void setAnchura(float anchura) {this.anchura = anchura;}

    public float getAltura () {return altura;}

    public void setAltura(float altura) {this.altura = altura;}

    public float getProfundidad() {return profundidad;}

    public void setProfundidad(float profundidad) {this.profundidad = profundidad;}

    public String getFuncionalidad() {return funcionalidad;}

    public void setFuncionalidad(String funcionalidad) {this.funcionalidad = funcionalidad;}

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}

    // Métodos
    public float costePintura(float precio){
        float result = precio * this.anchura * this.altura * this.profundidad;
        if(precio<0) return -1.0f;
        else return result;
    }
    public float costePintura(String lado, float precio){
        float result = 0.0f;
        
        if(lado.equals("ladoaltura")) result = precio * this.anchura * this.altura;
        else if(lado.equals("ladoprofundidad")) result = precio * this.altura * this.profundidad;
        
        if(precio<0) return -1.0f;
        else return result;
    }

    public abstract String funcionalidadEdificio();
    
    @Override
    public String mostrarInfo(){
        return "\nEdificio{ \n \"anchura\" =\"" + this.anchura + 
                "\", \n\"altura\" = \"" + this.altura +
                "\", \n \"profundidad\" = \"" + this.profundidad +
                "\", \n \"funcionalidad\" = \"" + this.funcionalidad +
                "\", \n \"tipo\" = \"" + this.tipo + 
                "\", \n \"altura\" = \"" + this.altura + "\" \n}";
    }
}
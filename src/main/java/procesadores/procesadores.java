package Procesadores;

public class Procesadores {
    int nucleos;
    double consumo, velocidad;
    String nombre;
    public Procesadores() {}

    public Procesadores(int nucleos, double consumo, double velocidad, String nombre) {
        this.nucleos = nucleos;
        this.consumo = consumo;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodos personalizados
    //Imprimir datos

}

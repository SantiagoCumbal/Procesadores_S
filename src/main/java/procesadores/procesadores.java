package Procesadores;

public class procesadores {
    int nucleos;
    double consumo, velocidad;
    String nombre;
    public procesadores() {}

    public procesadores(int nucleos, double consumo, double velocidad, String nombre) {
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
    public void Imprimir_Datos(){
        System.out.println("Esta la clase principal en el primer nivel");
        System.out.println("Nucleos: " + nucleos);
        System.out.println("Consumo: " + consumo);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Nombre: " + nombre);
    }

}

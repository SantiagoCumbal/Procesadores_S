package Procesadores;

public class Procesadores_moviles extends procesadores{
    boolean optimizacion_energia;
    public Procesadores_moviles() {}
    public Procesadores_moviles(int nucleos, double consumo, double velocidad, String nombre, boolean optimizacion_energia) {
        super(nucleos, consumo, velocidad, nombre);
        this.optimizacion_energia = optimizacion_energia;
    }

    public boolean isOptimizacion_energia() {
        return optimizacion_energia;
    }

    public void setOptimizacion_energia(boolean optimizacion_energia) {
        this.optimizacion_energia = optimizacion_energia;
    }
    //Imprimir Datos
    @Override
    public void Imprimir_Datos() {
        System.out.println("Procesador de móvil");
    }
}

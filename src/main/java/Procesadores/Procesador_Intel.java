package Procesadores;

public class Procesador_Intel extends Procesadores_escritorio{
    boolean sensor_temperatura;
    public Procesador_Intel() {}
    public Procesador_Intel(int nucleos, double consumo, double velocidad, String nombre, String socket, boolean sensor_temperatura) {
        super(nucleos, consumo, velocidad, nombre, socket);
        this.sensor_temperatura = sensor_temperatura;
    }

    public boolean isSensor_temperatura() {
        return sensor_temperatura;
    }

    public void setSensor_temperatura(boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }

    //Mostrar datos
}

package Procesadores;

public class Procesador_AMD extends Procesadores_escritorio{
    boolean GraficosIntegrados;
    public Procesador_AMD() {}

    public Procesador_AMD(int nucleos, double consumo, double velocidad, String nombre, String socket, boolean graficosIntegrados) {
        super(nucleos, consumo, velocidad, nombre, socket);
        GraficosIntegrados = graficosIntegrados;
    }

    public boolean isGraficosIntegrados() {
        return GraficosIntegrados;
    }

    public void setGraficosIntegrados(boolean graficosIntegrados) {
        GraficosIntegrados = graficosIntegrados;
    }
}

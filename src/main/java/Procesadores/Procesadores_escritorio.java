package Procesadores;

public class Procesadores_escritorio extends procesadores {
    String socket;
    public Procesadores_escritorio() {}
    public Procesadores_escritorio(int nucleos, double consumo, double velocidad, String nombre,String socket) {
        super(nucleos, consumo, velocidad, nombre);
        this.socket = socket;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    //Imprimir
    @Override
    public void Imprimir_Datos(){
        super.Imprimir_Datos();
        System.out.println("Computador de escritorio");
    }

}

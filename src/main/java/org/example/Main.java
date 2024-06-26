package org.example;
import Procesadores.procesadores;
import Procesadores.Procesador_AMD;
import Procesadores.Procesadores_moviles;
import Procesadores.Procesador_Intel;
import Procesadores.Procesadores_escritorio;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Integrante 1
        Procesador_AMD p1 = new Procesador_AMD();
        Procesador_AMD p2 = new Procesador_AMD(8, 24.89, 25, "Radeon1650", "Destacado", true);

        //Integrante 2
        Procesadores_moviles p3 = new Procesadores_moviles();
        Procesadores_moviles p4 = new Procesadores_moviles(16, 25.66, 35, "Radeon6500",true);

        //2 Instancias integrante 1

        Procesador_Intel p5 = new Procesador_Intel();
        Procesador_Intel p6 = new Procesador_Intel(16, 25, 45, "Nvidia 1560 GTX","AM2+", true );

        Procesadores_escritorio p7 = new Procesadores_escritorio(11,34,60,"Intel core I7","LGAIntel");
        Procesadores_escritorio p10 = new Procesadores_escritorio(11,34,60,"Intel core I7","LGAIntel");

        //Imprimir datos
        p1.Imprimir_Datos();
        p2.Imprimir_Datos();
        p3.Imprimir_Datos();
        p4.Imprimir_Datos();
        p5.Imprimir_Datos();
        p6.Imprimir_Datos();
        p7.Imprimir_Datos();
        p10.Imprimir_Datos();




    }
}
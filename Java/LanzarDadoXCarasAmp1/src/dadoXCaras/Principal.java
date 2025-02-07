package dadoXCaras;

import utilidades.UtilidadesES;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int suma_tiradas = 0;
        int tirada_actual;
        int numCaras;
        int lanzamientos;
        Dado dadoX;
        Juego miJuego;
        UtilidadesES utilidades = new UtilidadesES();
        String nombreJugador;
        try {
            nombreJugador = utilidades.leeCadena("Introduzca su nombre ");


            numCaras = utilidades.leeEntero(nombreJugador+" Ingrese el numero de caras del dado: ");
            dadoX = new Dado(numCaras);

            lanzamientos = utilidades.leeEntero(nombreJugador+" Ingrese el numero veces que se tirará el dado: ");
            miJuego = new Juego(dadoX);
        /*
        for (int i = 1; i <= lanzamientos; i++) {
            tirada_actual = miJuego.jugar();
            System.out.println("Lanzamiento " + i + ": " + tirada_actual);
            suma_tiradas += tirada_actual;
        }
        */
            suma_tiradas = lanzarVariasVeces(miJuego, lanzamientos);
            System.out.println("\nSuma tiradas: " + suma_tiradas);
        } catch (IOException ioe) {
            System.out.println("Error en la toma de datos");
        } catch (InputMismatchException ime) {
            System.out.println("Error, tipo de dato incorrecto.");
        } finally {
            System.out.println("Y hasta aqui la ejecucion del programa.");
        }

    }

    public static int lanzarVariasVeces(Juego miJuego, int lanzamientos) {
        int suma_tiradas = 0;
        int tirada_actual;
        for (int i = 1; i <= lanzamientos; i++) {
            tirada_actual = miJuego.jugar();
            System.out.println("Lanzamiento " + i + ": " + tirada_actual);
            suma_tiradas += tirada_actual;
        }
        return suma_tiradas;
    }

}

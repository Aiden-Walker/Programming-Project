package hashmap.procesos;

import hashmap.beans.Jugador;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class JuegoDados {
    HashMap<String, Jugador> jugadores;
    Jugador ganador;
    public void ejecutar() {
        jugadores= crearJugadores(3,3,8);
        ganador=jugar(3,jugadores);
        //mostrar datos del jugador que ha obtenido mayor puntuación
        mostrarGanador(ganador);
        //System.out.println("El ganador es: "+ganador.getNombre()+" con una puntuación de: "+ganador.getPuntuacionTotalTiradas());
    }

    private void mostrarGanador(Jugador ganador) {
        System.out.println("Jugador ganador: "+ganador.getNombre());
        System.out.println("Con :"+ganador.getPuntuacionTotalTiradas()+" puntos.");
    }

    private HashMap<String, Jugador> crearJugadores(int nJugadores, int nDados, int nCaras) {
        jugadores=new HashMap<>();
        String nombre;
        Scanner teclado=new Scanner(System.in);
        for (int i = 0; i < nJugadores; i++) {
            System.out.println("Ingrese el nombre del jugador: ");
            nombre=teclado.nextLine();
            jugadores.put(nombre,new Jugador(nombre,nDados,nCaras));
        }
        return jugadores;
    }

    private Jugador jugar(int numeroTiradas, HashMap<String, Jugador> jugadores) {

        Map.Entry<String,Jugador> ganador = null;
        int totalPuntosTiradas=0;
        boolean primero = true;
        // Desarrollar los lanzamientos
        for(int i=0;i<numeroTiradas;i++){
            for(Map.Entry<String, Jugador> Entry : jugadores.entrySet()) {
                System.out.println("Jugador: "+Entry.getKey());
                System.out.println("total puntos acumulados: "+Entry.getValue().lanzarDados());
            }
        }

        for(Map.Entry<String, Jugador> jugador : jugadores.entrySet()) {
            if (primero) {
                ganador=jugador;
                primero=false;
            } else {
                if (jugador.getValue().getPuntuacionTotalTiradas()>ganador.getValue().getPuntuacionTotalTiradas()) {
                    ganador =jugador;
                }
            }
        }
        return ganador.getValue();
    }
}

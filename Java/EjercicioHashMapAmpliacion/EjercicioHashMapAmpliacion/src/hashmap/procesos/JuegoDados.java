package hashmap.procesos;

import hashmap.beans.Jugador;

import java.util.*;


public class JuegoDados {
    HashMap<String, Jugador> jugadores;
    Jugador ganador;
    public void ejecutar() {
        jugadores= crearJugadores(5,3,8);
        ganador=jugar(3,jugadores);
        //mostrar datos del jugador que ha obtenido mayor puntuación
        mostrarGanador(ganador,jugadores);
        //System.out.println("El ganador es: "+ganador.getNombre()+" con una puntuación de: "+ganador.getPuntuacionTotalTiradas());
    }

    private void mostrarGanador(Jugador ganador, HashMap<String, Jugador> jugadores) {
        int empates=-1;
        for(Map.Entry<String, Jugador> entry: jugadores.entrySet()){
            if(entry.getValue().getPuntuacionTotalTiradas()==ganador.getPuntuacionTotalTiradas()){
                empates++;
            }
        }
        if(empates>0){
            System.out.println("Hay un empate, no hay ganador");
        }else{
            System.out.println("Jugador ganador: "+ganador.getNombre());
            System.out.println("Con :"+ganador.getPuntuacionTotalTiradas()+" puntos.");
            mostrarTresGanadores(jugadores);
        }
    }

    private HashMap<String, Jugador> crearJugadores(int nJugadores, int nDados, int nCaras) {
        jugadores=new HashMap<>();
        String nombre;
        Scanner teclado=new Scanner(System.in);
        for (int i = 0; i < nJugadores; i++) {
            System.out.println("Ingrese el nombre del jugador: ");
            nombre=teclado.nextLine();
            if(jugadores.containsKey(nombre)){
                System.out.println("Este nombre ya esta escogido, escoja otro: ");
                i--;
            }else{
                jugadores.put(nombre,new Jugador(nombre,nDados,nCaras));
            }
        }
        return jugadores;
    }
    private void mostrarTresGanadores(HashMap<String, Jugador> jugadores) {
        ArrayList<Jugador>listaJugadores=new ArrayList<>(jugadores.values());
        Collections.sort(listaJugadores);
        for(int i=0;i<3;i++){
            System.out.println("El ganador nº"+(i+1)+" es "+listaJugadores.get(i).getNombre()+" con una puntuacion de "+listaJugadores.get(i).getPuntuacionTotalTiradas());
        }
        /*listaJugadores.sort(Comparator.comparing(Jugador::getPuntuacionTotalTiradas));
        ArrayList<Jugador>jugadoresOrdenados=new ArrayList<>();
        int index=3;
        jugadoresOrdenados.add(0,ganador);
        for(int j=1;j<3;j++) {
            jugadoresOrdenados.add(listaJugadores.get(index));
            index--;
        }
        for(int i=0;i<jugadoresOrdenados.size();i++) {
            System.out.println("El ganador numero "+(i+1)+" es "+jugadoresOrdenados.get(i).getNombre()+" con una puntuacion de "+jugadoresOrdenados.get(i).getPuntuacionTotalTiradas());
        }*/

    }

    private Jugador jugar(int numeroTiradas, HashMap<String, Jugador> jugadores) {
        Jugador ganador=null;
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
                ganador=jugador.getValue();
                primero=false;
            } else {
                if (jugador.getValue().getPuntuacionTotalTiradas()>ganador.getPuntuacionTotalTiradas()) {
                    ganador =jugador.getValue();
                }
            }
        }
        return ganador;
    }
}

package prtalentshowamp.beansProcesos;

import prtalentshowamp.beansDatos.Artista;

import prtalentshowamp.beansDatos.ListaPuntuacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import utilidades.UtilidadesES;

public class Jurado {
    private UtilidadesES utilidadesES;
    private ListaPuntuacion listaPuntuacion;
    
    Jurado() {
        this.utilidadesES = new UtilidadesES(new BufferedReader(new InputStreamReader(System.in)), System.out);
        this.listaPuntuacion = new ListaPuntuacion();
    }
    public int puntuar(Artista artista) throws IOException, NumberFormatException {
        int puntuacion = 0;
        try {
            puntuacion = Integer.parseInt(utilidadesES.pideCadena("Indica la puntuacion del artista: "));
            listaPuntuacion.addArtista(artista, puntuacion);
        } catch (NumberFormatException nfe) {
            throw new NumberFormatException("No has introducido un numero en la puntuacion del artista");
            } catch (IOException ioe) {
                throw new IOException("Hay un error de entrada y salida");
            }
        
        if (puntuacion < 0) {
            throw new NumberFormatException("Has introducido un numero negativo");
        } else {
            if (puntuacion > 10) {
                throw new NumberFormatException("Has introducido un numero mayor a 10");
            }
        }
        
        return puntuacion;
    }
    
    /**
     * Metodo que abstrae el proceso de ordenamiento de la lista de puntuacion.
     * Lo que hace el metodo es ordenar la lista que tiene el jurado de mayor a menor.
     * Ordena de mayor a menor
    **/
    public List<Map.Entry<Artista, Integer>> dameListaPuntuacionOrdenada() {
        Map<Artista, Integer> unsortedMap = getListaPuntuacion().getListaPuntuacion();
        List<Map.Entry<Artista,Integer>> list = new LinkedList<Map.Entry<Artista, Integer>>(unsortedMap.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Artista,Integer>>() {
            @Override
            public int compare(Map.Entry<Artista,Integer> o1, Map.Entry<Artista,Integer> o2) {
                // TODO Implement this method
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });
        return list;
    }
    
    public ListaPuntuacion getListaPuntuacion() {
        return listaPuntuacion;
    }
}

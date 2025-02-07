package prtalentshowamp.beansDatos;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/**
 * Nota: La estructura de colecciones en Java no considera a un mapa como una colección
 * en sí mismo. Pueden obtenerse vistas del mapa con el propósito, entre otros, de
 * recorrerlo. Hay tres vistas:
 * - conjunto de claves (Set keySet())
 * - colección de valores (Collection values())
 * - conjunto parejas clave/valor (Set entrySet())
 */
public class ListaPuntuacion {
    private HashMap<Artista,Integer> listaPuntuacion;
    private Iterator<Artista> iterador;
    private Iterator<Entry<Artista,Integer>> iterador2;
    private Set<Entry<Artista, Integer>> entradas;
    private Entry<Artista, Integer> entrada;
    
    public ListaPuntuacion() {
        this.listaPuntuacion = new HashMap<Artista,Integer>();
        this.iterador = null;
        this.iterador2 = null;
        this.entradas = null;
        this.entrada = null;
    }
    
    public void addArtista(Artista artista,Integer puntuacion) {
        listaPuntuacion.put(artista,puntuacion);
    }

    public HashMap<Artista, Integer> getListaPuntuacion() {
        return listaPuntuacion;
    }
   
    public Set<Entry<Artista, Integer>> getEntradas() {
        return entradas;
    }

    public Iterator<Artista> getIterador() {
        return iterador;
    }

    public Iterator<Entry<Artista, Integer>> getIterador2() {
        return iterador2;
    }

    public Entry<Artista, Integer> getEntrada() {
        return entrada;
    }
}

package prtalentshowamp.beansDatos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


/**
 * @author Juan Antonio Chamizo Sánchez
 * @version 1
 */
public class ListaArtistas {
    /**
     * @aggregation shared
     */
    private ArrayList<Artista> listaArtistas;

    public ListaArtistas() {
        this.listaArtistas = new ArrayList<Artista>();
    }

    public Artista getArtista(int posicion) {
        return listaArtistas.get(posicion);
    }

    public int getNumArtistas() {
        return (listaArtistas.size());
    }

    public void addArtista(Artista artista) {
        listaArtistas.add(artista);
    }

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }
}

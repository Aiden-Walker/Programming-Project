package prtalentshowamp.beansDatos;

import java.io.Serializable;

public class Malabares implements Serializable{
    /**
     * tipoMalabares es el tipo de instrumento o objeto que va a usar el malabarista en la
     * actuación.
     */
    private TipoMalabares tipoMalabares;
    /**
     * numMalabares es el numero de objetos del tipo malabares que usa el malabarista
     */
    private int numMalabares;
    
    Malabares(int numMalabares, TipoMalabares tipoMalabares) {
        this.numMalabares = numMalabares;
        this.tipoMalabares = tipoMalabares;
    }

    public int getNumMalabares() {
        return numMalabares;
    }

    public TipoMalabares getTipoMalabares() {
        return tipoMalabares;
    }
}
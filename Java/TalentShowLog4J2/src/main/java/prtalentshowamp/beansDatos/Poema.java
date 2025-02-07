package prtalentshowamp.beansDatos;

import java.io.Serializable;

public class Poema implements Serializable{
    private String nombrePoema;
    
    public Poema(String nombrePoema) {
        this.nombrePoema = nombrePoema;
    }

    public String getNombrePoema() {
        return nombrePoema;
    }
}

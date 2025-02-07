package prtalentshowamp.beansDatos;

import java.io.Serializable;

public class Cancion implements Serializable{
    
    private String nombreCancion;
    
    public Cancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }
}

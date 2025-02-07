package prtalentshowamp.beansDatos;


import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.io.Serializable;

import utilidades.UtilidadesES;
@SuppressWarnings("Serializable")
public abstract class Artista implements Serializable {
    
    protected String nombre;
    protected int edad;
    protected TipoArtista tipoArtista;
    
    public Artista(String nombre, int edad, TipoArtista tipoArtista) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoArtista = tipoArtista;
    }
    
    public abstract String saludar();
    public abstract String actuar();
    public abstract String despedirse();

    public TipoArtista getTipoArtista() {
        return tipoArtista;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    /**
     * Hemos decidido que no va haber mas de un artista que se llamen iguales, que tenga la
     * misma edad, mismo tipo de malabares
     * 
     * Implementación del método de comparación equals()
     */
    public boolean equals(Object art) {
            Artista artista = (Artista) art;
           //  System.out.println("Se emplea la comparación equals de Usuario");
            if      (
                            artista != null &&
                            this.nombre.equals(artista.nombre) &&
                            String.valueOf(this.edad).equals(artista.edad) &
                            this.tipoArtista.equals(artista.tipoArtista)
                    )
                    return true;
            else
                    return false;
    }
    
    /**
     * Implementación del método hashCode()
     */
    public int hashCode() {
           //  System.out.println("Se emplea hashCode del objeto Usuario");
            return (this.nombre+this.edad+this.tipoArtista).hashCode();
    }
}

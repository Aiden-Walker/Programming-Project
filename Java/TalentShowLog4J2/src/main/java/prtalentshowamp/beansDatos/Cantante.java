package prtalentshowamp.beansDatos;


public class Cantante extends Artista {
    
    private Cancion cancion;
    
    public Cantante(String nombre, int edad) {
        super(nombre, edad, TipoArtista.CANTANTE);
        this.cancion = new Cancion("Cancion Por Defecto");
    }
    
    public Cantante(String nombre, int edad, Cancion cancion) {
        super(nombre, edad, TipoArtista.CANTANTE);
        this.cancion = cancion;
    }
    public String saludar() {
        return "Hola a todos, me llamo "+nombre+", tengo "+edad+" años, soy cantante.";
    }

    public String actuar() {
        return "Ha interpretado la cancion llamada "+cancion.getNombreCancion();
    }

    public String despedirse() {
        return "Se ha despedido el cantante "+nombre;
    }
}

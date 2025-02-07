package prtalentshowamp.beansDatos;


public class Poeta extends Artista {
    
    private Poema poema;
    
    public Poeta(String nombre, int edad) {
        super(nombre, edad, TipoArtista.POETA);
        this.poema = new Poema("Poema Por Defecto"); 
    }
    public Poeta(String nombre, int edad, Poema poema) {
        super(nombre, edad, TipoArtista.POETA);
        this.poema = poema;
    }
  
    public String saludar() {
        return "Hola a todos, me llamo "+nombre+", tengo "+edad+" años, soy poeta.";
    }

    
    public String actuar() {
        return "Ha interpretado el poema llamado "+poema.getNombrePoema();
    }

    
    public String despedirse() {
        return "Se ha despedido el poeta "+nombre;
    }
}

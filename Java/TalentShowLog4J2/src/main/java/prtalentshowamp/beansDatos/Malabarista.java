package prtalentshowamp.beansDatos;


public class Malabarista extends Artista {

    private Malabares malabares;

    public Malabarista(String nombre, int edad) {
        super(nombre, edad, TipoArtista.MALABARISTA);
        this.malabares = new Malabares(2, TipoMalabares.MACHETES);
    }

    public Malabarista(String nombre, int edad, Malabares malabares) {
        super(nombre, edad, TipoArtista.MALABARISTA);
        this.malabares = malabares;
    }
    public String saludar() {
        return "Hola a todos, me llamo "+nombre+", tengo "+edad+" años, soy malabarista.";
    }

    public String actuar() {
        
        String tipoMalabaresString = "";
        TipoMalabares tipoMalabares = malabares.getTipoMalabares();
        int numMalabares = malabares.getNumMalabares();
        switch (tipoMalabares) {
        case BOLAS:
            if (numMalabares == 1) {
                tipoMalabaresString = "bola";
            } else {
                tipoMalabaresString = "bolas";
            }
            break;
        case MAZAS:
            if (numMalabares == 1) {
                tipoMalabaresString = "maza";
            } else {
                tipoMalabaresString = "mazas";
            }
            break;
        case AROS:
            if (numMalabares == 1) {
                tipoMalabaresString = "aro";
            } else {
                tipoMalabaresString = "aros";
            }
            break;
        case MACHETES:
            if (numMalabares == 1) {
                tipoMalabaresString = "bola";
            } else {
                tipoMalabaresString = "bolas";
            }
            break;
        case BASTONES:
            if (numMalabares == 1) {
                tipoMalabaresString = "baston";
            } else {
                tipoMalabaresString = "bastones";
            }
            break;
        case DIABOLOS:
            if (numMalabares == 1) {
                tipoMalabaresString = "diabolo";
            } else {
                tipoMalabaresString = "diabolos";
            }
            break;
        case SOMBREROS:
            if (numMalabares == 1) {
                tipoMalabaresString = "sombrero";
            } else {
                tipoMalabaresString = "sombreros";
            }
            break;
        }
        return "Ha interpretado la actuacion con "+numMalabares+" "+tipoMalabaresString;
    }

    public String despedirse() {
        return "Se ha despedido el malabarista "+nombre;
    }
}

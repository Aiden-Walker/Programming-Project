package prtalentshowamp.errores;

public class OpcionMenuIncorrecta extends Exception {
    public OpcionMenuIncorrecta() {
        super();
    }
    public OpcionMenuIncorrecta(String mensaje) {
        super(mensaje);
    }
}

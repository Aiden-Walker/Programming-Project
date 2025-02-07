package figurageometrica;

public class TiposFigurasGeometricas {
    public static final byte NULL = 0;
    public static final byte CUADRADO = 1;
    public static final byte RECTANGULO = 2;
    public static final byte TRIANGULO = 3;
    public static final byte CIRCULO = 4;
    public static final byte ROMBO = 5;

    public static byte setNombreFigura(String tipo){
        switch(tipo){
            case "cuadrado": return CUADRADO;
            case "rectangulo": return RECTANGULO;
            case "triangulo": return TRIANGULO;
            case "circulo": return CIRCULO;
            case "rombo": return ROMBO;
            default: return NULL;
        }
    }

    public static String getNombreFigura(FiguraGeometrica figuraGeometrica){
        String nombreFigura = null;
        switch(figuraGeometrica.getFigureType()){
            case CUADRADO: nombreFigura = "CUADRADO";break;
            case RECTANGULO: nombreFigura = "RECTANGULO";break;
            case TRIANGULO: nombreFigura = "TRIANGULO"; break;
            case CIRCULO: nombreFigura = "CIRCULO";break;
            case ROMBO: nombreFigura = "ROMBO";break;
        }
        return nombreFigura;
    }
}

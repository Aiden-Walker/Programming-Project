package figurageometrica;

public class ColorFigurasGeometricas {
    public static final byte NULL = 0;
    public static final byte ROJO = 1;
    public static final byte AZUL = 2;
    public static final byte VERDE = 3;
    public static final byte AMARILLO = 4;

    public static byte setColorFigura(String Color){
        switch(Color){
            case "rojo": return ROJO;
            case "azul": return AZUL;
            case "verde": return VERDE;
            case "amarillo": return AMARILLO;
            default: return NULL;
        }
    }

    public static String getColorFigura(FiguraGeometrica figuraGeometrica){
        String colorFigura = null;
        switch(figuraGeometrica.getColorfigura()){
            case ROJO: colorFigura = "ROJO";break;
            case AZUL: colorFigura = "AZUL";break;
            case VERDE: colorFigura = "VERDE"; break;
            case AMARILLO: colorFigura = "AMARILLO";break;
        }
        return colorFigura;
    }
}

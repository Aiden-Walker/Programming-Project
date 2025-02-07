package figurageometrica;

abstract public class FiguraGeometrica {
    private final byte figureType;
    private final byte colorFigura;

    public FiguraGeometrica(byte figureType, byte colorFigura) {
        this.figureType = figureType;
        this.colorFigura = colorFigura;
    }
    public byte getFigureType() {
        return figureType;
    }
    public byte getColorfigura(){
        return colorFigura;
    }
    abstract public double area();
    abstract public double perimetro();
}

package figurageometrica;

public class Cuadrado extends FiguraGeometrica
{
    private double lado;
    public Cuadrado(double lado, byte color){
        super(TiposFigurasGeometricas.CUADRADO, color); //Es lo primero siempre, siempre
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }

    @Override
    public double area() {
        return Math.pow(lado,2);
    }

    public double perimetro() {
        return (lado*4);
    }

}

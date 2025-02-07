package figurageometrica;

public class Rectangulo extends FiguraGeometrica
{
    private double lado1;
    private double lado2;
    public Rectangulo(double lado1, double lado2, byte color) {
        super(TiposFigurasGeometricas.RECTANGULO, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {

        return lado2;
    }

    public double area(){
        return lado1 * lado2;
    }

    public double perimetro(){
        return ((lado1*2) + (lado2*2));
    }
}

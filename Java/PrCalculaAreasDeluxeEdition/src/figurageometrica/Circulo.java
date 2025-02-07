package figurageometrica;

public class Circulo extends FiguraGeometrica
{
    private double radio;
    private double pi=Math.PI;
    public Circulo(double radio, byte color){
        super(TiposFigurasGeometricas.CIRCULO, color);
        this.radio=radio;
    }
    public double getRadio() {
        return radio;
    }

    @Override
    public double area(){
        return pi*Math.pow(radio,2);
    }

    public double perimetro(){
        return 2*pi*radio;
    }


}

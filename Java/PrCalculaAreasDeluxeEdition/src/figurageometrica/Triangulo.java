package figurageometrica;

public class Triangulo extends FiguraGeometrica
{
    private double base;
    private double altura;
    private double hipotenusa;

    public Triangulo(double base, double altura, byte color){
        super(TiposFigurasGeometricas.TRIANGULO, color);
        this.base = base;
        this.altura = altura;
        this.hipotenusa = Math.sqrt((base*base) + (altura*altura));
    }
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double area(){
        return (base*altura)/2;
    }

    public double perimetro(){
        return (hipotenusa+base+altura);
    }

}

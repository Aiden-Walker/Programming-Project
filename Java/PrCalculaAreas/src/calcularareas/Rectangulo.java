package calcularareas;

public class Rectangulo extends FiguraGeometrica
{
    private double lado1;
    private double lado2;
    public Rectangulo(double lado1,double lado2){
        super("Rectangulo");
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public double area(){
        return Math.pow(lado1,lado2);
    }
}

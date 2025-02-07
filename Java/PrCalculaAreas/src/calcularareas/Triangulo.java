package calcularareas;

public class Triangulo extends FiguraGeometrica
{
    private double base;
    private double altura;
    public Triangulo(double base, double altura){
        super("Triangulo");
        this.base = base;
        this.altura =altura;
    }
    public double area(){
        return base*altura;
    }

}

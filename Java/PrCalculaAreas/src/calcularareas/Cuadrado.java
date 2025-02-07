package calcularareas;

public class Cuadrado extends FiguraGeometrica
{
    private double lado;
    public Cuadrado(double lado){
    super("Cuadrado");//Es lo primero siempre, SIEMPRE!!!
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
    @Override
    public double area() {
        return Math.pow(lado,2);
    }
}

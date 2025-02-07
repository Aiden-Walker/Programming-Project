package calcularareas;

public class Circulo extends FiguraGeometrica
{
    private double radio;
    private double pi=3.14;
    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;
        this.pi = pi;
    }
    public double getRadio(){
        return radio;
}
public double getPi(){
        return pi;
}
    @Override
    public double area(){
       // System.out.println("Area : "+area);
         return pi*Math.pow(radio,2);
    };
}

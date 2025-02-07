package calcularareas;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras=new ArrayList<>();
        double area;
        Circulo circulo = new Circulo(10);
        Cuadrado cuadrado = new Cuadrado(12);
        Rectangulo rectangulo = new Rectangulo(8,5);
        Triangulo triangulo = new Triangulo(9,7);
        /*area=circulo.area();*/
        figuras.add(circulo);
       /* area=cuadrado.area();*/
        figuras.add(cuadrado);
       /* area=rectangulo.area();*/
        figuras.add(rectangulo);
        figuras.add(triangulo);
        for(FiguraGeometrica fg:figuras){
            System.out.println("Tipo figura: "+fg.getFigureType());
            System.out.println("Area es: "+fg.area());
        }
    }
}
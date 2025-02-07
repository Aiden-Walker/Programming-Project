package calcularareas;

import figurageometrica.ColorFigurasGeometricas;
import figurageometrica.FiguraGeometrica;
import figurageometrica.TiposFigurasGeometricas;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    private Scanner teclado;
    public Aplicacion() {
        teclado = new Scanner(System.in);
    }
    public void ejecutar() {
        // Declaración variables
        ArrayList<FiguraGeometrica> figuras = new ArrayList();
        TomaDatosFigurasGeo toma = new TomaDatosFigurasGeo();
        byte tipoFigura;
        FiguraGeometrica figuraGeometrica;
        // Pedir los datos de las figuras
        for (int i=0; i<6; i++) {
            tipoFigura = pideTipoFigura();
            figuraGeometrica = toma.obtenerFiguraGeometrica(tipoFigura);
            figuras.add(figuraGeometrica);
        }
        // Mostrar resultados cálculos
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Tipo de figura: "+ TiposFigurasGeometricas.getNombreFigura(figura));
            System.out.println("Area: "+figura.area());
            System.out.println("Perimetro: "+figura.perimetro());
            System.out.println("Color: "+ ColorFigurasGeometricas.getColorFigura(figura));
        }
    }

    private byte pideTipoFigura() {
        byte tipoFigura=0;

        System.out.println("Introduzca el tipo de figura");
        System.out.println("1-Cuadrado\n2-Rectangulo\n3-Triangulo\n4-Circulo\n5-Rombo");
        tipoFigura = teclado.nextByte();
        return tipoFigura;
    }
}

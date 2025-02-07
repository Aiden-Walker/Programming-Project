package calcularareas;

import figurageometrica.Cuadrado;
import figurageometrica.FiguraGeometrica;
import figurageometrica.TiposFigurasGeometricas;

import java.util.Scanner;

public class TomaDatosFigurasGeo {
    private Scanner teclado;

    public TomaDatosFigurasGeo() {
        teclado = new Scanner(System.in);
    }

    public FiguraGeometrica obtenerFiguraGeometrica(byte tipoFigura) {
        FiguraGeometrica figuraGeometrica = null;
        switch (tipoFigura) {
            case TiposFigurasGeometricas.CUADRADO: figuraGeometrica = obtenerCuadrado();break;
            //case TiposFigurasGeometricas.CIRCULO: figuraGeometrica = obtenerCirculo();break;
            //case TiposFigurasGeometricas.RECTANGULO: figuraGeometrica = obtenerRectangulo();break;
            //case TiposFigurasGeometricas.TRIANGULO: figuraGeometrica = obtenerTriangulo();break;
            //case TiposFigurasGeometricas.ROMBO: figuraGeometrica = obtenerRombo();break;
        }
        return figuraGeometrica;
    }

    private FiguraGeometrica obtenerCuadrado() {
        FiguraGeometrica figuraGeometrica = null;
        double lado;
        byte color;
        System.out.print("Introduzca valor del lado: ");
        lado = teclado.nextDouble();
        System.out.print("Introduzca valor del color: ");
        color = teclado.nextByte();
        figuraGeometrica = new Cuadrado(lado, color);
        return figuraGeometrica;
    }
}

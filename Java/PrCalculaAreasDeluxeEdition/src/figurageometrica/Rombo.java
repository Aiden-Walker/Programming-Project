package figurageometrica;

public class Rombo extends FiguraGeometrica {
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor, byte color) {
        super(TiposFigurasGeometricas.ROMBO, color); //Es lo primero siempre, siempre
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    @Override
    public double area() {
        return ((diagonalMayor * diagonalMenor)/2);
    }

    public double perimetro() {
        return Math.sqrt(((diagonalMayor/2) * (diagonalMayor/2)) + ((diagonalMenor/2) * (diagonalMenor)/2)) *4;
    }
}

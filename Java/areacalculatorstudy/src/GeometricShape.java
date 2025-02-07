abstract class GeometricShape {
    protected double area;
    /* Maybe the program needs to know which kind of shape it is before doing anything? */
    private final String FigureType;
    public GeometricShape(String FigureType){this.FigureType = FigureType;}
}
package calcularareas;

abstract class FiguraGeometrica {
    //protected double area;
    private final String figureType;
    public FiguraGeometrica(String figureType){
        this.figureType = figureType;
    }
    public String getFigureType(){
        return figureType;
    }
    abstract public double area();
    abstract public String colour();
}

package hashmap.beans;

public class Jugador {
    private String nombre;
    private Cubilete cubilete;
    private int puntuacionTotalTiradas;

    public Jugador(String nombre, int numDados, int numCaras ) {
        this.nombre = nombre;
        cubilete = new Cubilete(numDados, numCaras);
        puntuacionTotalTiradas = 0;
    }
    public int getPuntuacionTotalTiradas() {
        return puntuacionTotalTiradas;
    }
    public String getNombre() {
        return nombre;
    }
    public int lanzarDados() {
        puntuacionTotalTiradas =puntuacionTotalTiradas+ cubilete.lanzarDados();
        return puntuacionTotalTiradas;
    }
}

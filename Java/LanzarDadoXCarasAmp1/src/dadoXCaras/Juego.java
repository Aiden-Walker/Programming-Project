package dadoXCaras;

public class Juego {
    private Dado dado;
    public Juego (Dado dado) {
        this.dado = dado;
    }
    public int jugar(){
        return (int) (Math.random() * dado.getNumCaras() + 1);
    }
}

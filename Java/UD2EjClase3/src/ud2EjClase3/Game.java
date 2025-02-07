package ud2EjClase3;

public class Game {
    private Dice dice;
    public Game(Dice dice) {
        this.dice = dice;
    }
    public int play(){
        return (int) (Math.random() * dice.getNumFaces() + 1);
    }
}

package dice;

public class Game {
    private Dice dice;
    public Game() {
        dice = new Dice();
    }
    public Game(Dice dice) {
        this.dice = dice;
    }
    public int play() { //If a class has a property and parameter of the same name it will prioritise using the parameter
        int result;
        result= (int) (Math.random()* dice.getNumSides()+1);
        return result;
        // Alternate code
        // return (int) (Math.random()* dice.getNumSides()+1);
    }
}

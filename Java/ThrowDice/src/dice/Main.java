package dice;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        //Game game = new Game(dice);
        Game game = new Game();
        System.out.println("Result: "+game.play());
    }
}

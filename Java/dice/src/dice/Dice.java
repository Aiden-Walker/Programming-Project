package dice;

public class Dice {
    public static void main(String[] args) {
        Dicemethod dicemethod = new Dicemethod();
        int rollresult;
        int maxNum = 6;
        System.out.println("Random number between 1 and "+maxNum+" :"+randomNumbers.randomNumber(maxNum));

        rollresult = dicemethod.diceresult();
        System.out.println(rollresult);
    }
}

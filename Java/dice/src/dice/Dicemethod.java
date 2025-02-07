package dice;

import java.util.Random;

public class Dicemethod {
    public Dicemethod() {
    }
    public int diceresult() {
        Random diceroll = new Random();
        int randomNumber = diceroll.nextInt(6) + 1;
        return randomNumber;
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Introduce a number: ");
        double input = keyboard.nextInt();
        double numbers =0;
        double average = 0;
        double lesser = 0;
        double greater = 0;
        while(input>0) {
            if (numbers == 0){
                lesser = input;
                greater = input;
            }
            numbers++;
            average = average+input;
            if (input>greater) {
                greater = input;
            }
            if (input<lesser) {
                lesser = input;
            }
            System.out.printf("Introduce a number: ");
            input = keyboard.nextInt();
        }
        if (numbers >0) {
            average = average / numbers;
            System.out.println("The average number is: " + average + " The lesser number is: " + lesser + " The greater number is: " + greater);
        }
        else {
            System.out.println("No numbers were introduced");
        }
    }
}
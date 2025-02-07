import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // This program reads positive numbers until a negative number or 0 are introduced
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Scanner keyboard = new Scanner(System.in);// to see how IntelliJ IDEA suggests fixing it.
        int numbersasked = 3;
        int counter = 0;
        int sum = 0;
        int product = 1;
        while (counter <numbersasked) {
            System.out.printf("Introduce a number: ");
            int input = keyboard.nextInt();
            sum = sum + input;
            product = product * input;
            ++counter;
        }
        System.out.println("The sum of the three numbers is: "+ sum);
        System.out.println("And the product of the three numbers is: " + product);
    }
}
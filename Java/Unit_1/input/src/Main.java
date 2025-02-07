import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Scanner keyboard = new Scanner(System.in);// to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Introduce a positive number: ");
        int input = keyboard.nextInt(); //Reads an input from the keyboard and stores it in "input"
        if (input > 0) {
            System.out.println("The input is: " + input);
        }
        else {
            System.out.println("Error: invalid number");
        }
    }
}
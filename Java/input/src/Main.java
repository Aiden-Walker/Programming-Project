import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // This program reads positive numbers until a negative number or 0 are introduced
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Scanner keyboard = new Scanner(System.in);// to see how IntelliJ IDEA suggests fixing it.

        System.out.printf("Introduce a positive number: ");
        int multiple=1;
        int input = keyboard.nextInt(); //Reads an input from the keyboard and stores it in "input"
       while (input > 0) {
           do {
               int result = input * multiple;
               System.out.println("" + input + "*" + multiple + " = " + result);
               ++multiple;
           } while(multiple <= 10);
           multiple=1;
           System.out.printf("Introduce another positive number: ");
           input = keyboard.nextInt();
       }
       System.out.println("End of program");
    }
}
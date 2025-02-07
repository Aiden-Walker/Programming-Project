import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // This program reads positive numbers until a negative number or 0 are introduced
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Scanner keyboard = new Scanner(System.in);// to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Introduce the base of your triangle: ");
        int base = keyboard.nextInt(); //Reads an input from the keyboard and stores it in "input"
        System.out.printf("Introduce the height of your triangle: ");
        int height = keyboard.nextInt();
        if (base <0 || height < 0) {
            System.out.println("The numbers you introduced were invalid");
        }
        else {
            System.out.println("The area of your triangle is: " + (base * height/2));
        }
    }
}
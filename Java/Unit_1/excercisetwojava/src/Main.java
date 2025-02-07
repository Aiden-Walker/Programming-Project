import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Introduce a number: ");
        int input = keyboard.nextInt();//The printf sets the value
        while (input <0) {
            System.out.println("Invalid number");
            System.out.printf("Introduce another number: ");
            input = keyboard.nextInt();
        }
        System.out.println("The number is correct, shutting down");
    }
}
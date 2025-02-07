import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x;
        int solution;
        int nega_x;
        int square;
        int data;
        int nega_solution;
        System.out.printf("Please type a positive number:");
        int a = keyboard.nextInt();
        System.out.printf("Please type another positive number:");
        int b = keyboard.nextInt();
        System.out.printf("Please type a final positive number:");
        int c = keyboard.nextInt();
        data = (b*b)-4*a*c;
        square = (int) Math.sqrt(data);
        x = (-b + square) / (2*a);
        nega_x = (-b - square) / (2*a);
        if (x >= 0 && nega_x >=0) {
            System.out.println("The result has 2 squares");
        } else if (x >=0 || nega_x >=0) {
            System.out.println("The result has 1 square");
        }
        else {
            System.out.println("The result has no square");
        }
        solution = a*(x*x)+(b*x)+c;
        nega_solution = a*(nega_x*nega_x)-(b*nega_x)-c;
        System.out.println("The positive result is: " + solution + " And the negative result is: " + nega_solution);
    }
}

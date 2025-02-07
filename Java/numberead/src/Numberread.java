import java.util.Scanner;
public class Numberread {
    public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                System.out.printf("Please introduce a number:");
                int number = keyboard.nextInt();
                while (number < 0) {
                    System.out.printf("The number" + number + " is lesser than 0, please introduce another number: ");
                    number= keyboard.nextInt();
                }
            }
        }

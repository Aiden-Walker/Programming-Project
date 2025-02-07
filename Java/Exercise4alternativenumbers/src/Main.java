import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // This program reads positive numbers until a negative number or 0 are introduced
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Scanner keyboard = new Scanner(System.in);// to see how IntelliJ IDEA suggests fixing it.
        int n1;
        int n2;
        int n3;
        System.out.printf("Introduce a number: ");
        n1 = keyboard.nextInt();
        System.out.printf("Introduce another number: ");
        n2 = keyboard.nextInt();
        System.out.printf("Introduce a final number: ");
        n3 = keyboard.nextInt();
        System.out.println("The sum of the three numbers is: "+ (n1 + n2 + n3));
        System.out.println("The product of the three numbers is: "+ n1 * n2 * n3);
            }
        }
import java.util.Scanner;
public class multiplicationtablexcercise4 {
        public static void main(String[] args){
            Scanner keyboard = new Scanner(System.in);
            System.out.printf("Please introduce your first number: ");
            int num1 = keyboard.nextInt();
            System.out.printf("Please introduce your second number: ");
            int num2 = keyboard.nextInt();
            System.out.printf("Please introduce your third number: ");
            int num3 = keyboard.nextInt();
            System.out.println("Now, the sum of all three numbers is: "+(num1+num2+num3)+" And the product of all three numbers is: "+(num1*num2*num3));
        }
    }

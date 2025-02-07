import java.util.Scanner;
public class Tablamultiplicarejercicio1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Introduce a number by keyboard:");
        int number = keyboard.nextInt();
        while (number>0) {
            for (int multcount = 0; multcount <= 10; multcount++) {
                System.out.println(number * multcount);
            }
            System.out.printf("Introduce another number by keyboard:");
            number = keyboard.nextInt();
        }
        }
    }
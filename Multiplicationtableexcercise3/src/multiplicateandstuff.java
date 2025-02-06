import java.util.Scanner;
public class multiplicateandstuff {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please introduce the number of multiplications you wanna do: ");
        int multcounter = keyboard.nextInt();
        System.out.println ("Now please introduce the number you wanna multiply for: ");
        int number = keyboard.nextInt();
        if (multcounter>0&&number>0){
            for (int timesmultiplied=0; timesmultiplied<=multcounter; timesmultiplied++) {
                System.out.println(number * timesmultiplied);
            }
            }
        }
    }

import java.util.Scanner;
public class triangle_area {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please introduce the base of your triangle: ");
        int base = keyboard.nextInt();
        System.out.printf("Please introduce the height of your triangle: ");
        int height = keyboard.nextInt();
        if (height>0&&base>0){
            System.out.println("The area of your triangle is: "+(base*height));
        } else {
            System.out.println("The program failed because of a misinput of the user");
        }
    }
}

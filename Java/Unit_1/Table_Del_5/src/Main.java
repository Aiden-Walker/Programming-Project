//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 4;
        int counter = 1;
        int result;
                // Defining variables for the number 4 multiplication table along with giving them values
        do {
            result = number*counter; //Making the multiplication
            System.out.println(number + "*" + counter + " = " + result);
            counter++;
        } while (counter <=10);
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Which day of the week is it (remember, the program is case sensitive!: ");
        int weekday = 3;
        System.out.println("How many tickets do you want to buy?: ");
        int ticket_amount = 5;
        if (weekday == 1 || weekday == 3) {
            int ticket_price = 5;
            int total_payout = ticket_amount * ticket_price;
            System.out.print("Today tickets are discounted by 2 €, so, your total purchause will be: ");
            System.out.println(total_payout);
        }
        else {
            int ticket_price = 7;
            int total_payout = ticket_amount * ticket_price;
            System.out.print("Your total purchause will be: ");
            System.out.println(total_payout);
        }
    }
}
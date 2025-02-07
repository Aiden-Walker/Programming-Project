<?php
echo "Which day of the week is it (remember, the program is case sensitive!: ";
$weekday = 3;
echo "How many tickets do you want to buy?: ";
$ticket_amount = 5;
if ($weekday == "Monday" || $weekday == "Wednesday") {
    $ticket_price = 5;
	echo "Today tickets are discounted by 2 €, so, your total purchause will be: ", $ticket_amount * $ticket_price;
}
else {
    $ticket_price = 7;
	echo "Your total purchause will be: ", $ticket_amount * $ticket_price;
}
?>
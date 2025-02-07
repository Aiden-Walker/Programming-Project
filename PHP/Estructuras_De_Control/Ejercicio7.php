<?php
$ticket_price = 7;
$weekday = 5;
$ticket_amount = 2;

if ($weekday == 1 || $weekday == 3) {
	echo "Today tickets are discounted by 2 €, so, your total purchause will be: ", $ticket_amount * ($ticket_price - 2);
}
else {
	echo "Your total purchause will be: ", $ticket_amount * $ticket_price;
}
?>
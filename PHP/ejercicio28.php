<?php
$weekday = "friday";
$entry_price = 0;
$amount_of_entries = 5;
$total = $entry_price * $amount_of_entries;
switch ($weekday) {
    case "monday":
    case "wednesday":
        $entry_price = 4;
        break;
    case "tuesday":
    case "thursday":
        $entry_price = 6;
        break;
    case "friday":
    case "saturday":
    case "sunday":
        $entry_price = 8;
        break;
    default:
        echo "I don't know what you're typing";
        break;
}
$total = $entry_price * $amount_of_entries;
echo "The total cost of your purchase will be:   $total";
?>
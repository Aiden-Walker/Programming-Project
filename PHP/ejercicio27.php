<?php
$weekday = 9;
$entry_price;
$amount_of_entries = 5;
$total = $entry_price * $amount_of_entries;
switch ($weekday) {
    case 1:
    case 3:
        $entry_price = 4;
        break;
    case 2:
    case 4:
        $entry_price = 6;
        break;
    case 5:
    case 6:
    case 7:
        $entry_price = 8;
        break;
    default:
        echo "I don't know what you're typing";
        break;
}
$total = $entry_price * $amount_of_entries;
echo "The total cost of your purchase will be:   $total";
?>
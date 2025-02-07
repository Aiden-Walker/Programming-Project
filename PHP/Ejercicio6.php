<?php
$article = 11.90;

$bought_amount = 6;

$payout = $article * $bought_amount;

if ($bought_amount <=10) {
	$payout = $payout * 0.95;
}
echo "The total price of your purchause is ",$payout;
?>
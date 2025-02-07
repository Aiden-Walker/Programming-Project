<?php
$kilometers = 440;
$price = 0;
$family_card = true;
$first_class = false;
for ($i = 0; $i < $kilometers; $i++) {
    if ($kilometers < 100) {
        $price = $price + 0.25;
    }
    elseif ($kilometers <= 300 && $kilometers >= 100) {
        $price = $price + 0.20;
    }
    elseif ($kilometers > 300) {
        $price = $price + 0.15;
    }
    else {
        echo "I don't know how many kilometers you introduced";
    }
}
if ($first_class == true) {
    $price = $price + (0.10 * $price);
}
elseif ($family_card == true && $first_class = false) {
    $price = $price - (0.15 * $price);
}
echo "The price of your journey will be: ", $price;
?>
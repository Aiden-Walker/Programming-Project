<?php
$kilometers = 440;
$bunk_bed = true;
$price = 0;
for ($i = 0; $i < $kilometers; $i++)
{
 $price = $price + 0.10;
}
if ($bunk_bed == true ) {
    $price = $price + 16;
}
echo "The price of your journey will be: ", $price;
?>
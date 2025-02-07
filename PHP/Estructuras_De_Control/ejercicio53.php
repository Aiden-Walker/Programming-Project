<?php
$integer=10;
$sum = 0;
for ($i = $integer; $i <= ($integer+19); $i++) {
    if ($i == ($integer+19)) {
        echo "$i ";
    }
    else {
    echo "$i + ";
    }
    $sum += $i;
}
echo "= $sum";
?>
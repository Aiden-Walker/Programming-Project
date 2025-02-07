<?php
$integer=6;
$factorial = 1;
for ($i = 1; $i <= $integer; $i++) {
    $factorial = $factorial * $i;
}
echo "!$integer = ";
for($i= 1;$i<=$integer;$i++){
    if ($i == $integer) {
        echo "$i";
    }
    else {
    echo "$i x ";
    }
}
echo "= $factorial";
?>
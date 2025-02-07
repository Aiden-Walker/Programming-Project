<?php
$num1 = 4;
$num2 = 5;
$num3 = 3;
if ($num1 < $num2 && $num1 < $num3 && $num2 < $num3){
    echo "$num1,$num2,$num3";
}
elseif ($num1 < $num2 && $num1 < $num3 && $num3 < $num2){
    echo "$num1,$num3,$num2";
}
elseif ($num2 < $num1 && $num2 < $num3 && $num1 < $num3){
    echo "$num2,$num1,$num3";
}
elseif ($num2 < $num1 && $num2 < $num3 && $num3 < $num1){
    echo "$num2,$num3,$num2";
}
elseif ($num3 < $num1 && $num3 < $num2 && $num1 < $num2){
    echo "$num3,$num1,$num2";
}
elseif ($num3 < $num1 && $num3 < $num2 && $num2 < $num1){
    echo "$num3,$num2,$num1";
}
?>
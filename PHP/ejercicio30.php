<?php
$num1 = 10;
$num2 = 100;
$operation = "SUM";
switch ($operation) {
    case "SUM":
        echo "You have chosen a sum, the sum of your numbers is: ", $num1+$num2;
        break;
    case "SU":
        echo "You have chosen a substraction, the substraction of your numbers is: ", $num1-$num2;
    case "M":
        echo "You have chosen a multiplication, the multiplication of your numbers is: ", $num1*$num2;
        break;
    case "D":
        echo "You have chosen a division, the division of your numbers is: ", $num1/$num2;
        break;
    default:
        echo "I don't know what you're typing";
        break;
}
echo nl2br("\n");
echo "End of program";
?>
<?php
$grade = 9;
switch ($grade) {
    case 0:
    case 1:
    case 2:
        echo "Your grade is very insufficient";
        break;
    case 3:
    case 4:
        echo "Your grade is insufficient";
        break;
    case 5:
        echo "Your grade is sufficient";
    case 6:
        echo "Your grade is decent";
    case 7:
    case 8:
        echo "Your grade is notable";
        break;
    case 9:
    case 10:
        echo "Your grade is excellent";
    default:
        echo "I don't know what you're typing";
        break;
}
echo nl2br("\n");
echo "End of program";
?>
<?php
$grade_systems = 7;
$grade_markup = 7;
$grade_programming = 7;
$grade_economy = 7;
$average = (($grade_economy + $grade_markup + $grade_programming + $grade_systems) / 4);
if ($grade_economy < 5 || $grade_markup < 5 || $grade_programming < 5 || $grade_systems < 5) {
    echo "You have failed since you have failed one or more subjects";
}
elseif ($average < 7) {
    echo "Global Grade = Enough";
}
elseif ($average < 9) {
    echo "Global Grade = Notable";
}
elseif ($average >=10) {
    echo "Global Grade = Outstanding";
}
else {
    echo "I don't know what you typed";
}
?>
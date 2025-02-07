<?php
$students=5;
$total_grade = 0;
$average = 0;
$not_evaluated = 0;
for ($i= 0; $i < $students; $i++) {
    $random_number = rand(0,11) - 1;
    if ($random_number >= 0){
    $total_grade += $random_number;
    }
    else {
        $not_evaluated++;
    }
    echo nl2br ("Grade of Student ". $i+1 ." =$random_number" . "\n");
}
$average = $total_grade / ($students-$not_evaluated);
echo "the number of evaluated students is: ". ($students-$not_evaluated) ." " ;
echo "The average of the evaluated students is: $average";
?>
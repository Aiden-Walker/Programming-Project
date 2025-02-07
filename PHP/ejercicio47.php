<?php
$number = 0;
$sumarand = 1;
for ($i=0; $i < 500; $i++) { 
    $number += $sumarand;
    $sumarand++;
    echo "$number ";
}
?>
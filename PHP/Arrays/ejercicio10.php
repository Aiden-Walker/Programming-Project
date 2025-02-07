<?php
$nombres = ["Maria", "Carlos", "Ana", "Pedro"];
$aux = "Carlos";
$esta1 = false;
for ($i = 0; $i < count($nombres); $i++) {
    $n = $nombres[$i];
    if ($n == $aux){
        $esta1 = true;
        break;
    }
}
    if ($esta1) {
        echo "$aux esta en el array";
    }
    else {
        echo " $aux NO esta en el array";
    }
?>
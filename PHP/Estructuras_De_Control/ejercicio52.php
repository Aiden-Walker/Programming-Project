<?php
$caps = false;
if ($caps) {
    for ($char = ord("A"); $char <= ord("Z"); $char++) {
        echo chr($char) . "\n";
}
}
else {
    for ($char = ord("a"); $char <= ord("z"); $char++) {
        echo chr($char) . "\n";
}
}
?>
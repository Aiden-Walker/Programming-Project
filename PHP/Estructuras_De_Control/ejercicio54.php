<?php
$multiple=1;
$number = 12;
$result = 0;
for ($i = 0; $i < 10; $i++) {
echo nl2br("" . $number . "*" . $multiple . " = " . ($number*$multiple) . "\n");
$multiple++;
}
?>
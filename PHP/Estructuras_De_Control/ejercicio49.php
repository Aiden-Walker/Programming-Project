<?php
$inferior_limit = 5;
$upper_limit = 11;
if ( $inferior_limit >= $upper_limit ) {
    echo "the inferior limit cannot be superior or equal to the upper limit";
}
else {
    for ( $i = $inferior_limit; $i <= $upper_limit; $i++ ) {
        if ($i == $upper_limit) {
            echo "$i";
        }
        else {
        echo "$i, ";
        }
    }
}
?>
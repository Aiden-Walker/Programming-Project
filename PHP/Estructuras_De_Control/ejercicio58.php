<?php 
$column = 8; // Define the size of the square 
$row = 0;  // Initialize the row counter 
$par_check = 0;
while ($row < $column) { 
    $col = 0; // Initialize the column counter 
    while ($col < $column) {
        if (($row + $par_check) % 2 == 0) {
        echo "B "; // Print an asterisk followed by a space
        }
        else {
            echo "N ";
        } 
        $col++;    // Increment the column counter 
        $par_check++;
    } 
    echo nl2br("\n"); // Move to the next line after finishing a row 
    $row++;    // Increment the row counter 
} 
?> 
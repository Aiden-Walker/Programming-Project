<?php 
$size = 5; // Define the size of the square 
$row = 0;  // Initialize the row counter 
 
while ($row < $size) { 
    $col = 0; // Initialize the column counter 
    while ($col < $size) { 
        echo "* "; // Print an asterisk followed by a space 
        $col++;    // Increment the column counter 
    } 
    echo nl2br("\n"); // Move to the next line after finishing a row 
    $row++;    // Increment the row counter 
} 
?> 
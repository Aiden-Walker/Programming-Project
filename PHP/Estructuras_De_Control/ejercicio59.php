<?php 
$column = 8; // Define the size of the square 
$row = 0;  // Initialize the row counter 
$par_check = 0;
$bishop_row = 3; // Bishop's position (row)
$bishop_col = 5; // Bishop's position (column)

while ($row < $column) { 
    $col = 0; // Initialize the column counter 
    while ($col < $column) {
        // If the current position is the bishop's position
        if ($col == $bishop_col && $row == $bishop_row) {
            echo "A "; // Bishop's position
        } 
        // Mark all diagonal positions where the bishop can move
        elseif (abs($row - $bishop_row) == abs($col - $bishop_col)) {
            echo "* "; // '*' marks the bishop's potential moves
        }
        // Alternating white and black squares
        elseif (($row + $par_check) % 2 == 0) {
            echo "B "; // White square
        }
        else {
            echo "N "; // Black square
        } 
        $col++;    // Increment the column counter 
        $par_check++;
    } 
    echo nl2br("\n"); // Move to the next line after finishing a row 
    $row++;    // Increment the row counter
} 
?>
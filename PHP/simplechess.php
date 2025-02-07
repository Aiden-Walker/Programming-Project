<?php
$size = 8;
for ($row = 0; $row < $size; $row++) {
    for ($col = 0; $col < $size; $col++) {
        $chessPiece[$row][$col] = " ";
    }
}
$chessPiece[3][3] = "Q";
$chessPiece[5][5] = "B";
$chessPiece[0][1] = "KN";
$chessPiece[3][7] = "R";
$chessPiece[6][4] = "P";
$chessPiece[0][4] = "KI";
//Top right diagonal movement
while ($row >= 0) {
    $row--;
    $col++;
    if ([$row][$col] != " "){
        return [$row,$col];
    }
}
//Top left diagonal movement
while ($row < 8) {
    $row--;
    $col--;
    if ([$row][$col] != " "){
        return [$row,$col];
    }
}
//Bottom right diagonal movement
while ($row >= 0) {
    $row++;
    $col++;
    if ([$row][$col] != " "){
        return [$row,$col];
    }
}
//Bottom left diagonal movement
while ($row < 8) {
    $row++;
    $col--;
    if ([$row][$col] != " "){
        return [$row,$col];
    }
}
//Down straight movement
while ($row < 8) {
    $row++;
    if ([$row][$col] != " "){
        return [$row,$col];
    }
}
//Upwards straight movement
while ($row >= 0) {
    $row--;
    if ([$row][$col] != " "){
        return [$row,$col];
    }
}
//Left straight movement
while ($col >= 0) {
    $col--;
    if ([$row][$col] != " "){
        return [$row,$col];
    }
}
//Right straight movement
while ($col < 8) {
    $col++;
    if ([$row][$col] != " "){
        return [$row,$col];
    }
}
echo "Hi guys"
?>
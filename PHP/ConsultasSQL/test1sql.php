<?php
    $host = 'localhost';
    $user = 'root';
    $password = 'root';
    $databaseName = 'prueba1';
    function openConnection($host,$user,$password,$databaseName){
        $connection = new mysqli($host,$user,$password,$databaseName);
    }
    openConnection($host,$user,$password,$databaseName);
    if ($connection->connect_error){
        die("Failed Connection: " . $connection->connect_error);
    }
    echo "Correct Connection.";
?>
<?php
    function openConnection() {
        $servername = "fdb33.awardspace.net";
        $username = "3976694_cs4125";
        $password = "ThisIsAPassword1";
        $dbname = "3976694_cs4125";

        // Create connection
        $conn = new mysqli($servername, $username, $password);

        // Check connection
        if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
        }
        echo "Connected successfully";
    }
    
    function closeConnection($conn) {
        msqli_close($conn);
    }
?>

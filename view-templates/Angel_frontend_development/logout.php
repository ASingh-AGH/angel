<?php 
ob_start();
session_start();
session_destroy();
header("Location: index.php?logout=true");
ob_flush();
?>
<!DOCTYPE HTML>
<html>
<head>
<title>Galeria</title>
</head>
<body>
<div id='obraz' style='text-align:center'>
<?php
//!!!!!!!!!!!!!!!!!!!!!!!!!
//Mocno się sugerowałem plikiem grafika.pdf, więc bardzo duzo jest podobne lub nawet identyczne.
//!!!!!!!!!!!!!!!!!!!!!!!!!
$imgDir = "./images";
if(isset($_GET['image'])){
    $image = intval($_GET['image']);
}
else{
    $image= 0;
}

$dir = scandir($imgDir);
array_shift($dir);
array_shift($dir);
$count = count($dir);

$imgName = $dir[$image];
echo "<img src=\"$imgDir/$imgName\" alt=\"$imgName\" />";
?>
</div>
<div id='nawigacja' style='text-align:center'>
<?php
if($image > 0 ) $prev = $image - 1;
else $prev = 0;
if($image < $count - 1) $next = $image +1;
else $next = $count - 1;
echo "<a href=\"./index.php\">Powrót</a>&nbsp;";
echo "<a href=\"./zdjecia.php?image=$prev\">Poprzednie</a>&nbsp;";
echo "<a href=\"./zdjecia.php?image=$next\">Nastepne</a>&nbsp;";
?>
</div>
</body>
</html>
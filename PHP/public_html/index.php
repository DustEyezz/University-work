<!DOCTYPE HTML>
<html>
<head>
<title>Galeria</title>
</head>
<body>
<?php
//!!!!!!!!!!!!!!!!!!!!!!!!!
//Mocno się sugerowałem plikiem grafika.pdf, więc bardzo duzo jest podobne lub nawet identyczne.
//!!!!!!!!!!!!!!!!!!!!!!!!!
$thumbDir = "./thumbnails";
$pagesize = 4;

if(isset($_GET['page'])){
    $page = intval($_GET['page']);
}
else{
    $page = 0;
}

$dir = scandir($thumbDir);
array_shift($dir);
array_shift($dir);

?>
<div id='miniatury' style='text-align:center'>
<?php
$count = count($dir);
for($i=0; $i < $pagesize; $i++){
    $imgNo = $page * $pagesize + $i;
    if($imgNo >= $count) break;
    $imgName = $dir[$imgNo];
    $ref = "<a href=\"./zdjecia.php?image=$imgNo\">";
    $img = "<img src=\"$thumbDir/$imgName\" alt=\"$imgName\" style='height: 100px'/></a>";
    echo "$ref $img";
}
?>
</div>
<div id='nawigacja' style='text-align:center'>
strona:
<?php
$pages = ceil($count / $pagesize);
if($page > 0 ) $prev = $page - 1;
else $prev = 0;
if($page < $pages - 1) $next = $page +1;
else $next = $pages - 1;
echo "<a href=\"./index.php?page=$prev\">Poprzednia</a>&nbsp;";
for($i = 0; $i < $pages; $i++){
    echo"<a href=\"./index.php?page=$i\">$i</a>&nbsp;";
}
echo "<a href=\"./index.php?page=$next\">Nastepna</a>&nbsp;";
?>
</div>
<!DOCTYPE HTML>
<html>
<head>
<title>Galeria</title>
</head>
<body>
<?php
$imgDir = "./images";
$thumbDir = "./thumbnails";
$thOnPage = 5;

if(isset($_GET['iid']) && isset($_GET['pid'])){
    $iId = intval($_GET['iid']);
    $pId = intval($_GET['pid']);
}
else{
    $iId = 0;
    $pId = 0;
}

$dir = scandir($thumbDir);
array_shift($dir);
array_shift($dir);

$count = count($dir);
$pages = ceil($count / $thOnPage);

if($iId < 0 || $iId >= $count || $pId < 0 || $pId >= $pages){
    $iId = 0;
    $pId = 0;
}
?>

<div id='miniatury' style='text-align:center'>

<?php
for($i=0; $i < $thOnPage; $i++){
    $imgNo = $pId * $thOnPage + $i;
    if($imgNo >= $count) break;
    $imgName = $dir[$imgNo];
    $imgTag = "<img src=\"$thumbDir/$imgName\" alt=\"$imgName\" />";
    $aHead = "<a href=\"./galeria.php?pid=$pId&amp;iid=$imgNo\">";
    $aFoot = "</a>";
    echo "$aHead $imgTag $aFoot";
}
?>
</div>
<div id='nawigacja' style='text-align:center'>
IdL' do strony:
<?php
for($i = 0; $i < $pages; $i++){
    echo"<a href=\"./galeria.php?pid=$i&amp;iid=$iId\">$i</a>&nbsp;";
}
?>
</div>
<div id='obraz' style='text-align:center'>
<?php
$imgName = $dir[$iId];
echo "<img src=\"$imgDir/$imgName\" alt=\"$imgName\" />";
?>
</div>
</body>
</html>

<?php
$image = imagecreatetruecolor(240, 160);
$red = imagecolorallocate($image, 255, 0, 0);
$white = imagecolorallocate($image, 255, 255, 255);
imagefill($image, 0, 0, $white);
imagefilledrectangle($image,0,80,240,160,$red);
imagepng($image, "flag.png");
imagedestroy($image);

$image = imagecreatetruecolor(240, 160);
$blue = imagecolorallocate($image, 0, 0, 255);
$red = imagecolorallocate($image, 255, 0, 0);
$white = imagecolorallocate($image, 255, 255, 255);
imagefill($image, 0, 0, $white);
imagefilledrectangle($image,160,0,240,160,$red);
imagefilledrectangle($image,0,0,80,160,$blue);
imagepng($image, "flag1.png");
imagedestroy($image);

$image = imagecreatetruecolor(240, 160);
$blue = imagecolorallocate($image, 0, 0, 255);
$yellow = imagecolorallocate($image, 255, 255, 0);
$white = imagecolorallocate($image, 255, 255, 255);
imagefill($image, 0, 0, $blue);
imagefilledrectangle($image,65,0,95,160,$yellow);
imagefilledrectangle($image,0,65,240,95,$yellow);
imagepng($image, "flag2.png");
imagedestroy($image);

$image = imagecreatetruecolor(240, 160);
$blue = imagecolorallocate($image, 0, 0, 255);
$red = imagecolorallocate($image, 255, 0, 0);
$white = imagecolorallocate($image, 255, 255, 255);
imagefill($image, 0, 0, $red);
imagefilledrectangle($image,65,0,95,160,$white);
imagefilledrectangle($image,0,65,240,95,$white);
imagefilledrectangle($image,73,0,87,160,$blue);
imagefilledrectangle($image,0,73,240,87,$blue);
imagepng($image, "flag3.png");
imagedestroy($image);
?>
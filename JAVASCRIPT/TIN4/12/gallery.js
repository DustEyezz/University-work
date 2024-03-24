function init(){
    var allElems = document.querySelectorAll('li');
    var MainIMG = document.getElementsByClassName('large_img');
    allElems.forEach(getIMG);
}
function getIMG(object){
    var image = object.querySelector('img');
    image.onclick = function() {replaceIMG(image)};
}
function replaceIMG(elem){
    MainIMG.src = elem.src;
    event.preventDefault;
}
window.onload = init;
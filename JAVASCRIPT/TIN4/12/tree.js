function init(){
    var allElems = document.querySelectorAll('li');
    allElems.forEach(addOnCLick);
}
function addOnCLick(object){
    console.log(object.firstChild);
    var textSpan = document.createElement('span');
    textSpan.append(object.firstChild);
    object.prepend(textSpan);
    
    textSpan.onclick = function() {hideAllChildren(object)};
}
function hideAllChildren(item){
    if (item.hasChildNodes()) {
        var childElem = item.querySelectorAll('ol');
        console.log(childElem); 
        childElem.forEach(hideChild);
    }
}
function hideChild(child){
    if(child.style.display == 'none'){
        child.style.display = 'block';
    }
    else{
        child.style.display = 'none';
    }
}
window.onload = init;
'use strict';

const obj = {
    className: 'first bordered'
}

function addClassName(newClass){
    if(obj.className.includes(newClass)){
        console.log('Already exists');
    }
    else{
        obj.className += ' '+newClass;
    }
}

addClassName(obj, 'visible');
console.log(obj.className);
addClassName(obj, 'visible');
console.log(obj.className);
'use strict';

function sum(){
    let s = 0;
    for(let i=0; i<arguments.length; i++){
        s += arguments[i];
    }
    return s;
}

console.log(sum(4,2));
console.log(sum(4,8,8));
console.log(sum(4,2,6));

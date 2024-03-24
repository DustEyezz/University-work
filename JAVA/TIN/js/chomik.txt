'use strict';

function chomik(){
    
    var obj = {
         }
    
    return function(data){
        
        if (data!=null){
            obj.key2 += " " + data;
        }
        else{
            var ret = obj.key2.replace('undefined ','');        
            return ret;
        } 
}
}


let cricetus = chomik();
cricetus('gruszka');
cricetus('gruszka');
cricetus('jabłko');
console.log(cricetus());

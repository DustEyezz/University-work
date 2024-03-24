/*jshint globalstrict: true, devel: true, browser:true, esversion: 6*/
'use strict';

function reset(){
    let headers = document.querySelectorAll('h4');
    let items = document.querySelectorAll('li');
    let itemsArray = Array.from(items);

    itemsArray.forEach(item => item.style.display = 'block');
    headers.forEach(item => item.style.display = 'block');
}

function query(string) {
    let headers = document.querySelectorAll('h4');
    let items = document.querySelectorAll('li');
    let itemsArray = Array.from(items);
    let itemsFiltered = itemsArray.filter( (item) => item.innerHTML.includes(string));
    console.log(itemsFiltered);
    itemsArray.forEach(item => item.style.display = 'none');
    itemsFiltered.forEach(item => item.style.display = 'block');
    headers.forEach(item => item.style.display = 'none');
}

function getShowAbstract(li){
    return function(){
        let abstract = li. firstElementChild.title;
        let div = document.createElement("div");
        div.textContent = abstract;
        div.style.border = 'solid 1px black';
        div.style.padding = '0.75em';
        div.style.margin = '1em';
        div.style.borderRadius = '0.5em';

        let button = li.lastElementChild;
        button.textContent = 'Hide Abstract';
        button.onclick = getHideAbstract(div,button, li);

        li.append(div);
    }
}

function getHideAbstract(div,button2, li){
    return function(){
        div.remove();
        button2.remove();

        let button = document.createElement("button");
        button.textContent = 'Show Abstract';
        button.style.cursor = 'pointer';
        button.onclick = getShowAbstract(li);
        li.append(button);
    }
}

function searchSetup(){
    let searchbar = document.createElement('input');
    let searchButton = document.createElement('button');
    searchButton.onclick = function () { query(searchbar.value) };
    searchButton.textContent = "Szukaj";
    let resetButton = document.createElement('button');
    resetButton.onclick = function () { reset()};
    resetButton.textContent = "Reset";

    document.querySelector('body').prepend(searchbar);
    document.querySelector('body').prepend(searchButton);
    document.querySelector('body').prepend(resetButton);
}


function setup(){
    searchSetup();
    let lis = document.querySelectorAll('ul[id]>li');
    lis.forEach(
        li => {
            let button = document.createElement("button");
            button.textContent = 'Show Abstract';
            button.style.cursor = 'pointer';
            button.onclick = getShowAbstract(li);
            li.append(button);
        }
    );
}

document.addEventListener('DOMContentLoaded', setup);
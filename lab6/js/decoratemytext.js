/*
Developer: Van Nhat Khong
Date: April 26, 2020

Below are solutions for lab 6
*/

"use strict";

const pageLoad = () => {
    document.getElementById("biggerDecoration").onclick = biggerSetInterval;
    document.getElementById("toPigLatin").onclick = toPigLatin;
    document.getElementById("checkMe").onchange = bling;
}

let timer = null; // stores ID of interval timer
const biggerSetInterval = () => {
    let currentSize = currentFontSize();
    if (timer === null && currentSize < 20) {
        timer = setInterval(biggerFont, 500);
    } else {
        clearInterval(timer); // cancel the timer
        timer = null;
    }
}

const biggerFont = () => {
    let newFont = currentFontSize() + 2 + "pt";
    document.getElementById("textDecorator").style.fontSize = newFont;
    //document.getElementById("textDecorator").style.fontSize = "4em";
}

const currentFontSize = () => {
    let style = window.getComputedStyle(document
        .getElementById("textDecorator"), null)
        .getPropertyValue('font-size');
    return parseInt(style);
}

const bling = () => {
    //alert("Bliiiiiiinggggg");
    if (document.getElementById("checkMe").checked) {
        document.getElementById("textDecorator").style.fontWeight = "bold";
        document.getElementById("textDecorator").style.color = "green";
        document.getElementById("textDecorator").style.textDecoration = "underline";
        document.getElementById('hundredDollar').style.visibility = 'visible';
    }
    else {
        document.getElementById("textDecorator").style.fontWeight = "normal";
        document.getElementById("textDecorator").style.color = "black";
        document.getElementById("textDecorator").style.textDecoration = "none";
        document.getElementById('hundredDollar').style.visibility = 'collapse';
    }
}

const toPigLatin = () => {
    
}

window.onload = pageLoad;
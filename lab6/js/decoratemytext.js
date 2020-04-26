/*
Developer: Van Nhat Khong
Date: April 26, 2020

Below are solutions for lab 6
*/

"use strict";

const pageLoad = () => {
    document.getElementById("biggerDecoration").onclick = biggerSetInterval;
    document.getElementById("igpay-atinlay").onclick = toPigLatin;
    document.getElementById("malkovitch").onclick = toMalkovich;
    document.getElementById("bling").onchange = checkOnChange;
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
    document.getElementById("textArea").style.fontSize = newFont;
    //document.getElementById("textDecorator").style.fontSize = "4em";
}

const currentFontSize = () => {
    let style = window.getComputedStyle(document
        .getElementById("textArea"), null)
        .getPropertyValue('font-size');
    return parseInt(style);
}

const checkOnChange = () => {
    //alert("Bliiiiiiinggggg");
    if (document.getElementById("bling").checked) {
        document.getElementById("textArea").style.fontWeight = "bold";
        document.getElementById("textArea").style.color = "green";
        document.getElementById("textArea").style.textDecoration = "underline";
        document.body.style.backgroundImage = "url(images/hundred-dollar-bill.jpg)";
    }
    else {
        document.getElementById("textArea").style.fontWeight = "normal";
        document.getElementById("textArea").style.color = "black";
        document.getElementById("textArea").style.textDecoration = "none";
        document.body.style.backgroundImage = "";
    }
}

const toPigLatin = () => {
    let lines = document.getElementById("textArea").value.trim().split("\n");
    let newText = "";
    let newLine;
    const vowels = "aeiouAEIOU";
    for (let line of lines) {
        let words = line.trim().split(" ");
        for (let i in words) {
            if (!words[i].localeCompare(" ") && vowels.indexOf(words[i].charAt(0))>-1) {
                words[i] = (words[i].substring(1) + words[i].charAt(0) + "ay");
            }
            else {
                words[i] += "ay";
            }
        }
        newLine = words.join(" ") + "\n";
        newText += newLine;
    }
    document.getElementById("textArea").value = newText;
}

const toMalkovich = () => {
    let lines = document.getElementById("textArea").value.trim().split("\n");
    let newText = "";
    let newLine;
    for (let line of lines) {
        let words = line.split(" ");
        newLine = "";
        for (let i in words) {
            if (words[i].length >= 5) {
                words[i] = "Malkovich";
            }
        }
        newLine = words.join(" ") + "\n";
        newText += newLine;
    }
    document.getElementById("textArea").value = newText;
}

window.onload = pageLoad;
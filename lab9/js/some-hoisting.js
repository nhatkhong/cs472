/*
* some-hoisting js
* */
"use strict";

// what scope is the variable x in? Global scope

//let x = 10; // Is x hoisted? Yes or No? If it finds any variable declaration, it does hoisting

console.log(x); // undefined
var x = 1;
const f = function() {
    console.log(x); // 1
    x = 15; //global variable, with var added, function scope
    console.log(x); // 15
    if (x > 10) {
        var y = 20; //var makes it function scope, const/let makes y block scope
        console.log(x);
        console.log(y);
    }
    console.log(y);
}
f();
console.log(x); // 15


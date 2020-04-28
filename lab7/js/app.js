var a = 5;
function b() {
    console.log("a: " + a); //undefined
    var a = 9;
}
console.log("a: " + a); //5
b();

var a = 5;
function b() {
    console.log("a: " + a); //5 (global variable)
    a = 9;
}
console.log("a: " + a); //5
b();


function b() {
    console.log("n: " + n);
    var n;
}
var n = 5;
b();
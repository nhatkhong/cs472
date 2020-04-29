/*jshint esversion: 6 */
/*jslint browser: true */
/*global window */

/*
Developer: Van Nhat Khong
Date: April 26, 2020

Below are solutions for lab 8
*/

//Question 6
var count = {
    counter: 0,
    add: function () {
        "use strict";
        return this.counter += 1;
    },
    reset: function () {
        "use strict";
        return (this.counter = 0);
    }
};

console.log("Question 6--------------------------");
console.log(count.add());
console.log(count.add());
console.log(count.reset());

/*Question 7
- counter is the free variable in add() and reset() methods.
- The term free variable refers to variables used in a function
that are not local variables nor parameters of that function.
These variables that the function takes (read and write) in
the enclosing scope where is declared the closure or in a parent scope.
*/

//Question 8
function make_adder(increment) {
    "use strict";
    var counter = 0;
    return function() {
        return counter += increment;
    }
}
var add5 = make_adder(5);
console.log("\n Question 8--------------------------");
add5();
add5();
console.log(add5());
console.log("------------------------------------");
var add7 = make_adder(7);
add7();
add7();
console.log(add7());

//Question 9
//We can use Module Pattern IIFE to wrap all variables and functions inside a big function.
// (function(params){
//      statements;
// })(params);

//Question 10
const Employee = (function() {
    "use strict";
    let name;
    let age;
    let salary;
    const setName = function (newName) {
        name = newName;
    };
    const setAge = function (newAge) {
        age = newAge;
    };
    const setSalary = function (newSalary) {
        salary = newSalary;
    };
    const getName = function () {
        return name;
    };
    const getAge = function () {
        return age;
    };
    const getSalary = function () {
        return salary;
    };
    const increaseSalary = function (percentage) {
        salary = getSalary() * (1 + percentage/100);
    };
    const incrementAge = function (increment) {
        age = getAge() + increment;
    };

    const toString = function() {
        return `Name: ${name}, Age: ${age}, Salary: ${salary}`;
    }

    return {
        setName: setName,
        setAge: setAge,
        setSalary: setSalary,
        increaseSalary: increaseSalary,
        incrementAge: incrementAge,
        toString: toString
    };
})();
console.log("\n Question 10-----------------------------");
Employee.setName("Micheal");
Employee.setAge(30);
Employee.setSalary(4000);
console.log(Employee.toString());
Employee.increaseSalary(10);
Employee.incrementAge(1);
console.log("--------------------------------------");
console.log(Employee.toString());

//Question 11
Employee.address = "";
Employee.setAddress = function(newAddress) {
    "use strict";
    this.address = newAddress;
};
Employee.getAddress = function () {
    "use strict";
    return this.address;
};

Employee.setAddress("Fairfield, Iowa, US");
console.log("\n Question 11-----------------------------");
console.log(Employee.toString());
console.log("New address:  "+Employee.getAddress());

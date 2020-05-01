/*
* what-is-this.js
* */

"use strict";

// "this" in the global enviroment/scope
console.log(this);
console.log(this.name);
console.log(this.firstname);

// "this" inside a function declaration
function f() {
    console.log(this); //refer to window if we don't have "use strict";
    this.firstName = "Ana";
    console.log(this.firstName);
}
window.f();
// "this" always typically refers to the object on which the function
// where "this" was encountered was called.

// "this" inside a nested function

function f2() {
    let firstName = "Ana2";
    const g = function() {
        // with "use strict" on, this = undefined
        // without "use strict", this = window
        console.log(this);
        //return console.log(this.firstName);
    }
    console.log(g());
}
f2();

// "this" inside object literal gives the object
const f21 = {
    firstName: "Ana21",
    g: function() {
        console.log(this);
        return console.log(this.firstName);
    }
}
console.log(f21.g());

// "this" inside a nested arrow function
// "this" refers to the surrounding lexical scope -- global window object
function f3() {
    let firstName = "Ana3";
    const g = () => console.log(this);
    g();
}
f3();

function Person(firstName) {
    console.log(this);
    this.firstName = firstName;
    console.log(this);
}
const ana = new Person("New Person");
//Person("New Person"); // window

// "this" in nested funtion inside object literal - the Self Pattern
// const person = {
//     firstName : "Kalu",
//     getFirstName: function() {
//         console.log(this);
//         const changeFirstName = function (newFirstName) {
//             console.log(this);
//             this.firstName = newFirstName;
//         }
//         changeFirstName("Levi");
//         console.log(this.firstName);
//         return this.firstName;
//     }
// };
// console.log(person.getFirstName());

//self
const person2 = {
    firstName : "Kalu",
    getFirstName: function() {
        console.log(this);
        const self = this;
        const changeFirstName = function (newFirstName) {
            console.log(self);
            self.firstName = newFirstName;
        }
        console.log(this.firstName);
        changeFirstName("Levi");
        console.log(this.firstName);
        return this.firstName;
    }
};
console.log(person2.getFirstName());

// Using arrow function
// "this" refers to the surrounding lexical scope
const person3 = {
    firstName : "Kalu",
    getFirstName: function() {
        console.log(this); //person 3 object
        const changeFirstName = newFirstName => {
            console.log(this); //person 3 object
            this.firstName = newFirstName;
        }
        console.log(this.firstName); //Kalu
        changeFirstName("Levi");
        console.log(this.firstName); //Levi
        return this.firstName;
    }
};
console.log(person3.getFirstName()); //Levi

//Using call, apply, and bind to specify "this" reference

//using Function.prototype.call
const person4 = {
    firstName : "Kalu4",
    getFirstName: function() {
        console.log(this); //person4 object
        const changeFirstName = function(newFirstName) {
            console.log(this);
            this.firstName = newFirstName;
        }
        console.log(this.firstName); //Kalu4
        changeFirstName.call(this, "Levi");
        //console.log(this.firstName); //Levi
        return this.firstName;
    }
};
console.log(person4.getFirstName());

//using Function.prototype.apply
const person5 = {
    firstName : "Kalu5",
    getFirstName: function() {
        console.log(this); //person5 object
        const changeFirstName = function(newFirstName) {
            console.log(this);
            this.firstName = newFirstName;
        }
        console.log(this.firstName); //Kalu5
        changeFirstName.apply(this, ["Levi"]);
        //console.log(this.firstName); //Levi
        return this.firstName;
    }
};
console.log(person5.getFirstName());

//using Function.prototype.bind
const person6 = {
    firstName : "Kalu6",
    getFirstName: function() {
        console.log(this); //person6 object
        const changeFirstName = function(newFirstName) {
            console.log(this);
            this.firstName = newFirstName;
        }
        console.log(this.firstName); //Kalu6
        const changeFNamePerson6 = changeFirstName.bind(this, "Levi");
        changeFNamePerson6();
        //console.log(this.firstName); //Levi
        return this.firstName;
    }
};
console.log(person6.getFirstName());

// -- Function borrowing using Function.prototype.bind
const employee = {
    firstName: null,
    lastName: null,
    getFullName: function() {
        return `${this.firstName} ${this.lastName}`
    }
};

const paySalary = function(salary, payDate) {
    console.log(`${this.getFullName()} is paid ${salary} on ${payDate}`);
};

// Someone named Anna IS-A employee
const anna = Object.create(employee);
anna.firstName = "Ana";
anna.lastName = "Smith";

const paySalaryToAnna = paySalary.bind(anna, 40000);
paySalaryToAnna(new Date());
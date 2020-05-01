/*jshint esversion: 6 */
/*jslint browser: true */
/*global window */

/*
Developer: Van Nhat Khong
Date: April 30, 2020

Below are the solutions for lab 9 - question 1-3
*/

"use strict";

//Question 1
console.log("_____________Solution for Q1______________________");
const Person = {
    name: "",
    dateOfBirth: "",
    getName: function() {
        return this.name;
    },
    setName: function(newName) {
        this.name = newName;
    },
    printValues: function () {
        console.log(`The person’s name is ${this.name}`);
        console.log(`${this.name} was born on ${this.dateOfBirth}`);
    }
};
const john = Object.create(Person);
john.name = "John";
john.dateOfBirth = "December 10th, 1998";
john.printValues();

//Using class
class Person1B {
    constructor(name, dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    getName() {
        return this.name;
    }
    setName(newName) {
        this.name = newName;
    }
    printValues() {
        console.log(`The person’s name is ${this.name}`);
        console.log(`${this.name} was born on ${this.dateOfBirth}`);
    }
}
console.log("-----------using Class-----------------------");
const john2 = new Person1B("John", "December 10th, 1998");
john2.printValues();

//Question 2
console.log("_____________Solution for Q2______________________");
const Employee = {
    __proto__: Person,
    salary: 0,
    hireDate: new Date(),
    doJob: function (jobTitle) {
        console.log(`${this.name} is a ${jobTitle} who earns ${this.salary}`);
    }
};

const anna = Object.create(Employee);
anna.name = "Anna";
anna.dateOfBirth = "November 10th, 1998";
anna.salary =  249995.50;
anna.doJob("Programmer");

//using Class
class EmployeeC extends Person1B {
    constructor(name, dateOfBirth, salary, hireDate) {
        super(name, dateOfBirth);
        this.salary = salary;
        this.hireDate = hireDate;
    }
    doJob (jobTitle) {
        console.log(`${this.name} is a ${jobTitle} who earns ${this.salary}`);
    }
}
console.log("-----------using Class-----------------------");
const anna2 = new EmployeeC("Anna", "November 10th, 1998", 249995.50, new Date());
anna2.doJob("Programmer");

//Question 3
console.log("_____________Solution for Q3______________________");
class Person3 {
    constructor(name, dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    getName() {
        return this.name;
    }
    setName(newName) {
        this.name = newName;
    }
    printValues() {
        console.log(`The person’s name is ${this.name}`);
        console.log(`${this.name} was born on ${this.dateOfBirth}`);
    }
    toString() {
        console.log(`Name: ${this.name}, DateOfBirth: ${this.dateOfBirth}`);
    }
}

const peter = new Person3("Peter", "November 10, 1985");
peter.toString();

//Question 4

/*
Developer: Van Nhat Khong
Date: April 25, 2020

Below are solutions for lab 5 - question 14 - Login form
*/
"use strict";
const pageLoad = () => {
    document.getElementById("submit").submit = submit;
}

const submit = () => {
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value
    const url = document.getElementById("url").value
    console.log(email);
    console.log(password);
    console.log(url);
}

window.onload = pageLoad;
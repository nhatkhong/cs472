/*jshint esversion: 6 */
/*jslint browser: true */
/*global window */

/*
Developer: Van Nhat Khong
Date: April 25, 2020

Below are solutions for lab 5 - question 14 - Login form
*/

const pageLoad = () => {
    "use strict";
    document.getElementById("submit").submit = submit;
}

const submit = () => {
    "use strict";
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value
    const url = document.getElementById("url").value
    console.log(email);
    console.log(password);
    console.log(url);
}

window.onload = pageLoad;
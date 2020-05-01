/*jshint esversion: 6 */
/*jslint browser: true */
/*global window */

/*
Developer: Van Nhat Khong
Date: April 25, 2020

Below are solutions for lab 9 - question 4 - Login form
*/
"use strict";

$(document).ready(function() {
    $('#submit').on('click', function(event) {
        event.preventDefault();
        const email = $("#email").val();
        const password = $("#password").val();
        const url = $("#url").val();
        console.log(email);
        console.log(password);
        console.log(url);
    });
});
/*jshint esversion: 6 */
/*jslint browser: true */
/*global window */
/*
Developer: Van Nhat Khong
Date: April 25, 2020

Below are solutions for lab 5 - question 15
*/


const createTimer = () => {
    "use strict";
    setTimeout(displayTime, 1000);
};
const displayTime = () => {
    "use strict";
    let options = {
        year: 'numeric', month: 'numeric', day: 'numeric',
        hour: 'numeric', minute: 'numeric', second: 'numeric',
    };
    let time = new Date();
    const dtf = new Intl.DateTimeFormat('en', options);
    const [
        {value: mo}, ,
        {value: day}, ,
        {value: year}, ,
        {value: hour}, ,
        {value: minute}, ,
        {value: second}, ,
        {value: am_pm}] = dtf.formatToParts(time);
    document.getElementById("clock").innerHTML = `${year}-${mo}-${day} ${hour}:${minute}:${second} ${am_pm} `;
    createTimer();
};
window.onload = displayTime;
/*
Developer: Van Nhat Khong
Date: April 25, 2020

Below are solutions for lab 5 - question 14 - New Product form
*/
"use strict";
const pageLoad = () => {
    document.getElementById("btnSubmit").onclick = submit;
}

const submit = () => {
    const productNumber = document.getElementById("productNumber").value;
    const name = document.getElementById("name").value
    const unitPrice = document.getElementById("unitPrice").value
    const url = document.getElementById("url").value
    const quantity = document.getElementById("quantity").value
    const supplier = document.getElementById("supplier").value
    const date = document.getElementById("date").value
    alert("Product Number: " + productNumber + "\n" + "Name: " + name + "\n" + "Unit Price: " + unitPrice + "\n" + "URL: " + url + "\n" + "Quantity: " + quantity + "\n" + "Supplier: " + supplier + "\n" + "Date: " + date)
}

window.onload = pageLoad;
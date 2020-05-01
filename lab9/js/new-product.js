/*jshint esversion: 6 */
/*jslint browser: true */
/*global window */

/*
Developer: Van Nhat Khong
Date: April 25, 2020

Below are solutions for lab 9 - question 4 - New Product form
*/

$(document).ready(function() {
    $('#btnSubmit').on('click', function(event) {
        event.preventDefault();
        const productNumber = $("#productNumber").val();
        const name = $("#name").val();
        const unitPrice = $("#unitPrice").val();
        const url = $("#url").val();
        const quantity = $("#quantity").val();
        const supplier = $("#supplier").val();
        const date = $("#date").val();
        const submission = $("<p>", {"text": `Product Name: ${productNumber}`});
        $('form').append($("<div class='submission'>")).append(
                    `<p>Product number: ${productNumber} | Name: ${name} | Supplier: ${supplier}</p>
                    <p>Unit Price: ${unitPrice} | Quantity: ${quantity}</p>
                    <p>Date: ${date}</p>
                    <p>URL: ${url}</p>`);
    });
});
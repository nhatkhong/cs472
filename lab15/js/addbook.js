
const newBookForm = document.getElementById("newBookForm");
const txtIsbn = document.querySelector("#isbn");
const txtTitle = document.querySelector("#title");
const txtOverdueFee = document.querySelector("#overdueFee");
const txtPublisher = document.querySelector("#publisher");
const dtpkDatePublished = document.querySelector("#datePublished");
const alertMessageBox = document.getElementById("alertMessageBox");
newBookForm.addEventListener("submit", function(e) {
    e.preventDefault();
    const isbn = txtIsbn.value;
    const title = txtTitle.value;
    const overdueFee = parseFloat(txtOverdueFee.value);
    const publisher = txtPublisher.value;
    const datePublished = dtpkDatePublished.value;
    const newBookData = {
        "isbn": isbn,
        "title": title,
        "overdueFee": overdueFee,
        "publisher": publisher,
        "datePublished": datePublished
    };

    fetch("https://elibraryrestapi.herokuapp.com/elibrary/api/book/add", {
        method: "post",
        body: JSON.stringify(newBookData),
        headers: {
            "Content-Type": "application/json"
        }
    }).then(function(response) {
        return response.json();
    }).then(function (jsonResponseData) {
        console.log(jsonResponseData);   
        txtIsbn.value = "";     
        txtTitle.value = "";   
        txtOverdueFee.value = "0.00";
        txtPublisher.value = "";
        dtpkDatePublished.value = "";   
        txtTitle.focus();
        alertMessageBox.style.display = "inline-block";
    }).catch(function(error) {
        console.error(error);
    
    })
});
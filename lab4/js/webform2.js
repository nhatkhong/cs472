const pageLoad = () => {
    document.getElementById("btnSubmit").onclick = submit;
}

const submit = () => {
    const productNumber = document.getElementById("productNumber").value;
    const name = document.getElementById("name").value
    const unitPirce = document.getElementById("unitPirce").value
    const url = document.getElementById("url").value
    const quantity = document.getElementById("quantity").value
    const supplier = document.getElementById("supplier").value
    const date = document.getElementById("date").value
    alert("Product Number:" + productNumber + "\n" + "Name:" + name + "\n" + "Unit Price:" + unitPirce + "\n" + "URL:" + url + "\n" + "Quantity:" + quantity + "\n" + "Supplier:" + supplier + "\n" + "Date:" + date)
}

window.onload = pageLoad;
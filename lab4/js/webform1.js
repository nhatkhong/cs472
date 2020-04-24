const pageLoad = () => {
    document.getElementById("submit").submit = submit;
}

const submit = () => {
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value
    console.log(email);
    console.log(password);
}

window.onload = pageLoad;
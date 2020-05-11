
(function() {
    getBooks();
})();

function getBooks() {
  fetch("https://elibraryrestapi.herokuapp.com/elibrary/api/book/list")
  .then((response) => {
      if(response.ok) {    
        return response.json();
      } else {
        return Promise.reject({ status: response.status, statusText: response.statusText });
      }
    })
  .then(books => {
    let content = "";
      books.forEach(function(book, i) {
        content += `
              <tr>
                <th scope="row">${i+1}.</th>
                <td>${book.isbn}</td>
                <td>${book.title}</td>
                <td>${new Intl.NumberFormat("en-US",{style:"currency",currency:"USD",minimumFractionDigits:2}).format(book.overdueFee)}</td>
                <td>${book.publisher}</td>
                <td>${book.datePublished}</td>
              </tr>
            `;
      });
      document.querySelector("#tbody").innerHTML = content;
  })
  .catch(err => {
    console.log("Error message:", err.statusText);
    document.getElementById("divBooksList").innerHTML = "<p style='color:#ff0000;'>We are sorry. The elibrary books data service is unavailable. Please try again later</p>";
  });
}

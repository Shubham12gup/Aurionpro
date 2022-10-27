function store() { //stores items in the localStorage
    var brand = document.getElementById('carBrand').value;
    var price = document.getElementById('carPrice').value;

    const car = {
        brand: brand,
        price: price,
    }
    
    window.localStorage.setItem('car',JSON.stringify(car));  
    //converting object to string
}

function retrieveRecords() { //retrieves items in the localStorage
        console.log("retrive records");
        var records = window.localStorage.getItem('car');
        var element = document.getElementById("retrieve");
        element.innerHTML = `<p>${records}</p>`;
}

function removeItem() {//deletes item from localStorage
        localStorage.removeItem('car');
        console.log("remove items");
}

function clearStorage() { //clears the entire localStorage
        localStorage.clear();
        console.log("clear records");
}

window.onload =function() { //ensures the page is loaded before functions are executed.
        document.getElementById("carForm").onsubmit = store;
        document.getElementById("clearButton").onclick = clearStorage;
        document.getElementById("removeButton").onclick = removeItem;
        document.getElementById("retrieveButton").onclick = retrieveRecords;
}
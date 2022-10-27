function store() { //stores items in the localStorage
        var brand = document.getElementById('carBrand').value;
        var price = document.getElementById('carPrice').value;
    
        const car = {
            brand: brand,
            price: price,
        }
        
        window.sessionStorage.setItem('car',JSON.stringify(car));  
        //converting object to string
    }

function retrieveRecords() { //retrieves items in the sessionStorage
        console.log("retrive records");
        var records = window.sessionStorage.getItem('car');
        var element = document.getElementById("retrieve");
        element.innerHTML = `<p>${records}</p>`;
}

function removeItem() {//deletes item from sessionStorage
        sessionStorage.removeItem('car');
        console.log("remove items");
}

function clearStorage() { //clears the entire sessionStorage
        sessionStorage.clear();
        console.log("clear records");
}

window.onload =function() { //ensures the page is loaded before functions are executed.
        document.getElementById("carForm").onsubmit = store;
        document.getElementById("clearButton").onclick = clearStorage;
        document.getElementById("removeButton").onclick = removeItem;
        document.getElementById("retrieveButton").onclick = retrieveRecords;
}
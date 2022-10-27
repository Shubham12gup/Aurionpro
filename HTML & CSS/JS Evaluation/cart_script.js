const productData = [
    { name: "ParleG", price: 10 },
    { name: "Monacco", price: 20 },
    { name: "Dark Fantasy", price: 40 }
];

let item = document.getElementById("products");
var itemPrice = document.getElementById("price");
var quantity = document.getElementById('quantity').value;
const addTOcart = document.getElementById("addToCart");
const table = document.querySelector('.table');

productData.forEach(product=>{
    var c = document.createElement("option");
    c.text = product.name;
    c.name = product.name;
    c.value = product.price;
    item.options.add(c);
});

item.addEventListener('click', ()=>{
    itemPrice.value = item.value;
    console.log("Item Price: ", itemPrice);
});


var totalCost = 0;
let cartItem = [];
let totalPara = document.getElementById('cartTotal');
addTOcart.addEventListener('click', ()=>{
    let item = document.getElementById("products");
    let itemName = item.options[item.selectedIndex].text;
    var itemPrice = document.getElementById("price").value;
    let quantity = document.getElementById('quantity').value;
    let itemTotal = itemPrice * quantity;

    var index;
    var flag = false;
    function checkItemPresent(){
        cartItem.forEach(e=>{
            if(e.productName === itemName){
                index = cartItem.indexOf(e);
                flag = true;
                // return true;
            }
        });
    }
    
    let cartitem = {
        productName: itemName,
        productPrice: itemPrice,
        productQuantity: quantity,
        productTotal: itemTotal
    }

    console.log(checkItemPresent());
    if(flag){
        cartItem[index] = {
            productName: itemName,
            productPrice: itemPrice,
            productQuantity: parseInt(cartItem[index].productQuantity) + parseInt(quantity),
            productTotal: cartItem[index].productTotal + itemTotal
        }

        table.innerHTML = "";
        tableTemplate();
        displayTable(cartItem);

        // totalCost += itemTotal;
        // let totalPara = document.getElementById('cartTotal');
        // totalPara.innerText = `Rs. ${totalCost}`;
        totalPara.innerText = `Rs. ${totalCalculator(cartItem)}`;

        console.log(cartItem);
        console.log("Total Cost: ",totalCalculator(cartItem));
    }
    else{

        cartItem.push(cartitem);
        
        table.innerHTML = "";
        tableTemplate();
        displayTable(cartItem);
        
        // totalCost += itemTotal;
        // let totalPara = document.getElementById('cartTotal');
        // totalPara.innerText = `Rs. ${totalCost}`;
        totalPara.innerText = `Rs. ${totalCalculator(cartItem)}`;

        console.log("Total Cost: ",totalCalculator(cartItem));
        console.log(cartItem);
    }

});


function displayTable(cartItem) {
    cartItem.forEach(p => {
        table.innerHTML += `
        <tr class="row" id="row">
        <td> ${p.productName} </td>
        <td> ${p.productQuantity} </td>
        <td> ${p.productPrice} </td>
        <td> ${p.productTotal} </td>
        <td> <button class="delete" id="delete"> <i class="fa-solid fa-trash-can"></i> </button></td>
        </tr>`;
    });
}

function tableTemplate() {
    table.innerHTML = `
    <thead>
    <tr>
        <th scope="col">Product name</th>
        <th scope="col">Quantity</th>
        <th scope="col">Unit Price</th>
        <th scope="col">Sub Total</th>
        <th scope="col">Remove</th>
    </tr>
    </thead>
    `;
}

var del = document.querySelector(".delete");
// del.addEventListener("click", (e) => {
table.addEventListener("click", (e) => {
    if (e.target.localName == "i") {
        console.log(e.target);
        console.log(e.target.parentElement.parentElement.parentElement.parentElement);
        e.target.parentElement.parentElement.remove();
    
        cartItem.pop(e.target);
        // cartItem.filter(e => e !== e.target);
    
        table.innerHTML = "";
        tableTemplate();
        displayTable(cartItem);
        let totalPara = document.getElementById('cartTotal');
        totalPara.innerText = `Rs. ${totalCalculator(cartItem)}`;
        console.log(cartItem);
        console.log("Total Cost: ",totalCalculator(cartItem));
    }
    
});

function totalCalculator(cartItem){
    var total = 0;
    cartItem.forEach((t)=>{
        total += t.productTotal;
    });
    return total;
}
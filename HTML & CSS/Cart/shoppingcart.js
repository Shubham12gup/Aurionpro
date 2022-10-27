const Product = [
  { pname: "ParleG", unit: 40 },
  { pname: "Chips", unit: 10 },
  { pname: "choclate", unit: 20 },
];

let Shopitem = [];
let unitCost = [];
let updateQuantity = [];

let Productname = document.querySelector(".products");
let unitPrice = document.querySelector(".unitPrice");
let ProductQuantity = document.querySelector(".Quantity");
let addTOcart = document.querySelector(".addTOcart");
let totalCost = document.querySelector(".totalCost");

let table = document.querySelector(".table");
let html = ``;



for (var i = 0; i < Product.length; i++) {
  Productname.innerHTML =
    Productname.innerHTML + "<option>" + Product[i]["pname"] + "</option>";
}



Productname.addEventListener("click", (e) => {
  var a = e.target;
  //console.log(a.value);

  unitCost = Product.find((p) => p.pname === a.value);
  console.log(unitCost.unit);

  unitPrice.value = unitCost.unit;

  console.log(unitCost);
});





addTOcart.addEventListener("click", (e) => {
  let Productname = document.querySelector(".products");
  let unitPrice = document.querySelector(".unitPrice");
  let ProductQuantity = document.querySelector(".Quantity");

  console.log(
    ProductQuantity.value + "" + Productname.value + "" + unitPrice.value
  );

  console.log(unitPrice.value);
  if (unitPrice.value != 00) {
    let psubtotal = ProductQuantity.value * unitPrice.value;

    const { length } = Shopitem;
    const id = length + 1;
    const found = Shopitem.some((el) => el.pname === Productname.value);

    if (!found) {
      Shopitem.push({
        id: id,
        pname: Productname.value,
        pcost: unitPrice.value,
        PQuantity: ProductQuantity.value,
        pSubTotal: psubtotal,
      });

      console.log(Shopitem);
    } else {
      index = Shopitem.findIndex((x) => x.pname === Productname.value);

      console.log("index" + index);

      let previousQuantity = Shopitem[index].PQuantity;

      var changeQuantity =
        parseInt(previousQuantity) + parseInt(ProductQuantity.value);

      console.log(" previous Quantity" + parseInt(previousQuantity));

      psubtotal = changeQuantity * unitPrice.value;

      Shopitem[index] = {
        pname: Productname.value,
        pcost: unitPrice.value,
        PQuantity: changeQuantity,

        pSubTotal: psubtotal,
      };

      console.log(Shopitem);
    }

    // console.log("outside if else" + Shopitem);

    table.innerHTML = "";
    displaytableTemplate(table);

    displaytable(Shopitem);
  }
});

table.addEventListener("click", (e) => {
  if (e.target.localName == "i") {
    console.log(e.target.parentElement.localName);

    e.target.parentElement.parentElement.remove();

    Shopitem.pop(e.target);

    console.log(Shopitem);

    displaytableTemplate(table);
    displaytable(Shopitem);
    totalCostOfItems(Shopitem);
  }
});



function displaytable(Shopitem) {
  let table = document.querySelector(".table");
  let html = ``;

  //  table.innerText= "";

  Shopitem.forEach((item) => {
    html += `

    
    
    <tr>
    <td> ${item.pname}</td>
    <td> ${item.PQuantity}</td>
    <td> ${item.pcost}</td>
    <td> ${item.pSubTotal}</td>
    <td> <i class="fa-solid fa-trash-can"></i> </td>
</tr>`;
    table.innerHTML += html;
    html = ``;
  });

  totalCostOfItems(Shopitem);
}



function displaytableTemplate(table) {
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



function totalCostOfItems(Shopitem) {
  let productTotalCost = Shopitem.reduce(
    (total, Shopitem) => total + Shopitem.pSubTotal,
    0
  );

  totalCost.innerText = productTotalCost;
}

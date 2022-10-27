const num = [0, 10, 20, 30, 40, 50];

// console.log("hello");
// num.forEach(number => { number>20 ? console.log(number) : console.log() });

// const num1=[]
// num.filter(num=>num>30).forEach(num=>num1.push(num));
// console.log(num1);

const filteredScore = num.filter(number=>{
    return number>=30;
});
console.log(filteredScore);


const users=[
    {name:"Jayesh",subscribed:true},
    {name:"Manish",subscribed:false},
    {name:"Vijay",subscribed:false},
    {name:"Krishna",subscribed:true},
];

const subscribedUsers = users.filter(user => {
    return user.subscribed==true;
    // no need to mention boolean value
    // return user.subscribed;

});
console.log(subscribedUsers);

const prices = [100, 200, 300, 150, 400];

const discountPrice = prices.map(price=>{
    return price - price*0.3;
});

console.log(discountPrice);

// const products=[
//     {name:"Parle-g",price:10},
//     {name:"Frooti",price:100},
//     {name:"Maggi",price:20},
//     {name:"Pasta",price:40}
// ];

// const discountProducts = products.map(product=>{
//     if (product.price>20){
//         return {name: product.name, price: product.price-product.price*0.25};
//     }
//     return product;
// })

// console.log(discountProducts);
// console.log(products);


const ages = [10, 20, 30, 40, 50];

// const result = ages.reduce((sum, age)=>{
//     // console.log(age, sum);
//     console.log(sum, age);
//     sum+=age;
//     return sum;
// });

// const result = ages.reduce((sum, age)=>sum+age);

// console.log(result);

// const productCat=[
//     {category:"groceries",name:"Parle-g",price:10},
//     {category:"groceries",name:"Frooti",price:12},
//     {category:"electronics",name:"boat headphone",price:20},
//     {category:"groceries",name:"Pasta",price:40}
// ];

// const total = productCat.reduce((sum, product)=> sum+product.price, 0);
// const res = productCat.reduce((sum, productCat))

// console.log(total);

// >>Find Method
const scores = [10, 20, 30, 40, 50, 55, 60];

const scoreGreaterThan50 = scores.find((score) => {
    return score>50;
});
console.log(scoreGreaterThan50);

// >>Sort Method - Destructive method(Changes original array)
let students = ["Ashish", "Shubh", "Rahul", "reena", "Shivam", "Immanuel"];
students = students.map(s=> s.toUpperCase()).sort();
// students.sort();
console.log(students);

const marks = [40, 90, 5, 3, 10, 20, 30, 50, 55, 60];
marks.sort((a, b) => {
    // if(a<b){
    //     return -1;
    // } else if (a>b){
    //     return 1;
    // } else{
    //     return 0;
    // }
    
    //returns -1, 1, 0 same as above 
    return a-b;
});
console.log(marks);

const players = [
    {name: "finch", score: 50},
    {name: "surya", score: 60},
    {name: "Virat", score:50},
    {name: "Dhoni", score:65}
];

// players = players.map(p => p.name.toUpperCase());
players.sort((a, b) => {
    return (a.name).localeCompare(b.name);
});
console.log(players);

// players.sort((a,b) => {
//     return a.score - b.score
// });
// console.log(players);

const products=[
    {name:"tshirt",price:500},
    {name:"chinos",price:1200},
    {name:"jeans",price:1100},
    {name:"shirt",price:800},
    {name:"Jacket",price:2500}
];

let discountProducts = products.filter(product=>{
    if (product.price>1000)
        return product;
});

discountProducts = discountProducts.map(product=>{
    return {name: product.name, price: (product.price-(product.price*0.3))};
});
console.log(discountProducts);
    
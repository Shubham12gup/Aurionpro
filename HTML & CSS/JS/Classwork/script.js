
//http://127.0.0.1:5500/index.html
//http://127.0.0.1:5500/
// console.log("hello")

// const rate = 9.0
// let percent = 80

// rate = 10;
// console.log(percent)


//1. find index of @
let email = 'jitesh.guntuka@aurionpro.com';
var index   = email.indexOf('@')
console.log("index of @ : " + index)

//2. get domain name from email id

var domain = email.substring(email.lastIndexOf("@") +1);
console.log( "Domain name :" + domain );  


//3. get character after . and before @
var after_ =  email.substring(email.indexOf('.')+1,email.indexOf('@'))
console.log( " get character after . and before @ : " + after_ );  

// 4. replace j by r
var replace = email.replace("j", "r");  
console.log( "replace j by r :" + replace );  


//5. find length of string
console.log("length of string: "+  email.length)

const title="Proramming in Java";
const author="Balagurusamy";
const price=500;

const Text = `Book of ${title} written by ${author} is of ${price} rs`;
console.log(Text);

const players = ['virat','rohit','gill']
console.log(players)

let result = players.concat(['rishabh', 'bumrah'])

console.log(result)
players.push('ashwin')
console.log(players)


let popplayer = players.pop()
console.log("pop player " + popplayer)

console.log(players)

console.log(players.includes('ashwin'))
console.log(result.includes('rishabh'))




// function greet(){
//     console.log('hello')
// }

// greet();

// function addNumber(a,b){
//     return a+b
// }

// let res = addNumber(10,25);

// console.log(res)

// // function expression

// const addNew = function(a,b){
//     return a+b
// }
// console.log(addNew(28, 45));

console.log("---------------------------------------");

// function in js, hoisting          vs function expression

let add = addNumber(10,25);

console.log(add);

function addNumber(a,b)
{ return a+b }

// arrow function

//const addNewNum = (a,b)=>(a+b)
const addNewNum = (a,b)=>a+b

console.log(addNewNum(2,2));



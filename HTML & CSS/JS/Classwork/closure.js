// Example1
function Counter() {
    var counter = 0;
    console.log(counter);
    function IncreaseCounter() {
        return counter += 1;
    };

    return IncreaseCounter;
}

var counter = Counter();
console.log(counter());
console.log(counter());
console.log(counter());

// Example 2
function greeting() {
    let message = 'Hi';

    function sayHi() {
        console.log(message);
    }
    return sayHi;
}

let hi = greeting();
hi();

// // Example 3
// function greeting(message) {
//     return function(name){
//         return message + ' ' + name;
//     }
//  }
//  let sayHi = greeting('Hi');
//  let sayHello = greeting('Hello');
 
//  console.log(sayHi('John')); // Hi John
//  console.log(sayHello('John'));
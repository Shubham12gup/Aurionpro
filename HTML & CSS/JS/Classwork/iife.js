// Function Expresssion
var expression = function (item){
    console.log('Function expression example '+ item);
}
expression("Hii");



// IIFE Syntax
// (function () {
//     // …
//   })();

// IIFE Addition Example
(function() {

    function add(a, b) {
        return a + b;
    }

    console.log(add(10,20)); 
}());

(function() {
    var x = 20;
    var y = 20;
    var answer = x + y;
    console.log(answer);
})();

// IIFE Example
var iife = function (){
    return 'Immediately Invoked Function Expressions(IIFEs) example ';
}();

console.log(iife);
function Car (model, year, miles) {
    this.model = model;
    this.year = year;
    this.miles = miles;
        
    this.toString = function() {
        return `${this.model} manufacturde in ${this.year} has droven ${this.miles} miles`;
    }
}

// Constructor pattern creates toString method again and again for every object, which uses more memory.
// To overcome this disadvantage we use prototype pattern.

let civic = new Car('Honda Civic', 2009, 20000);
let mondeo = new Car('Ford Mondeo', 2010, 5000);

console.log(civic);
console.log(mondeo);

console.log(civic.toString());
console.log(mondeo.toString());



// Ways to create object

// var newObject = {}; 

// var newObject = new Object();


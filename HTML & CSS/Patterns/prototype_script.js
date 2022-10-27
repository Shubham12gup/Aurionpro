function Car (model, year, miles) {
    this.model = model;
    this.year = year;
    this.miles = miles;
    

    Car.prototype.toString = function() {
        return `${this.model} manufactured in ${this.year} has droven ${this.miles} miles`;
    }
}

// Prototype is used to overcome constructor pattern disadvantage.
// It does not create methods again and again instead uses the same method 
Car.prototype = {
    run: function(speed){
        return 'Car running at ' +speed+ ' speed.'
    },

    stop: function(){
        return 'Stop the car.'
    }
}

let civic = new Car('Honda Civic', 2009, 20000);
let mondeo = new Car('Ford Mondeo', 2010, 5000);

console.log(civic);
console.log(civic.toString());
console.log(civic.run(100));
console.log(civic.stop());

console.log(mondeo);
console.log(mondeo.toString());
console.log(mondeo.run(100));
console.log(mondeo.stop());


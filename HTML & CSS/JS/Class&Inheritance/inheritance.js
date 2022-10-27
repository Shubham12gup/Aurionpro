// parent class
class Person { 
    constructor(name) {
        this.name = name;
        this.occupation = "unemployed";
    }

    // Constructor overloading
    // Constructor overloading is not allowed in javascript. 
    // A class may only have one constructor
    // constructor() {
    //     this.name = "Shubham";
    // }
    
    greet() {
        console.log(`Hello, I am ${this.name}.`);
    }
 
}

// inheriting parent class
class Student extends Person {

    constructor(name) {
        
        // call the super class constructor and pass in the name parameter
        super(name);
        
        // Overriding an occupation property
        this.occupation = 'Student';
    }
    
    // overriding Person's method
    greet() {
        console.log(`Hello, I am ${this.name}.`);
        console.log('Occupation: ' + this.occupation);
    }
}

let student1 = new Student('Jack');
student1.greet();

class Driver extends Person{
    constructor(){
        // super();
        super().name = "Ramu";
        this.occupation = "Driving";
    }

    greet() {
        super.greet();
        console.log('Occupation: ' + this.occupation);
    }
}

let driver = new Driver();
driver.greet();
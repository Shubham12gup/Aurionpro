// Example 1
var myModule = (function() {
    // 'use strict';
  
    var privateProperty = 'I am a private variable';
    var publicProperty = 'I am a public variable';
  
    function privateMethod() {
      console.log(privateProperty);
    }
  
    function publicMethod() {
      privateMethod();
    }
  
    return {
      publicMethod: publicMethod,
      publicProperty: publicProperty
    };
  })();
  
  myModule.publicMethod();
  console.log(myModule.publicProperty);
  console.log(myModule.privateProperty); // is undefined protected by the module closure
//   myModule.privateMethod();

// Example 2
function EmployeeDetails() {
    var name = "Mayank";
    var age = 30;
    var designation = "Developer";
    var salary = 10000;
  
    var calculateBonus = function(amount) {
      return salary + amount;
    }
  
    return {
      name: name,
      age: age,
      designation: designation,
      calculateBonus: calculateBonus
    }
}
  
var newEmployee = EmployeeDetails()
console.log(newEmployee.name);
console.log(newEmployee.age);
console.log(newEmployee.designation);
console.log(newEmployee.salary);

var userSal = newEmployee.calculateBonus(1000);
console.log(userSal);
// Session Storage
window.sessionStorage.setItem("Name", "Shubh");
window.sessionStorage.setItem("Name1", "Rahul");

let nameArr = ["Ashish", "Reena", "Harshal"];
sessionStorage.setItem("nameArray", JSON.stringify(nameArr));

console.log(sessionStorage.getItem("Name"));
console.log(sessionStorage.getItem("Name1"));
console.log(JSON.parse(sessionStorage.getItem("nameArray")));

// console.log(sessionStorage.removeItem("Name1"));

// sessionStorage.clear();

console.log(sessionStorage.key(1));
//-------------------------------------------------------------------

// Local Storage
window.localStorage.setItem("Name", "Shubh");
window.localStorage.setItem("Name1", "Rahul");

let nameArr1 = ["Ashish", "Reena", "Harshal"];
localStorage.setItem("nameArray", JSON.stringify(nameArr1));

console.log(localStorage.getItem("Name"));
console.log(localStorage.getItem("Name1"));
console.log(JSON.parse(localStorage.getItem("nameArray")));

// console.log(localStorage.removeItem("Name1"));

// localStorage.clear();

console.log(localStorage.key(1));

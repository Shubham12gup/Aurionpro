// callback function
const myFunc = function(callback){
    let value = 10;
    callback(value);

}

const demoFunc = function(val){
    console.log(val);
}

myFunc(demoFunc);

myFunc(function(val){
        console.log(val);
    }
);

//Array iterator
const players=["Ashish","Ritesh","Rizwan","Shubham","Shivam","Reena"];
// for(i=0; i<players.length; i++){
//     console.log(players[i]);
// }

// players.forEach(player => {
//     console.log(player);
// })

// Adding elements in unordered list 
// const ul = document.querySelector(".play");
// console.log(ul);
// let html = ``;
// players.forEach(player => {
//         html += `<li>${player}</li>`;
// });

// ul.innerHTML = html;

// Object literals
let player = {
    name : "Sachin",
    age: 35,
    matches: 200,
    tweets: ["India in asia cup", "Federer retires", "Indian cricket in 2025"],
    country: "India",
    // score: function(){
    //     console.log("Highest score is 205");
    // },
    // score: ()=> {
    //     console.log("Highest score is 205");
    // },
    score() {
        console.log("Highest score is 285");
    },

    // printMatches: function(){
    //     console.log("Matches : " + this.matches);
    // },
    printMatches: () =>{
        console.log("Matches : " + this.matches);
    },

    printTweets: function(){
        this.tweets.forEach(tweet => {
            console.log(tweet);
        });
    } 
}
console.log(player);
console.log(player.name);
console.log(player.age);
console.log(player.tweets[0]);
console.log(player.score());
console.log(player.printMatches());
console.log(player.printTweets());


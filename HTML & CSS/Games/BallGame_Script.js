let button = document.querySelectorAll(".btn");
let turns = document.querySelector(".turns");
let gameStatus = document.querySelector(".status");
let guess_no = document.querySelector(".guess_no");

let attempts = 6;
const max = 40;

const random_number = Math.floor(Math.random() * max) + 1;
console.log("Random number: = " + random_number);

turns.innerHTML = attempts;

if (attempts > 0){

    button.forEach(btn =>{
      btn.addEventListener('click', function() {
            attempts = attempts - 1;
            
            if(btn.innerText < random_number){
                console.log(btn.innerText);
                btn.style.backgroundColor = "yellow"
                gameStatus.innerText= "!! Keep trying !! ";
                btn.disabled = true;
            }

            if(btn.innerText > random_number){
                console.log(btn.innerText);
                btn.style.backgroundColor = "red";
                gameStatus.innerText= "!! Keep trying !! ";
                btn.disabled = true;
            }

            if(btn.innerText == random_number){
                btn.style.backgroundColor = "green";
                gameStatus.innerText= "!! You Win !!"
                guess_no.innerText = `${random_number}`;
                
                button.forEach(button=>{ 
                  button.disabled = true;
                })
            }

            if (attempts == 0){
              turns.innerText = attempts;
              gameStatus.innerText = "!! No more turns left, You Lost !!";
              guess_no.innerText = `${random_number}`;
              button.forEach(butn=>{ butn.disabled = true;});
            }

            turns.innerText = attempts;
            
        })
    })
   
}



const button = document.querySelectorAll(".btn")
const turns = document.querySelector(".turns")
const gamestatus = document.querySelector(".gamestatus")
const guessno  = document.querySelector(".guessno")

const max = 40;

const attempts= 6;

const random_number = Math.floor(Math.random() * max) + 1;


console.log("Random number: = " + random_number);


let i = 6;
turns.innerHTML=i


if(i>0){


button.forEach(butn=>{
    butn.addEventListener('click',e=> 
    
        {
            i=i-1;

            if(i==0){
                console.log("disable at attempts:="+ i);
                gamestatus.innerHTML= "!! No More attemps left ! Play again  :(!"
                guessno.innerHTML= random_number
                button.forEach(butn=>{ butn.disabled = true;})

              }

              if(e.target.value<random_number){
                butn.classList.add("bg-warning")
                gamestatus.innerHTML= "!! Keep trying !! "

              }


              if(e.target.value>random_number){
                butn.classList.add("bg-danger")
                gamestatus.innerHTML= "!! Keep trying !! "

              }

              if(e.target.value==random_number){
                butn.classList.add("bg-success")
                gamestatus.innerHTML= "!! You Win !! :)"
                guessno.innerHTML= random_number
            
                button.forEach(butn=>{ butn.disabled = true;})

              }
              turns.innerHTML=i
           
            console.log("button clicked value = "+e.target.value);

                console.log("attempts:="+ i);

            
           


      

           
           
        })

       
    
    });


}









 







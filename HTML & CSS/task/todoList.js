const ul =  document.querySelector("ul")
const input = document.querySelector("input")
const button = document.querySelector("button")

let html = ``

button.addEventListener('click', e=>{
   
    if(input.value!="")

   {html +=` 


   <div class="task">
   <span id="taskname">
   <li class="list-group-item">${input.value} </li>
   </span>
       <i class="far fa-trash-alt"></i>

</div>


`;

   ul.innerHTML+=html

   input.value=""
   html = ``}


});


// {html +=`   <li class="list-group-item">${input.value} <i class="fa-solid fa-trash-can"></i></li>`;

// ul.innerHTML+=html

// input.value=""
// html = ``}






ul.addEventListener('click',e=>{

    if(e.target.localName=="i")
    { e.target.parentElement.remove() }
})
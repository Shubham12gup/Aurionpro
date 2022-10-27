const form = document.querySelector("#myForm");

async function loadIntoTable(url,table){
    const response = await fetch(url);
    const data = await response.json();
    console.log(data);
    let index = 1;
    data.forEach(element => {
        
        table.innerHTML += 
        `<tr>
            <td>${index}</td>
            <td>${element.rollNo}</td>
            <td>${element.name}</td>
            <td>${element.age}</td>
            <td>${element.email}</td>
            <td><button id="${element.id}" onclick="deleteStudent(this)">Delete</button></td>
            <td><button id="${element.id}" onclick="update(this)">Edit</button></td>
        </tr>
        `
        index++;
    });
    let h3 = document.querySelector("h3");
    h3.innerText = `Total records found : ${index-1}`;
    
}

loadIntoTable("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",document.querySelector("table"));




const btn = document.getElementById('btn');
form.style.display = 'none';



 function update(student){

    console.log(student.id);

    var update=student.id;
    
    const form = document.getElementById('myForm');


    if (form.style.display === 'none') {
      // // 👇️ this SHOWS the form
       form.style.display = 'block';
      // form.style.display = 'none';
    } else {
      // 👇️ this HIDES the form
       form.style.display = 'none';
     
    }


    let name = document.querySelector("#name");
    let rollNo = document.querySelector("#roll");
    let age = document.querySelector("#age");
    let email = document.querySelector("#email");

    form.addEventListener('submit',async (e)=>{
        e.preventDefault();
        const newStudent = {
            rollNo : rollNo.value,
            name : name.value,
            age : age.value,
            email : email.value
        };

        var url="http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students";
   
        fetch(`${url}/${update}`,{
             
             method : 'PUT',
    
             body: JSON.stringify(newStudent),
                 headers : {'Content-Type': 'application/json; charset=UTF-8'}
             });
                 
    })

            // const student = await response.json();
            //  return student;
            
       
}

// form.addEventListener('submit',async (e)=>{
// e.preventDefault();
// const newStudent = {
//     rollNo : rollNo.value,
//     name : name.value,
//     age : age.value,
//     email : email.value
// };
// // const createdStudent = update(newStudent);

// // console.log(createStudent);
// });


function deleteStudent(student){
   
    var url="http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students";
    var del=student.id;

    console.log(del);
    fetch(`${url}/${del}`,{
        method:'DELETE'
    })
    .then(res=>res.json)
    student.parentNode.parentNode.remove();
    }


// function  editStudent(student){

//     console.log(student);

//     const form = document.getElementById('myForm');


//     if (form.style.display === 'none') {
//       // // 👇️ this SHOWS the form
//        form.style.display = 'block';
//       // form.style.display = 'none';
//     } else {
//       // 👇️ this HIDES the form
//        form.style.display = 'none';
     
//     }






//     var url="http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students";
//     var update=student.id;
//     fetch(`${url}/${update}`,{
//         method:'PUT',
//         body : JSON.stringify(
//             {
//                 rollNo : rollNo,
//                 name : name,
//                 age : age,
//                 email : email
//             }
//             ),
//             headers : {'Content-Type': 'application/json; charset=UTF-8'}
//     });

//     }











// btn.addEventListener('click', () => {
//   const form = document.getElementById('myForm');


//   if (form.style.display === 'none') {
//     // // 👇️ this SHOWS the form
//      form.style.display = 'block';
//     // form.style.display = 'none';
//   } else {
//     // 👇️ this HIDES the form
//      form.style.display = 'none';
   
//   }
// });
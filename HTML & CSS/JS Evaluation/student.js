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
        </tr>
        `
        index++;
    });
    let h3 = document.querySelector("h3");
    h3.innerText = `Total records found : ${index-1}`;
    
}

loadIntoTable("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",document.querySelector("table"));

const form = document.querySelector("#form");
let roll = document.querySelector("#roll");
let name = document.querySelector("#name");
let age = document.querySelector("#age");
let email = document.querySelector("#email");


const createStudent = async(s) =>{
    const response = await fetch('http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students',{
        method: 'POST',
        body: JSON.stringify({
            roll: s.roll,
            name: s.name,
            age: s.age,
            email: s.email,
        }),
        headers: {
            'Content-type': 'application/json; charset=UTF-8',
        },  
    })

    const student = response.json();
    return student;
};

form.addEventListener('submit',async (e)=>{
    e.preventDefault();
    const newStudent = {
        roll : roll.value,
        name : name.value,
        age : age.value,
        email : email.value
    };

    const createdStudent = await createStudent(newStudent); 
    
    console.log(createdStudent.value);
    });


function deleteStudent(student){
   
    var url="http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students";
    var del=student.id;
    fetch(`${url}/${del}`,{
        method:'DELETE'
    })
    .then(res=>res.json)
    student.parentNode.parentNode.remove();
}
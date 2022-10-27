// DOM 

// const para = document.querySelector("p");

// console.log(para);

// para.innerText = "Statement updated to Wonderful world";

// const paras = document.querySelectorAll("p");
// console.log(paras);

// paras.forEach(para=>{
//     para.innerText+= " more text....";
// });

// const errPara = document.querySelector(".error");

// console.log(errPara);

// errPara.innerText = "Error message changed.....";

// const welcomePara = document.querySelector("#welcome");
// const welcomePara = document.getElementById("welcome");
// console.log(welcomePara);

// // const errortag = document.querySelectorAll(".error");
// const errortag = document.getElementsByClassName("error");

// const para = document.querySelector(".content");
// para.innerHTML= "<h1>New content added....</h1>";

// const players=["Sachin","Sehwag","Yuvi","Dravid"];

// players.forEach(player => {
//     para.innerHTML += `<p>${player}</p>`;
// });

// Table
// const studentDetails=[
//     {id:101,name:"Ritesh",course:"BE-CS",gradYear:2022},
//     {id:102,name:"Divesh",course:"BE-Auto",gradYear:2021},
//     {id:103,name:"Ganesh",course:"BE-IT",gradYear:2022},
//     {id:104,name:"Mangesh",course:"BE-Mech",gradYear:2020},
//     {id:105,name:"Pritesh",course:"BE-CS",gradYear:2023},
//     {id:106,name:"Mahesh",course:"BE-IT",gradYear:2022}
// ];

// const table = document.querySelector("table");
// studentDetails.forEach(student => {
//     table.innerHTML += `<tr>
//     <td>${student.id}</td> 
//     <td>${student.name}</td>
//     <td>${student.course}</td>
//     <td>${student.gradYear}</td>`;
// });

// const link = document.querySelector("a");
// console.log(link.getAttribute("href"));

// link.setAttribute("href", "https://www.instagram.com");
// link.innerText = "Link to instagram"
// console.log(link.getAttribute("href"));

// const para = document.querySelector("p");

// para.setAttribute("class", "success")
// para.setAttribute("style", "color:green")
// para.innerHTML = "Some success text in para";

// adding and removing css
const para= document.querySelector(".error"); 
para.classList.replace("error", "success");

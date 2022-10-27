// JS inbuilt API - fetch api
// Internally fetch api implemnts promise
// fetch returns promise to 

fetch("Books.json").then((response)=>{
    // console.log("resolved",response);
    // console.log(response.json());
    return response.json();
}).then((data)=>{
    console.log(data);
    return fetch("journal.json")
            .then((response)=>{
                return response.json();
            }).then((data)=>{
                console.log(data);
            });
}).catch((err)=>{
    console.log("error",err);
})
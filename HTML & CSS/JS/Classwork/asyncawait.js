// Async await

// const getTodos = async()=>{

//     const response = await fetch("Books.json");
//     const data = await response.json();
//     console.log(data);

//     const response1 = await fetch("journal.json");
//     const data1 = await response1.json();
//     console.log(data1);
// };

// const test = getTodos();
// console.log(test);

const getTodos = async (resource) =>{

    const response = await fetch(resource);
    const data = await response.json();
    return data;
};

getTodos("Books.json").then((data)=>{
    console.log(data);
}).catch((err)=>{
    console.log("Could not fetch data");
});

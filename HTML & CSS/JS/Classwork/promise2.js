const getTodos=(resource)=>{

    return new Promise((resolve, reject)=>{
        const request = new XMLHttpRequest();

        request.addEventListener('readystatechange',()=>{
            if(request.readyState==4 && request.status==200){
                const data=JSON.parse(request.responseText)
                resolve(data);
            }
            else if(request.readyState==4){
                reject("data could not be fetched...");
            }
        });
        request.open("GET", resource);
        request.send();
    });
};

// getTodos("journal.json").then((data)=>{
//     console.log(data);
// }).catch((err)=>{
//     console.log(err);
// });

// Chaining promises
// getTodos("Books.json").then((data)=>{
//     console.log(data);
//     getTodos("journal.json").then((data)=>{
//         console.log(data);
//         getTodos("Books.json").then((data)=>{
//             console.log(data);
//             getTodos("journal.json").then((data)=>{
//                 console.log(data);
//             }).catch((err)=>{
//                 console.log(err);
//             });
//         }).catch((err)=>{
//             console.log(err);
//         });
//     }).catch((err)=>{
//         console.log(err);
//     });
// }).catch((err)=>{
//     console.log(err);
// });

getTodos("Books.json").then((data)=>{
    console.log(data);
    return getTodos("journal.json");
}).then((data)=>{
    console.log(data);
    return getTodos("Books.json");
}).then((data)=>{
    console.log(data);
    return getTodos("journal.json");
}).then((data)=>{
    console.log(data);
}).catch((err)=>{
    console.log(err);
});
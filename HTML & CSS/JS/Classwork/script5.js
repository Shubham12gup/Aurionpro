// setTimeout()

// for(i=0; i<100; i++){
// console.log("@");
// }
// console.log(1);

// console.log(2);
// console.log(3);
// console.log(4);
// console.log(5);

//XMLHttpRequest
// used to request data from external servers
// Request are made to API end points

/**
 * Ready State
 * 0-Unsent
 * 1-Open
 * 2-Headers recieved
 * 3-Loading
 * 4-Complete/Done
 */

/**
 * Response Status
 * Note- for correct url status code-200
 * 
 * 100-199: informational response
 * 200-299: success response
 * 300-399: Redirection messages
 * 400-499: Client erroe messages
 * 500-599: server error messages 
 */

// const getTodos=()=>{
// const request = new XMLHttpRequest();

// request.addEventListener('readystatechange', ()=>{
//     if (request.readyState == 4 && request.response == 200){
//         console.log(request.responseText);
//     }
//     else if (request.readyState == 4){
//         console.log("could not fetch data...");
//     }
// });

// request.open("GET", "https://jsonplaceholder.typicode.com/todoss/");

// request.send();
// }

// getTodos();

// const getTodos=(callback)=>{
//     const request = new XMLHttpRequest();

//     request.addEventListener('readystatechange',()=>{
//         if(request.readyState==4 && request.status==200){
//             const data=JSON.parse(request.responseText)
//             callback(undefined,data)
//             // console.log(request.responseText);
//         }
//         else if(request.readyState==4){
//             // console.log("could not fetch data...");
//             callback("could not fetch data...",undefined)
//         }
//     });
//     request.open("GET", "https://jsonplaceholder.typicode.com/todos/")
//     // request.open("GET","Books.json");
//     request.send();
// }

// getTodos((err,data)=>{
//     console.log("callback called...");
//     if(err){
//         console.log(""+err);
//     }
//     else{
//         console.log(data);
//     }
// });


// Callback Hell
const getTodos=(resource, callback)=>{
    const request = new XMLHttpRequest();

    request.addEventListener('readystatechange',()=>{
        if(request.readyState==4 && request.status==200){
            const data=JSON.parse(request.responseText)
            callback(undefined,data)
            // console.log(request.responseText);
        }
        else if(request.readyState==4){
            // console.log("could not fetch data...");
            callback("could not fetch data...",undefined)
        }
    });
    request.open("GET",resource);
    request.send();
}

getTodos("Books.json", (err,data)=>{
    console.log(data);
    getTodos("journal.json", (err,data)=>{
        console.log(data);
        getTodos("Books.json", (err,data)=>{
            console.log(data);
            getTodos("journal.json", (err,data)=>{
                console.log(data);
            });
        });
    });
});

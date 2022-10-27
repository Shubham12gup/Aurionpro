// promise- resolve, rejected

const getSomething=()=>{
    return new Promise((resolve, reject)=>{
        resolve("data received..");
        reject("Could not fetch data..");
    });
};

// getSomething().then((data)=>{
//     console.log(data);
// }, (err)=>{
//     console.log(err);
// });

getSomething().then((data)=>{
    console.log(data);
}).catch((err)=>{
    console.log(err);
});
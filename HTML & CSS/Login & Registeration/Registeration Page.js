function validateForm(){
    let email = document.getElementById("Email").value;
    let pwd = document.getElementById("psw").value;
    let confirmPwd = document.getElementById("confirm-psw").value;
    let number = document.getElementById("number").value;
    let date = document.getElementById("birthday").value;

    var mailformat = /^w+([.-]?w+)*@w+([.-]?w+)*(.w{2,3})+$/;
    if (email.value.match(mailformat)){
        alert("Email entered is correct fill other details.")
    }
    else{
        alert("Email entered is invalid.")
    }

    


    

}
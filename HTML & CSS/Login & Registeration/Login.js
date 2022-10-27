function validateForm() {
    let name = document.getElementById("uname").value;
    if (name == "") {
        // text = "Please enter user name"; 
        alert("Please enter user name");
        return false;
    }

    let pwd = document.getElementById("psw").value;
    if (pwd == "") {
        alert("Please enter password");
        return false;
    }

    if (pwd.length < 8) {
        alert("Password length must be atleast 8 characters");
        return false;
    }
    if (pwd.length > 15) {
        alert("Password length must be less than 15 characters");
        return false;
    }
    
}
$(document).ready(function () {

    var value = $("#psw").val();
    $.validator.addMethod("pwcheck", function (value) {
        return /^[A-Za-z0-9\d=!\-@._*]*$/.test(value) && /[a-z]/.test(value) && /\d/.test(value) && /[A-Z]/.test(value);
    });

    $("#basicform").validate({
        errorClass: "error",
        // validClass: "valid success-alert",

        rules: {
            name: {
                required: true,
                minlength: 2
            },

            email: {
                required: true,
                Email: true
            },


            psw: {
                required: true,
                minlength: 8,
                maxlength: 15,
                pwcheck: true
            },

            confirm: {
                required: true,
                equalTo: "#psw"
            },

            number: {
                required: true,
                minlength: 10,
                maxlength: 10
            },

            remember: {
                required: true
            }

        },

        messages: {
            name: {
                required:"Please enter name",
                minlength: "Name should be at least 2 characters"
            },

            email: {
                required:"Please enter email",
                email: "The email should be in the format: abc@domain.com"
            },

            psw: {
                required:"Please enter password",
                pwcheck: "Password should include one Lowercase letter, one Uppercase letter, one number and one special character"
            },

            confirm: {
                required: "Please re-enter password",
                equalTo: "Password doesnt match"
            },

            number: {
                required: "Please enter number",
                minlength: "Phone number should be of 10 numbers" 

            },

            remember: {
                required: ""
            }
        },

        submitHandler: function (form) {
            form.submit();
        }

    });
});
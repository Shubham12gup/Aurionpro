import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormBuilder, Validators} from '@angular/forms'

@Component({
  selector: 'app-user-types',
  templateUrl: './user-types.component.html',
  styleUrls: ['./user-types.component.css']
})
export class UserTypesComponent implements OnInit {

  constructor(private formBuilder:FormBuilder) { }

  ngOnInit(): void {}

  // formBuilder:FormBuilder = new FormBuilder();

    addUserTypeForm: FormGroup = this.formBuilder.group(
      {
        "userName": new FormControl('',[
          Validators.minLength(6),
          Validators.maxLength(15),
          Validators.required
        ]),

        "password": new FormControl('', 
        [
          Validators.required,
          Validators.pattern(/^[\w]+$/)
        ]),

        "userDescription": new FormControl('',[
          Validators.pattern(/^[\w]+$/),
          // Validators.pattern("^[A-Za-z]+$"),
          Validators.required
        ]),

        "userGender": new FormControl('', Validators.required),
        "conditions": new FormControl('', Validators.required)
      }
    );

  addUser(){
    console.log(this.addUserTypeForm.value);
    
  }

  reset(){
    this.addUserTypeForm.reset();
  }


  
 

}

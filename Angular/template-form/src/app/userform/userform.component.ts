import { Component, OnInit } from '@angular/core';
import { NgForm} from "@angular/forms";

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  userName: string = "";
  userType: string = "";
  userGender: string = "male";
  conditions: boolean = false;

  addUser(formData: NgForm ){
    console.log(formData.value);
  }
}

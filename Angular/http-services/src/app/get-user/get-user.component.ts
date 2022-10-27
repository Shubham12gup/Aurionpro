import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service'
@Component({
  selector: 'app-get-user',
  templateUrl: './get-user.component.html',
  styleUrls: ['./get-user.component.css']
})
export class GetUserComponent implements OnInit {

  users:any;
  constructor(private service: UserService) { }

  ngOnInit(): void {
    this.users = this.service
    .getUsers()
    .subscribe((data) => {this.users = data
      console.log(data);
      
    });
  }



}

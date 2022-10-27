import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service'; 

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {

  constructor(private service: UserService) { }

  ngOnInit(): void {
    this.service.updateUser();
  }

}

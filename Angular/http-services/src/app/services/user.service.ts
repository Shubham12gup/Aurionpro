import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  
  getUsers(){
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }

  updateUser(){
    const updateBody = { name: "Shubh", email: "shubh@gmail.com"};

    return this.http
    .put('https://jsonplaceholder.typicode.com/users/1', updateBody)
    .subscribe((data) => { console.log(data); });
  }

  deleteUser(){
    return this.http.delete('https://jsonplaceholder.typicode.com/users/2')
    .subscribe((data) => { console.log(data); });
  }
}

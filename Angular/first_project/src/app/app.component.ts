import { Component } from '@angular/core';
import { bufferToggle } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'first_project';
  name = 'Shubham';


  displayText = "";
  getValue(box:string){
    this.displayText = box;
  }

  isDisabled = false;
  disableInput(){
    if(this.isDisabled){
      this.isDisabled= false;
    } else {
      this.isDisabled= true;
    }
  }


  show:boolean = true;

  //switch
  color:string = "yell";

// for loop using list tag
  players = ["Shubham", "Ritesh", "Shivam", "Harshal"];

  batsman = [
    {name:"Ashish", country: "India", run: 2000, matches: 100},
    {name:"Dhoni", country: "India", run: 2000, matches: 200},
    {name:"Sachin", country: "India", run: 3000, matches: 300},
    {name:"Virat", country: "India", run: 4000, matches: 400}
  ];

  scoreDetails = [
    {name:"Dhoni", matches:100, lastFiveInningScores: [10, 20, 30, 40, 50]},
    {name:"Sachin", matches:200, lastFiveInningScores: [10, 20, 30, 40, 50]},
    {name:"Rahul", matches:300, lastFiveInningScores: [10, 20, 30, 40, 50]},
    {name:"Raina", matches:400, lastFiveInningScores: [10, 20, 30, 40, 50]}
  ];

  fontColor="black";
  bgColor= "green";

  //Toggle color 
  toggleColor(){
    if(this.bgColor === 'black'){
      this.bgColor = 'green';
      this.fontColor = 'black'; 
    } else {
      this.bgColor = 'black';
      this.fontColor = 'green';
    }
  }

  //To-do list
  taskList: Array<{id: Number, task: String}> = [];
  task = "";
  id=0;

  addTask(taskName:string){
    this.id = this.id++;
    this.task = taskName;
    this.taskList.push({id: this.id, task: this.task});
  }

  removeTask(task: any){
    this.taskList = this.taskList.filter(item => item !== task);
  }







}

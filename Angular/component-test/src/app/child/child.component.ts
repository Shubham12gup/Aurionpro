import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  i:number=0;

  increment(){
    if(this.i<=9)
      this.i++;
  }

  decrement()
  {
    if(this.i>=1)
      this.i--;
  }
}

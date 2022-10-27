import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  name:any ="Shubh";

  numbers = [1, 2, 3, 4];

  today = Date.now();

  person = { name:"Shubh"};

  number = 10.3456789;

}

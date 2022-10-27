import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'component-test';
  i:number = 10;

  items= ["1", "2", "3"];

  addItem(item:any){
    this.items.push(item);
  }

  x:any
  displayItem(item:any){
    this.x=item;
  }

  //ngModel
  text1:any;

  // displayText(text:any){
  //   this.text = text;
  // }

  fontSize:number=16;

  today = Date.now();

}

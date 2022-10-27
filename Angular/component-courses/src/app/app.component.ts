import { Component } from '@angular/core';
import { COURSES } from 'src/db-data';
import { Course } from './model/course';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'component-courses';

  javaCourse = COURSES[0];
  pythonCourse = COURSES[1];
  cloudCourse = COURSES[2];

  onCourseSelected(course:Course){
    console.log(course);
  }

}

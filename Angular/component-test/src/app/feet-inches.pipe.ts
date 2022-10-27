import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'feetInches'
})
export class FeetInchesPipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    return value*12;
  }

}

import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'stringWords'
})
export class StringWordsPipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {

    return value.split(" ").slice(0, args[0]).join(" ") + args[1];
  }

}

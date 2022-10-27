let before = '12-09-2000';
before = new Date(before);
console.log(before);

let today = new Date();
console.log(today);

console.log(`Difference in days ${differenceInDays(today, before)}`);
import { format, compareAsc } from 'date-fns'

format(new Date(2014, 1, 11), 'MM/dd/yyyy')
//=> '02/11/2014'

// const dates = [
//   new Date(1995, 6, 2),
//   new Date(1987, 1, 11),
//   new Date(1989, 6, 10),
// ]
// dates.sort(compareAsc)

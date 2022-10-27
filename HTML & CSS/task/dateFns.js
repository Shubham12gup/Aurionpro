

// const dates = [
//   new Date(1995, 6, 2),
//   new Date(1987, 1, 11),
//   new Date(1989, 6, 10),
// ]
// dates.sort()

// console.log(dates);
//=> [
//   Wed Feb 11 1987 00:00:00,
//   Mon Jul 10 1989 00:00:00,
//   Sun Jul 02 1995 00:00:00
// ]



// const result = differenceInDays(
//     new Date(2020, 5, 1),
//     new Date(2020, 2, 1)
//   )


  // Which date is closer to 6 September 2015?
// const dateToCompare = new Date(2015, 8, 6)
// const datesArray = [
//   new Date(2015, 0, 1),
//   new Date(2016, 0, 1),
//   new Date(2017, 0, 1)
// ]
// const result = closestIndexTo(dateToCompare, datesArray)



import format from 'date-fns';
var result = format(
    new Date(2014, 1, 11),
    'MM/DD/YYYY'
) 
console.log('Result: ',result);




// import { format } from 'date-fns';
// const date = new Date();
// console.log(date);
// console.log(`${format(date, 'dd.MM.yyyy')}`);
// console.log(`${format(date, 'yyyy-MM-dd').toString()}`);
// console.log(`today is ${format(date, 'EEEE, MMMM yyyy')}`);
// console.log(`today is  ${format(date, 'EEEE,MMMM do, yyyy hh:mm a')}`);
// console.log(`Today's date: ${format(date, 'MMMM, yyyy')}`);
// console.log(`Today's date: ${format(date, 'MMMM.do.')}`);
// console.log(`Today's date: ${format(date, 'EEEE do HH:mm ')}`);
// console.log(`${format(date, 'EEEE,MMMM do, yyyy ppppp')}`);
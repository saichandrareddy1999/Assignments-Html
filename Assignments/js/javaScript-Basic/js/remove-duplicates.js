var first = [ 1, 2, 3 ];
var second = [100,2,1,10] ;
 
var difference = first.filter(x => !second.includes(x));
console.log(difference);
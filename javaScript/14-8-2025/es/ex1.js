let numbers = [1,5,3,4,5]
let sum =0;
// const f = (numbers)=>{
//    for (let i = 0; i < numbers.length; i++) {
    
//     sum += numbers[i];
   
//    }
//     return sum;
// }

const f = (numbers) => numbers.reduce((acc, num) => acc + num, 0)

console.log((f(numbers)));
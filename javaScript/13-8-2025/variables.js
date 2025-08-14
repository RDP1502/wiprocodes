var a = 4;
let b = 5;
const c = 6;


if (a < b){
    a = 10;
    b = 20;
    console.log("in for loop")
    console.table([a,b])
}

console.log("outside for loop")
console.table([a,b,c])



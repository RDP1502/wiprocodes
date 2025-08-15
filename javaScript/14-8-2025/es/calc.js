import multiply from "./operations.js";
import { divide } from "./operations.js";

let mulResult = multiply(5,10)
console.log("Multiplication Result:", mulResult);
let divResult = divide(10,2)
console.log("Division Result:", divResult);
let divResultZero = divide(10,0)
console.log("Division Result:", divResultZero);

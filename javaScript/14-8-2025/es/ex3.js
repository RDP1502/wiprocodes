class Util{
   getTodayDate(){
    let today = new Date()
    let day = today.getDate()
    let month = today.getMonth()+1
    let year = today.getFullYear()
    return `${day}/${month}/${year}`
    
   }

   getPivalue(){
    return Math.PI;
   }

   convertToFahrenheit(celsius){
    return (celsius * 9/5) + 32;
   }

   fibonacci(n){
    let fib = [0, 1];
    for (let i = 2; i < n; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib;
   }
}

let util = new Util()

console.log(util.getTodayDate())
console.log(util.getPivalue())
console.log(util.convertToFahrenheit(30))
console.log(util.fibonacci(5))
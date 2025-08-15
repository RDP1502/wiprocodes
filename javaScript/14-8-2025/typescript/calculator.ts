class Operation{

    add(a:number, b:number):number{
        return a+b
    }

    substract(a:number, b:number):number{
        return a-b
    }

}

let op = new Operation()
console.log(op.add(5,4))
console.log(op.substract(10,2))
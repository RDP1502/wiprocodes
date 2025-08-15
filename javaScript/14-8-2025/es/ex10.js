function sumNumers(...args){
    return args.reduce((acc, number)=> acc +number, 0)
}

console.log(sumNumers(1,2,3,4))
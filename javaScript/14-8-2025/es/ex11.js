function seprateFirst(...args){
    let first = args[0];
    let rest = args.slice(1)
    return {first, rest}

}

console.log(seprateFirst(1,2,3,4,5))
let elements = [1,2,3]
function add(a,b,c){
    return a+b+c;
}

let result = add(...elements)
console.log(result)
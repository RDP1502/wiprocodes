export default function multiply(a,b){
    return a*b
}

export function divide(a,b){
    if(b == 0){
        console.log("Cannot divide by zero");
        return null
    }
    else{
        return a/b
    }
    
}
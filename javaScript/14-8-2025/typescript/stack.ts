class Stack<T>{
    private value: T[] = [];

    constructor(value){
        this.value = value
    }

    push(item:T): void{
        this.value.push(item)

    }

    pop():T|undefined{
       return this.value.pop()

    }

    peek():T|undefined{
        return this.value[this.value.length-1]

    }

}


let stack = new Stack<string>(["hello", "welcome"])
stack.push("help")
stack.pop()
stack.peek()
console.log(stack)
class box<T>{
    private value:T;

    constructor(value){
        this.value = value
    }

    getValue():T{
        return this.value;
    }
}

let shape = new box<string>("Rohan");
console.log(shape)
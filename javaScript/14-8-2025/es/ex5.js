class vehical {
    constructor(make, model, year){
        this.make = make
        this.model = model
        this.year = year
    }

    getInfo(){
        return `${this.year} ${this.make} ${this.model}`
    }
}
class Car extends vehical {
    constructor(make, model, year, numDoors){
        super(make, model, year)
        this.numDoors = numDoors
    }

    getInfo(){
        return `${this.year} ${this.make} ${this.model} with ${this.numDoors} doors`
    }
}

let myCar = new Car("Mustang", "GT", 2021, 2)
console.log(myCar.getInfo())




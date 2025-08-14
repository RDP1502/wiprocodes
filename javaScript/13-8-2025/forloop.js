// let names = ["Rohan", "harshwardhan", "atharv", "shreyash", "nikhil"]
// let filteredNames = names.filter((name)=>name.length>5)
// let upperCaseNames = filteredNames.map((name)=>{return name.toUpperCase()})
// console.log(upperCaseNames);


let nameList = [
    {
        name: "Rohan",
        age: 20,
        city : "jath"

    },
     {
        name: "atharv",
        age: 17,
        city : "sangli"

    },
     {
        name: "vinay",
        age: 12,
        city : "kolhapur"

    },
     {
        name: "shreyash",
        age: 22,
        city : "Pune"

    },
     {
        name: "nikhil",
        age: 56,
        city : "Pune"

    }

]

// let filteredList = nameList.filter((person) => person.age > 18 )

//for (let i=0; i<filteredList.length; i++){
    // console.log(filteredList)
//}

// for(let i=0; i<nameList.length; i++){
//     if(nameList[i].age>18){
//         nameList[i].property = "adult";
//     }
//     else{
//         nameList[i].property = "Minor";
//     }
// }
// console.table(nameList);

nameList.map((person)=> person.age>18? person.property = "adult": person.property = "Minor");
//nameList.map((person)=>( if(person.age>18)person.property = "adult"; else person.property = "Minor"));
console.table(nameList);
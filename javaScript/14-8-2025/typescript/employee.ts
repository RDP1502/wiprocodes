interface Employee{
    empId : number;
    empName : string;
    empSalary: number;
    
}

let employeeList:Employee[]=[
     { empId: 1, empName: "Rohan", empSalary: 50000 },
        { empId: 2, empName: "Atharv", empSalary: 60000 },
        { empId: 3, empName: "Vinay", empSalary: 75000 }
]

function getEmp(employee:Employee[]):number{
    employee.forEach(employee=>{
        console.log(`ID:${employee.empId}, Name: ${employee.empName} Salary: ${employee.empSalary}`)
    })
    return employee.length

}
var employeeList = [
    { empId: 1, empName: "Rohan", empSalary: 50000 },
    { empId: 2, empName: "Atharv", empSalary: 60000 },
    { empId: 3, empName: "Vinay", empSalary: 75000 }
];
function getEmp(employee) {
    employee.forEach(function (employee) {
        console.log("ID:".concat(employee.empId, ", Name: ").concat(employee.empName, " Salary: ").concat(employee.empSalary));
    });
    return employee.length;
}

let count =getEmp(employeeList)
console.log(count) 
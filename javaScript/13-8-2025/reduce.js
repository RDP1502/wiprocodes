let empList = [
    {
        empName:"john",
        empId: 101,
        role:"Manager",
        salary:50000
    },
     {
        empName:"john",
        empId: 101,
        role:"Manager",
        salary:50000
    },
     {
        empName:"john",
        empId: 101,
        role:"QA",
        salary:50000
    },
     {
        empName:"john",
        empId: 101,
        role:"Dev",
        salary:50000
    },
     {
        empName:"john",
        empId: 101,
        role:"QA",
        salary:50000
    },
     {
        empName:"john",
        empId: 101,
        role:"Dev",
        salary:50000
    },
     {
        empName:"john",
        empId: 101,
        role:"Manager",
        salary:50000
    },
]


let filteredEmpList = empList.filter((emp) => emp.role === "Manager").reduce((acc, emp)=> (acc+emp.salary),0);

let totalSalary = filteredEmpList.reduce((acc, emp)=> (acc+emp.salary),0);
console.log("Total Salary of Managers: "+ filteredEmpList);
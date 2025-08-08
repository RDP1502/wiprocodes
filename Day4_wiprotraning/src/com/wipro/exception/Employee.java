package com.wipro.exception;

public class Employee implements Comparable<Employee> {
	
	String empName;
	String empId;
	int empAge;
	double empSalary;
	
	

	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getEmpId() {
		return empId;
	}



	public void setEmpId(String empId) {
		this.empId = empId;
	}



	public int getEmpAge() {
		return empAge;
	}



	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}



	public double getEmpSalary() {
		return empSalary;
	}



	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
	public Employee(String empName, String empId, int empAge, double empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}



	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Double.compare(this.getEmpSalary(), o.getEmpSalary());
		//return this.getEmpSalary().compareTo(o.getEmpSalary());
	}

}

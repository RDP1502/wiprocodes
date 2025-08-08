package com.wipro.fileio;

public class Employee {
	String empName;
	int empAge;
	int empSalary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public Employee(String empName, int empAge, int empSalary) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary + "]";
	}
	

}

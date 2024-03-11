package com.empinfo.springbootdemo.model;

public class EmpInfo {
	private String empId;
	private String empName;
	private String empSalary;
	
	
	public EmpInfo() {
		
	}
	
	public EmpInfo(String empId, String empName, String empSalary) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	
	

}

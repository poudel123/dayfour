package com.capgemini.icici.domain.domain;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private int employeePhone;
	private double basicSalary;
	public final double specialAllowance = 250.80;
	public final double hra = 1000.50;
	public Employee() {
		
	}
	public Employee(long Id,String Name, String Address, int Phone) {
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress=Address;
		this.employeePhone=Phone;
		
	}
	public  double calculateSalary() {
		double salary;
		salary = (basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100));
		System.out.println(salary);
		
		return salary;
		
	}


}


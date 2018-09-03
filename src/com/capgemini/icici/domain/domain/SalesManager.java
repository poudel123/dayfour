package com.capgemini.icici.domain.domain;

public class SalesManager extends Employees {
	
	// TODO Auto-generated constructor stub

private double petrolAllowance;
private double foodAllowance;
private double otherAllowance;




public SalesManager(double basicSalary, double employeeId, String employeeName) {
	super(basicSalary, employeeId, employeeName);
	// TODO Auto-generated constructor stub
}



@Override
public double calculateNetSalary()
{
	petrolAllowance=0.08*getBasicSalary();
	foodAllowance=0.13*getBasicSalary();
	otherAllowance=0.03*getBasicSalary();
	return super.calculateNetSalary()+petrolAllowance+foodAllowance+otherAllowance;
	
}




	
}

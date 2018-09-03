package com.capgemini.icici.domain.domain;

public class Employees {

		private double basicSalary;
		private double employeeId;
		private String employeeName;
		public static final double medical=250.80;
		public static final double pt=1000.50;
		public Employees(double basicSalary, double employeeId, String employeeName) {
			super();
			this.basicSalary = basicSalary;
			this.employeeId = employeeId;
			this.employeeName = employeeName;
		}

		public double getBasicSalary() {
			return basicSalary;
		}
		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}
		public double getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(long employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public static double getMedical() {
			return medical;
		}
		public static double getPt() {
			return pt;
		}
		
		public double calculateNetSalary() {
			double salary;
			double hra=0.5*basicSalary;
			
			double pf=0.12*basicSalary;
			double grossSalary;
			grossSalary=hra+basicSalary+medical;
			salary=grossSalary-(pf+pt);
			return salary;
			
		}
		
		

	}


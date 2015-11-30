package com.aurotech.dto;

import java.util.Date;

import com.aurotech.java.core.util.CommonDTO;

public class Employee extends CommonDTO {
	
public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobID() {
		return jobID;
	}
	public void setJobID(String jobID) {
		this.jobID = jobID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommision() {
		return commision;
	}
	public void setCommision(double commision) {
		this.commision = commision;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public int getDeptID() {
		return deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	
/*@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", fullName=" + fullName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", hireDate=" + hireDate + ", jobID=" + jobID + ", salary="
				+ salary + ", commision=" + commision + ", manager=" + manager
				+ ", deptID=" + deptID + "]\n";
	}
*/
int employeeID;
String fullName;
String email;
String phoneNumber;
Date hireDate;
String jobID;
double salary;
double commision;
int manager;
int deptID;


}

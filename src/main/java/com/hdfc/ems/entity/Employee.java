package com.hdfc.ems.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="employeeId")
private int employeeId;
@Column(name="employeeName")
private String employeeName;
@Column (name="DateOfBirth")
private Date DateOfBirth;
public int getEmployeeId() { 
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String EmployeeName) {
	this.employeeName = EmployeeName;
}
public Date getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(Date DateOfBirth) {
	this.DateOfBirth = DateOfBirth;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int employeeId, String EmployeeName, Date DateOfBirth) {
	super();
	this.employeeId = employeeId;
	this.employeeName = EmployeeName;
	this.DateOfBirth = DateOfBirth;
}


}

package com.hdfc.ems.dto;

import java.time.LocalDate;

public class EmployeeDto {
private int employeeId;
private String EmployeeName;
private LocalDate date;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public EmployeeDto() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeDto(int employeeId, String employeeName, LocalDate date) {
	super();
	this.employeeId = employeeId;
	EmployeeName = employeeName;
	this.date = date;
}

}

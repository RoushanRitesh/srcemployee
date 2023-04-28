package com.hdfc.ems.Exception;

public class EmployeeNotFoundException extends Exception{
	private String mssg;
	public EmployeeNotFoundException(String mssg) {
     this.mssg=mssg;
}
	@Override
	public String toString() {
		return "EmployeeNotFoundException [mssg=" + mssg + "]";
	}
	
}
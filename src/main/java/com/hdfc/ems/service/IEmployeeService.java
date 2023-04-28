package com.hdfc.ems.service;




import org.springframework.stereotype.Service;

import com.hdfc.ems.Exception.EmployeeNotFoundException;

import com.hdfc.ems.vo.EmployeeVo;
@Service
public interface IEmployeeService {
	
	public EmployeeVo findEmployeeBYId(int employeeId) throws EmployeeNotFoundException;
}

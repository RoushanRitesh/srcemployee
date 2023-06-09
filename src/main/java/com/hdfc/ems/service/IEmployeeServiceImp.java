package com.hdfc.ems.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.ems.Exception.EmployeeNotFoundException;
import com.hdfc.ems.Repository.EmployeeRepository;
import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.vo.EmployeeVo;




@Service
public class IEmployeeServiceImp implements IEmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;
	@Override
	
	public EmployeeVo findEmployeeBYId(int employeeId) throws EmployeeNotFoundException
	{
		Employee employee=employeeRepo.findById(employeeId).orElseThrow(()->new EmployeeNotFoundException("Invalid Employee id"));
		EmployeeVo empvo=new EmployeeVo(employeeId,employee.getEmployeeName(),employee.getDateOfBirth().toString());
		return empvo;
		
	}
	

}

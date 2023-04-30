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
		EmployeeVo empVo=new EmployeeVo();
		try {
			
		
		 Employee emp=employeeRepo.findById(employeeId).orElseThrow(()->new EmployeeNotFoundException());
		  empVo=new EmployeeVo(employeeId,emp.getEmployeeName(),emp.getDateOfBirth().toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	return empVo;
	}
	

}

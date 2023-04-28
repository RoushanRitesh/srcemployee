package com.hdfc.ems.service;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.ems.Exception.EmployeeNotFoundException;

import com.hdfc.ems.vo.EmployeeVo;
@SpringBootTest
class EmployeeServiceTest {
@Autowired
private IEmployeeService employeeService;
	@Test
	void testFindById() throws EmployeeNotFoundException {
		EmployeeVo employee=employeeService.findEmployeeBYId(106);
		assertNotNull(employee);
		
	}

}

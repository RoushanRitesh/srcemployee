package com.hdfc.ems.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.service.IEmployeeServiceImp;
import com.hdfc.ems.vo.EmployeeVo;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
@Autowired
public IEmployeeServiceImp empService;

private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
@GetMapping("/findEmp/{employeeId}")
public ResponseEntity<EmployeeVo> findEmployeeById(@PathVariable int employeeId) throws Exception
{
	logger.info("EmployeeId ("+employeeId+") is called");
	EmployeeVo emps=empService.findEmployeeBYId(employeeId);
	emps.setDateOfBirth(EmployeeVo.encrypt(emps.getDateOfBirth()));
	return new ResponseEntity<EmployeeVo>(emps,HttpStatus.ACCEPTED);
}
}

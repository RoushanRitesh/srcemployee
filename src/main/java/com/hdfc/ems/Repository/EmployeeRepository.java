package com.hdfc.ems.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hdfc.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

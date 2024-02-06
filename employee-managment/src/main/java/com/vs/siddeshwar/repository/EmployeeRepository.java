package com.vs.siddeshwar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vs.siddeshwar.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	
}

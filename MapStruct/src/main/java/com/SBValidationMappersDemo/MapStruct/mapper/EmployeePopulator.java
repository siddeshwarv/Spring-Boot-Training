package com.SBValidationMappersDemo.MapStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.SBValidationMappersDemo.MapStruct.dto.EmployeeDto;
import com.SBValidationMappersDemo.MapStruct.entity.Employee;

@Mapper
public interface EmployeePopulator {
	EmployeePopulator INSTANCE = Mappers.getMapper(EmployeePopulator.class);
	Employee populateEmployee(EmployeeDto employeeDto);
	}

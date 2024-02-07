package com.SBValidationMappersDemo.MapStruct.dto;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
	private int id;
	private String name;
	private int age;
	private String emailAdress;
	private int projectId;
}

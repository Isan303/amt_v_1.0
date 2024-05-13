package com.project.attendance.service;



import java.util.List;

import com.project.attendance.model.Employee;

public interface EmployeeService {

	public abstract List<Employee> getAllEmployees();

	public abstract Employee getEmployeeById(String empId);

//	public abstract List<Employee> getEmployeeByFirstName(String empName);

	public abstract Employee addEmployee(Employee employee);

	public abstract Employee updateEmployee(Employee employee);

	public abstract Employee deleteEmployee(String empId);
}
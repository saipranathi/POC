package com.ing.bfsi.employeeDB.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.bfsi.employeeDB.model.Employee;
import com.ing.bfsi.employeeDB.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
    EmployeeService employeeService;
	
	@RequestMapping("/save")
	private int saveEmployee(@RequestBody Employee employee) 
	{
		employeeService.save(employee);
	    return employee.getEmployeeid();
	}

	@RequestMapping("/getAllEmployees")
	private List<Employee> getAllEmloyees()
	{
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping("/getEmployee/{employeeid}")
	private Employee getEmloyee(@PathVariable("employeeid") int employeeid)
	{
		return employeeService.getEmployeeById(employeeid);
	}

	@PutMapping("/update")  
	private Employee update(@RequestBody Employee employee)   
	{  
		employeeService.saveOrUpdate(employee);  
	    return employee;  
	}  

	@RequestMapping("/delete/{employeeid}")  
	private void deleteBook(@PathVariable("employeeid") int employeeid)   
	{  
		employeeService.delete(employeeid);  
	}  


}

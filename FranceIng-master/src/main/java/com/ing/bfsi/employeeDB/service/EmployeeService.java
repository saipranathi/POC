package com.ing.bfsi.employeeDB.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.bfsi.employeeDB.SalaryComparator;
import com.ing.bfsi.employeeDB.model.Employee;
import com.ing.bfsi.employeeDB.repository.EmployeeRepository;

@Service
public class EmployeeService {

  @Autowired
  EmployeeRepository employeeRepository;
  
  public int save(Employee employee) 
  {
	 employeeRepository.save(employee);
	return employee.getEmployeeid();
  }

  public void delete(int id)   
  {  
	  employeeRepository.deleteById(id);  
  }  
 @SuppressWarnings("unchecked")
public List<Employee> getAllEmployees()
 {
	 List<Employee> employees=new ArrayList<Employee>();
	 employeeRepository.findAll().forEach(emp->employees.add(emp));
	// Collections.sort(employees);  
	 Collections.sort(employees,new SalaryComparator());  
	 return employees;
	 
 }
 public Employee getEmployeeById(int id)
 {
	 return employeeRepository.findById(id).get();  

 } 
 public Employee saveOrUpdate(Employee employee) 
 {
	 return employeeRepository.save(employee);
	
 }

  
}

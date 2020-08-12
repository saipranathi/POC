package com.ing.bfsi.employeeDB.repository;
import org.springframework.data.repository.CrudRepository;

import com.ing.bfsi.employeeDB.model.Employee;
//repository that extends CrudRepository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
}


package com.ing.bfsi.employeeDB.testcases;

import com.ing.bfsi.employeeDB.model.Employee;
import com.ing.bfsi.employeeDB.repository.EmployeeRepository;
import com.ing.bfsi.employeeDB.service.EmployeeService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;    

public class EmployeeServiceTest {

	  private static EmployeeService mockedEmployeeService;
	  private static EmployeeRepository mockedEmployeeRepository;
	  private static  Employee emp1;
	  private static  Employee emp2;


	  @BeforeClass
	  public static void setUp(){
		  
	   //Create mock object of BookDAL
	mockedEmployeeService = mock(EmployeeService.class);
	mockedEmployeeRepository=mock(EmployeeRepository.class);
	
    emp1 = new Employee(8131,"CompilersPrinciples",
         "sai.pranathib@gmail.com", 2008,1009,28);

    emp2 = new Employee(123,"sai",
            "sai.pranathib@gmail.com", 2008,1009,28);


    //Stubbing the methods of mocked BookDAL with mocked data. 
//    when(mockedEmployeeService.getAllEmployees()).
//    thenReturn(Arrays.asList(emp1, emp2));
    
    when( mockedEmployeeRepository.findAll()).
    thenReturn(Arrays.asList(emp1, emp2));


	  }
    @Test
    public void testGetAllEmployees() throws Exception{

        List<Employee> allEmployees = (List<Employee>) mockedEmployeeRepository.findAll();
        assertEquals(2, allEmployees.size());
        Employee employee = allEmployees.get(0);
        assertEquals(8131, employee.getEmployeeid());
        assertEquals("CompilersPrinciples", employee.getName());
        assertEquals("sai.pranathib@gmail.com", employee.getEmail());
        assertEquals(2008, employee.getSalary());
        assertEquals(1009, employee.getExp());
        assertEquals(28, employee.getAge());

    }	  
	  }
		  
		  


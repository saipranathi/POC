package com.ing.bfsi.employeeDB.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee implements Comparable<Employee> {

	@Id
	@Column
	private int employeeid;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	public int salary;
	@Column
	private int exp;
	@Column
	private int age;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int employeeid, String name, String email, int salary, int exp, int age) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.exp = exp;
		this.age = age;
	}
	@Override
	public int compareTo(Employee arg0) {

		return this.age - arg0.getAge();
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", email=" + email + ", salary=" + salary
				+ ", exp=" + exp + ", age=" + age + "]";
	}

	
}

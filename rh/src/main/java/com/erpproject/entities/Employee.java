package com.erpproject.entities;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.log4j.Logger;

import com.erpproject.common.Entity;
import com.erpproject.entities.Person;

public class Employee extends Entity {
	
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger(Employee.class);
	
	public String Register;
	public Person Person;
	private BigDecimal Salary;
	
	public String getRegister() {
		return Register;
	}
	
	public void setRegister(String register) {
		Register = register;
	}
	
	public Person getPerson() {
		return Person;
	}
	
	public void setPerson(Person person) {
		Person = person;
	}
	
	public BigDecimal getSalary() {
		return Salary;
	}
	
	public void setSalary(BigDecimal salary) {
		Salary = salary;
	}
	
	public Employee(int id, Date addDate, String addUser, Date lastDate, String lastUser, 
			String register, Person person, BigDecimal salary) {
		super(id, addDate, addUser, lastDate, lastUser);
		Register = register;
		Person = person;
		Salary = salary;
	}
}
package com.erpproject.entities;

import java.util.Date;

import com.erpproject.common.Entity;

public class State extends Entity {
	
	public String Name;
	public String Initial;
	public Country Country;
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getInitial() {
		return Initial;
	}
	
	public void setInitial(String initial) {
		Initial = initial;
	}
	
	public Country getCountry() {
		return Country;
	}
	
	public void setCountry(Country country) {
		Country = country;
	}
	
	public State(int id, Date addDate, String addUser, Date lastDate, String lastUser, 
		String name, String initial, Country country) {
		super(id, addDate, addUser, lastDate, lastUser);
		Name = name;
		Initial = initial;
		Country = country;
	}

	@Override
	public String toString() {
		return "State [Name=" + Name + ", Initial=" + Initial + ", Country=" + Country + "]";
	}
}
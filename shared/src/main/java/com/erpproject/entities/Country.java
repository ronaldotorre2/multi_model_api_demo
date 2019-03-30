package com.erpproject.entities;

import java.util.Date;

import com.erpproject.common.Entity;

public class Country extends Entity {
	
	public String Name;
	public String Description;
	public String Initial;
	public String MoneyName;
	public String MoneyInitial;
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setDescription(String description) {
		Description = description;
	}
	
	public String getInitial() {
		return Initial;
	}
	
	public void setInitial(String initial) {
		Initial = initial;
	}
	
	public String getMoneyName() {
		return MoneyName;
	}
	
	public void setMoneyName(String moneyName) {
		MoneyName = moneyName;
	}
	
	public String getMoneyInitial() {
		return MoneyInitial;
	}
	
	public void setMoneyInitial(String moneyInitial) {
		MoneyInitial = moneyInitial;
	}

	public Country(int id, Date addDate, String addUser, Date lastDate, String lastUser, String name,
			String description, String initial, String moneyName, String moneyInitial) {
		super(id, addDate, addUser, lastDate, lastUser);
		Name = name;
		Description = description;
		Initial = initial;
		MoneyName = moneyName;
		MoneyInitial = moneyInitial;
	}

	@Override
	public String toString() {
		return "Country [Name=" + Name + ", Description=" + Description + ", Initial=" + Initial + ", MoneyName="
				+ MoneyName + ", MoneyInitial=" + MoneyInitial + "]";
	}
}
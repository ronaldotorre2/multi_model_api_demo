package com.erpproject.entities;

import java.util.Date;

import com.erpproject.common.Entity;

public class District extends Entity {
	
	public String Name;
	public String CityCode;
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getCityCode() {
		return CityCode;
	}
	
	public void setCityCode(String cityCode) {
		CityCode = cityCode;
	}

	public District(int id, Date addDate, String addUser, Date lastDate, String lastUser, String name,
			String cityCode) {
		super(id, addDate, addUser, lastDate, lastUser);
		Name = name;
		CityCode = cityCode;
	}

	@Override
	public String toString() {
		return "District [Name=" + Name + ", CityCode=" + CityCode + "]";
	}
}
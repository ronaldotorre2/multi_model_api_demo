package com.erpproject.entities;

import java.util.Date;

import com.erpproject.common.Entity;
import com.erpproject.entities.District;
import com.erpproject.entities.City;

public class Address extends Entity {
	
	public int PersonId;
	public int Type;
	public String ZipeCode;
	public String Localy;
	public String Number;
	public String Complement;
	public District District;
	public City	City;
		
	public int getPersonId() {
		return PersonId;
	}

	public void setPersonId(int personId) {
		PersonId = personId;
	}

	public int getType() {
		return Type;
	}

	public void setType(int type) {
		Type = type;
	}

	public String getZipeCode() {
		return ZipeCode;
	}

	public void setZipeCode(String zipeCode) {
		ZipeCode = zipeCode;
	}

	public String getLocaly() {
		return Localy;
	}

	public void setLocaly(String localy) {
		Localy = localy;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getComplement() {
		return Complement;
	}

	public void setComplement(String complement) {
		Complement = complement;
	}

	public District getDistrict() {
		return District;
	}

	public void setDistrict(District district) {
		District = district;
	}

	public City getCity() {
		return City;
	}

	public void setCity(City city) {
		City = city;
	}	

	public Address(int id, Date addDate, String addUser, Date lastDate, String lastUser, int personId, int type,
			String zipeCode, String localy, String number, String complement, District district, City city) {
		super(id, addDate, addUser, lastDate, lastUser);
		PersonId = personId;
		Type = type;
		ZipeCode = zipeCode;
		Localy = localy;
		Number = number;
		Complement = complement;
		District = district;
		City = city;
	}

	@Override
	public String toString() {
		return "Address [PersonId=" + PersonId + ", Type=" + Type + ", ZipeCode=" + ZipeCode + ", Localy=" + Localy
				+ ", Number=" + Number + ", Complement=" + Complement + ", District=" + District + ", City=" + City
				+ "]";
	}
}
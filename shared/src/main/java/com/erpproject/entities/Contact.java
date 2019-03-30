package com.erpproject.entities;

import java.util.Date;

import com.erpproject.common.Entity;

public class Contact extends Entity {
	
	public int PersonId;
	public int TypeId;
	public String Description;
	
	public int getPersonId() {
		return PersonId;
	}
	
	public void setPersonId(int personId) {
		PersonId = personId;
	}
	
	public int getTypeId() {
		return TypeId;
	}
	
	public void setTypeId(int typeId) {
		TypeId = typeId;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setDescription(String description) {
		Description = description;
	}
		
	public Contact(int id, Date addDate, String addUser, Date lastDate, 
				   String lastUser, int personId, int typeId,
				   String description) {
		super(id, addDate, addUser, lastDate, lastUser);
		
		PersonId = personId;
		TypeId = typeId;
		Description = description;
	}

	@Override
	public String toString() {
		return "Contact [PersonId=" + PersonId + ", TypeId=" + TypeId + ", Description=" + Description + "]";
	}
	
}
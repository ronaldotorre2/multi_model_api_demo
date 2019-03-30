package com.erpproject.common;

import java.util.Date;

public abstract class Entity {

	public int Id;
	public Date AddDate;
	public String AddUser;
	public Date LastDate;
	public String LastUser;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public Date getAddDate() {
		return AddDate;
	}
	
	public void setAddDate(Date addDate) {
		AddDate = addDate;
	}

	public String getAddUser() {
		return AddUser;
	}
	
	public void setAddUser(String addUser) {
		AddUser = addUser;
	}
	
	public Date getLastDate() {
		return LastDate;
	}
	
	public void setLastDate(Date lastDate) {
		LastDate = lastDate;
	}
	
	public String getLastUser() {
		return LastUser;
	}
	
	public void setLastUser(String lastUser) {
		LastUser = lastUser;
	}
	
	public Entity(int id, Date addDate, String addUser, Date lastDate, String lastUser) {
		Id = id;
		AddDate = addDate;
		AddUser = addUser;
		
		try {
			
			if(lastDate.toString() != null && !lastDate.toString().isEmpty())
				LastDate = lastDate;
			
			if(lastUser != null && !lastUser.isEmpty())
				LastUser = lastUser;
		}
		catch (NullPointerException ne) {
			LastDate = null;
		}
	}
}
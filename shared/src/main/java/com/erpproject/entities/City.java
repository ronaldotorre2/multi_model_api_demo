package com.erpproject.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.erpproject.common.Entity;
import com.erpproject.entities.State;

public class City extends Entity {
	
	public String Name;
	public String Code;
	public State State;
	
	public List<District> Districts = new ArrayList<District>();
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getCode() {
		return Code;
	}
	
	public void setCode(String code) {
		Code = code;
	}

	public State getState() {
		return State;
	}

	public void setState(State state) {
		State = state;
	}

	public List<District> getDistricts() {
		return Districts;
	}

	public City(int id, Date addDate, String addUser, Date lastDate, 
			String lastUser, String name, String code, State state) {
		super(id, addDate, addUser, lastDate, lastUser);
		Name = name;
		Code = code;
		State = state;
	}

	@Override
	public String toString() {
		return "City [Name=" + Name + ", Code=" + Code + ", State=" + State + ", Districts=" + Districts + "]";
	}
}
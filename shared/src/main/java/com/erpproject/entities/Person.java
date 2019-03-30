package com.erpproject.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.erpproject.common.Entity;

public class Person extends Entity  {
	
	public int Type;
	public String Name;
	public String SocialName;
	public int Gender;
	public Date BirthDate;
	public String Hometown;
	public String Document1;
	public String Document2;
	public String Document3;
	public int StateCivil;
	public String SpouseName;
	public String MotherName;
	public String FatherName;
	
	public int getType() {
		return Type;
	}

	public void setType(int type) {
		Type = type;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSocialName() {
		return SocialName;
	}

	public void setSocialName(String socialName) {
		SocialName = socialName;
	}

	public int getGender() {
		return Gender;
	}

	public void setGender(int gender) {
		Gender = gender;
	}

	public Date getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}

	public String getHometown() {
		return Hometown;
	}

	public void setHometown(String hometown) {
		Hometown = hometown;
	}

	public String getDocument1() {
		return Document1;
	}

	public void setDocument1(String document1) {
		Document1 = document1;
	}

	public String getDocument2() {
		return Document2;
	}

	public void setDocument2(String document2) {
		Document2 = document2;
	}

	public String getDocument3() {
		return Document3;
	}

	public void setDocument3(String document3) {
		Document3 = document3;
	}

	public int getStateCivil() {
		return StateCivil;
	}

	public void setStateCivil(int stateCivil) {
		StateCivil = stateCivil;
	}

	public String getSpouseName() {
		return SpouseName;
	}

	public void setSpouseName(String spouseName) {
		SpouseName = spouseName;
	}

	public String getMotherName() {
		return MotherName;
	}

	public void setMotherName(String motherName) {
		MotherName = motherName;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	
	public List<Contact> Contacts = new ArrayList<Contact>();
	public List<Address> Addresses = new ArrayList<Address>();

	public Person(int id, Date addDate, String addUser, Date lastDate, String lastUser, int type, String name,
			String socialName, int gender, Date birthDate, String hometown, String document1, String document2,
			String document3, int stateCivil, String spouseName, String motherName, String fatherName) {
		super(id, addDate, addUser, lastDate, lastUser);
		
		Type = type;
		
		if(type == 1) {
			Name = name;
			Gender = gender;
			BirthDate = birthDate;
			Hometown = hometown;
			Document1 = document1;
			Document2 = document2;
			StateCivil = stateCivil;
			SpouseName = spouseName;
			MotherName = motherName;
			FatherName = fatherName;
		}
		else if(type == 2) {
			Name = name;
			SocialName = socialName;
			Document1 = document1;
			Document2 = document2;
			Document3 = document3;
		}
	}

	@Override
	public String toString() {
		return "Person [Type=" + Type + ", Name=" + Name + ", SocialName=" + SocialName + ", Gender=" + Gender
				+ ", BirthDate=" + BirthDate + ", Hometown=" + Hometown + ", Document1=" + Document1 + ", Document2="
				+ Document2 + ", Document3=" + Document3 + ", StateCivil=" + StateCivil + ", SpouseName=" + SpouseName
				+ ", MotherName=" + MotherName + ", FatherName=" + FatherName + ", Contacts=" + Contacts + "]";
	}
}
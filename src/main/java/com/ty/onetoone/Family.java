package com.ty.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Family {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String familyHead;
	private String familySong;
	private int  familyMembers;
	private long phoneNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFamilyHead() {
		return familyHead;
	}
	public void setFamilyHead(String familyHead) {
		this.familyHead = familyHead;
	}
	public String getFamilySong() {
		return familySong;
	}
	public void setFamilySong(String familySong) {
		this.familySong = familySong;
	}
	public int getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(int familyMembers) {
		this.familyMembers = familyMembers;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	

}

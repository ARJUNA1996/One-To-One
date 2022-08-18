package com.ty.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class House {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int houseNo;
	private String houseOwner;
	private long ownerNumber;
	private String houseAddress;
	@OneToOne
	private Family family;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getHouseOwner() {
		return houseOwner;
	}

	public void setHouseOwner(String houseOwner) {
		this.houseOwner = houseOwner;
	}

	public long getOwnerNumber() {
		return ownerNumber;
	}

	public void setOwnerNumber(long ownerNumber) {
		this.ownerNumber = ownerNumber;
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}
	
	
}

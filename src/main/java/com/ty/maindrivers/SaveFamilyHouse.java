package com.ty.maindrivers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.Family;
import com.ty.onetoone.House;

public class SaveFamilyHouse {
	
	
	public static void main(String[] args) {
		
		

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		
		
		House house=new House();
		house.setHouseOwner("MAllikarjuna");
		house.setHouseAddress("state: Andhra Pradesh, city: kadapa,Town :saipeta");
		house.setHouseNo(84562);
		house.setOwnerNumber(9000517458l);
		
		Family  family=new Family();
		family.setFamilyHead("Dharani");
		family.setFamilySong("CHINNIRAI");
		family.setFamilyMembers(5);
		family.setPhoneNumber(9092244883l);
		
		house.setFamily(family);
		
		House house1=new House();
		house1.setHouseOwner("Harsha");
		house1.setHouseAddress("state: Andhra Pradesh, city: kadapa,Town :saipeta");
		house1.setHouseNo(8462);
		house1.setOwnerNumber(9000517458l);
		
		Family  family1=new Family();
		family1.setFamilyHead("Sai Prasanna");
		family1.setFamilySong("TRUE LOVE");
		family1.setFamilyMembers(8);
		family1.setPhoneNumber(9959007854l);
		
		house1.setFamily(family1);
		
		transaction.begin();
		manager.persist(house);
		manager.persist(house1);
		manager.persist(family);
		manager.persist(family1);
		transaction.commit();
		
		
		
	}

}

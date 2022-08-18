package com.ty.maindrivers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.Company;
import com.ty.onetoone.Gst;

public class SaveCompany {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Company company = new Company();
		company.setName("MARRY GOLD");
		company.setPhoneNumber(9000517462l);

		Gst gst = new Gst();
		gst.setGstNumber("GSJLMP5423622HSJSH5212");
		gst.setStatus("ACTIVE");

		gst.setCompany(company);

		transaction.begin();
		manager.persist(company);
		manager.persist(gst);
		transaction.commit();

		System.out.println("--------DATA SAVED--------");

	}

}

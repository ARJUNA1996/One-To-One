package com.ty.maindrivers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.Company;
import com.ty.onetoone.Gst;

public class GetCompanyById {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Gst gst = manager.find(Gst.class, 2d);

		if (gst != null) {
			System.out.println(gst);
		} else {
			System.out.println("element is not found in data base");
		}

	}

}

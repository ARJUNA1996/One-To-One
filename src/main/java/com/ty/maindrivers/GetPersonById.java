package com.ty.maindrivers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.Person;

public class GetPersonById {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Person person = manager.find(Person.class, 1);

		if (person != null) {

			System.out.println(person);
		} else {
			System.out.println("element is not present in database");
		}
	}

}

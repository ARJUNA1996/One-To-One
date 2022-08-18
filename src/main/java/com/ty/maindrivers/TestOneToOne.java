package com.ty.maindrivers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.Pan;
import com.ty.onetoone.Person;

public class TestOneToOne {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Person person = new Person();
		person.setName("Mallikarjun");
		person.setAge(20);

		Pan pan = new Pan();
		pan.setPanNumber("ptur253623");
		pan.setFatherName("nagabhushanam");

		person.setPan(pan);

		transaction.begin();
		manager.persist(person);
		manager.persist(pan);

		transaction.commit();

	}

}

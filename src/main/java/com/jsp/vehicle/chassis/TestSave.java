package com.jsp.vehicle.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicle vehicle = new Vehicle();
		Chassis chassis = new Chassis();

		vehicle.setName("tata");
		vehicle.setBrand("tiago");
		vehicle.setChassis(chassis);
		
		chassis.setNumber(12334);
		chassis.setVehicle(vehicle);
		
		entityTransaction.begin();
		entityManager.persist(chassis);
		entityManager.persist(vehicle);
		entityTransaction.commit();
		
		System.out.println("All good......");
	}
}

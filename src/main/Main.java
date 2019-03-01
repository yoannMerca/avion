package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import main.resources.DatabaseHandle;

public class Main {

	public static void main(String[] args) {
		EntityManager em = DatabaseHandle.getEntityManagerFactory();
		EntityTransaction transaction = em.getTransaction();
	}

}

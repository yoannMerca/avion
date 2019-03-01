package main.resources;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DatabaseHandle {
	private static EntityManager entityManager;
	
	public static  synchronized EntityManager getEntityManagerFactory(){
		if (entityManager == null || ! entityManager.isOpen()){
			entityManager = Persistence.createEntityManagerFactory("jpa_avion").createEntityManager();
		}
		
		return entityManager;
	}
}

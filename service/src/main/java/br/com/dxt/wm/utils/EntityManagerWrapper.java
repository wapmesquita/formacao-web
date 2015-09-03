package br.com.dxt.wm.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerWrapper {
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	static {
		emf = Persistence.createEntityManagerFactory("hibernate-search-example");
	}
	
	public static EntityManager getEntityManager() {
		if (em == null) {
			em = emf.createEntityManager();
		}
		return em;
	}

	public static void closeEm() {
		if (em != null) {
			em.close();
			em = null;
		}
	}
	
	public static void begin() {
		getEntityManager().getTransaction().begin();
	}
	
	public static void commit() {
		getEntityManager().getTransaction().commit();
	}
}

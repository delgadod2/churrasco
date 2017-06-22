package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoBD {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("churrasco");

	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

}

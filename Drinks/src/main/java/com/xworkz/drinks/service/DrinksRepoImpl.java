package com.xworkz.drinks.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.drinks.dto.DrinksDto;

public class DrinksRepoImpl implements DrinksRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");

	EntityManager em = emf.createEntityManager();

	EntityTransaction tr = em.getTransaction();

	@Override
	public boolean save(DrinksDto dto) {
		if (em != null) {
			tr.begin();
			em.persist(dto);
			tr.commit();
		}
		return false;
	}

}

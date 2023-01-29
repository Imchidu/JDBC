package com.xworkz.bulb.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.xworkz.bulb.dto.BulbDTO;

public class BulbRepoImpl implements BulbRepo {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();

	public boolean create(BulbDTO dto) {
		if (entityManager != null) {
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
			entityManager.close();
		}
		return true;
	}

	public List<BulbDTO> readAll() {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("readAll", BulbDTO.class);
			List list = namedQuery.getResultList();
			entityManager.getTransaction().commit();

			return list;

		}
		return null;

	}

	public BulbDTO findBybrandName(String name) {
		if (entityManager != null) {
			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("findBybrandName", BulbDTO.class);
			Query setParameter = namedQuery.setParameter("nam", name);
			BulbDTO singleResult = (BulbDTO) setParameter.getSingleResult();
			entityManager.getTransaction().commit();

			return singleResult;
		}
		return null;
	}
}

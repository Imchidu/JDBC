package com.xworkz.tubelight.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.xworkz.tubelight.dto.TubelightDTO;

public class TubelightRepoImpl implements TubelightRepo {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();

	public boolean create(TubelightDTO dto) {
		if (entityManager != null) {

			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
		}
		return true;
	}

	public List<TubelightDTO> readAll() {
		if (entityManager != null) {

			transaction.begin();
			Query namedQuery = entityManager.createNamedQuery("readAll");
			List list = namedQuery.getResultList();

			transaction.commit();
			return list;
		}

		return null;
	}

	public TubelightDTO findByName(String name) {
		if (entityManager != null) {
			transaction.begin();
			Query createNamedQuery = entityManager.createNamedQuery("findByName", TubelightDTO.class);
			Query setParameter = createNamedQuery.setParameter("find", name);
			transaction.commit();
			return (TubelightDTO) setParameter.getSingleResult();

		}
		return null;
	}

}

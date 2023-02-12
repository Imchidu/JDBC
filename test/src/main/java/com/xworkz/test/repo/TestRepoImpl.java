package com.xworkz.test.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.test.dto.TestDto;

public class TestRepoImpl implements TestRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();

	@Override
	public String save(TestDto dto) {
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return "Data Saved Successfully";
		}

		return null;
	}

	@Override
	public List<TestDto> readAll() {
		if (em != null) {
			em.getTransaction().begin();
			Query createNamedQuery = em.createNamedQuery("readAll", TestDto.class);
			List resultList = createNamedQuery.getResultList();
			em.getTransaction().commit();
			return resultList;
		}

		return null;
	}

}

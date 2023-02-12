package com.xworkz.school.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.school.DTO.SchoolDTO;

public class SchoolRepoImpl implements SchoolRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();

	@Override
	public String save(SchoolDTO dto) {
		if (em != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return "Data Saved Successfully";
		}

		return null;
	}

	@Override
	public List<SchoolDTO> readAll() {
		if (em != null) {
			em.getTransaction().begin();
			Query namedQuery = em.createNamedQuery("readAll", SchoolDTO.class);
			List resultList = namedQuery.getResultList();
			em.getTransaction().commit();
			return resultList;
		}

		return null;
	}

}

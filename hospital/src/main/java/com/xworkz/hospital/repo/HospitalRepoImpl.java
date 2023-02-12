package com.xworkz.hospital.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.hospital.dto.HospitalDTO;

public class HospitalRepoImpl implements HospitalRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager em = emf.createEntityManager();

	@Override
	public String save(HospitalDTO dto) {
		System.out.println("runnng save method in repo");
		try {

			if (em != null) {

				em.getTransaction().begin();

				em.persist(dto);
				em.getTransaction().commit();
				return "data saved succesfully";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<HospitalDTO> readAll() {
		if (em != null) {

			em.getTransaction().begin();

			Query namedQuery = em.createNamedQuery("readAll",HospitalDTO.class);
			List resultList = namedQuery.getResultList();
			
			em.getTransaction().commit();
			
			return resultList;
		}
		
		return null;
	}

}

package com.xworkz.hospital.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}

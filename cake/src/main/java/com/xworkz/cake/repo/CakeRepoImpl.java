package com.xworkz.cake.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.cake.dto.CakeDTO;

public class CakeRepoImpl implements CakeRepo {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager entityManager = factory.createEntityManager();

	public boolean save(CakeDTO dto) {
		if (dto != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}

		return false;
	}

	public CakeDTO findById(int id) {
		entityManager.getTransaction().begin();
		CakeDTO find = entityManager.find(CakeDTO.class, 1);
		entityManager.getTransaction().commit();

		return find;
	}

	public List<CakeDTO> readall() {
//		entityManager.getTransaction().begin();
//		entityManager

		return null;
	}

	public boolean updateByName(String name) {
		entityManager.getTransaction().begin();
		CakeDTO find1 = entityManager.find(CakeDTO.class, 2);
		find1.setName(name);
		entityManager.merge(find1);
		entityManager.getTransaction().commit();

		return true;
	}

	public boolean deleteById(int id) {
		entityManager.getTransaction().begin();
		CakeDTO find3 = entityManager.find(CakeDTO.class, 3);
		entityManager.remove(find3);
		entityManager.getTransaction().commit();

		return true;
	}

}

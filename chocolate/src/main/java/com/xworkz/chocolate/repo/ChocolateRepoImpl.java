package com.xworkz.chocolate.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.chocolate.dto.ChocolateDTO;

public class ChocolateRepoImpl implements ChocolateRepo {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean save(ChocolateDTO dto) {
		entityManager.getTransaction().begin();
		entityManager.persist(dto);
		entityManager.getTransaction().commit();

		return true;
	}

	public ChocolateDTO findById(int id) {
		entityManager.getTransaction().begin();
		ChocolateDTO find = entityManager.find(ChocolateDTO.class, id);
		entityManager.getTransaction().commit();
		return find;
	}

	public List<ChocolateDTO> readAll() {

		return null;
	}

	public boolean updateNameById(String name, int id) {
		entityManager.getTransaction().begin();
		ChocolateDTO find2 = entityManager.find(ChocolateDTO.class, id);
		find2.setBrand(name);
		entityManager.merge(find2);
		entityManager.getTransaction().commit();
		return true;
	}

	public boolean deletePriceById(int price, int id) {
		entityManager.getTransaction().begin();
		ChocolateDTO find3 = entityManager.find(ChocolateDTO.class, 4);
		entityManager.remove(find3);
		entityManager.getTransaction().commit();

		return true;
	}

}

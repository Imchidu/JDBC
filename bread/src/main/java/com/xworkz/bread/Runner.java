package com.xworkz.bread;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bread.dto.BreadDTO;

public class Runner {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		BreadDTO dto = new BreadDTO(1, "Britania", "white");
		BreadDTO dto1 = new BreadDTO(2, "Britania", "white");
		BreadDTO dto2 = new BreadDTO(3, "Britania", "white");
		BreadDTO dto3 = new BreadDTO(4, "Britania", "white");

//		entityManager.persist(dto);
//		entityManager.persist(dto1);
//		entityManager.persist(dto2);
//		entityManager.persist(dto3);

		BreadDTO find = entityManager.find(BreadDTO.class, 1);
		System.out.println(find);

		BreadDTO find2 = entityManager.find(BreadDTO.class, 2);
		find2.setName("Big bread");

		entityManager.merge(find2);

		BreadDTO find3 = entityManager.find(BreadDTO.class, 3);

		entityManager.remove(find3);

		transaction.commit();
		entityManager.close();

	}

}

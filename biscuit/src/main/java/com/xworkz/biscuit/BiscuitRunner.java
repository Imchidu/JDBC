package com.xworkz.biscuit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.biscuit.dto.BiscuitDTO;

public class BiscuitRunner {

	public static void main(String[] args) {
		BiscuitDTO dto = new BiscuitDTO(1, "parle", 10, "brown", "50gm");
		BiscuitDTO dto1 = new BiscuitDTO(2, "horlicks", 20, "brown", "100gm");
		BiscuitDTO dto2 = new BiscuitDTO(3, "tiger", 5, "brown", "50gm");
		BiscuitDTO dto3 = new BiscuitDTO(4, "britania", 10, "brown", "50gm");
		BiscuitDTO dto4 = new BiscuitDTO(5, "gooday", 20, "brown", "50gm");
		BiscuitDTO dto5 = new BiscuitDTO(6, "20-20", 10, "brown", "50gm");
		BiscuitDTO dto6 = new BiscuitDTO(7, "50-50", 10, "white", "50gm");
		BiscuitDTO dto7 = new BiscuitDTO(8, "bourboun", 20, "brown", "100gm");
		BiscuitDTO dto8 = new BiscuitDTO(9, "orea", 20, "black", "50gm");
		BiscuitDTO dto9 = new BiscuitDTO(10, "fantacy", 30, "brown", "150gm");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = createEntityManager.getTransaction();

		transaction.begin();

//		createEntityManager.persist(dto);
//		createEntityManager.persist(dto1);
//		createEntityManager.persist(dto2);
//		createEntityManager.persist(dto3);
//		createEntityManager.persist(dto4);
//		createEntityManager.persist(dto5);
//		createEntityManager.persist(dto6);
//		createEntityManager.persist(dto7);
//		createEntityManager.persist(dto8);
//		createEntityManager.persist(dto9);
//		
System.out.println("read method================================================");
		BiscuitDTO find = createEntityManager.find(BiscuitDTO.class, 2);
		System.out.println(find);
System.out.println("updatemethod===========================================");
		BiscuitDTO find2 = createEntityManager.find(BiscuitDTO.class, 3);
		find2.setColor("black");
		createEntityManager.merge(find2);
System.out.println("delete method=========================================");
		BiscuitDTO find3 = createEntityManager.find(BiscuitDTO.class, 10);

		createEntityManager.remove(find3);

		transaction.commit();
		createEntityManager.close();

	}

}

package com.xworkz.spects.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.spects.dto.SpectsDTO;

public class SpectsRepoImpl implements SpectsRepo {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean create(SpectsDTO dto) {

		if (entityManager != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;
		}

		return false;
	}

	public List<SpectsDTO> readAll() {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("readAll");
			List resultList = createNamedQuery.getResultList();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.commit();

			return resultList;
		}

		return null;
	}

	public SpectsDTO findByShapeAndPrice(String shape, int price) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("findByShapeAndPrice");
			createNamedQuery.setParameter("sh", shape);
			createNamedQuery.setParameter("pr", price);
			Object singleResult = createNamedQuery.getSingleResult();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.commit();

			return (SpectsDTO) singleResult;
		}
		return null;
	}

	public boolean updatePriceByName(int price, String name) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("updatePriceByName");
			createNamedQuery.setParameter("pr", price);
			createNamedQuery.setParameter("nm", name);
			int executeUpdate = createNamedQuery.executeUpdate();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.commit();
			System.out.println(executeUpdate);

		}
		return true;
	}

	public boolean updateColorByPriceAndShape(String color, int price, String shape) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("updateColorByPriceAndShape");
			createNamedQuery.setParameter("cl", color);
			createNamedQuery.setParameter("pr", price);
			createNamedQuery.setParameter("sh", shape);
			createNamedQuery.executeUpdate();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.commit();
			return true;

		}
		return true;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("deleteByPriceAndColor");
			createNamedQuery.setParameter("pr", price);
			createNamedQuery.setParameter("cl", color);
			createNamedQuery.executeUpdate();
			entityManager.getTransaction().commit();
		}
		return true;
	}

	public boolean deleteByNameAndId(String name, int id) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("deleteByNameAndId");
			createNamedQuery.setParameter("nm", name);
			createNamedQuery.setParameter("i", id);
			createNamedQuery.executeUpdate();
			entityManager.getTransaction().commit();
		}

		return true;
	}

}

package com.xworkz.Chocolate1.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.Chocolate1.dto.Chocolate1DTO;

public class Chocolate1RepoImpl implements Chocolate1Repo {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean createAll(Chocolate1DTO dto) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
		}

		return true;

	}

	public List<Chocolate1DTO> readAll() {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("readAll");
			List resultList = createNamedQuery.getResultList();
			entityManager.getTransaction().commit();
			return resultList;
		}

		return null;
	}

	public Chocolate1DTO findByColorAndWeight(String color, String weight) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("findByColorAndWeight");
			createNamedQuery.setParameter("cl", color);
			createNamedQuery.setParameter("wt", weight);
			
			Object singleResult = createNamedQuery.getSingleResult();
			entityManager.getTransaction().commit();
			return (Chocolate1DTO) singleResult;
		}

		return null;
	}

	public Chocolate1DTO findByPriceAndName(int price, String name) {
		
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("findByColorAndWeight");
			createNamedQuery.setParameter("pr", price);
			createNamedQuery.setParameter("nm", name);
			
			Object singleResult = createNamedQuery.getSingleResult();
			entityManager.getTransaction().commit();
			return (Chocolate1DTO) singleResult;
		}
		return null;
	}

	public boolean updateWeightByNameAndColor(String weight, String name, String color) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("updateWeightByNameAndColor");
			createNamedQuery.setParameter("wt", weight);
			createNamedQuery.setParameter("nm", name);
			createNamedQuery.setParameter("cl", color);
			int executeUpdate = createNamedQuery.executeUpdate();
			entityManager.getTransaction().commit();
			
		}
		
		return true;
	}

	public boolean deleteByColorAndName(String color, String name) {
		
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("deleteByColorAndName");
			createNamedQuery.setParameter("cl", color);
			createNamedQuery.setParameter("nm", name);
		
			int executeUpdate = createNamedQuery.executeUpdate();
			entityManager.getTransaction().commit();
			

		}
		return true;
	}

	public boolean updateNameByIdAndWeight(String name, int id, String weight) {

		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query createNamedQuery = entityManager.createNamedQuery("updateNameByIdAndWeight");
			createNamedQuery.setParameter("nm", name);
			createNamedQuery.setParameter("i", id);
			createNamedQuery.setParameter("wt", weight);
			int executeUpdate = createNamedQuery.executeUpdate();
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

}

package com.xworkz.pg.entity.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.pg.entity.PgEntity;
import com.xworkz.pg.entity.dao.PgDAO;

public class PgDAOImpl implements PgDAO {

	public Boolean save(PgEntity entity) {
		Session openSession = null;
		try {
			Configuration configuration = new Configuration().configure()
					.addAnnotatedClass(com.xworkz.pg.entity.PgEntity.class);
			SessionFactory buildSessionFactory = configuration.buildSessionFactory();
			openSession = buildSessionFactory.openSession();
			Transaction beginTransaction = openSession.beginTransaction();
			openSession.save(entity);

			beginTransaction.commit();

			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			openSession.close();
		}
		return false;
	}

	@Override
	public PgEntity getById(Integer id) {
		Session session = null;

		try {
			Configuration configuration = new Configuration().configure().addAnnotatedClass(PgEntity.class);
			SessionFactory factory = configuration.buildSessionFactory();
			session = factory.openSession();
			PgEntity pgEntity = session.find(PgEntity.class, id);

			return pgEntity;
		} catch (HibernateException e) {

		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public void updateById(Integer id,String name ,Double rent) {
		Session session = null;
		try {
			Configuration configuration = new Configuration().configure().addAnnotatedClass(PgEntity.class);
			SessionFactory factory = configuration.buildSessionFactory();
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			PgEntity pgEntity = session.find(PgEntity.class, id);
			pgEntity.setName(name);
			pgEntity.setRent(rent);
			session.save(pgEntity);
			transaction.commit();

		} catch (HibernateException e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
		
	}
	@Override
	public void deleteById(Integer id) {
		Session session=null;
		try {
			Configuration configuration = new Configuration().configure().addAnnotatedClass(PgEntity.class);
			SessionFactory factory = configuration.buildSessionFactory();
			 session = factory.openSession();
			 Transaction transaction = session.beginTransaction();
			 PgEntity pgEntity = session.find(PgEntity.class, id);
			 session.delete(pgEntity);
			 transaction.commit();
			
			
			
		}
		catch (HibernateException e) {
			// TODO: handle exception
		}
		finally {
			session.close();
		}
		// TODO Auto-generated method stub
		PgDAO.super.deleteById(id);
	}
}

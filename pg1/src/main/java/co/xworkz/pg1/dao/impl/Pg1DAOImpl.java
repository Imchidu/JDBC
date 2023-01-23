package co.xworkz.pg1.dao.impl;

import co.xworkz.pg1.dao.Pg1DAO;
import co.xworkz.pg1.entity.Pg1Entity;
import static co.xworkz.pg1.util.ConfigarationInformation.getSessionFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Pg1DAOImpl implements Pg1DAO {

	public Boolean save(Pg1Entity entity) {
		 Transaction transaction = null;
	        try (Session session = getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(entity);
	            // commit transaction
	            transaction.commit();
	            return true;
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
		return false;
	}

}

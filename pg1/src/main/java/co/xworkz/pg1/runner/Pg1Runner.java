package co.xworkz.pg1.runner;

import co.xworkz.pg1.dao.Pg1DAO;
import co.xworkz.pg1.dao.impl.Pg1DAOImpl;
import co.xworkz.pg1.entity.Pg1Entity;

public class Pg1Runner {
	public static void main(String[] args) {
		Pg1Entity entity = new Pg1Entity(1, "manojpg");
		
		Pg1DAO impl = new Pg1DAOImpl();
		
		Boolean save = impl.save(entity);
		System.out.println(save);
	}

}

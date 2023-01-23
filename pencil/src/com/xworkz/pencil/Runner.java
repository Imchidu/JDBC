package com.xworkz.pencil;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.pencil.configaration.Config;
import com.xworkz.pencil.dto.PencilDto;

public class Runner {

	public static void main(String[] args) {
		PencilDto pencilDto = new PencilDto(1, "Apsara", 5, "black");
		PencilDto pencilDto1 = new PencilDto(2, "Natraj", 5, "red");
		PencilDto pencilDto2 = new PencilDto(3, "classmate", 5, "black");
		PencilDto pencilDto3 = new PencilDto(4, "doms", 5, "brown");

		SessionFactory factory = Config.getSessionFactory();
		Session openSession = factory.openSession();

		Transaction beginTransaction = openSession.beginTransaction();

	//	openSession.save(pencilDto);
//		openSession.save(pencilDto1);
//		openSession.save(pencilDto2);
//		openSession.save(pencilDto3);
		
//		System.out.println(openSession.get(PencilDto.class, 2));

		Criteria criteria = openSession.createCriteria(PencilDto.class);
		List list = criteria.list();
		
		for (Object object : list) {
			System.out.println(list);
			
		}
		
		
		beginTransaction.commit();
		openSession.close();
	}

}

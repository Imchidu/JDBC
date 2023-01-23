package com.xworkz.aircondition.runner;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.aircondition.configaration.Config;
import com.xworkz.aircondition.dto.AirConditionDto;

public class Runner {

	public static void main(String[] args) {

		AirConditionDto airConditionDto = new AirConditionDto(1, "Sony", 12000);
		AirConditionDto airConditionDto1 = new AirConditionDto(2, "Samsung", 10000);
		AirConditionDto airConditionDto2 = new AirConditionDto(3, "LG", 15000);
		AirConditionDto airConditionDto3 = new AirConditionDto(4, "Samsung", 10000);

		SessionFactory factory = Config.getFactory();
		Session openSession = factory.openSession();

		Transaction beginTransaction = openSession.beginTransaction();

//		openSession.save(airConditionDto1);
//		openSession.save(airConditionDto2);
//		openSession.save(airConditionDto3);

//		AirConditionDto find = openSession.find(AirConditionDto.class, 2);
//		System.out.println(find);

		Criteria criteria = openSession.createCriteria(AirConditionDto.class);
		List list = criteria.list();

		for (Object object : list) {
			System.out.println(object);

		}

		beginTransaction.commit();
		openSession.close();
	}

}

package com.xworkz.aircondition.configaration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.xworkz.aircondition.dto.AirConditionDto;

public class Config {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		Configuration configuration = new Configuration();

		Properties properties = new Properties();

		if (factory == null) {

			properties.put(Environment.USER, "root");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/xworkz");
			properties.put(Environment.PASS, "Xworkzodc@123");
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			properties.put(Environment.SHOW_SQL, true);

			configuration.setProperties(properties);

			configuration.addAnnotatedClass(AirConditionDto.class);

			StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();

			factory = configuration.buildSessionFactory(standardServiceRegistry);

			return factory;
		}

		return null;
	}

}

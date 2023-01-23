package com.xworkz.pencil.configaration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.xworkz.pencil.dto.PencilDto;

public class Config {
	public static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			Configuration configuration = new Configuration();

			Properties properties = new Properties();

			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Xworkzodc@123");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/xworkz");
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			properties.put(Environment.SHOW_SQL, true);

			configuration.setProperties(properties);

			configuration.addAnnotatedClass(PencilDto.class);

			StandardServiceRegistry ServiceRegistryBuilder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();

			sessionFactory = configuration.buildSessionFactory(ServiceRegistryBuilder);

			return sessionFactory;
		}

		return null;
	}

}

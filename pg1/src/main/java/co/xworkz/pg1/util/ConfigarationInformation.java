package co.xworkz.pg1.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import co.xworkz.pg1.entity.Pg1Entity;

public class ConfigarationInformation {
	
	 private static SessionFactory sessionFactory;
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            try {
	                Configuration configuration = new Configuration();

	                // Hibernate settings equivalent to hibernate.cfg.xml's properties
	                Properties properties = new Properties();
	                properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	                properties.put(Environment.URL, "jdbc:mysql://localhost:3306/xworkz");
	                properties.put(Environment.USER, "root");
	                properties.put(Environment.PASS, "Xworkzodc@123");
	                properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

	                properties.put(Environment.SHOW_SQL, "true");

	                properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

	                properties.put(Environment.HBM2DDL_AUTO, "update");

	                configuration.setProperties(	                properties);

	                configuration.addAnnotatedClass(Pg1Entity.class);

	                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	                    .applySettings(configuration.getProperties()).build();

	                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	                // sessionFactory= configuration.buildSessionFactory();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        return sessionFactory;
	    }
	
	

}

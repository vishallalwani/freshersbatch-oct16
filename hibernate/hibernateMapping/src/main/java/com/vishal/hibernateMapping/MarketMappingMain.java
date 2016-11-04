package com.vishal.hibernateMapping;

import java.io.File;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MarketMappingMain {

	
	public static void main(String[] args) {

		Configuration configuration=new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		
		saveDepartment(session);
		
		
		session.getTransaction().commit();
		session.close();
		
		sessionFactory.close();
	}
	
	
	public static void saveDepartment(Session session) {
		Market market = new Market();
		market.setMarketName("Sales");

		Stock emp1 = new Stock("Nina", 20000);
		Stock emp2 = new Stock("Tony", 30000.85);
		emp1.setMarket(market);
		emp2.setMarket(market);
		
		market.setStocks(new HashSet<Stock>());
		market.getStocks().add(emp1);
		market.getStocks().add(emp2);
		session.save(market);
		System.out.println("department saved!!");
		
	}
}

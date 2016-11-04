package com.vishal.hibernateMapping;

import java.io.File;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class CustomerMappingMain {

	public static void main(String[] args) {


		Configuration configuration=new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		
		//addCustomer(session);
		  updateCustomer(session);
		readCustomer(session);
		//deleteCustomer(session);
		session.getTransaction().commit();
		session.close();
		
		sessionFactory.close();
	}
	
	
	 private static void deleteCustomer(Session session) {
	      
	        Customer customer1 = session.load(Customer.class, 22L);
	        session.delete(customer1);
	       
	    }


	private static void updateCustomer(Session session) {
		
		 Customer customer = session.load(Customer.class, 20L);
	        customer.setName("XYZ");
	        customer.getEnquiry().setEnquiry("Updated Enquiry");
	}


	private static void readCustomer(Session session) {
		Query query = session.createQuery("from Customer");
		 List<Customer> productList = query.list();
         for (Customer product_3 : productList) {
                System.out.println(product_3);
         }
		
	}


	public static void addCustomer(Session session) {
		Enquiry enquiry = new Enquiry("customer_status");
		Customer customer = new Customer("john", enquiry);
		session.save(customer);
		System.out.println("customer saved");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

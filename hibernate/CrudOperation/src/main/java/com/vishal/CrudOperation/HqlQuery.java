package com.vishal.CrudOperation;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class HqlQuery {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure(new File("src/hibernate.cfg.xml"));

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Transaction transaction;

		//1) hql query for total cost of product

		Session session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		String hql = "select sum(price) from Product";
		Query que = session.createQuery(hql);
		transaction.commit();
		List listResult = que.list();
		Number number = (Number) listResult.get(0);
		System.out.println(number.intValue());
		session.close();

		// 2)hql query for sorting product
		// Session session1=sessionFactory.openSession();
		// transaction = session1.beginTransaction();
		// String hql1="FROM Product p ORDER BY p.price DESC";
		// Query query=session1.createQuery(hql1);
		// transaction.commit();
		// List<Product> productList = query.list();
		// for (Product product_3 : productList) {
		// System.out.println(product_3);
		// }
		// session1.close();

		// 2)criteria for sorting product
		Session session2 = sessionFactory.openSession();
		transaction = session2.beginTransaction();
		Criteria cr = session2.createCriteria(Product.class);
		cr.addOrder(Order.desc("price"));
		List<Product> sortList = cr.list();
		for (Product product_3 : sortList) {
			System.out.println(product_3);
		}
		session2.close();

		// 3)hql query for grouping product

		Session session3 = sessionFactory.openSession();
		transaction = session3.beginTransaction();
		String hql1 = "select sum(p.price),p.name FROM Product p GROUP BY p.name";
		Query query1 = session3.createQuery(hql1);
		transaction.commit();
		List<Object[]> listResult1 = query1.list();

		for (Object[] aRow : listResult1) {
			Double sum = (Double) aRow[0];
			String category = (String) aRow[1];
			System.out.println(category + " - " + sum);
		}
		session3.close();
		
		//3)criteria for grouping product
		Session session_4 = sessionFactory.openSession();
		Criteria cr7 = session_4.createCriteria(Product.class);
        ProjectionList projList = Projections.projectionList();
        projList.add(Projections.property("name"));
        projList.add(Projections.groupProperty("name"));
        cr7.setProjection(projList);
        List<Object[]> results = cr7.list();
        for (Object[] product_3 : results) {
               System.out.println(product_3[0]+"-"+product_3[1]);
        }
        session_4.close();
		
		

		//4) hql query for average cost of product

		Session session4 = sessionFactory.openSession();
		transaction = session4.beginTransaction();
		String hql2 = "select avg(price) from Product";
		Query que2 = session4.createQuery(hql2);
		transaction.commit();
		List listResult2 = que2.list();
		Number number1 = (Number) listResult2.get(0);
		System.out.println(number1.intValue());
		//criteria for average cost of product
		//			Criteria cr5= session4.createCriteria(Product.class);
		//			cr5.setProjection(Projections.avg("price"));
		//			List listResult5 = cr5.list();
		//			Number number5 = (Number) listResult5.get(0);
		//			System.out.println(number5.intValue());


		session4.close();


		//5)hql query for cost greater than 10000
		//			Session session5 = sessionFactory.openSession();
		//			transaction = session5.beginTransaction();
		//			String hql3 = "from Product p where p.price>10000";
		//			Query que3 = session5.createQuery(hql3);
		//			transaction.commit();
		//			List<Product> productList = que3.list();
		//			 for (Product product_3 : productList) {
		//			 System.out.println(product_3);
		//			 }
		//			session5.close();

		
		//5)criteria for cost greater than 10000
		Session session6 = sessionFactory.openSession();
		transaction = session6.beginTransaction();
		Criteria cr1 = session6.createCriteria(Product.class);
		cr1.add(Restrictions.gt("price", 10000.00));
		List<Product> sortList1 = cr1.list();
		for (Product product_3 : sortList1) {
			System.out.println(product_3);
		}
		transaction.commit();
		session6.close();
	}
}

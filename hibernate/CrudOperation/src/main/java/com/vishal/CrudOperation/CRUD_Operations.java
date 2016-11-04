package com.vishal.CrudOperation;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD_Operations {

       public static void fireSQL(SessionFactory sessionFactory) {

              Session session = sessionFactory.openSession();
              SQLQuery sqlQuery = session.createSQLQuery("SELECT P_ID, NAME FROM PRODUCT_MASTER");
              sqlQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
              List<Map> productList = sqlQuery.list();
              for (Map hmapRow : productList) {
                     // Map hmapRow = (Map)data;
                     System.out.println(hmapRow.get("P_ID") + " - " + hmapRow.get("NAME"));
              }

       }

       public static void main(String[] args) throws Exception {

              Configuration configuration = new Configuration();
              configuration.configure(new File("src/hibernate.cfg.xml"));

              SessionFactory sessionFactory = configuration.buildSessionFactory();

              // CREATE A PRODUCT
              Session session_1 = sessionFactory.openSession();
              Product product = new Product("bikw", 17500);
              Transaction transaction = session_1.beginTransaction();

              session_1.save(product); // Hibernate
              // OR
              // session_1.persist(product); //JPA

              long productId = product.getId();
              transaction.commit();
              session_1.close();

              
              
              
              //insert using SQL query
              
//              Session session_sql = sessionFactory.openSession();
//
//              transaction = session_sql.beginTransaction();
//              String sql = "insert into PRODUCT_MASTER (name,cost) values ('bike',95000)";
//              Query query_sql = session_sql.createSQLQuery(sql);
//              query_sql.executeUpdate();
//              session_sql.getTransaction().commit();
//
//              session_sql.flush();
//              
              
              
              
              // UPDATE A PRODUCT
              
//              Session session_2 = sessionFactory.openSession();
//              transaction = session_2.beginTransaction();
//
//              Product product_2 = session_2.load(Product.class,productId);
//              // OR
//              // product_2 = session_2.get(Product.class, productId);
//
//              product_2.setPrice(55000);
//              session_2.update(product_2);
//              transaction.commit();
//              session_2.close();

              //update with hql query
             
              
//              Session session4=sessionFactory.openSession();
//              transaction=session4.beginTransaction();
//              String hql="UPDATE Product set cost = :cost WHERE p_id = :p_id";
//              Query que=session4.createQuery(hql);
//              que.setParameter("cost",70000);
//              que.setParameter("p_id", 3);
//              que.executeUpdate();
//              transaction.commit();
//              session4.close();
              
              
              // READ ALL PRODUCTS
              // fireSQL(sessionFactory);

              Session session_3 = sessionFactory.openSession();
              // Query query = session_3.createQuery("from Product");
              Query query = session_3.getNamedQuery("getAllProducts");
              List<Product> productList = query.list();
              for (Product product_3 : productList) {
                     System.out.println(product_3);
              }
              session_3.close();

              
              
              
              
              // DELETE ALL PRODUCTS
//            Session session_4 = sessionFactory.openSession();
//
//            Query query_2 = session_4.createQuery("delete from Product");
//            transaction = session_4.beginTransaction();
//            int updates = query_2.executeUpdate();
//            System.out.println("No of records deleted = " + updates);
//            transaction.commit();
//            session_4.close();

              sessionFactory.close();
       }
       
       

}

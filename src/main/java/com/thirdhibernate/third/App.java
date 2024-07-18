package com.thirdhibernate.third;

import java.io.FileInputStream;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main(String[] args)
    {
//        // Create SessionFactory
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        
//       
//        // Open session and begin transaction
//        Session openSession = sessionFactory.openSession();
//        Transaction txn = openSession.beginTransaction();
//        
////        // Create Student object
////        Student s = new Student();
////        Student s2= new Student();
////        
////        s.setId(1);
////        s.setCity("Jaipur");
////        s.setName("Yogesh");
////        s.setSalary(100200300);
////        s2.setId(2);
////        s2.setCity("Sikar");
////        s2.setName("vishal");
////        s2.setSalary(1000300);
//        
//        // Save student object to create table in database 
//       // openSession.save(s);
//       // openSession.save(s2);
//        // Commit transaction
//        
//        
//        //to delete record in database 
////        Student loadedStudent=openSession.get(Student.class, 2);
////        if(loadedStudent!=null)
////        {
////        	openSession.delete(loadedStudent);
////        	openSession.getTransaction().commit();
////        	System.out.println("Transaction Done");
////        }
////        else
////        {
////        	System.out.println("No Record Found");
////        }
//        
//        
//        Product product = new Product();
//        product.setName("Laptop");
//          
//        
//    
//        txn.commit();
//        
//        // Close session
//        openSession.close();
//        
//        // Close sessionFactory
//        sessionFactory.close();
    	
    	
    	SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
    	Session ssn = sessionFactory.openSession();
    	Transaction txn = ssn.beginTransaction();
    	
    	Adress address=new Adress();
    	address.setCity("sikar");
    	address.setCountry("India");
    	address.setPincode("332401");
    	
    	Employee employee = new Employee(); 
    	employee.setName("Yogesh");
    	employee.setSalary(100000);
        employee.setAddress(address);
        ssn.save(employee);
        txn.commit();
    }
}

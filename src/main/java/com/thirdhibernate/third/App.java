package com.thirdhibernate.third;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main(String[] args)
    {
        // Create SessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        
        System.out.println(sessionFactory);
        System.out.println("hello world");
        System.out.println(sessionFactory.isOpen());
         
        // Open session and begin transaction
        Session openSession = sessionFactory.openSession();
        Transaction txn = openSession.beginTransaction();
        
        // Create Student object
        Student s = new Student();
        
        s.setId(107);
        s.setCity("Jaipurt");
        s.setName("Yogeshk");
        s.setSalary(320003);
        
        // Save student object
        openSession.save(s);
        // Commit transaction
        txn.commit();
        
        // Close session
        openSession.close();
        
        // Close sessionFactory
        sessionFactory.close();
    }
}

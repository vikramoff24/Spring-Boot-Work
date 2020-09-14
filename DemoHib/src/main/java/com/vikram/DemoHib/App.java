package com.vikram.DemoHib;


import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien telusko= new Alien();
        telusko.setAid(12);
        telusko.setAname("navin");
        telusko.setColour("Green");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        		
        SessionFactory sf = con.buildSessionFactory();
        Session session= sf.openSession();
      Transaction tx = session.beginTransaction();
       session.save(telusko);
        tx.commit();
    }
}

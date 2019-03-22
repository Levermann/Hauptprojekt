/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Landb
 */



public class Aggregate {
    
public void Min() {
   
        SessionFactory factory;
    factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession(); 
    Aktienwerte Aktienwerte =new Aktienwerte();
    Unternehmen Unternehmen =new Unternehmen();
    Punkteliste Punkteliste =new Punkteliste();
    
         session.beginTransaction();
 
    
    
         EntityManager em = null;
         
         TypedQuery<Aktienwerte> query = em.createQuery("SELECT SUM(Wert_pro_Aktie) from Aktienwerte", Aktienwerte.class);
         List<Aktienwerte> werte = query.getResultList();
                 
//  Query query = session.createQuery("SELECT SUM(Wert_pro_Aktie) from Aktienwerte");

  // List<Aktienwerte> users1 = (List<Aktienwerte>) session;
     
    // for (Aktienwerte u : users1)

 
                 System.out.println("test3"); 

        
     
     session.getTransaction().commit();
     session.close();         
      System.err.println("Abfrage Beendet");   
      
      
}
}

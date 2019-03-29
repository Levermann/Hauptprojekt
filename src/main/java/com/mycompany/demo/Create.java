/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

/**
 *
* @author Flandd done 01.03.2019
* 
 */
public class Create {
 
    public void CreateUnternehmen () {
             System.out.println(" Bitte \n 1. Unternehmen \n 2. Datum \n 3. Eigenkapital \n 4. Jahresüberschuss");

        Scanner scanner = new Scanner(System.in);
           String Company = scanner.next();
                      String datum = scanner.next();
           float eigenkapital = scanner.nextInt();
           float jahresueberschuss = scanner.nextInt();

         
        // create session factory
        SessionFactory factory;
        factory = (SessionFactory) new Configuration().configure().addAnnotatedClass(Unternehmen.class).buildSessionFactory();
     
        // create session
        Session session = factory.getCurrentSession();
      try{
            //create a unternehmen object
            System.out.println("Creating new Unternehmen Object");
      
            Unternehmen Unternehmen = new Unternehmen ();

            // start a transaction
            session.beginTransaction();
             
            // safe Unternhemen Object
            System.out.println("Speichere Unternehmen...");
            session.save(Unternehmen);
          //   } while(Company!="stopp");
            //commit transaction
            
            session.getTransaction().commit();
            System.out.println("Done!");
     
        }finally{factory.close();}         
    }
  
    public void CreateAktienwert () {
 
        Scanner scanner = new Scanner(System.in);
          
        System.out.println("Bitte \n 1. Namen \n 2. \nWert 3.  Datum \n eingeben ");  
        String name = scanner.next();
           float Wert_pro_Aktie = scanner.nextInt();
           String datum = scanner.next();
         
        // create session factory
        SessionFactory factory;
        factory = (SessionFactory) new Configuration().configure().addAnnotatedClass(Aktienwerte.class).buildSessionFactory();
     
        // create session
        Session session = factory.getCurrentSession();
      try{
            //create a unternehmen object
            System.out.println("Creating new Unternehmen Object");
      
            Aktienwerte Aktienwerte = new Aktienwerte (name, Wert_pro_Aktie,datum);

            // start a transaction
            session.beginTransaction();
             
            // safe Unternhemen Object
            System.out.println("Speichere Unternehmen...");
            session.save(Aktienwerte);
          //   } while(Company!="stopp");
            //commit transaction
            
            session.getTransaction().commit();
            System.out.println("Done!");
     
        }finally{factory.close();}         
    }
    
    
    
    
}

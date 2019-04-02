/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Landb
 */
public class Gewinnrevision {
    
    public void Gewinnrevision () {
    
    
    


     // Erstellung des Scanners
    Scanner scanner = new Scanner(System.in);    
    
    // Select statement 
       String Select = "from Unternehmen where " ;
   
    System.out.println("Bitte wählen Sie: \n 0: alles \n 1: ID \n 2: Firmen");       

       
        // switch case
        int i = scanner.nextInt();
       
    SessionFactory factory;
    factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession(); 
    Unternehmen Unternehmen=new Unternehmen();
  
     // Verbingungsaufbau
     session.beginTransaction();


             System.out.println("Sie erhalten nun eine gesamte Liste");  

      
     // Erzeugung der MYSQ Query       
     Query query0 = session.createQuery("from Unternehmen");
     // Zeilenbeginn der Auslese
     query0.setFirstResult(0);

     // Erstellung der Liste
     List<Unternehmen> users0 = (List<Unternehmen>) query0.list();
          
        System.out.println("ID + Unternehman" + " Eigenkapital" + " Jahresueberschuss " + "Datum");
        for (Unternehmen u : users0)
       
        // Ausgabe
              System.out.println( u.toString() );


  
  
     session.getTransaction().commit();
     session.close();         
     //  } while (i != 3);
      
            System.err.println("Abfrage Beendet");

      }  
    
    
}

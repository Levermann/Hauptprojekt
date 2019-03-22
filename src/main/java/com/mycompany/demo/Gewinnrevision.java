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
       String Select = "from Aktienwerte where " ;
   
    System.out.println("Bitte wählen Sie: \n 0: alles \n 1: ID \n 2: Firmen");       


        // switch case
        int i = 1;
        
        System.out.println("bitte 1. Datum: dd.mm.yyyy");
        
       String date1 = "10.02.2019"; // scanner.next();

        System.out.println("bitte 2. Datum: dd.mm.yyyy");
        
       String date2 = "10.03.2019"; //scanner.next();
       

       
    SessionFactory factory;
    factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession(); 
    Aktienwerte Aktienwerte =new Aktienwerte();
    Unternehmen Unternehmen =new Unternehmen();
    Punkteliste Punkteliste =new Punkteliste();
    
     // Verbingungsaufbau
     session.beginTransaction();

  switch(i){
      
      // Ausgabe der Punkteliste
      case 0:
             System.out.println("Sie erhalten nun eine gesamte Liste");  

      
     // Erzeugung der MYSQ Query       
     Query query0 = session.createQuery("from Punkteliste");
     // Zeilenbeginn der Auslese

     // Erstellung der Liste
     List<Punkteliste> users0 = (List<Punkteliste>) query0.list();
          
        System.out.println("Name & Punkte ");
        for (Punkteliste u : users0)

   System.out.println( "Name = " + u.getPktName()+"\n Gewinnrevision = " + u.getPunktGewinnrevision());


        // System.out.println( u.getAId() + " \t" + u.getAName() +  "\t" + u.getWert_pro_Aktie()+ " € "+ "\t\t\t" + u.getADate().substring(0,10).replace("-", "."));
            session.getTransaction().commit();
     session.close();         
      System.err.println("Abfrage Beendet"); 
        
        break;  
  
  // Aktualisieren der Punkteliste
    case 1:
       // Erzeugung der MYSQ Query   
        System.out.println("Sie befinden sich in der Unternehmensauswahl, bitte Name Eingeben:");  
        
        // Eingabeauforderung Name
         String name = scanner.next();
            Aktienwerte.setAName(name); 
             Punkteliste.setPktName(name);
           
             
             System.out.println("test1");       
        
      
         Select = "from Aktienwerte where name = " + "'" + Aktienwerte.getAName()+ "'";       
       String Select1 = "select AVG(Wert_pro_Aktie) as Average from Aktienwerte ";       
      
     // Erzeugung der MYSQ Query       
        Query query1 = session.createQuery(Select1);  
 

     
     
         // System.out.println("\nAktienliste55\n");
             System.out.println("test2");       

     // Erstellung der Liste
     List<Aktienwerte> users1 = (List<Aktienwerte>) query1.list();
     
     for (Aktienwerte u : users1)
         
 System.out.println( "\t"+ "Unternehman = " + u.getAName() + " Wert pro Aktie = " + u.getWert_pro_Aktie()+ " € "+ u.getADate());
 
                 System.out.println("test3");       

         
 if (Aktienwerte.getWert_pro_Aktie() > Aktienwerte.getWert_pro_Aktie() == true){

     //  Punkteliste.setPktName(name);
      // Punkteliste.setPunktGewinnrevision(1);
      // session.beginTransaction(); 
 
        System.out.println("\nhahahahahaha\n");
 
       // session.update(Punkteliste);   
       

// List<Punkteliste> users3 = (List<Punkteliste>) query3.list();
                 
       //           for (Punkteliste unt : users3)
      //  System.out.println(unt.getPktName() +"\t " + unt.getPunktGewinnrevision()); 
   }

  
     else {System.out.println("\nPunkteliste2 :D\n");
 // System.out.println( "\t"+ "Unternehman = " + u.getAName() + " Wert pro Aktie = " + u.getWert_pro_Aktie()+ " € "+ u.getADate().substring(0,10).replace("-", "."));
 
     System.out.println("nope");
                 
      //  for (Punkteliste unt : users3)
       // System.out.println(unt.getPktName() +"\t " + unt.getPunktGewinnrevision());
   
   }

     
          session.getTransaction().commit();
     session.close();         
      System.err.println("Abfrage Beendet");
        break;
  
  
  
  }
  
        
        


      }  
    
    
}

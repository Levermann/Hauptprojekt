/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.kennzahlen;

import java.util.List;

import com.levermann.entityclass.Punkteliste;
import com.levermann.entityclass.Unternehmen;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Gewinnrevision {
    
    public void Gewinnrevision () {


    SessionFactory factory;
        factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
    Session session1 = factory.openSession(); 
      try{  
    Unternehmen Un= new Unternehmen();
  
     // Verbingungsaufbau
     session1.beginTransaction();
     
    System.out.println("Sie erhalten nun eine gesamte Liste");  

      
     // Erzeugung der MYSQ Query       
     Query query0 = session1.createQuery("from Unternehmen");
     // Zeilenbeginn der Auslese
     query0.setFirstResult(0);

     // Erstellung der Liste
     List<Unternehmen> users0 = (List<Unternehmen>) query0.list();
          
        System.out.println("ID + Unternehman" + " Eigenkapital" + " Jahresueberschuss " + "Datum");
        for (Unternehmen u : users0)
       
        // Ausgabe
        if ( u.getEigenkapital() != u.getJahresueberschuss() == true){
           System.out.println( u.getCid() + " \t" + u.getName() +  "\t" + u.getEigenkapital()+ " € " +  "\t" + u.getJahresueberschuss()+ " € "+ u.getDatum() );
       
              // Erzeugung der MYSQ Query       
     Query query2 = session1.createQuery("from Punkteliste where CID2 = '" + u.getCid() +"'");
     // Zeilenbeginn der Auslese
     query2.setFirstResult(0);

     // Erstellung der Liste
     List<Punkteliste> users1 = (List<Punkteliste>) query2.list();
          
        System.out.println("ID + Unternehman" + " Eigenkapital" + " Jahresueberschuss " + "Datum");
        for (Punkteliste o : users1)
          o.setGewinnrevision(1);
          System.out.println( "test" );
        }
        
       else
            System.out.println("");
        
     session1.getTransaction().commit();
     session1.close();         
     //  } while (i != 3);
             
      }finally{factory.close();}} 
    
}

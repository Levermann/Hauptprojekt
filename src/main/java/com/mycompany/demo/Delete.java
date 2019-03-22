/*

on Track

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
 */
public class Delete {

    
void DeleteUnternehmen() {
 
    // Eingabeauforderung Unternehmen
    Scanner scanner = new Scanner(System.in);    

   
    SessionFactory factory;
    factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession(); 
    try{  
    Unternehmen Unternehmen=new Unternehmen();
  
       System.out.println("Sie befinden sich in der IDauswahl, bitte name Eingeben:");  
     // Eingabeauforderung ID
            String name = scanner.next();
            Unternehmen.setName(name); 
            
     // Verbingungsaufbau
        session.beginTransaction();
        session.delete(Unternehmen);
        session.getTransaction().commit();
        System.out.println(" ID = " + Unternehmen.getId() + " wurde gelöscht");
     
    } finally{factory.close();}}  

void DeleteAktienwerte() {
 
    // Eingabeauforderung Unternehmen
    Scanner scanner = new Scanner(System.in);    

   
    SessionFactory factory;
    factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession(); 
    try{  
    Aktienwerte Aktienwerte=new Aktienwerte();
  
       System.out.println("Sie befinden sich in der IDauswahl, bitte ID Eingeben:");  
     // Eingabeauforderung ID
            int id = scanner.nextInt();
            Aktienwerte.setAId(id); 
            
     // Verbingungsaufbau
        session.beginTransaction();
        session.delete(Aktienwerte);
        session.getTransaction().commit();
        System.out.println(" ID = " + Aktienwerte.getAId() + " wurde gelöscht");
     
    } finally{factory.close();}}  

}                   
                  

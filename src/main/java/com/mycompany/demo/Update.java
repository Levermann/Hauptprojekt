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
 */
public class Update {


    public void UpdateUnternehmen () {

        Scanner scanner = new Scanner(System.in);    
// Eingabeauforderung Unternehmen
  
         
   SessionFactory factory;
	factory = (SessionFactory) new Configuration().configure().addAnnotatedClass(Unternehmen.class).buildSessionFactory();
     Session session = factory.openSession(); 
   Unternehmen Unternehmen=new Unternehmen();
   
  try {      
    System.out.println("Eingabe:\n 1. ID \n 2. Unternehmen \n 3. Datum \n 4. Eigenkapital \n 5. Jahresueberschuss");
       
    //Select Primärschlüssel
   int id = scanner.nextInt();
   Unternehmen.setId(id);
    
    String name = scanner.next();    
    Unternehmen.setName(name);
    
    String datum = scanner.next();
    Unternehmen.setDate(datum);
   
    float  eigenkapital = scanner.nextInt(); 
    Unternehmen.setEigenkapital(eigenkapital);   
    float  jahresueberschuss = scanner.nextInt();
    Unternehmen.setJahresueberschuss(jahresueberschuss); 
     
    session.beginTransaction(); 
        
   // Aktion   
        session.update(Unternehmen);
    
    // Variablen zum Update    
        session.getTransaction().commit();}
	finally{factory.close();}}
    
 
    
        public void UpdateAktienwerte () {

 System.out.println("Eingabe:\n 1. ID \n 2. Unternehmen \n 3. Wert_pro_Aktie" );
        Scanner scanner = new Scanner(System.in);    
// Eingabeauforderung Unternehmen
   int id = scanner.nextInt();
         
   SessionFactory factory;
	factory = (SessionFactory) new Configuration().configure().addAnnotatedClass(Aktienwerte.class).buildSessionFactory();
     Session session = factory.openSession(); 
   Aktienwerte Aktienwerte=new Aktienwerte();
   
  try {      
      
     Aktienwerte.setAId(id);
     
    //Select Primärschlüssel
    String name = scanner.next();    
    Aktienwerte.setAName(name);
   
    float  Wert_pro_Aktie = scanner.nextInt(); 
    Aktienwerte.setWert_pro_Aktie(Wert_pro_Aktie);   
   
    session.beginTransaction(); 
        
   // Aktion   
        session.update(Aktienwerte);
    
    // Variablen zum Update    
        session.getTransaction().commit();}
	finally{factory.close();}}
}
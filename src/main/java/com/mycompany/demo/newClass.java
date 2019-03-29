/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.mycompany.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author Landb
 */
public class newClass {
    
    
    
    
     public static void main(String[] args)
   {
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "HibernatePersistenzEM");
      EntityManager entitymanager = emfactory.createEntityManager( );
   

      
        entitymanager.getTransaction( ).begin( );
      
      Unternehmen Unternehmen = new Unternehmen( ); 
      Unternehmen.setEigenkapital(50000);
      Unternehmen.setId(2);
      Unternehmen.setJahresueberschuss(60000);
      Unternehmen.setName("bmw");
      Unternehmen.setDate("24.02.2016");
      
        
      entitymanager.persist( Unternehmen );
      entitymanager.getTransaction( ).commit( );

      entitymanager.close( );
      emfactory.close( );
   }
    
    
}

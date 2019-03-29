/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.mycompany.demo;

import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Landb
 */
public class newClass {
    
    
    Logger log = Logger.getLogger(this.getClass().getName());
    
    private EntityManagerFactory emf;
    
    @Before
    public void init(){
    emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }
    
   @After
    public void close(){
        emf.close();
        
    }
    
    
    @Test
    public void createUnternehmen(){
        
          Unternehmen un = new Unternehmen();
          
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
      
        
        un.setId(3);
        un.setDate("29.03.2019");
        un.setEigenkapital(5000);
        un.setJahresueberschuss(50000);
        un.setName("BMWW");
        
       em.persist(un);
    }
    
    
}
    
    
    /*
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
    */
    


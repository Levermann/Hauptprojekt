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
     EntityManagerFactory emf = Persistence.createEntityManagerFactory( "HibernatePersistenzEM");
     EntityManager em = emf.createEntityManager();
   

       try
    {
  
  
      Unternehmen Unternehmen1 = new Unternehmen( ); 
      Unternehmen1.setEigenkapital(50000);
      Unternehmen1.setId(2);
      Unternehmen1.setJahresueberschuss(60000);
      Unternehmen1.setName("bmw");
      Unternehmen1.setDate("24.02.2016");
      
        
      em.getTransaction().begin();
      em.persist( Unternehmen1 );
      em.getTransaction().commit();

  
        String query = "SELECT c FROM Unternehmen c";
      for ( Unternehmen c : em.createQuery( query, Unternehmen.class ).getResultList() )
        System.out.println( c.getName() );
      
      
    }
    catch ( Exception e )
    {
      e.printStackTrace();
      em.getTransaction().rollback();
    }
    finally
    {
      em.close();
  }
  }
}

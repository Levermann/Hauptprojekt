/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.project;

import com.levermann.dao.UnternehmenDao;
import com.levermann.entityclass.Unternehmen;
import com.levermann.kennzahlen.Gewinnrevision;

/**
 *
 * @author Das ist ein Test :D
 */
public class ConnectionMain {

    
    
    
    
    /**
     * @param args the command line arguments
    
    * 
    * */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

      //done
      //   Create create = new Create ();
      //  create.CreateUnternehmen();
       //  Delete delete = new Delete ();
     //   delete.DeleteUnternehmen();


        Unternehmen A = new Unternehmen("Adidas");
        UnternehmenDao Udao = new UnternehmenDao();
        Udao.createUnternehmen(A);
     

        
  Gewinnrevision Gewinnrevision = new Gewinnrevision();
  Gewinnrevision.Gewinnrevision();
  
       //System.out.println("Wilkommen in der Tabellenbearbeitung \n Bitte wählen Sie: \n 0. Unternehmen \n 2. Gewinnrevision");         
        
       
     //  Gewinnrevision gr = new Gewinnrevision ();
     //  gr.Gewinnrevision();
       
     
   
       
       
       //  TypedQuery<Unternehmen> query = em.createNamedQuery("Unternehmen.findAll", Unternehmen.class);
  //List <Unternehmen> results = query.getResultList();
          
       
       /*Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
  
        
  switch(i){  
    
      // Unternehmensauswahl
      case 0: 
 
     System.out.println("Wilkommen in der Tabellenbearbeitung für Unternehmen \n Bitte wählen Sie: \n 0. Erstellung \n 1. Auswertung \n 2. Aktualisierung \n 3. Löschen");       
      int j = scanner.nextInt();
 
      switch(j){
      
      case 0:     
        Create create = new Create ();
        create.CreateUnternehmen();
        break;
        
      case 1:
        Select select = new Select ();
        select.SelectUnternehmen();
        break;

      case 2:
        Update update = new Update ();
        update.UpdateUnternehmen();
        break;
      
      case 3:
        Delete delete = new Delete ();
        delete.DeleteUnternehmen();
        break;
        
      default:
          
          System.err.println("falsche Auswahl!");
          
          break;}   
      break;
      // Unternehmensauswahl ende
         
     // Gewinnrevision Punkt 8
     case 2:
         System.out.println("gewinnrevisionsaktualisierung Punkt 8 Levermann");   
Gewinnrevision Gewinnrevision = new Gewinnrevision ();
Gewinnrevision.Gewinnrevision();
         
     break;
     // Gewinnrevision Punkt 8 ende
     
     // default für Switch case     
     default:
      break;}
 
        System.out.println("Vielen Dank und auf Wiedersehen :)");
    
    /*

        System.out.println(" test 1234");
  
        System.out.println("nummer 1");
        
        
        printGregorianCalendarDate(); 
  
      System.out.println("Nummer 2");
      
  printSimpleDateFormat(); 
  
  
        System.out.println("ende :DDDDDD");*/
    }
    
}

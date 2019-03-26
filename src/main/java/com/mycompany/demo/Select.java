/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Flandd done 01.03.2019
 */
public class Select {

    public void SelectUnternehmen () {
    
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

  switch(i){
      
      case 0:
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
              System.out.println( u.getId() + " \t" + u.getName() +  "\t" + u.getEigenkapital()+ " € " +  "\t" + u.getJahresueberschuss()+ " € "+ u.getDate().substring(0,10).replace("-", ".") );


          break; 
      
      
        case 1:
             System.out.println("Sie befinden sich in der IDauswahl, bitte ID Eingeben:");  
     // Eingabeauforderung ID
            int id = scanner.nextInt();
            Unternehmen.setId(id); 
            
        System.out.println("Bitte wählen Sie: \n 0: name \n 1: ID \n 2: Eigenkapital \n 3: jahresueberschuss");       
        
        int f = scanner.nextInt();
        
        String group;
        

        
            switch(f){
                
                
                case 0:
                    group = "GROUP BY name"; 
                    break;
                case 1:
                     group = "GROUP BY id"; 
                    
                    break;
                
                case 2:
                     group = " GROUP BY eigenkapital"; 
                    
                    break;
                case 3:
                     group = "GROUP BY jahresueberschuss"; 
                    
                    break;
                default:
                    group = "";
                    break;
            }
            
      Select = "from Unternehmen where ID = " + Unternehmen.getId() + group;   
     
     // Erzeugung der MYSQ Query       
     Query query1 = session.createQuery(Select);
   
     // Beginn der Auslese
     query1.setFirstResult(0);
     
     // Ende der Auslese
     //query.setMaxResults(9)
          
     
     
     // Erstellung der Liste
     List<Unternehmen> users1 = (List<Unternehmen>) query1.list();
          for (Unternehmen u : users1)
       

              
        // Ausgabe
        System.out.println("Unternehman = " + u.getName() + " Eigenkapital = " + u.getEigenkapital()+ " € " +  "Jahresueberschuss = " +u.getJahresueberschuss()+ " € ");
         break; 
 
    case 2:
       // Erzeugung der MYSQ Query   
        System.out.println("Sie befinden sich in der Unternehmensauswahl, bitte Name Eingeben:");  
        
        // Eingabeauforderung Name
         String name = scanner.next();
            Unternehmen.setName(name); 
    
             System.out.println("Bitte wählen Sie: \n 0: name \n 1: ID \n 2: Eigenkapital \n 3: jahresueberschuss");       
        
        int g = scanner.nextInt();
            
        String GroupName;
            
            switch(g){
                
                
                case 0:
                    GroupName = "GROUP BY name"; 
                    break;
                case 1:
                     GroupName = "GROUP BY id"; 
                    
                    break;
                
                case 2:
                     GroupName = " GROUP BY eigenkapital"; 
                    
                    break;
                case 3:
                     GroupName = "GROUP BY jahresueberschuss"; 
                    
                    break;
                default:
                    GroupName = "";
                    break;
            }
     
        Select = "from Unternehmen where name = " + "'" + Unternehmen.getName()+ "'" + GroupName;       

        // Erzeugung der MYSQ Query       
        Query query2 = session.createQuery(Select);
          
         query2.setFirstResult(0);
     
  
     // Erstellung der Liste
     List<Unternehmen> users2 = (List<Unternehmen>) query2.list();
     
     for (Unternehmen u : users2)
       
    // Ausgabe
        System.out.println("Unternehman = " + u.getName() + " Eigenkapital = " + u.getEigenkapital()+ " € " +  "Jahresueberschuss = " +u.getJahresueberschuss()+ " € ");
      break;        
                   }
   
     session.getTransaction().commit();
     session.close();         
     //  } while (i != 3);
      
            System.err.println("Abfrage Beendet");

      }  

    
    
    
    
    
   public void SelectAktienwerte () {
    
    // Erstellung des Scanners
    Scanner scanner = new Scanner(System.in);    
    
    // Select statement 
       String Select = "from Aktienwerte where " ;
   
    System.out.println("Bitte wählen Sie: \n 0: alles \n 1: ID \n 2: Firmen");       

       
        // switch case
        int i = scanner.nextInt();
       
    SessionFactory factory;
    factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession(); 
    Aktienwerte Aktienwerte=new Aktienwerte();
  
     // Verbingungsaufbau
     session.beginTransaction();

  switch(i){
      
      case 0:
             System.out.println("Sie erhalten nun eine gesamte Liste");  

      
     // Erzeugung der MYSQ Query       
     Query query0 = session.createQuery("from Aktienwerte");
     // Zeilenbeginn der Auslese
     query0.setFirstResult(0);

     // Erstellung der Liste
     List<Aktienwerte> users0 = (List<Aktienwerte>) query0.list();
          
        System.out.println("ID + Aktienwerte" + " Wert pro Aktie" + "Datum");
        for (Aktienwerte u : users0)
       
        // Ausgabe
         System.out.println( u.getAId() + " \t" + u.getAName() +  "\t" + u.getWert_pro_Aktie()+ " € " + u.getADate().substring(0,10).replace("-", "."));
         break; 
      
      
        case 1:
             System.out.println("Sie befinden sich in der IDauswahl, bitte ID Eingeben:");  
     // Eingabeauforderung ID
            int id = scanner.nextInt();
            Aktienwerte.setAId(id); 
            
        System.out.println("Bitte wählen Sie: \n 0: name \n 1: ID \n 2: Wert pro Aktie");       
        
        int f = scanner.nextInt();
        
        String group;
        

        
            switch(f){
                
                
                case 0:
                    group = "GROUP BY name"; 
                    break;
                case 1:
                     group = "GROUP BY id"; 
                    
                    break;
                
                case 2:
                     group = " GROUP BY Wert_pro_Aktie"; 
                    
                    break;
               default:
                    group = "";
                    break;
            }
            
      Select = "from Aktienwerte where ID = " + Aktienwerte.getAId() + group;   
     
     // Erzeugung der MYSQ Query       
     Query query1 = session.createQuery(Select);
   
     // Beginn der Auslese
    // query1.setFirstResult(0);

     //query.setMaxResults(9)
          
     
     
     // Erstellung der Liste
     List<Aktienwerte> users1 = (List<Aktienwerte>) query1.list();
          for (Aktienwerte u : users1)
       

              
        // Ausgabe
        System.out.println("Unternehman = " + u.getAName() + " Wert pro Aktie = " + u.getWert_pro_Aktie()+ " € " + u.getADate().substring(0,10).replace("-", "."));
         break; 
 
    case 2:
       // Erzeugung der MYSQ Query   
        System.out.println("Sie befinden sich in der Unternehmensauswahl, bitte Name Eingeben:");  
        
        // Eingabeauforderung Name
         String name = scanner.next();
            Aktienwerte.setAName(name); 
    
             System.out.println("Bitte wählen Sie: \n 0: name \n 1: ID \n 2: Wert pro Aktie");       
        
        int g = scanner.nextInt();
            
        String GroupName;
            
            switch(g){
                
                
                case 0:
                    GroupName = "GROUP BY name"; 
                    break;
                case 1:
                     GroupName = "GROUP BY id"; 
                    
                    break;
                
                case 2:
                     GroupName = " GROUP BY Wert_pro_Aktie"; 
                    
                    break;
                default:
                    GroupName = "";
                    break;
            }
     
        Select = "from Aktienwerte where name = " + "'" + Aktienwerte.getAName()+ "'" + GroupName;       

        // Erzeugung der MYSQ Query       
        Query query2 = session.createQuery(Select);
          
         query2.setFirstResult(0);
     
  
     // Erstellung der Liste
     List<Aktienwerte> users2 = (List<Aktienwerte>) query2.list();
     
     for (Aktienwerte u : users2)
       
    // Ausgabe
        System.out.println("Unternehman = " + u.getAName() + " Wert pro Aktie = " + u.getWert_pro_Aktie()+ " € "+ u.getADate().substring(0,10).replace("-", "."));
      break;        
                   }
   
     session.getTransaction().commit();
     session.close();         
     //  } while (i != 3);
      
            System.err.println("Abfrage Beendet");

      }      
    
    
    }                
                  

    

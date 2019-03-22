package com.mycompany.demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Landb
 * 
 * 
 */

@Entity 

@Table(name="Aktienwerte")
public class Aktienwerte implements Serializable {
    
    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
         @Id
    private  int  id;

    @Column(name="name")    
    private String name;
    
    @Column(name="Wert_pro_Aktie")    
    private float Wert_pro_Aktie;

    private String datum;

    
    public Aktienwerte() {
    }


   
    public Aktienwerte(String name, float Wert_pro_Aktie) {
        this.name = name;
        this.Wert_pro_Aktie = Wert_pro_Aktie;

   
}
    
        public Aktienwerte( String name, float Wert_pro_Aktie,  String datum) {
        this.name = name;
        this.Wert_pro_Aktie = Wert_pro_Aktie;
        this.datum = datum;
 
}

   
    /**
     * @return the id
     */
 
    public int getAId() {
        return id;}
    
         public void setAId(int id) {
        this.id = id;}
      
         
         
             public String getADate() {
        return datum;}            
    
         public void setADate(String datum) {
               this.datum = datum;}
               
    /**
     * @return the name
     */
    public String getAName() {
        return name;}

    /**
     * @param name the name to set
     */
    public void setAName(String name) {
        this.name = name;}

    /**
     * @return the eigenkapital
     */
    public float getWert_pro_Aktie() {
        return Wert_pro_Aktie;}

    /**
     * @param Wert_pro_Aktie the eigenkapital to set
     */
    public void setWert_pro_Aktie(float Wert_pro_Aktie) {
        this.Wert_pro_Aktie = Wert_pro_Aktie;}

   @Override
    public String toString() {
        return "DB: Unternehmen \n " + "id= " + id + ", name= " + name + ", Wert_pro_Aktie= " + Wert_pro_Aktie + '}';}
    
}
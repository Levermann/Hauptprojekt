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

@Table(name="Punkteliste")
public class Punkteliste implements Serializable {
    

    
    @Column(name="name")    
    @Id
    private String name;

   
    @Column(name="PunktGewinnrevision")    
    private int PunktGewinnrevision;  

Punkteliste() {}


   
    public Punkteliste(String name, int PunktGewinnrevision) {
        this.name = name;
        this.PunktGewinnrevision = PunktGewinnrevision;

   
}

   
    /**
     * @return the id
     */

    

         
         public int getPunktGewinnrevision() {
        return PunktGewinnrevision;}            
    
         public void setPunktGewinnrevision(int PunktGewinnrevision) {
               this.PunktGewinnrevision = PunktGewinnrevision;}    
    /**
     * @return the name
     */
    public String getPktName() {
        return name;}

    /**
     * @param name the name to set
     */
    public void setPktName(String name) {
        this.name = name;}



   @Override
    public String toString() {
        return "DB: Unternehmen \n " + ", name= " + name + ", Wert_pro_Aktie= " + PunktGewinnrevision + '}';}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
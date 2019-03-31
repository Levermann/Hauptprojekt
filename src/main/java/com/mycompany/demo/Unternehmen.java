/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



/**
 *
 * @author flandd
 */




@Entity 
@Table(name="unternehmen")

@NamedQueries({
    @NamedQuery (name = "Unternehmen.findAll", query = "Select c FROM Unternehmen c")

})
public class Unternehmen implements Serializable {
    
    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    @Id 
    private  int  id;
    
    @Column(name="name")    
    private String name;
    
    @Column(name="eigenkapital")    
    private float eigenkapital;
    
    @Column(name="jahresueberschuss")    
    private float jahresueberschuss;
    
    @Column(name="datum")    
    private String datum;
   

    
    public Unternehmen() {
        
    }

    /*public Unternehmen(String name, float eigenkapital, float jahresueberschuss) {
        super();
        this.name = name;
        this.eigenkapital = eigenkapital;
        this.jahresueberschuss = jahresueberschuss;}
    
        public Unternehmen( String name, String datum, float eigenkapital, float jahresueberschuss) {
        super();
            this.name = name;
        this.eigenkapital = eigenkapital;
        this.jahresueberschuss = jahresueberschuss;
        this.datum = datum;
}*/

   
    /**
     * @return the id
     */
 
    public int getId() {
        return id;
    }
    
         public void setId(int id) {
        this.id = id;
    }
         
         
             public String getDate() {
        return datum;
    }
    
         public void setDate(String datum) {
               this.datum = datum;}
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the eigenkapital
     */
    public float getEigenkapital() {
        return eigenkapital;
    }

    /**
     * @param eigenkapital the eigenkapital to set
     */
    public void setEigenkapital(float eigenkapital) {
        this.eigenkapital = eigenkapital;
    }

    /**
     * @return the jahresueberschuss
     */
    public float getJahresueberschuss() {
        return jahresueberschuss;
    }

    /**
     * @param jahresueberschuss the jahresueberschuss to set
     */
    public void setJahresueberschuss(float jahresueberschuss) {
        this.jahresueberschuss = jahresueberschuss;
    }

    
    @Override
    public String toString() {
        return "DB: Unternehmen \n " + "id= " + id + ", name= " + name + ", eigenkapital= " + eigenkapital + ", jahresueberschuss= " + jahresueberschuss + "datum= "+ datum+'}';
    }

   
    
    
}

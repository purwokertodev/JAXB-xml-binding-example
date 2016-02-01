/*
   **********************************************************************
   **********************************************************************
   ** By Wuriyanto                                                     **
   ** EMAIL/FACEBOOK : wuriyanto48@yahoo.co.id  OR  Prince Wury        **
   ** WEBSITE : wuriyantoinformatika.blogspot.com                      **
   ** CITY : BANJARNEGARA CENTRAL JAVA INDONESIA                       **
   ** COMPUTER SCIENCE                                                 **
   ** MUHAMMADIYAH UNIVERSITY OF PURWOKERTO                            **
   ** NB:BEBAS DIDISTRIBUSIKAN UNTUK TUJUAN BELAJAR                    **      
   **                                                                  **
   **                                     JMAT.inc & Black Code Studio **
   **********************************************************************
   **********************************************************************

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.jaxb.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author WURI
 */
@XmlRootElement(name = "person")
public class Person {
    
    private String id;
    private String name;
    private String address;

    public String getId() {
        return id;
    }

    @XmlAttribute
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    @XmlElement
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }

    
    

}

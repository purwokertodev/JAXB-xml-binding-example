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
package com.wury.jaxb.service;

import com.wury.jaxb.model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WURI
 */
public class PersonService {
    
    public Person findOne(String id){
        Person p = null;
        for(Person person:findAll()){
            if(id.equals(person.getId())){
                p = person;
            }
        }
        return p;
    }

    public List<Person> findAll() {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person();
        p1.setId("001");
        p1.setName("Alex");
        p1.setAddress("Jakarta");
        list.add(p1);
        
        Person p2 = new Person();
        p2.setId("002");
        p2.setName("Bobbie");
        p2.setAddress("Jakarta");
        list.add(p2);
        
        Person p3 = new Person();
        p3.setId("003");
        p3.setName("Charlie");
        p3.setAddress("Jakarta");
        list.add(p3);
        return list;
    }

}

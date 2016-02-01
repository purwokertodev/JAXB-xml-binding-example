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
package com.wury.jaxb.databinding;

import com.wury.jaxb.model.Person;
import com.wury.jaxb.model.Persons;
import com.wury.jaxb.service.PersonService;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author WURI
 */
public class PersonBinding {

    public void singleBindingToXml(String id) {
        PersonService personService = new PersonService();
        Person p = personService.findOne(id);

        if(p != null){
            try {
            File file = new File("C:\\person.xml");
            JAXBContext jAXBContext = JAXBContext.newInstance(Person.class);
            Marshaller marshaller = jAXBContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(p, file);
            marshaller.marshal(p, System.out);
        } catch (JAXBException ex) {

        }
        }
    }

    public void singleBindingFromXml() {
        try {

            File file = new File("C:\\person.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Person p = (Person) jaxbUnmarshaller.unmarshal(file);
            System.out.println(p);

        } catch (JAXBException e) {

        }
    }

    public void multiBindingToXml() {

        PersonService personService = new PersonService();
        Persons persons = new Persons();
        persons.setPersons(personService.findAll());

        try {
            File file = new File("C:\\persons.xml");
            JAXBContext jAXBContext = JAXBContext.newInstance(Persons.class);
            Marshaller marshaller = jAXBContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(persons, file);
            marshaller.marshal(persons, System.out);

        } catch (JAXBException ex) {

        }

    }

    public void multiBindingFromXml() {
        try {
            File file = new File("C:\\persons.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);
            
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Persons persons = (Persons) jaxbUnmarshaller.unmarshal(file);
            for(Person p:persons.getPersons()){
                System.out.println(p.getId());
                System.out.println(p.getName());
                System.out.println(p.getAddress());
            }
        } catch (JAXBException ex) {
            System.out.println(ex.getMessage());
        }
    }

}

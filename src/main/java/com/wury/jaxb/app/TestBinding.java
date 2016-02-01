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

package com.wury.jaxb.app;

import com.wury.jaxb.databinding.PersonBinding;

/**
 *
 * @author WURI
 */
public class TestBinding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonBinding binding = new PersonBinding();
        binding.multiBindingFromXml();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Main { 

    public static void main(String[] args) { 
      Voorwerp[] voorwerpen = {
        new Boekenrek(),
        new Boekenrek(75, 90, 28.5F),
          
        new Leesboek(),
        new Leesboek("Leesboek Java 7", "Oracle", 20.4F, 
                     "genre Informatica", "onderw programmeren" ),
                 
        new Woordenboek(),
        new Woordenboek("Woordenboek Engels", "Van Dale", 30.10F, 
                        "genre vertaal woordenboek", 
                        "taal Engels-Nederlands")  
      } ;
        
      float totaleWinst = 0;  
        
      for (Voorwerp eenVoorwerp: voorwerpen) {
        eenVoorwerp.gegevensTonen(); 

      System.out.println();
        totaleWinst += eenVoorwerp.winstBerekenen();
      }
      System.out.println("DE TOTALE WINST BEDRAAGT " + totaleWinst);
    }
} 


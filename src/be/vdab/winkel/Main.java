/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;


import be.vdab.winkel.Catalogus;
import be.vdab.winkel.Mandje;
import be.vdab.winkel.Product;
import java.util.Map.Entry;


/**
 *
 * @author hoang.anh.duc.ton
 */
public class Main {
    public static void main(String[] args) {     
        Catalogus catalogus = new Catalogus();
        Mandje mandje = new Mandje ();
        
         //Catalogus overlopen + mandje programmatorisch vullen
        int i = 1;
        for (Product eenProduct : catalogus.getLijstCatalogus()) {
            if (i%2==0)
                mandje.add(eenProduct,i);
            i++;
        }
        
        System.out.println("u kocht:");
        for (Entry eenAankoop : mandje.getMandje().entrySet()) 
        { 
            System.out.println( (eenAankoop.getKey()).toString() + "; aantal stuks: " + eenAankoop.getValue() );
        }
 
        System.out.println("\nu kocht voor een totaal van: " + 
        mandje.getTotalePrijs() );
    }
} 

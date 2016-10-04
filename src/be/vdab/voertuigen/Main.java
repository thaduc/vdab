/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voertuigen;

import be.vdab.voertuigen.*;
import java.util.*;
/**
 *
 * @author hoang.anh.duc.ton
 */
public class Main {
    public static void main(String[] args) {
        Personenwagen opel1 = new Personenwagen();
        opel1.toon();
        System.out.println(opel1);

        Personenwagen opel2 = new Personenwagen("Jan Klaasen",
                14599.0F, 105, 6.8F, "1-KLM-099", 5, 5);
        opel2.toon();
        System.out.println(opel2);

        opel2.setKostprijs(-15000);
        opel2.setAantalDeuren(-7);
        opel2.setAantalPassagiers(0);
        System.out.println(opel2); //opel2 is niet gewijzigd        

        Vrachtwagen volvo1 = new Vrachtwagen();
        volvo1.toon();
        System.out.println(volvo1);

        Vrachtwagen volvo2 = new Vrachtwagen("Michel Dewolf",
                214599.0F, 440, 33.1F, "1-PRD-441", 6000.0F);
        volvo2.toon();
        System.out.println(volvo2);
 
        System.out.println();
        System.out.println("Kyotoscore personenwagen 1: " + opel1.getKyotoScore());
        System.out.println("Kyotoscore personenwagen 2: " + opel2.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 1: " + volvo1.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 2: " + volvo2.getKyotoScore());
 
        //polymorfisme 
        Voertuig voertuigen[] = new Voertuig[4];
        voertuigen[0] = opel1;
        voertuigen[1] = opel2;
        voertuigen[2] = volvo1;
        voertuigen[3] = volvo2;
 
        System.out.println("\n--- toString()---");
        for (Voertuig voertuig : voertuigen) {
            System.out.println(voertuig);
        }
 
        System.out.println("\n--- method toon() ---");
        for (Voertuig voertuig : voertuigen) {
            voertuig.toon();
        }
        
        
        Set<Voertuig> setVoertuigen = new TreeSet<>();
        setVoertuigen.add(opel2);
        setVoertuigen.add(new Personenwagen("Piet Peeters",
                18321.0F, 110, 7.1F, "1-OPQ-099", 5, 5));
        setVoertuigen.add(volvo2);
        setVoertuigen.add(new Vrachtwagen("Jan Vos",
                254612.0F, 450, 33.1F, "1-AZE-123", 6200.0F));

        System.out.println("\n*** TreeSet van voertuigen ***");         
        for (Voertuig eenVoertuig : setVoertuigen) {
            System.out.println(eenVoertuig.toString()); 
        }
    }
} 
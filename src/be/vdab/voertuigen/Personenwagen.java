/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voertuigen;

import be.vdab.util.*;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Personenwagen extends Voertuig implements Vervuiler{
    private int aantalDeuren = 4;
    private int aantalPassagier = 5;

    public Personenwagen() {
    }

    public Personenwagen(
        String polishouder, 
        float kostprijs, 
        int pk, 
        float gemVerbruik, 
        String nummerplaat,
        int aantalDeuren,
        int aantalPassagier) 
    {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagier);
    }

    
    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public final void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren > 0)
            this.aantalDeuren = aantalDeuren;
    }

    public int getAantalPassagiers() {
        return aantalPassagier;
    }

    public final void setAantalPassagiers(int aantalPassagier) {
        if (aantalPassagier > 0)
            this.aantalPassagier = aantalPassagier;
    }

    @Override
    public String toString() {
        return super.toString() + "aantalDeuren=" + aantalDeuren + ", aantalPassagier=" + aantalPassagier;
    }

    public void toon()
    {
        System.out.println("aantalDeuren " + aantalDeuren);        
        System.out.println("aantalPassagier " + aantalPassagier);        
    }

   @Override
    public double getKyotoScore()
    {
        return (getGemVerbruik()*getPk()) / getAantalPassagiers();
    }
    
    @Override
    public double berekenVervuilling()
    {
        return getKyotoScore()* 20.F;
    }
}

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
public class Vrachtwagen extends Voertuig implements Vervuiler{
    private float maxLading = 10000.f;

    public Vrachtwagen() {
    }

    public Vrachtwagen(
        String polishouder,
        float kostprijs,
        int pk,
        float gemVerbruik,
        String nummerplaat,
        float maxLading) 
    {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setMaxLading(maxLading);
    }

    public float getMaxLading() {
        return maxLading;
    }

    public final void setMaxLading(float maxLading) {
        if (maxLading > 0)
            this.maxLading = maxLading;
    }

    @Override
    public String toString() {
        return super.toString() + "maxLading=" + maxLading;
    }

    public void toon()
    {
        System.out.println("maxLading " + maxLading);        
    }
   
   
    @Override
    public double getKyotoScore()
    {
        return (getGemVerbruik()*getPk()) /(getMaxLading() / 1000f);
    }

    @Override
    public double berekenVervuilling()
    {
        return getKyotoScore()* 5.F;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voertuigen;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;
import java.util.Objects;

/**
 *
 * @author hoang.anh.duc.ton
 */
public abstract class Voertuig implements Privaat, Milieu, Comparable<Voertuig> {
    private String polishouder = "onberpaal";
    private float kostprijs = 0f;
    private int pk = 0;
    private float gemVerbruik = 0f;
    private String nummerplaat = "onberpaal";
    
    public abstract double getKyotoScore();
    
    public Voertuig()
    {
    }

    public Voertuig(
        String polishouder,
        float kostprijs,
        int pk,
        float gemVerbruik,
        String nummerplaat)
    {
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setNummerplaat(nummerplaat);
    }

    public String getPolishouder() {
        return polishouder;
    }

    public final void setPolishouder(String polishouder) {
        if (polishouder != null && !polishouder.isEmpty())
            this.polishouder = polishouder;
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public final void setKostprijs(float kostprijs) {
        if (kostprijs > 0.f)
            this.kostprijs = kostprijs;
    }

    public int getPk() {
        return pk;
    }

    public final void setPk(int pk) {
        if (pk > 0)
           this.pk = pk;
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public final void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0.f)
            this.gemVerbruik = gemVerbruik;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public final void setNummerplaat(String nummerplaat) {
        if (nummerplaat != null && !nummerplaat.isEmpty())
            this.nummerplaat = nummerplaat;
    }

    @Override
    public String toString() {
        return "polishouder=" + polishouder + ", kostprijs=" + kostprijs + ", pk=" + pk + ", gemVerbruik=" + gemVerbruik + ", nummerplaat=" + nummerplaat + '}';
    }
    
    public void toon()
    {
        System.out.println("polishouder " + polishouder);
        System.out.println("kostprijs " + kostprijs);
        System.out.println("pk " + pk);
        System.out.println("gemVerbruik " + gemVerbruik);
        System.out.println("nummerplaat " + nummerplaat);
    }
    
    @Override
    public void geefPrivaatData()
    {
        System.out.println("polishouder " + polishouder);
        System.out.println("nummerplaat " + nummerplaat);
    }

    @Override
    public void geefMilieuData()
    {
        System.out.println("kostprijs " + kostprijs);
        System.out.println("pk " + pk);
        System.out.println("gemVerbruik " + gemVerbruik);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Voertuig)) {
            return false;
        }
        Voertuig v = (Voertuig) o;
        return nummerplaat.equals(v.getNummerplaat() );
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.nummerplaat);
        return hash;
    }
    
    @Override 
    public int compareTo(Voertuig v) {
        if (v == null) 
            throw new NullPointerException();
        else
            if ( this.equals(v) )
                return 0;
            else
                return nummerplaat.compareTo(v.getNummerplaat()) ;
    }
}

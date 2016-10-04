/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.rekening;

import be.vdab.util.RekeningNummerException;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Rekening { 
    private String rekeningNummer;
    private double saldo;
    
    public Rekening(String rekeningNummer) 
        throws RekeningNummerException 
    { 
        setRekeningNummer(rekeningNummer); 
}
 
    public Rekening(String rekeningNummer, double saldo) 
        throws RekeningNummerException 
    {
        setRekeningNummer(rekeningNummer); 
        if (saldo >= 0)
            this.saldo = saldo;
    }

    public String getRekeningNummer() { 
        return rekeningNummer;
    }

    public final void setRekeningNummer(String rekeningNummer) 
        throws RekeningNummerException 
    { 
      if (checkIBANnummer(rekeningNummer)){ 
          this.rekeningNummer = rekeningNummer;
      }
      else { 
          throw new RekeningNummerException("ongeldig IBANreknr", rekeningNummer); 
      }
    } 

    public double getSaldo() { 
        return saldo;
    }

    public void storten (double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo += bedrag;
        }
    }
    
    public void afhalen (double bedrag) { 
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
        }
    }
    
    public void overschrijven(Rekening rek, double bedrag) {
        if (checkBedrag(bedrag)) {
            saldo -= bedrag;
            rek.storten(bedrag);
        } 
    }
    
    private boolean checkBedrag(double bedrag) {
        return bedrag > 0.0;
    }         
    
    private boolean checkIBANnummer(String reknr) { 
        //formaat van de string reknr: xxxx xxxx xxxx xxxx 
        if (reknr == null || reknr.isEmpty() ||  
            reknr.length()!= 19 ||
            !reknr.substring(0,2).equals("BE")) {
            return false;
        }
        try { 
            Integer.parseInt(reknr.substring(2,4)); 
            int d1 = Integer.parseInt(reknr.substring(5,9)); 
            int d2 = Integer.parseInt(reknr.substring(10,14));
            int d3 = Integer.parseInt(reknr.substring(15,17));
            int d4 = Integer.parseInt(reknr.substring(17,19));
            
            long tienCijfers = d1*1000000 + d2*100 + d3;
            int rest = (int)(tienCijfers % 97);
            return (rest == d4);
        }
        catch (NumberFormatException ex) {
            return false;
        }
    } 

    @Override
    public String toString() {
        return "Rekening{" + rekeningNummer + ", " + saldo + '}';
    }
    
} 
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
public class Zichtrekening extends Rekening { 
    private int maxKrediet; 

    public Zichtrekening(String rekeningNummer,int bedrag) 
        throws RekeningNummerException     
    { 
        super(rekeningNummer);
        maxKrediet = bedrag;
    }
     
    public Zichtrekening(String rekeningNummer, double saldo, int bedrag) 
        throws RekeningNummerException 
    {
        super(rekeningNummer, saldo);
        maxKrediet = bedrag;
    }
 
    public int getMaxKrediet() {
        return maxKrediet;
    }
 
    public void setMaxKrediet(int maxKrediet) {
        this.maxKrediet = maxKrediet;
    } 
} 

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
public class Spaarrekening extends Rekening { 
    private static double intrest; 
    
    public Spaarrekening(String rekeningNummer, double intrest) 
        throws RekeningNummerException 
    { 
         super(rekeningNummer); 
        Spaarrekening.intrest = intrest; 
    }
     
    public Spaarrekening(String rekeningNummer, double intrest, double saldo) 
        throws RekeningNummerException 
    { 
        super(rekeningNummer, saldo);
        Spaarrekening.intrest = intrest;
    }
 
    public static double getIntrest() { 
        return intrest;
    } 
} 
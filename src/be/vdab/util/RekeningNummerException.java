/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.util;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class RekeningNummerException extends java.lang.Exception { 

    private String foutRekeningNummer; 
     
    public RekeningNummerException() {}
    public RekeningNummerException(String omschrijving) {
        super(omschrijving);
    } 
    public RekeningNummerException(String omschrijving, String 
           foutRekeningNummer) {
        super(omschrijving);
        this.foutRekeningNummer = foutRekeningNummer;
    }
     
    public String getFoutRekeningNummer() {
        return foutRekeningNummer; 
    }
}
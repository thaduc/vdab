/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.gastenboek;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author hoang.anh.duc.ton
 */
public class GastenboekEntry implements Serializable  {
    public static final long serialVersionUID = 1L;
    private final Date datum = new Date();
    private String schrijver = ""; 
    private String boodschap = "";


    public GastenboekEntry() {
    }

    
    public GastenboekEntry(String schrijver, String boodschap) {
        if (schrijver!=null && !(schrijver.isEmpty()) ) {
            this.schrijver = schrijver;
        }
        if (boodschap!=null && !(boodschap.isEmpty()) ) {
            this.boodschap = boodschap;
        }
    }
        
    public String getDatum() 
    { 
        return datum.toString();            
    }

    public String getSchrijver() {
        return schrijver;
    }

    public String getBoodschap() { 
        return boodschap;
    }
    
    
    @Override
    public String toString() {
        return "GastenboekEntry{" + "datum=" + datum + ", schrijver=" + schrijver + ", boodschap=" + boodschap + '}';
    }    
}

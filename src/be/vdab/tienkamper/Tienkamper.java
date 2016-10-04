/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.tienkamper;
import java.util.Comparator;
/**
 *
 * @author hoang.anh.duc.ton
 */
public class Tienkamper  implements Comparable<Tienkamper> { 
    private String naam="";
    private int punten;
    
    public Tienkamper(String naam, int punten) {
        setNaam(naam);
        setPunten(punten);
    }
    
    public String getNaam() {
        return naam;
    }
    public final void setNaam(String naam) {
        if (naam != null) {
            this.naam = naam;
        }
    }
    public int getPunten() {
        return punten;
    }
    public final void setPunten(int punten) { 
        if (punten>=0) {
            this.punten = punten;
        }
    } 

    @Override 
    public String toString() {
        return naam + " - " + punten; 
    }
    
    @Override
    public boolean equals(Object object) { 
        if (object == null)
            return false;
        if (! (object instanceof Tienkamper)) {
          return false; 
        }
        Tienkamper andere = (Tienkamper) object ; 
        return naam.equals(andere.naam);
    }
    
    @Override
    public int compareTo(Tienkamper tienkamper) {
        return naam.compareTo(tienkamper.naam);
    }
    
    @Override
    public int hashCode() {
        return naam.hashCode();
    }
} 

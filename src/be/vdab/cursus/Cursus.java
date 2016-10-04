/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.cursus;

import java.io.Serializable;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Cursus implements Comparable<Cursus>, Serializable  {

    private int cursusNr;
    private String cursusNaam;
    private int prijs;

    public Cursus(int nr, String naam, int prijs) {
        setCursusNr(nr);
        setCursusNaam(naam);
        setPrijs(prijs);
    }

    public int getCursusNr() {
        return cursusNr;
    }

    public final void setCursusNr(int nr) {
        if (nr > 0) {
            this.cursusNr = nr;
        }
    }

    public String getCursusNaam() {
        return cursusNaam;
    }

    public final void setCursusNaam(String naam) {
        if ((naam != null) && !(naam.isEmpty())) {
            this.cursusNaam = naam;
        }
    }

    public int getPrijs() {
        return prijs;
    }

    public final void setPrijs(int prijs) {
        if (prijs > 0) {
            this.prijs = prijs;
        }
    }

    @Override
    public String toString() {
        return (cursusNr + " ; " + cursusNaam + " ; " + prijs);
    }

    @Override
    public boolean equals(Object o) 
    {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Cursus)) {
            return false;
        }
        Cursus c = (Cursus) o;
        return cursusNr == c.getCursusNr();
    }

    @Override
    public int hashCode() {
        return cursusNr;
    }

    @Override
    public int compareTo(Cursus c) {
        if (c == null) {
            throw new NullPointerException();
        } 
        else 
            return cursusNr - c.getCursusNr ();
    }
}

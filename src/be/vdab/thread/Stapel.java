/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.thread;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Stapel {

    private int aantalPannenkoeken;

    public void voegPannenkoekToe() 
    {
        System.out.println("Nog een pannenkoek gebakken");
        synchronized (this) {
            ++aantalPannenkoeken;
        }            
    }

    public boolean neemPannenkoekWeg() 
    {
        System.out.println("Nog een pannenkoek gegeten hmm...");
        synchronized (this) {
            if (aantalPannenkoeken > 0) {
                --aantalPannenkoeken;
                return true;
            }
            return false;
        }
    }

    public int getAantalPannenkoeken() {
        return aantalPannenkoeken;
    }
}

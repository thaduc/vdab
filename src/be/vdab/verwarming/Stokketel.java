/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.verwarming;

import be.vdab.util.*;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Stokketel implements Vervuiler {
    private float CONorm;

    public Stokketel() {
    }

    public Stokketel(float CONorm) {
        setCONorm(CONorm);
    }

    public float getCONorm() {
        return CONorm;
    }

    public final void setCONorm(float CONorm) {
        this.CONorm = CONorm;
    }
    
    @Override
    public double berekenVervuilling()
    {
        return CONorm * 100;
    }
}

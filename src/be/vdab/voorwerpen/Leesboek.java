/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.voorwerpen;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Leesboek extends Boek {
    private String onderwerp; 
    private static final float WINSTMARGE = 1.5F;    
    
    public Leesboek() {
      this("Leesboek Java ", "O Reilly", 10.5F, "genre studie", 
           "onderw Informatica" );
    }

    public Leesboek(String titel, String auteur, float aankoopPrijs,
                    String genre, String onderwerp ) {
      super(titel, auteur, aankoopPrijs, genre);
      setOnderwerp(onderwerp) ;
    }
    
    public String getOnderwerp() { 
      return onderwerp;
    }
    public final void setOnderwerp(String onderwerp) { 
        if (onderwerp != null)
            this.onderwerp = onderwerp;
    }

    public float getWINSTMARGE() { 
        return WINSTMARGE;
    }
    
    @Override
    public void gegevensTonen() { 
      super.gegevensTonen();
      System.out.println("Onderwerp           : " + onderwerp);
      System.out.println("Winst               : " + winstBerekenen() );
    }
    
    @Override
    public float winstBerekenen() { 
      return super.getAankoopPrijs() * WINSTMARGE;
    }    

    @Override
    public String toString() { 
      return (super.toString() + " ; " + onderwerp + " ; " + WINSTMARGE);
    }
} 
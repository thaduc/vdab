/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;

import java.util.*;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Catalogus {
    private final List <Product> lijstCatalogus;

    public Catalogus() {
        lijstCatalogus = new ArrayList<> ();
        lijstCatalogus.add(new Product ("1kg appelen", 1.34 ) );
        lijstCatalogus.add(new Product ("1kg peren", 1.56) );
        lijstCatalogus.add(new Product ("netje citroenen", 0.64 ) ) ;
        lijstCatalogus.add(new Product ("bakje aardbeien", 2.85 ) ) ;
        lijstCatalogus.add(new Product ("1kg mandareinen", 1.60 ) ) ;
        lijstCatalogus.add(new Product ("0.5kg noten", 2.35 ) ) ;
        lijstCatalogus.add(new Product ("0.5kg kastanjes", 3.15 ) ) ;
        lijstCatalogus.add(new Product ("zakje rozijnen", 1.90 ) ) ;
    }
    
    public List<Product> getLijstCatalogus() {
        return lijstCatalogus;
    }
    
    @Override
    public String toString() {
        return lijstCatalogus.toString();
    }

}

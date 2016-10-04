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
public class Mandje {
    private final Map <Product,Integer> mandje =  new HashMap<>();

    public Mandje() {
    }

    public Map<Product, Integer> getMandje() {
        return mandje;
    }
    
    
    public void add (Product product, int aantal) // voegt een Product toe aan het mandje
    {
        if (! mandje.containsKey(product) )
            mandje.put(product, aantal);
        else
            set(product, aantal);
    }
    
    public void set(Product product, int aantal) {
        int oudeAantal = mandje.get(product);
        mandje.put(product,oudeAantal + aantal);
    }

    
    public void remove(Product product) {
        mandje.remove(product);
    }
     
    public void clear() {
        mandje.clear(); 
    }
    
    public double getTotalePrijs() {
        double som = 0;
        for (Product p: mandje.keySet() ) {
            som = som + (p.getPrijs() * mandje.get(p) )  ;
        }
        return som;
    }
    
    @Override
    public String toString() { 
        return mandje.toString();
    }
    
}

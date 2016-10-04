/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.gastenboek;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Gastenboek implements Serializable{
    public static final long serialVersionUID = 1L;
    List<GastenboekEntry> gastenboek = new ArrayList<>();

     
    public Gastenboek() 
    {
    } 
    
    public void toevoegen(GastenboekEntry gastenboekEntry) 
    { 
        gastenboek.add(gastenboekEntry);
    }
    
    public List<GastenboekEntry> getGastenboek() 
    {
        return gastenboek;
    }
    
}

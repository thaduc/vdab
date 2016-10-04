/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.gastenboek;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author hoang.anh.duc.ton
 */
public class GastenboekManager {
    private Gastenboek gastenboek = new Gastenboek() ;
    
    public GastenboekManager() 
    {
        leesGastenboek(); //initieel reeds het geschreven gastenboek inlezen
    }
  
    public Gastenboek getGastenboek() 
    {
          return gastenboek;
    }

  
    public void schrijfEntry(
        GastenboekEntry entry) 
    {
        gastenboek.toevoegen(entry);
    }
  
     public void schrijfGastenboek() { 
      try (FileOutputStream fos = new FileOutputStream("c:/DucTon/gastenboek.dat");
           ObjectOutputStream oos = new ObjectOutputStream(fos); )
      {
           oos.writeObject(gastenboek);
      }
      catch (IOException e) {
         System.out.println("Gastenboek kan niet weggeschreven worden!");
      }
  }

    
    private void leesGastenboek()
    {
        GastenboekEntry gbe;
        
        try (FileInputStream fis = new FileInputStream("c:/DucTon/gastenboek.dat"); 
            ObjectInputStream ois = new ObjectInputStream(fis);) 
        {  
            gastenboek = (Gastenboek) ois.readObject();             
        }  
        catch (IOException e) {
            System.out.println("Kan het gastenboek niet vinden, er wordt gestart met een nieuw gastenboek!");
            gastenboek = new Gastenboek(); //starten met een leeg gastenboek
        }
        catch (ClassNotFoundException e) 
        { 
            System.out.println("Kan de klasse niet vinden : ");
        } 
        
    }   
}

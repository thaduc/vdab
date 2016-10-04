/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.cursus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Main {
    
    public static void main(String[] args) {  
       
        List<Cursus> cursussenIn = new ArrayList<>();
        cursussenIn.add(new Cursus(5, "Word", 100) );
        cursussenIn.add(new Cursus(3, "Excel", 110) );
        cursussenIn.add(new Cursus(1, "Windows", 90) );
        cursussenIn.add(new Cursus(4, "Access", 120) );
        cursussenIn.add(new Cursus(2, "Powerpoint", 80) );
        cursussenIn.add(new Cursus(6, "Photoshop", 100) );
        
        //List met cursussen wegschrijven naar een object stream 
        try (FileOutputStream fos = new FileOutputStream("c:/DucTon/cursussen.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);) 
        {  
            for (Cursus cursus : cursussenIn) { 
               oos.writeObject(cursus);                        
            }
        } 
        catch (IOException e) {
            System.out.println("file niet gevonden");
        }
                

        //De weggeschreven cursussen terug inlezen van de object stream
        List<Cursus> cursussenOut = new ArrayList<>();
        Cursus cursus; 
 
        try (FileInputStream fis = new FileInputStream("c:/DucTon/cursussen.obj"); 
            ObjectInputStream ois = new ObjectInputStream(fis);) 
        {  
            for (int i = 0 ; i<= 5 ; i++) { 
                cursus = (Cursus) ois.readObject(); 
                cursussenOut.add(cursus);
             }             
        }  
        catch (ClassNotFoundException | IOException e) { 
            System.out.println("probleem met de file"); 
        } 
        System.out.println(cursussenOut);

        
        for (Cursus c : cursussenOut) { 
           System.out.println(c);
        }
    }
    
}

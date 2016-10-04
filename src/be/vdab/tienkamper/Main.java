/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.tienkamper;

import java.util.List;
import java.util.*;
/**
 *
 * @author hoang.anh.duc.ton
 */
public class Main {
    public static void main(String[] args) {

        Set<String> hs = new TreeSet<>(); 
        hs.add("fiets"); 
        hs.add("even");
        hs.add("dak");
        hs.add("citroen");
        hs.add("boom");
          hs.add("aap");
        hs.add("dak");
      hs.add("boom");

        System.out.println("Voorbeeld van een HashSet:");         
        for (String woord : hs) {
            System.out.println(woord + "\t" + woord.hashCode()); 
        }  
        
        SortedSet<String> ss = (SortedSet) hs; 
        System.out.println("\nExtra methods:");
        System.out.println("Eerste element: " + ss.first()); 
        System.out.println("Laatste element: " + ss.last()); 
        SortedSet<String> ssSubSet = ss.subSet("boom", "even"); 
        System.out.println("\nSubSet van de TreeSet vanaf 'boom' tot 'even':");
        for (String woord : ssSubSet) {
            System.out.println(woord);
        }
        ssSubSet = ss.headSet("boom"); 
        System.out.println("\nHeadSet van de TreeSet vanaf 'boom' tot 'even':");
        for (String woord : ssSubSet) {
            System.out.println(woord);
        }
        ssSubSet = ss.tailSet("boom"); 
        System.out.println("\nTailSet van de TreeSet vanaf 'boom' tot 'even':");
        for (String woord : ssSubSet) {
            System.out.println(woord);
        }
        
    Tienkamper Jurgen = new Tienkamper("Jurgen Hingsen",8832);
    Tienkamper Roman = new Tienkamper("Roman Sebrle",8891);
    Tienkamper Daley = new Tienkamper("Daley Thompson",8847);
    Tienkamper Dan = new Tienkamper("Dan O'Brien",8891);
  
    List<Tienkamper> lijst = new ArrayList<>();
    lijst.add(Jurgen);
    lijst.add(Roman);
    lijst.add(Daley);  
    lijst.add(Dan);  
  
    System.out.println("Alle tienkampers uit de arraylist (=volgorde van toevoegen):");
    for (Tienkamper eenTienkamper:lijst)
       System.out.println(eenTienkamper);
    System.out.println();
  
    Set<Tienkamper> set = new TreeSet<>();
    set.add(Jurgen);
    set.add(Roman);
    set.add(Daley); 
    
    set.add(Dan);
  
    System.out.println("Alle tienkampers uit de treeset (=gesorteerd op naam):");
    for (Tienkamper eenTienkamper:set)
       System.out.println(eenTienkamper);
    System.out.println();
  }

}

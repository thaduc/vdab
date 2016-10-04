/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.letter;
import java.util.*;
import java.util.HashMap; 
import java.util.Map;
import java.util.Map.Entry;
/**
 *
 * @author hoang.anh.duc.ton
 */
public class Main {
    //private static final String woorden[] = {"een", "twee", "drie",
    //    "vier", "vijf", "zes", "zeven", "acht", "negen", "tien"};

    public static void main(String args[]) {
        Map<Character, Integer> hashMapAantal = new HashMap<>();
        String express;
        String woorden[];
        
        System.out.print("enter your express:");
        Scanner input = new Scanner (System.in);
        express = input.nextLine();    
        woorden = express.split(" ");
        
        if (woorden[0] == "")
            return;
        
        //1e manier: lezen met key en begin-value putten of value verhogen
        //en terug putten
        for (String woord : woorden) {
            if (hashMapAantal.get(woord.charAt(0)) == null) {
                hashMapAantal.put(woord.charAt(0), 1);
            } 
            else {
                hashMapAantal.put(woord.charAt(0), hashMapAantal.get(woord.charAt(0)) + 1);
            }
        }

        System.out.println(
                "\nAantal woorden die beginnen met elke letter:    ");
        System.out.println(hashMapAantal); //toString() HashMap wordt gebruikt
        System.out.println("size: " + hashMapAantal.size());
        System.out.println("isEmpty: " + hashMapAantal.isEmpty());

        System.out.println("------ Set van de keys ------");
        for (char c : hashMapAantal.keySet()) {
            System.out.println(c);
        }

        System.out.println("------ Set van de values ------");
        for (int i : hashMapAantal.values()) {
            System.out.println(i);
        }
        System.out.println("------ Set van de map.entries ------");
        for (Map.Entry<Character, Integer> entry : hashMapAantal.entrySet()) {
            System.out.print(entry); //toString() Map.Entry wordt gebruikt
            System.out.println(" of anders: " + entry.getKey() + " : "
                    + entry.getValue());
        }
        
        Map<String, String> landen = new LinkedHashMap<>(); 
        landen.put("B", "Belgie"); 
        landen.put("NL", "Nederland");
        landen.put("F", "Frankrijk");
        landen.put("D", "Duitsland");
        landen.put("L", "Luxemburg");
 
        String eenLand = landen.get("F"); 
        System.out.println("Land met code F: " + eenLand); 

        String vorigLand = landen.put("F", "Finland"); 
        System.out.println("Vorig land met code F: " + vorigLand);
        eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);
 
        System.out.println("\n*** View van de Keys ***");
        for (String eenLandcode : landen.keySet()) { 
            System.out.println(eenLandcode);
        } 

        System.out.println("\n*** View van de Keys met bijhorende valuewaarde ***");


       for (String eenLandcode : landen.keySet()) {  
           System.out.println(eenLandcode + " heeft als landnaam: " + landen.get(eenLandcode)); 
        }        
 
        System.out.println("\n*** View van de Values ***");
        for (String eenLandnaam : landen.values()) { 
            System.out.println(eenLandnaam);
        }
        
        System.out.println("\n*** View van de Key-Value-paren ***"); 
        for (Entry eenLandEntry : landen.entrySet()) { 
            System.out.println(eenLandEntry);
        }  
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException; 
import java.io.PrintStream;
import java.math.BigDecimal;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class InsectenLezer extends Thread 
{
    private String bestandsNaam; // zal insecten1.csv of insecten2.csv zijn
    private BigDecimal maximum = BigDecimal.valueOf(1.);
    private PrintStream stream; // staat voor System.out of System.err

    public InsectenLezer(
            String bestand, 
            PrintStream stream) 
    {
        this.bestandsNaam = bestand;
        this.stream = stream;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(bestandsNaam)));) {
            String regel = reader.readLine();
            while (regel != null) {
                String[] regelOnderdelen = regel.split(";");
                BigDecimal prijs = new BigDecimal(regelOnderdelen[1]);
                if (prijs.compareTo(maximum) <= 0) {
                    stream.println(bestandsNaam + ':' + regel);
                }
                regel = reader.readLine();
            }
        } 
        catch (IOException ex) {
            System.err.println(ex);
        }
    }
}


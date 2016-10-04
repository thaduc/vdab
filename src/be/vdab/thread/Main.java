/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.thread;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author hoang.anh.duc.ton
 */
public class Main {
    public static void main(String args[])
    {
        double [] getallen = new double[1_000_000];
        
        //double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        for (int i=0; i<getallen.length; i++)
            getallen[i] = Math.random();
        
        GemiddeldeRekenaar gemiddeldeRekenaar1 = new GemiddeldeRekenaar(getallen, 0, getallen.length / 2);
        GemiddeldeRekenaar gemiddeldeRekenaar2 = new GemiddeldeRekenaar(getallen, getallen.length / 2, getallen.length);
        
        Thread thread1 = new Thread(gemiddeldeRekenaar1);
        Thread thread2 = new Thread(gemiddeldeRekenaar2);
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } 
        catch (InterruptedException ex) {
            System.err.println(ex);
        }

        System.out.println((gemiddeldeRekenaar1.getGemiddelde() + gemiddeldeRekenaar2.getGemiddelde()) / 2);  
        
        
        Stapel stapel = new Stapel();
        List<Thread> threads = new ArrayList<>();
        
        for (int i = 0; i != 2; i++) {
            threads.add(new Thread(new Kok(stapel)));
        }
        for (int i = 0; i != 4; i++) {
            threads.add(new Thread(new Klant(stapel)));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println(stapel.getAantalPannenkoeken());

    }
}

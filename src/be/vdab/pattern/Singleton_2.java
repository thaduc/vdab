/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.pattern;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Singleton_2 {

    private static Singleton_2 instance;

    private Singleton_2() {
    }

    //static block initialization for exception handling
    static {
        try {
            instance = new Singleton_2();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Singleton_2 getInstance() {
        return instance;
    }
}

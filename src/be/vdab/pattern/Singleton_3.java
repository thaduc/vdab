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
public class Singleton_3 {

    private static Singleton_3 instance;

    private Singleton_3() {
    }

    public static Singleton_3 getInstance() {
        if (instance == null) {
            instance = new Singleton_3();
        }
        return instance;
    }
}

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
public class Singleton_1 {

    private static final Singleton_1 instance = new Singleton_1();

    //private constructor to avoid client applications to use constructor
    private Singleton_1() {
    }

    public static Singleton_1 getInstance() {
        return instance;
    }
}

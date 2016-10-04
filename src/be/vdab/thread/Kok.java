/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.thread;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class Kok implements Runnable {

    private final Stapel stapel;

    public Kok(Stapel stapel) {
        this.stapel = stapel;
    }

    @Override
    public void run() {
        for (int i = 0; i != 100; i++) {
            stapel.voegPannenkoekToe();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
        }
    }

}

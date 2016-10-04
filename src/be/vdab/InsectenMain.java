/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;

/**
 *
 * @author hoang.anh.duc.ton
 */
public class InsectenMain {
    public static void main(String[] args) 
    {
        InsectenLezer thread1 = new InsectenLezer("c:/DucTon/insecten1.csv", System.out);
        InsectenLezer thread2 = new InsectenLezer("c:/DucTon/insecten2.csv", System.err);
        thread1.start();
        thread2.start();
    }

}

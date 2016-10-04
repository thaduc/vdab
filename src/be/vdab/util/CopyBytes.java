/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.util;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
/**
 *
 * @author hoang.anh.duc.ton
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try { 
            fis = new FileInputStream("C:/DucTon/duc.txt"); 
            fos = new FileOutputStream("C:/DucTon/alfabetOut.txt"); 
            int c;
            while ((c = fis.read()) != -1) { 
                fos.write(c);  
            }
        }  
        catch (IOException e) { 
            System.out.println("file niet gevonden"); 
        } 
        finally {
            if (fis != null) { 
                fis.close(); 
            } 
            if (fos != null) {
                fos.close();
            }
        }
        
        try (BufferedInputStream bis= new BufferedInputStream( 
               new FileInputStream("C:/DucTon/duc.txt")); 
             BufferedOutputStream bos= new BufferedOutputStream( 
               new FileOutputStream("C:/DucTon/alfabetOut1.txt"));) { 
            int c; 
            while ((c = bis.read()) != -1) { 
                bos.write(c);
            }
        } 
        catch (IOException e) {
            System.out.println("file niet gevonden");
        }
    }
}

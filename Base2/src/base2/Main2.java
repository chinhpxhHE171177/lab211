/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main2 {

    public static void main(String[] args) {
        Random rd = new Random();

        // Tao so ngau nhien
        //int num = rd.nextInt(); // nos se rd la mot so ngua nhien bat ki trong khoang so int
        //System.out.println(num);
        
        // Tao so ngau nhien trong khoang 0+...
        for (int i = 0; i < 10; i++) {
            //int num = rd.nextInt(100); // [0;99]
            int num = rd.nextInt(15 - 10 + 1) + 10; // tao so ngau nhien trong khoang tu 10 - 15(khoang gtr nhat dinh)
            System.out.println(num);
        }
    }
}

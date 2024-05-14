/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0008;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CountLetterAndChar {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String str = sc.nextLine();
        
        // Tao ra hai ban do map de luu tru so tu va so chu cai tuong ung
        Map<String, Integer> worldcount = new HashMap<>(); // key la mot tu va value la so lan tu xh trong str
        Map<Character, Integer> letterCount = new HashMap<>();
        
        // Dem so tu 
        for (String w : str.split("\\s")) { // split chia chuoi thanh ca tu 
            worldcount.put(w, worldcount.getOrDefault(w, 0) + 1); // moi tu them tu do vao worldCount map
        }
        // Dem so ky tu 
        for (char letter : str.replaceAll("\\s", "").toCharArray()) { // replace de loai bo cac space trong str 
            // chuyen doi chuoi thanh mang ky tu bang phuong thuc toCharArray
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1); // moi tu dc add letterCount map
        }
        System.out.println(worldcount);
        System.out.println(letterCount);
    }
}

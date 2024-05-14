/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0004;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        // Display a screen to prompt users to input a positive decimal number.
        Scanner sc = new Scanner(System.in);
        int num = QuickSort.getInt("The number of array: ");
        // Initial array
        int []arr = new int[num];
        //Generate random number in range
        QuickSort.random(arr);
        // Display array before sort
        System.out.print("Unsort array: ");
        QuickSort.dislay(arr);
        System.out.println("");
        //Display array after sorted 
        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        QuickSort.dislay(arr);
    }
}

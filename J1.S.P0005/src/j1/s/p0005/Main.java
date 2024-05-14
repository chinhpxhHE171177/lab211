/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0005;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Display a screen to prompt users to input a positive decimal number.
        Scanner sc = new Scanner(System.in);
        int num = MergeSort.getInt("The number of array: ");
        // Initial array
        //Generate random number in range
        int[] arr = MergeSort.random(num);
        // Display array before sort
        System.out.print("Unsort array: ");
        MergeSort.display(arr);
        System.out.println("");
        //Display array after sorted 
        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        MergeSort.display(arr);
    }
}

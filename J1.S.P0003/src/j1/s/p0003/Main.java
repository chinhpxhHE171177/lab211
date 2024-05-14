/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0003;

import static j1.s.p0003.InsertionSort.display;
import static j1.s.p0003.InsertionSort.insertionSort;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter number of array
        int num = InsertionSort.checkArrayInteger("Enter number of array: ");
        // Initial integer array 
        // Generate random integer in range
        int[] arr = InsertionSort.random(num);
        // Unsorted array
        System.out.print("Unsorted array: ");
        display(arr);
        System.out.print("\n");
        insertionSort(arr);
        //Sorted array
        System.out.print("Sorted array: ");
        display(arr);
    }
}

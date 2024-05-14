/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0010;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        
        LinearSearch l = new LinearSearch();
        Scanner sc = new Scanner(System.in);
        // Get the number of elements in the array from the user
        System.out.println("Enter number of array: ");
        int num = CheckInput.checkInt();
        // Generate array to contains elements
        int[] arr = l.random(num);
        // Usorte array
        System.out.println("Unsorted array: ");
        LinearSearch.display(arr);
        //sorted array
        LinearSearch.printSort(arr);
        // Get the value form user
        System.out.println("Enter search value: ");
        int x = CheckInput.checkInt();
        int[] result = l.linearSearch(arr, x);
        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        } else {
            System.out.println("Element not present in the array");
        }
    }
}

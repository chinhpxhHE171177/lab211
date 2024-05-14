
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort b = new BubbleSort();
        // Input size of array
        int size = b.getInteger("Enter size of array: ", "You must be positive integer", 1, Integer.MAX_VALUE);
        //Tao mang chua phan tu 
        int[] arr = b.random(size);
        // 3. Display unsorted array
        System.out.print("Unsorted array:");
        b.display(arr);
        System.out.println("");
        // 5. Display sorted array
        Arrays.sort(arr);
        System.out.print("Sorted array:");
        b.display(arr);

    }

}

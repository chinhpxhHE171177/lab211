package j1.s.p0006;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        Scanner sc = new Scanner(System.in);

        // Get user input for the size of the array
        System.out.println("Enter the size of the array: ");
        int size = BinarySearch.checkArrayInt();

        // Create an array with random values
        int[] arr = b.random(size);

        // Unsorted array
        System.out.println("Unsorted array: ");
        BinarySearch.display(arr);
        System.out.println();

        // Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        BinarySearch.display(arr);
        System.out.println();

        // Input the value to search for
        System.out.println("Enter the value to search for: ");
        int x = BinarySearch.checkArrayInt();

        int[] result = b.binarySearch(arr, x);
        if (result.length != 0) {
            System.out.println("Element found at indices: " + Arrays.toString(result));
        } else {
            System.out.println("Element not present in the array");
        }
    }
}

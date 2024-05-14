/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0006;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

    private static final Scanner sc = new Scanner(System.in);

    public int[] binarySearch(int[] arr, int x) {

        int count = 0;
        int[] A = new int[arr.length];

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                A[count++] = mid;
                int left = mid - 1;
                int right = mid + 1;

                while (left >= 0 && arr[left] == x) {
                    A[count++] = left--;
                }

                while (right < arr.length && arr[right] == x) {
                    A[count++] = right++;
                }
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int[] result = new int[count];
        System.arraycopy(A, 0, result, 0, count);
        return result;
    }

    public static int checkArrayInt() {
        while (true) {
            try {
                int num = Integer.parseInt(sc.nextLine().trim());
                if (num < 0) {
                    System.out.println("You must input a positive number");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                System.out.print("Enter again: ");
            }
        }
    }

    public int[] random(int size) {
        Random rd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rd.nextInt(size);
        }
        // check duplicate
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < i; j++) {
//                if (array[i] == array[j]) {
//                    array[i] = rd.nextInt(size);
//                    j = -1;
//                }
//            }
//        }
        return array;
    }

    public static void display(int[] array) {
        System.out.print(Arrays.toString(array));
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0003;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);

    // Check user input integer
    public static int checkArrayInteger(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Don't leave it empty!");
                } else {
                    int number = Integer.parseInt(input);
                    if (number <= 0) {
                        System.out.println("You must input a positive integer!");
                    } else {
                        return number;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("The input is invalid!");
            }
        }
    }

    // User aglorithm insertion sort
    public static int [] insertionSort(int[] arr) { // nhap mang so nguyen lam dau vao
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) { // duyet tu phan tu thu 2 den cuoi arr
            int key = arr[i]; // luu gtri phan tu hien tai vao bien var
            int j = i - 1; // khoi tao bien j la chi so phan tu truoc ptu hien tai

            while (j >= 0 && arr[j] > key) { // ss gti cua ptu thu j vs bien va
                arr[j + 1] = arr[j]; // neu var nho hon chen chen var vao vi ti ptu thu j
                j--; // tang gtri cua j
            }

            arr[j + 1] = key;
        }
        return arr;
    }

    // Random integer in number range
    public static int [] random(int size) {
        Random rd = new Random();
        int []arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(size);
        }
        // Duyệt qua mảng và kiểm tra xem các phần tử có bị lặp lại hay không
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    // Nếu phần tử bị lặp lại, thì tạo một số nguyên ngẫu nhiên khác
                    arr[i] = rd.nextInt(size);
                    j = -1;
                }
            }
        }
        return arr;
    }
    
    public static void display(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }
}

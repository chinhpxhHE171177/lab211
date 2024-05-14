/*
 Merge Sort là một thuật toán sắp xếp dựa trên giải thuật Divide and Conquer (Chia để trị).
Nó hoạt động bằng cách chia một mảng thành các mảng con nhỏ hơn, 
sắp xếp từng mảng con, sau đó hợp nhất các mảng con đã sắp xếp lại với nhau để tạo thành mảng được sắp xếp cuối cùng.

 */
package j1.s.p0005;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);
    
    public static int[] mergeSort(int[] arr) {
        if (arr.length > 1) {
            // Tìm điểm giữa để chia mảng thành hai phần
            int mid = arr.length / 2;
            
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            // Đệ quy áp dụng Merge Sort cho hai mảng con
            left = mergeSort(left);
            right = mergeSort(right);

            // Kết hợp hai mảng con đã sắp xếp
            merge(arr, left, right);
        }
        return arr;
    }
    
    public static int[] merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {  
            if (left[i] < right[j]) {   // ss cac ptu mang để kết hợp mảng
                arr[k++] = left[i++];   // gán arr[k] bằng left[i] và tăng giá trị của i và k lên 1 đv
            } else {
                arr[k++] = right[j++];
            }
        }
        // Sau vòng lặp while đầu kthu
        //  Sao chép các phần tử còn lại của mảng trái (nếu có)
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        //Sao chép các phần tử còn lại của mảng phải (nếu có)
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return arr; // sau khi kết hợp return mảng đẫ sx
    }
    
    public static int[] random(int size_Array) {
        Random rd = new Random();
        int[] arr = new int[size_Array];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
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

    // check Input 
    public static int getInt(String message) {
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
}

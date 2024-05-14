/*
Đệ quy trong java là quá trình trong đó một phương thức gọi lại chính nó một cách liên tiếp
Đệ quy gồm hai tp: Phần đk: để thoát khỏi đệ quy
                   Phần dệ quy: phần chứa lời gọi đệ quy

Quicksort là thuật toán hiện quả O(nlogn),chia mảng thành hai phần bằng cách 
so sánh từng phần tử của mảng với một phần tử được chọn gọi là phần tử chốt (Pivot)
 */
package j1.s.p0004;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class QuickSort {

    private static final Scanner sc = new Scanner(System.in);

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

    public static void dislay(int[] arr) {
        System.out.print(Arrays.toString(arr));
    }

    public static void random(int[] arr) {
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(arr.length);
        }
        // check Duyệt qua mảng và kiểm tra xem các phần tử có bị lặp lại hay không
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = rd.nextInt(arr.length);
                    j = -1; // dde khoi tao gtri va chay tiep
                }
            }
        }
    }

    // hàm sx
    // low --> chỉ mục bắt đầu,
    // high --> chỉ mục kết thúc
    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // chọn pivot và đặt đúng vị trí 
            int Index = putIn(arr, low, high);

            // đệ quy được áp dụng cho phần bên trái và phải của pivot(ptu cuối cx của mảng)
            quickSort(arr, low, Index - 1);
            quickSort(arr, Index + 1, high);
        }
        return quickSort(arr, low, high);
    }

    //ham de chia mang thanh 2 phan, su dung phan tu chot (pivot) n
    public static int putIn(int[] arr, int low, int high) {
        int n = arr[high]; // chọn pivot là pt ccx của mảng
        int i = low - 1; // chỉ mục của pt nhỏ nhất
        for (int j = low; j < high; j++) {
            if (arr[j] < n) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // // Đặt pivot vào vị trí chính xác
        return i + 1; // Trả về vị trí của pivot
    }

    // hàm để tra đổi giá trị
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

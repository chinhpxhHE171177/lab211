/*
 * Linear search: là thuật toán tìm kiếm tuyến tính tuần tự, nó sẽ ktra array cho đến khi tìm ra phần tử để trả về, nếu không nó tiếp tục
 * thuật toán tìm kiếm tuyến tính hoạt động bằng cách so sánh từng phần tử trong danh sách với giá trị cần tìm, nếu tìm thấy return gtri, not found: return -1;
 * Tìm kiếm tuyến tính không có hiệu suất tốt trong các tình huống có danh sách lớn và không được sắp xếp. 
 * Vì thuật toán phải duyệt qua từng phần tử, độ phức tạp thời gian là O(n), với n là số lượng phần tử trong danh sách.
 * Để triển khai tìm kiếm tuyến tính trong Java, bạn có thể sử dụng một vòng lặp for hoặc while 
 * để duyệt qua từng phần tử trong danh sách và so sánh giá trị cần tìm với từng phần tử.
 *
 *
 */
package j1.s.p0010;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);
//
//    public int linearSearch(int[] arr, int x) {
//        boolean found = false;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                System.out.println("Found " + x + " at index: " + i);
//                found = true;
//            }
//        }
//        if (!found) {
//            System.out.println("Element not present in the array.");
//        }
//        return x;
//    }
//    

    public int[] linearSearch(int[] arr, int value) {

        int count = 0; // đếm số lượng ptu in arr = value 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }

        if (count == 0 || arr.length == 0) {
            return null; // Trả về null nếu không tìm thấy
        }

        int[] ls1 = new int[count]; // khoi toa mang lưu bien count (nếu tìm thấy 1 ptu khop)
        int index = 0; // để theo dõi vị trí hiện tại trong mang lsl

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                ls1[index] = i;
                index++;
            }
        }

        return ls1;
    }

    // Random integer in range
    public int[] random(int size) {
        Random rd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(size);
        }
        // check duplicate
        /*for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = rd.nextInt(size);
                    j = -1;
                }
            }

        }*/
        return arr;
    }

    // Display
//    public static void display(int[] arr) {
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            if (i < arr.length - 1) {
//                System.out.print(arr[i] + ", ");
//            } else {
//                System.out.print(arr[i]);
//            }
//        }
//        System.out.print("]");
//    }
    public static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    //Check sort 
    public static boolean checkSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void printSort(int[] arr) {
        if (!checkSort(arr)) {
            Arrays.sort(arr);
            System.out.println("Sorted array: ");
            System.out.println(Arrays.toString(arr));
        }
    }
}

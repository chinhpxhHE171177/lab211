
import java.util.Scanner;

// - phần cơ sở: đk thoát khỏi đệ quy
// - Phần đệ quy: phần thân hàm gọi đệ quy
/* Đệ quy là 1 phương thức gọi chính nó để giải gq bài toán
 *
 */
public class Fibo {

    // Create value of fibo sequence into array
    public static void fiboArray(int[] arr, int count) {  // nhận vào an array & a value count 
        // if count == 0 || count == 1
        while (count <= 1) {  // check count == 0 || count ==1
            arr[count] = count; // gán gtri count cho index trong array
            count++; // tăng biến đếm
        }
        // nếu count > 1 nó sẽ đi vào khối if
        if (count > 1) {
            arr[count] = arr[count - 1] + arr[count - 2]; // sum 2 gtri trc đó && gán vào index(count) hiện tại in array
            count++; // tăng biến đếm 
            if (count < arr.length) {
                fiboArray(arr, count);  // lệnh gọi đệ quy fiboArray sẽ đc thực hiện và slg tăng tiếp tực điền vào mảng
            }
        }
    }

    // phương thuc nay tao mang va ddien cac so fibo vao mang
    public static int[] findFibo(int sizeArray) {
        int[] arr = new int[sizeArray]; // get expect size && initial an array have size.
        fiboArray(arr, 0);  // phương thuc goi tham so là arr và chỉ số bd là 0
        return arr;
    }

    public static void display(int[] array) {
        System.out.println("The 45 sequence fibonacci: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // loop for print elements and space = space 

        }
    }

    public static int checkInt() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            try {

                int n = Integer.parseInt(sc.nextLine());
                if (n < 0) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Wrong Fomat Input.");
                System.out.println("Please input again: ");
            }
        }
    }
//    // sd vong lap for 
//    public static int fibo(int n) {
//        if (n < 2) {
//            return n;
//        }
//        return fibo(n - 1) + fibo(n - 2);
//    }
//
//    public static void fibo2(int n) {
//        int a = 0, b = 1;
//        System.out.print(a + " " + b + " ");
//        for (int i = 2; i < n; i++) {
//            int sum = a + b;
//            System.out.print(sum + " ");
//            a = b;
//            b = sum;
//        }
//    }
//}

    public static int fibo3(int n) {
        int[] fibo3 = new int[n];

        fibo3[0] = 0; // first element
        fibo3[1] = 1; // second element

        if (n > 2) {
            for (int i = 2; i < n; i++) {
                fibo3[i] = fibo3[i - 1] + fibo3[i - 2];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(fibo3[i] + " "); 
            }
        } else {
            return n;
        }

        return fibo3[n - 1]; // return the last element in the Fibonacci sequence
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0009;

/**
 *
 * @author Admin
 */
public class Fibonacci {

    // Check fibonacci
    public static int fibonacci(int n) {

        while (true) {
            try {
                int f0 = 0;
                int f1 = 1;
                int fn = 1;

                if (n < 0) {
                    return -1;
                } else if (n == 0 || n == 1) {
                    return n;
                } else {
                    for (int i = 2; i <= n; i++) {
                        fn = f0 + f1;
                        f0 = f1;
                        f1 = fn;
                    }
                }
                return fn;

            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
    }
}

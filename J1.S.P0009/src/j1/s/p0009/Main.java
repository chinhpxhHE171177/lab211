/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0009;

import static j1.s.p0009.Fibonacci.fibonacci;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The 45 sequence fibonacci: ");
        for (int i = 0; i <= 45; i++) {
            System.out.print(fibonacci(i) + " ");

            /* Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0) {
            System.out.println("Invalid input! n must be a positive integer.");
        } else {
            System.out.println("The " + n + " sequence fibonacci: ");
            for (int i = 0; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }*/
        }
    }
}

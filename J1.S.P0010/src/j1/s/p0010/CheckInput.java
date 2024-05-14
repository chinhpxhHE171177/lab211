/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0010;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CheckInput {

    private static final Scanner sc = new Scanner(System.in);

    public static int checkInt() {
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Don't is empty!");
                } else {
                    int number = Integer.parseInt(input);
                    if (number < 0) {
                        System.out.println("You must input positive integer!");
                    } else {
                        return number;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }
    }
}

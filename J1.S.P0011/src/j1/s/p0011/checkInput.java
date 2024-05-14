/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class checkInput {

    private static Scanner sc = new Scanner(System.in);

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input number binary
    public String checkInputBinary() {
        System.out.print("Enter binary number: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (isBinary(result)) {
                return result;
            }
            System.err.println("Must be enter 0 or 1");
            System.out.print("Enter again: ");
        }
    }

    // check user input number decimal
    public String checkInputDecimal() {
        System.out.print("Enter decimal number: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (isDecimal(result)) {
                return result;
            }
            System.err.println("Must be enter 0-9");
            System.out.print("Enter again: ");
        }
    }
    // check user input number hexadecimal

    public String checkInputHexadecimal() {
        System.out.print("Enter hexadecimal number: ");
        String result;
        while (true) {
            result = sc.nextLine().trim().toUpperCase();
            if (isHexadecimal(result)) {
                return result;
            }
            System.err.println("Must be enter 0-9 or A-F");
            System.out.print("Enter again: ");
        }
    }

    private boolean isBinary(String input) {
        for (char c : input.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    private boolean isDecimal(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean isHexadecimal(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c) && (c < 'A' || c > 'F')) {
                return false;
            }
        }
        return true;
    }
}

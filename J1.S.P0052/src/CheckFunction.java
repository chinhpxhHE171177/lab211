
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class CheckFunction {

    private static final Scanner sc = new Scanner(System.in);

    public static int checkInt() {
        while (true) {
            try {
                int num = Integer.parseInt(sc.nextLine().trim());
                if (num <= 0) {
                    throw new Exception();
                }
                return num;
            } catch (Exception e) {
                System.out.println("The number is greater than zero");
                System.out.println("Enter again: ");
            }
        }
    }

    public static double checkDouble() {
        while (true) {
            try {
                double num = Double.parseDouble(sc.nextLine().trim());
                if (num <= 0) {
                    System.out.println("The number is greater than zero");
                    continue;
                }
                return num;
            } catch (Exception e) {
                System.out.println("You must be a number");
                System.out.println("Enter again: ");
            }
        }
    }

    public static float CheckFloat() {
        //- Yêu cầu người dùng nhập vào một số nguyên
        while (true) {
            try {
                float num = Float.parseFloat(sc.nextLine().trim());
                if (num <= 0) {
                    System.out.println("The number is greater than zero");
                    continue;
                }
                return num;
            } catch (Exception e) {
                System.out.println("You must be a number");
                System.out.println("Enter again: ");
            }
        }
    }

    public static String checkString() {
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.println("Don't be empty!");
                System.out.println("Enter again: ");
            }
        }
    }
}

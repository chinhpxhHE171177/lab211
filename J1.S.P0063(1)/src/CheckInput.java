
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
public class CheckInput {

    static final Scanner sc = new Scanner(System.in);

    public static String inputString() {
        // loop until user input true value 
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Don't be empty");
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
                System.out.print("Please input again: ");
            }
        }
    }

    public static int inputInt() throws Exception {
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                if (input < 0) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!!");
                System.out.print("Please input again: ");
            }
        }
    }

    public static double inputSalary() {
        while (true) {
            try {
                double input = Double.parseDouble(sc.nextLine());
                if (input < 0) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Salary must to great than zero");
                System.out.print("Please input again: ");
            }
        }
    }

}

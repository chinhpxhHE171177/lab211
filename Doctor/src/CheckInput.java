
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

    public static int inputInt() throws Exception {
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                if (input < 0) {
                    System.out.println("You must input greater than zero");
                    continue;
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!!");
                System.out.println("Please input again: ");
            }
        }
    }

    public static String inputString() {
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Don't be empty!");
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
    }

    public static double inputDouble() {
        while (true) {
            try {
                double input = Double.parseDouble(sc.nextLine());
                if (input < 0) {
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("You must input number greater than zero");
                System.out.println("Please input again: ");
            }
        }
    }

    static int inputInt(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

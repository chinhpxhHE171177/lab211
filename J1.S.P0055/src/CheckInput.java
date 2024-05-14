
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

    public static int checkInt(int min, int max) throws Exception {
        do {
            try {
                int num = Integer.parseInt(sc.nextLine());
                if (num < min || num > max) {
                    throw new NumberFormatException();
                }
                return num;

            } catch (NumberFormatException e) {
                System.out.println("You must input positive integer!");
                System.out.println("Please input again: ");
            }
        } while (true);
    }

    public static String inputString() {
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    throw new Exception("Don't be empty!");
                }
                return input;
            } catch (Exception e) {
                System.out.println("Invalid input!");
                System.out.println("Enter again: ");
            }
        }
    }
}

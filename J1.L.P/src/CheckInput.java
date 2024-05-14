
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

    private static final Scanner sc = new Scanner(System.in);

    public static int checkInt() {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Don't be empty!");
                } else {
                    int num = Integer.parseInt(input);
                    if (num <= 0) {
                        throw new Exception();
                    }
                    return num;
                }
            } catch (Exception e) {
                System.out.println("The num must greater than zero");
                System.out.println("Input again: ");
            }
        }
    }

    public static double checkDouble() {
        while (true) {
            try {
                double num = Double.parseDouble(sc.nextLine().trim());
                if (num <= 0) {
                    throw new Exception();
                }
                return num;
            } catch (Exception e) {
                System.out.println("The number must be greater than zero");
                System.out.println("Input again: ");
            }

        }
    }
}

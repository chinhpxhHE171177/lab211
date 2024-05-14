
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

    public static int checkInt() throws Exception {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number < 0) {
                    System.out.println("The number is greater than zero ");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Value of matrix is digit");
            }
        }

        return number;
    }
    
     public static int checkChoice(int min, int max) {
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException ex) {
                System.err.println("Invalid value. Input again: ");
            }
        }
    }
}

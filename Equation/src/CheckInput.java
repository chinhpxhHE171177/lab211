
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
    
    Scanner sc = new Scanner(System.in);
    public int checkInt() {
        while (true) {            
            try {
                int num = Integer.parseInt(sc.nextLine().trim());
                if(num <= 0) {
                    System.out.println("Number must be positive integer");
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public double checkDouble() {
        while (true) {            
            try {
                double num = Double.parseDouble(sc.nextLine().trim());
                if(num <= 0) {
                    System.out.println("You must input positive integer");
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }
}

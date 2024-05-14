/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Age = getInt("Enter the age: ", "The age must is integer", 10, 30);
        System.out.println(Age);

        int numOfProduct = getInt("Enter the number of product: ",
                "The number of product must integer", 1, 1000);
        System.out.println(numOfProduct);

    }

    // Dat ten ham: access modifier + (Static) return type + name method
    // access modifer : pham vi truy cap (public, private, protected, default)
    // return type: tra ve gia tri (int, float, double, string)
    public static int getInt(String message, String error, int min, int max) { // tham so
        Scanner sc = new Scanner(System.in);

        //-Yêu cầu người dùng nhập vào 1 số nguyên
        while (true) {   // vong lap vo han ket thuc cho den khi break or return gtri         
            try {
                //System.out.print("Enter a integer: ");
                System.out.print(message);
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Don't is empty!");
                } else {
                    int number = Integer.parseInt(input);
                    // check number in range 
                    if (number >= min && number <= max) {
                        //System.out.println("The value input: " + number);
                        //break;
                        return number;
                    } else {
                        System.out.println("You must input in range 10 - 30");
                    }
                }
            } catch (Exception e) {
                //System.out.println("You inputed wrong!");
                System.out.println(error);
            }
        }
    }
}

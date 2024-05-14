
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
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        Equation e = new Equation();

        while (option != 3) {
            try {
                displayMenu();
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        e.linearEquation(scanner);
                        break;
                    case 2:
                        e.quadraticEquation(scanner);
                        break;
                    case 3:
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid choice!");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Invalid input");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("----- Calculate Equation -----");
        System.out.println("1. Linear Equation");
        System.out.println("2. Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your option: ");
    }
}

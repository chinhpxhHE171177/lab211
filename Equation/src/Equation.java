
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
public class Equation {

    CheckInput ch = new CheckInput();
    Scanner sc = new Scanner(System.in);

    public void linearEquation(Scanner scanner) {
        System.out.println("----- Linear Equation -----");

        System.out.print("Enter A: ");
        double a = ch.checkDouble();
        System.out.print("Enter B: ");
        double b = ch.checkDouble();
        double x = -b / a;
        System.out.println("Solution: x = " + x);

        displayOddEvenSquareNumbers(a, b, x);
    }

    public void quadraticEquation(Scanner scanner) {
        System.out.println("----- Quadratic Equation -----");
        System.out.print("Enter A: ");
        double a = ch.checkDouble();
        System.out.print("Enter B: ");
        double b = ch.checkDouble();
        System.out.print("Enter C: ");
        double c = ch.checkDouble();
        
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Solution: x = " + x);
        } else {
            System.out.println("No real solutions exist.");
        }

        displayOddEvenSquareNumbers(a, b, c, delta);
    }

    public static void displayOddEvenSquareNumbers(double... coefficients) {
        System.out.print("Odd Number: ");
        for (double coe : coefficients) {
            if (coe % 2 != 0) {
                System.out.print(coe + ", ");
            }
        }
        System.out.println();

        System.out.print("Even number: ");
        for (double coe : coefficients) {
            if (coe % 2 == 0) {
                System.out.print(coe + ", ");
            }
        }
        System.out.println();

        System.out.print("Number is Perfect Square: ");
        for (double coe : coefficients) {
            double sqrt = Math.sqrt(coe);
            if (sqrt % 1 == 0) {
                System.out.print(coe + ", ");
            }
        }
        System.out.println();
    }
}

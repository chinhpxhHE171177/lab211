package FPT_HungNT;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Check {

    public Check() {
    }

    Scanner sc = new Scanner(System.in);

    public int checkInputLimit(int min, int max) {
        do {
            try {

                int n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Wrong Fomat Input.");
                System.out.println("Please input again: ");
            }
        } while (true);
    }

    public String checkInputString() {

        do {
            try {
                String result = sc.nextLine().trim();
                if (result.isEmpty()) {
                    throw new Exception("Not empty string. Please input again: ");
                }
                return result;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public int createMenu() {

        System.out.println("--------- Menu ------------");
        System.out.println("1. Add Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Search Doctor");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        int choice = checkInputLimit(1, 5);
        return choice;
    }

    public Doctor InputValue() {
        System.out.print("Enter Code: ");
        String code = checkInputString();
        System.out.print("Enter Name: ");
        String name = checkInputString();
        System.out.print("Enter Specialization: ");
        String specialization = checkInputString();
        System.out.print("Enter Availability: ");
        int availability = checkInputLimit(1, Integer.MAX_VALUE);
        Doctor dt = new Doctor(code, name, specialization, availability);
        return dt;
    }
}

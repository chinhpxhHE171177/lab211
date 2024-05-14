

import java.util.Scanner;
 
public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Manager m = new Manager();

        while (true) {
            System.out.println("====== USER MANAGEMENT SYSTEM ======");
            System.out.println("1. Add an account");
            System.out.println("2. Find an account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = CheckInput.checkChoice(1, 3);

            try {
                switch (choice) {
                    case 1:
                        System.out.println("-------- Add Account --------");
                        m.addAccount();
                        break;
                    case 2:
                        System.out.println("-------- Login Account --------");
                        m.findAccount();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

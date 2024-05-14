/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0101;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) throws Exception {

        EmpManager em = new EmpManager();

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add employees");
            System.out.println("2. Update employees");
            System.out.println("3. Remove employees");
            System.out.println("4. Search employees");
            System.out.println("5. Sort employees by salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = CheckInput.inputInt();

            switch (choice) {
                case 1:
                    em.addEmployee();
                    break;
                case 2:
                    em.updateEmployee();
                    break;
                case 3:
                    em.removeEmployee();
                    break;
                case 4:
                    
                    em.searchEmployee();
                    break;
                case 5:
                    em.sortEmpBySalary();
                    break;
                case 6:
                    System.out.println("Exit program");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

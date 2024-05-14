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

    public static void main(String[] args) throws Exception {
        ManagerTask mt = new ManagerTask();
        while (true) {
            System.out.println("========== Task Management ==========");
            System.out.println(" 1. Add Task ");
            System.out.println(" 2. Delete Task ");
            System.out.println(" 3. Show Task");
            System.out.println(" 4. Exist ");
            System.out.println("Enter your choice: ");
            int choice = CheckInput.checkInput(1, 4);
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Requirement Name: ");
                        String name = CheckInput.checkString();
                        System.out.print("Enter Task Type: ");
                        String typeId = CheckInput.checkInputTaskTypeId();
                        System.out.print("Enter Date: ");
                        String date = CheckInput.checkDate();
                        System.out.print("Enter From: ");
                        double planFrom = CheckInput.checkDouble(8.5, 17.5);
                        System.out.print("Enter To: ");
                        double planTo = CheckInput.checkDouble2(8.5, 17.5, planFrom);
                        System.out.print("Enter Assignee: ");
                        String assignee = CheckInput.checkString();
                        System.out.print("Enter Reviewer: ");
                        String reviewer = CheckInput.checkString();
                        if (mt.addTask(name, typeId, date, planFrom, planTo, assignee, reviewer)) {
                            System.out.println("Add successfully");
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("------------Delete Task---------------");
                        System.out.println("Enter the Id: ");
                        int Id = CheckInput.checkInt();
                        if (mt.deleteTask(Id)) {
                            System.out.println("Delete successfully");
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("------------Show Task---------------");
                        System.out.println("ID\tName\t\tTask Type\tDate\t\tTime\tAssignee\tReviewer");
                        mt.showTasks();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 4:
                    return;

            }
        }
    }
}

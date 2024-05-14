/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0101;

import java.util.Scanner;

public class EmpManager {

    private Employee[] employees;
    private int count;
    private Scanner sc;

    public EmpManager() {
        employees = new Employee[100];
        count = 0;
        sc = new Scanner(System.in);
    }

    public boolean checkEmployee(String id) {
        for (int i = 0; i < count; i++) {
            if (employees[i] != null && employees[i].getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public void addEmployee() throws Exception {
        System.out.println("--------- Add Employee --------");
        System.out.println("Enter employee ID: ");
        String id = CheckInput.inputString();
        if (checkEmployee(id)) {
            System.out.println("Employee ID already exists");
            System.out.println("Enter employee ID again: ");
            id = CheckInput.inputString();
        }
        Employee employee = findEmployeeById(id);
        System.out.print("Enter first name: ");
        String firstName = CheckInput.inputString();
        System.out.print("Enter last name: ");
        String lastName = CheckInput.inputString();
        System.out.print("Enter phone number: ");
        String phone = CheckInput.inputString();
        System.out.print("Enter email: ");
        String email = CheckInput.inputString();
        System.out.print("Enter address: ");
        String address = CheckInput.inputString();
        System.out.print("Enter date of birth: ");
        String dob = "";
        while (true) {
            try {
                dob = CheckInput.inputString();
                if (CheckInput.isValidDateFormat(dob, "dd/MM/yyyy")) {
                    break;
                } else {
                    throw new Exception("Invalid date format. Please enter in dd/MM/yyyy format.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.print("Enter date of birth: ");
            }
        }
        System.out.print("Enter sex: ");
        String sex = CheckInput.inputString();
        System.out.print("Enter salary: ");
        double salary = CheckInput.inputDouble();
        System.out.print("Enter agency: ");
        String agency = CheckInput.inputString();
        employee = new Employee(id, firstName, lastName, phone, email, address, dob, sex, salary, agency);
        employees[count] = employee;
        count++;
        System.out.println("Employee added successfully.");
    }

    public Employee findEmployeeById(String id) {
        for (Employee emp : employees) {
            if (emp != null && emp.getId().equals(id)) {
                return emp;
            }
        }
        return null;
    }

    public void updateEmployee() {
        System.out.println("-------- Update Employee --------");
        System.out.print("Enter employee ID: ");
        String id = CheckInput.inputString();
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            System.out.print("Enter new first name: ");
            String firstName = CheckInput.inputString();
            System.out.print("Enter new last name: ");
            String lastName = CheckInput.inputString();
            System.out.print("Enter new phone number: ");
            String phone = CheckInput.inputString();
            System.out.print("Enter new email: ");
            String email = CheckInput.inputString();
            System.out.print("Enter new address: ");
            String address = CheckInput.inputString();
            System.out.print("Enter new date of birth: ");
            String dob = "";
            while (true) {
                try {
                    dob = CheckInput.inputString();
                    if (CheckInput.isValidDateFormat(dob, "dd/MM/yyyy")) {
                        break;
                    } else {
                        throw new Exception("Invalid date format. Please enter in dd/MM/yyyy format.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.print("Enter date of birth: ");
                }
            }
            System.out.print("Enter new sex: ");
            String sex = CheckInput.inputString();
            System.out.print("Enter new salary: ");
            double salary = CheckInput.inputDouble();
            System.out.print("Enter new agency: ");
            String agency = CheckInput.inputString();

            // Update the existing employee object with new values
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setPhone(phone);
            employee.setEmail(email);
            employee.setAddress(address);
            employee.setDob(dob);
            employee.setSex(sex);
            employee.setSalary(salary);
            employee.setAgency(agency);
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void removeEmployee() {
        System.out.println("-------- Delete Employee --------");
        System.out.print("Enter employee ID: ");
        String id = CheckInput.inputString();
        for (int i = 0; i < count; i++) {
            if (employees[i].getId().equalsIgnoreCase(id)) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                count--;
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void searchEmployee() {
        System.out.println("-------- Search Employee --------");
        System.out.println("Enter employee Name: ");
        String name = CheckInput.inputString();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            Employee employee = employees[i];
            if (employee != null && (employee.getFirstName().equalsIgnoreCase(name)
                    || employee.getLastName().equalsIgnoreCase(name)
                    || employee.getFirstName().toLowerCase().contains(name.toLowerCase())
                    || employee.getLastName().toLowerCase().contains(name.toLowerCase()))) {
                System.out.println("----------- Employee Information ------------");
                System.out.println("id\tfirstName\tlastName\tphone\t\temail\t\t\taddress\t\tdob\t\tsex\tsalary\t\tagency");
                System.out.print(employee);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching employees found.");
        }
    }

    public void sortEmpBySalary() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (employees[j].getSalary() > employees[j + 1].getSalary()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        System.out.println("Employees sorted by salary:");
        System.out.println("id\tfirstName\tlastName\tphone\t\temail\t\t\taddress\t\tdob\t\tsex\tsalary\t\tagency");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }
}

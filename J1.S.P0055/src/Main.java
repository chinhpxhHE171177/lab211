
import java.util.HashMap;
import java.util.Map;

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
        Map<String, Doctor> doctorMap = new HashMap<>();
        DoctorManager dm = new DoctorManager();

        while (true) {
            System.out.println("========= Doctor Management ==========");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. Search Doctor");
            System.out.println("5. Sort Doctor");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = CheckInput.checkInt(1, 6);

            switch (choice) {
                case 1:
                    try {
                        System.out.println("--------- Add Doctor ----------");
                        System.out.println("Enter doctor code:");
                        String code = CheckInput.inputString();
                        try {
                            dm.checkDoc(code); // Check for duplicate doctor code goi pthuc checkDOc tu dtg dm
                            System.out.println("Duplicate doctor code");
                        } catch (Exception e) {
                            System.out.println("Enter doctor name:");
                            String name = CheckInput.inputString();
                            System.out.println("Enter doctor specialization:");
                            String specialization = CheckInput.inputString();
                            System.out.println("Enter Availability: ");
                            int availability = CheckInput.checkInt(1, Integer.MAX_VALUE);
                            Doctor doctor = new Doctor(code, name, specialization, availability);
                            dm.addDoctor(doctor); // goi pthuc add tu dtg dm de them dtg doctor 
                            System.out.println("Doctor added successfully");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("--------- Update Doctor -------");
                        System.out.println("Enter doctor code:");
                        String code = CheckInput.inputString();
                        System.out.println("Enter updated doctor name:");
                        String name = CheckInput.inputString();
                        System.out.println("Enter updated doctor specialization:");
                        String specialization = CheckInput.inputString();
                        System.out.println("Enter updated Availability: ");
                        int availability = CheckInput.checkInt(1, Integer.MAX_VALUE);
                        Doctor doctor = new Doctor(code, name, specialization, availability);
                        dm.updateDoctor(doctor);
                        System.out.println("Doctor updated successfully");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("--------- Delete Doctor -------");
                        System.out.println("Enter doctor code:");
                        String code = CheckInput.inputString();
                        Doctor doctor = dm.checkDoc(code);
                        dm.deleteDoctor(doctor);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.println("---------- Search Doctor --------");
                        System.out.print("Enter search string Name: ");
                        String input = CheckInput.inputString();
                        HashMap<String, Doctor> searchMap = dm.searchDoctor(input); // goi pt search tu dtg dm de tim kiem bac si dua chuoi tim kiem string
                        if (searchMap.isEmpty()) {
                            System.out.println("Not found");
                        } else {
                            System.out.println("---------- Search Doctor --------");
                            System.out.println("Enter text:");
                            System.out.println("--------- Result ------------");
                            System.out.println("Code\tName\t\tSpecialization\tAvailability");

                            for (Doctor dt : searchMap.values()) { // duyệt qua các đối tượng Doctor trong searchMap.
                                dt.display(); // goi ptu display de hien thi tt bacsi 
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println("---------- Sorted Doctor --------");
                        HashMap<String, Doctor> sortedMap = dm.sortDoctorsByName();
                        System.out.println("Code\tName\tSpecialization\tAvailability");
                        for (Doctor dt : sortedMap.values()) {
                            dt.display();
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
            }
        }
    }
}

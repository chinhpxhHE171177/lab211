
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 1
 *
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Map<String, Doctor> doctorMap = new HashMap<>();
        DoctorManager dm = new DoctorManager();

        while (true) {
            System.out.println("========== Doctor Managerment ==========");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. Search Doctor");
            System.out.println("5. Sorted Doctor");
            System.out.println("6. Exist");
            System.out.println("Enter your choice: ");
            int choice = CheckInput.inputInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.println("------------- Add Doctor --------------");
                        System.out.println("Enter doctor code: ");
                        String code = CheckInput.inputString();
                        try {
                            dm.checkDoc(code); // Check code duplicate 
                            System.out.println("Duplicate doctor code");
                        } catch (Exception e) {
                            System.out.println("Enter doctor name: ");
                            String name = CheckInput.inputString();
                            System.out.println("Enter doctor specialization: ");
                            String specialization = CheckInput.inputString();
                            System.out.println("Enter doctor availablity: ");
                            int availability = CheckInput.inputInt();
                            Doctor doctor = new Doctor(code, name, specialization, availability);
                            dm.addDoctor(doctor);
                            System.out.println("Doctor added successfully");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("-------------- Update Doctor ---------------");
                        System.out.println("Enter doctor code: ");
                        String code = CheckInput.inputString();
                        System.out.println("Enter updated doctor name: ");
                        String name = CheckInput.inputString();
                        System.out.println("Enter upadated doctor specialization: ");
                        String specialization = CheckInput.inputString();
                        System.out.println("Enter updated docotr availiablity: ");
                        int availiablity = CheckInput.inputInt();
                        Doctor doctor = new Doctor(code, name, specialization, availiablity);
                        dm.updateDoctor(doctor);
                        System.out.println("Doctor updated successfully");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("--------------- Delete Doctor -----------------");
                        System.out.println("Enter doctor code: ");
                        String code = CheckInput.inputString();
                        Doctor doctor = dm.checkDoc(code);
                        dm.deleteDoctor(doctor);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.println("------------- Search Doctor --------------------");
                        System.out.println("Enter search name: ");
                        String name = CheckInput.inputString();
                        HashMap<String, Doctor> searchMap = dm.searchDoctor(name);
                        if (searchMap.isEmpty()) {
                            System.out.println("Not found!");
                        } else {
                            System.out.println("Enter text: ");
                            System.out.println("----------- Result ------------");
                            System.out.println("Code\tName\t\tSpecialization\tAvailiablity");

                            for (Doctor dt : searchMap.values()) {
                                dt.display();
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        System.out.println("------------- Sorted Doctor -----------------");
                        HashMap<String, Doctor> sortedMap = dm.sortDoctorByName();
                        System.out.println("Code\tName\tSpecialization\tAvailiablity");
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

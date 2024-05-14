package FPT_HungNT;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) throws Exception {

        Map<String, Doctor> doctorMap = new HashMap<>();
        DoctorManagement dm = new DoctorManagement(doctorMap);

        Check ck = new Check();
        while (true) {
            int choice = ck.createMenu();

            switch (choice) {
                case 1:
                   
                    try {

                    System.out.print("Enter Code: ");
                    String code = ck.checkInputString();
                    if (doctorMap.containsKey(code)) {
                        throw new Exception("hungfsf");
                    }
                    System.out.print("Enter Name: ");
                    String name = ck.checkInputString();
                    System.out.print("Enter Specialization: ");
                    String specialization = ck.checkInputString();
                    System.out.print("Enter Availability: ");
                    int availability = ck.checkInputLimit(1, Integer.MAX_VALUE);
                    Doctor doctor = new Doctor(code, name, specialization, availability);
                    if (dm.addDoctor(doctor)) {
                        System.out.println("Successfull");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                break;

                case 2:
                          try {
                    if (doctorMap.isEmpty()) {
                        throw new Exception("Database is not existed");
                    }

                    System.out.print("Enter Code: ");
                    String code = ck.checkInputString();
                    dm.checkDoc(code);
                    System.out.print("Enter New Name : ");
                    String newName = ck.checkInputString();
                    System.out.print("Enter New Specialization : ");
                    String newSpecialization = ck.checkInputString();
                    System.out.print("Enter New Availability : ");
                    int newAvailability = ck.checkInputLimit(1, Integer.MAX_VALUE);
                    Doctor dt = new Doctor(code, newName, newSpecialization, newAvailability);
                    if (dm.updateDoctor(dt)) {
                        System.out.println("Doctor updated successfully.");
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());

                }
                break;

                case 3:
                    try {
                    if (doctorMap.isEmpty()) {
                        throw new Exception("Database is not existed");
                    }
                    System.out.print("Enter Code: ");
                    String code = ck.checkInputString();
                    Doctor dt = dm.checkDoc(code);
                    dm.deleteDoctor(dt);
                    System.out.println("Delete successfully");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

                case 4:
//                     try {
//            if (doctorMap.isEmpty()) {
//                throw new Exception("Database does not exist");
//            }
//            System.out.print("Enter search string Name: ");
//            String input = ck.checkInputString();
//             HashMap<String, Doctor> resultList = dm.searchDoctor(input);
//                         if (resultList.isEmpty()) {
//                             System.out.println("Not found");
//                         }
//            System.out.println("--------- Search Result ------------");            
//           
//            for (Doctor dt : resultList.values()) {
//                System.out.println(dt.getCode() + "\t\t" + dt.getName() + "\t\t"
//                        + dt.getSpecialization() + "\t\t" + dt.getAvailability());
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//                    
                    try{
                        System.out.print("Enter search string Name: ");
            String input = ck.checkInputString();
                        Doctor [] dt= dm.searchDoctor2(input);
                        for (Doctor d: dt) {
                            System.out.println(d.getCode() + "\t\t" + d.getName() + "\t\t"
                        + d.getSpecialization() + "\t\t" + d.getAvailability());
                        }
            
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

            }
        }

    }
}

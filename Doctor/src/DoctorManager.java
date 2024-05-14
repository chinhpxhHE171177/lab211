
import java.util.HashMap;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class DoctorManager {

    private HashMap<String, Doctor> doctorMap;
    int count;

    public DoctorManager() {
    }

    
    public DoctorManager(HashMap<String, Doctor> doctorMap) {
        this.doctorMap = doctorMap;
        count = doctorMap.size();
    }

    //Check if Doctor exists
    public Doctor checkDoc(String code) throws Exception {
        if (!doctorMap.containsKey(code)) {
            throw new Exception("Doctor code does not exist");
        }
        return doctorMap.get(code);
    }

    // Add doctor
    public boolean addDoctor(Doctor doctor) throws Exception {
        if (doctorMap == null) {
            throw new Exception("Database does not exist");
        }
        if (doctor == null) {
            throw new Exception("Data does not exits");
        }
        if (doctorMap.containsKey(doctor.getCode())) {
            throw new Exception("Doctor code [" + doctor.getCode() + "] is duplicate");
        }
        doctorMap.put(doctor.getCode(), doctor);
        return true;
    }

    //Update docotr
    public boolean updateDoctor(Doctor doctor) throws Exception {
        if (doctorMap == null) {
            throw new Exception("Database does not exist");
        }
        if (doctor == null) {
            throw new Exception("Data does not exist");
        }
        if (!doctorMap.containsKey(doctor.getCode())) {
            throw new Exception("Doctor code doesn't exist");
        }
        doctorMap.put(doctor.getCode(), doctor);
        return true;
    }

    //Delete doctor
    public boolean deleteDoctor(Doctor doctor) throws Exception {
        if (doctorMap == null) {
            throw new Exception("Database does not exist");
        }
        if (doctor == null) {
            throw new Exception("Data does not exist");
        }
        if (!doctorMap.containsKey(doctor.getCode())) {
            throw new Exception("Doctor code doesn't exist");
        }
        doctorMap.remove(doctor.getCode());
        System.out.println("Doctor deleted sucessfully");
        return true;
    }
    // Find doctor

    public HashMap<String, Doctor> searchDoctor(String input) throws Exception {
        HashMap<String, Doctor> searchMap = new HashMap<>();

        if (doctorMap == null || doctorMap.isEmpty()) {
            throw new Exception("Database does not exist");
        }
        for (Doctor doctor : doctorMap.values()) {
            if (doctor.getCode().contains(input) || doctor.getName().contains(input) || doctor.getSpecialization().contains(input)) {
                searchMap.put(doctor.getCode(), doctor);
            }
        }
        return searchMap;
    }
    //    public Doctor[] searchDoctor(String input) throws Exception {
//        Doctor[] dt = new Doctor[doctorMap.size()];
//        int count = 0;
//
//        for (Doctor doctor : doctorMap.values()) {
//            if (doctor.getCode().contains(input) || doctor.getName().contains(input) || doctor.getSpecialization().contains(input)) {
//                dt[count] = doctor;
//                count++;
//            }
//        }
//
//        if (count == 0) {
//            throw new Exception("Not found");
//        }
//
//        return Arrays.copyOfRange(dt, 0, count);
//    }

    //Them ham sorted by name
    public HashMap<String, Doctor> sortDoctorByName() {
        Doctor[] doctors = new Doctor[doctorMap.size()];
        int index = 0;
        for (Doctor doctor : doctorMap.values()) {
            doctors[index] = doctor;
            index++;
        }
        // Dung ham bubble sort
        for (int i = 0; i < doctors.length - 1; i++) {
            for (int j = 0; j < doctors.length - i - 1; j++) {
                if (doctors[j].getName().compareTo(doctors[j + 1].getName()) > 0) {
                    Doctor temp = doctors[j];
                    doctors[j] = doctors[j + 1];
                    doctors[j + 1] = temp;
                }
            }
        }

        HashMap<String, Doctor> sortedMap = new HashMap<>();
        for (Doctor doctor : doctors) {
            sortedMap.put(doctor.getCode(), doctor);
        }
        return sortedMap;
    }
}

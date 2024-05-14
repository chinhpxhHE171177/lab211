package FPT_HungNT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dell
 */
public class DoctorManagement {

    private Map<String, Doctor> doctorMap;
    Check ck = new Check();

    public DoctorManagement() {
        doctorMap = new HashMap<>();
    }

    public DoctorManagement(Map<String, Doctor> doctorMap) {
        this.doctorMap = doctorMap;
    }
    

//    public void addDoctor() throws Exception {
//        try {
//            System.out.print("Enter Code: ");
//            String code = ck.checkInputString();
//            if (doctorMap.containsKey(code)) {
//                throw new Exception("Error: Doctor code [" + code + "] is duplicate");
//            }
//            System.out.print("Enter Name: ");
//            String name = ck.checkInputString();
//            System.out.print("Enter Specialization: ");
//            String specialization = ck.checkInputString();
//            System.out.print("Enter Availability: ");
//            int availability = ck.checkInputLimit(1, Integer.MAX_VALUE);
//            Doctor doctor = new Doctor(code, name, specialization, availability);
//
//            doctorMap.put(doctor.getCode(), doctor);
//            System.out.println("Doctor added successfully.");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
    
public boolean addDoctor( Doctor dt) throws Exception {
  
            if (doctorMap.containsKey(dt.getCode())) 
                throw new Exception("Error: Doctor code [" + dt.getCode() + "] is duplicate");
            
            doctorMap.put(dt.getCode(), dt);
            return true;
        
    }
public Doctor checkDoc(String code) throws Exception{
    if (!doctorMap.containsKey(code)) {
        throw new Exception("Doctor code does not exist");
    }
    return doctorMap.get(code);
}

    public boolean updateDoctor( Doctor dt) throws Exception {

        
            if (doctorMap.isEmpty()) {
                throw new Exception("Database does not exist");
            }
            
            if (!doctorMap.containsKey(dt.getCode())) {
                throw new Exception("Doctor code does not exist");
            }
            
            doctorMap.put(dt.getCode(), dt);
            
            return true;
      
    }

    public void deleteDoctor(Doctor dt) throws Exception {
        
            if (doctorMap.isEmpty()) {
                throw new Exception("Database does not exist");
            }
        
            if (!doctorMap.containsKey(dt.getCode())) {
                throw new Exception("Doctor code does not exist");
            }
            doctorMap.remove(dt.getCode());
            System.out.println("Doctor deleted suc cessfully.");
      
    }

  
    public HashMap <String,Doctor>  searchDoctor( String input) throws Exception {
        
           
            HashMap<String, Doctor> resultList = new HashMap<>();

                for(Doctor doctor: doctorMap.values()){
                    if (doctor.getCode().contains(input) || doctor.getName().contains(input) || doctor.getSpecialization().contains(input)) {
                    resultList.put(doctor.getCode(), doctor);
                }
                }
                return resultList;

    }
     public Doctor  [] searchDoctor2( String input) throws Exception {
         
         Doctor[] dt= new Doctor[doctorMap.size()];
         int count=0;
                for(Doctor doctor: doctorMap.values()){
                    if (doctor.getCode().contains(input) || doctor.getName().contains(input) || doctor.getSpecialization().contains(input)) {
                   dt[count]=doctor;
                   count++;
                }
                }
         if (count==0) {
             throw new Exception("Not found");
         }
                
              
                return Arrays.copyOfRange(dt, 0, count);
    }
}

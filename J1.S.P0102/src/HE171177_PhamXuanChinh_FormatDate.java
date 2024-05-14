
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class HE171177_PhamXuanChinh_FormatDate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 

        try {
            // 1. User enter date with [dd/mm/yyyy] format
            System.out.print("Please enter date with format [dd/mm/yyyy]: ");
            String inputDate = sc.nextLine(); 

            // 2. Check if the user input date exists
            if (isValid(inputDate)) {
                Date date = df.parse(inputDate);
                // 3. Determine day of the week with the input date
                SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE"); 
                String dayOfWeek = dayFormat.format(date);
                System.out.println("Your day is " + dayOfWeek);
            } else {
                System.out.println("Invalid date!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    public static boolean isValid(String dateStr) { 
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false); 
        try {
            df.parse(dateStr); 
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

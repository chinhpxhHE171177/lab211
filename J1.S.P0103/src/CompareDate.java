
import java.text.ParseException;
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
public class CompareDate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        try {

            //1. User enter the first date with [dd/mm/yyyy] format 
            System.out.print("Please enter the first date: ");
            Date date1 = df.parse(sc.nextLine()); // phuong thuc parse chuyen doi chuoi str ve date 

            //2. User enter the second date with [dd/mm/yyyy] format 
            System.out.print("Please enter the second date: ");
            Date date2 = df.parse(sc.nextLine());

            //3. Compare and display
            CompareAndDisplay(date1, date2);

        } catch (ParseException e) {
            System.out.println("Invalid input!");
        }
    }

    public static void CompareAndDisplay(Date date1, Date date2) {
        if (date1.before(date2)) {
            System.out.println("Date1 is before Date2");
        } else if (date1.after(date2)) {
            System.out.println("Date1 is after Date2");
        } else {
            System.out.println("Date1 is equals Date2");
        }
    }
}

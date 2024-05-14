
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
public class FormatDate {

    public static boolean isValid(int day, int month, int year) {
        if (year <= 0) {  // ktra năm có > 0 nếu làm số âm ==> false
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > getDaysInMonth(month, year)) { //nó kiểm tra xem ngày có nằm trong khoảng từ 1 đến số ngày tương ứng của tháng và năm hay không
            return false;  // hương thức getDaysInMonth và truyền tham số là tháng và năm. Nếu ngày không nằm trong khoảng hợp lệ, phương thức trả về false.
        }
        return true;
    }

    public static int getDaysInMonth(int month, int year) {  //khai báo một mảng daysInMonth chứa số ngày trong các tháng của năm không nhuận.
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) { // nếu thang 2 va nam nhuan(isLeapYear) va tra ve 29
            return 29;  
        }
        return daysInMonth[month - 1];    // trả về số ngày tương ứng trong mảng daysInMonth dựa trên tháng truyền vào
    }

    public static boolean isLeapYear(int year) {  // ham ktra nam nhuan
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void Validator() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");  // định dạng ngày và ktra tính hợp lệ ngày
        try {
            // 1. User enters date with [dd/mm/yyyy] format
            System.out.print("Please enter a date with the format [dd/mm/yyyy]: ");
            String inputDate = sc.nextLine();  // user input date format and stored inputdate

            // 2. Parse the user input date to check if it is valid
            String[] dateParts = inputDate.split("/");  // phân tách inputdate ngay,thang, nam theo"/"
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);  // chuyển đối chuỗi thành kiểu dl so nguyen
            int year = Integer.parseInt(dateParts[2]);

            if (isValid(day, month, year)) {
                // 3. Construct a Date object from the valid input date
                Date date = df.parse(inputDate);

                // 4. Determine the day of the week for the input date
                SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
                String dayOfWeek = dayFormat.format(date);
                System.out.println("The day is " + dayOfWeek);
            } else {
                System.out.println("Invalid date!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            sc.close();
        }
    }
}

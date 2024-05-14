
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
public class CheckInput {

    public static int checkInput(int min, int max) {
        do {
            Scanner sc = new Scanner(System.in);
            try {

                int n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Wrong Fomat Input.");
                System.out.println("Please input again: ");
            }
        } while (true);
    }

    public static int checkInt() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {

                int n = Integer.parseInt(sc.nextLine());
                if (n < 0) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Wrong Fomat Input.");
                System.out.println("Please input again: ");
            }
        }
    }

  

    public static double checkDouble(double min, double max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                double n = Double.parseDouble(sc.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }

                return n;

            } catch (NumberFormatException e) {
                System.out.println("Wrong format string. Please input again");
            }
        }
    }

    public static double checkDouble2(double min, double max, double t) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                double n = Double.parseDouble(sc.nextLine());
                if (n < min || n > max || n <= t) {
                    throw new NumberFormatException();
                }

                return n;

            } catch (NumberFormatException e) {
                System.out.println("Wrong format string. Please input again");
            }
        }
    }

    public static String checkDate() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                dateFormat.setLenient(false); // sẽ không chấp nhận các giá trị ngày tháng không hợp lệ.
                Date date = dateFormat.parse(input); // Chuyển đổi chuỗi input thành đối tượng Date theo định dạng
                return input;
            } catch (ParseException e) {
                System.out.println("wrong format date.Please inout again: ");
            }
        }
    }

//    public static boolean checkDate2(String input) {
//
//        while (true) {
//            try {
//
//                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//                dateFormat.setLenient(false);
//                Date date = dateFormat.parse(input);
//                return true;
//            } catch (ParseException e) {
//                System.out.println("wrong format date.Please inout again: ");
//            }
//        }
//    }

    public static String checkInputTaskTypeId() {
        while (true) {
            int n = checkInput(1, 4);
            String result = null;
            switch (n) {
                case 1:
                    result = "code";
                    break;
                case 2:
                    result = "test";
                    break;
                case 3:
                    result = "manager";
                    break;
                case 4:
                    result = "learn";
            }
            return result;
        }
    }

    public static String checkString() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String n = sc.nextLine();
                if (n.isEmpty()) {
                    throw new Exception();
                }

                return n;

            } catch (Exception e) {
                System.out.println("Wrong format string. Please input again");
            }
        }
    }
}

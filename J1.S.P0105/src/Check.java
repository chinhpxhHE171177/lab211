
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Check {

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
                System.out.println("Invalid input. Please input again");
            }
        }
    }

    public static String checkDate() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                dateFormat.setLenient(false);
                Date date = dateFormat.parse(input);
                return input;
            } catch (ParseException e) {
                System.out.println("Invalid date.Please input again: ");
            }
        }
    }

    public static boolean checkDate4(String input) {
        while (true) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                dateFormat.setLenient(false);
                Date date = dateFormat.parse(input);
                return true;
            } catch (ParseException e) {
                System.out.println("Invalid date.Please input again: ");
            }
        }
    }

    public static String checkDate5(String input) {

        while (true) {
            try {

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                dateFormat.setLenient(false);
                Date date = dateFormat.parse(input);
                return input;
            } catch (ParseException e) {
                System.out.println("Invalid date.Please input again: ");
            }
        }
    }
    // checkdate nhập vào phải lớn hơn date2 , nhập ngày hết hạn

    public static String checkDate2(String date2) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                dateFormat.setLenient(false);
                Date date = dateFormat.parse(input);
                Date date2Date = dateFormat.parse(date2);

                if (date.before(date2Date)) {
                    System.out.println("Expiry date must be after date of manufacture");
                    continue;
                }
                return input;
            } catch (Exception e) {
                System.out.println("Invalid date.Please input again: ");
            }
        }
    }
    // nhập ngày nhận > ngày sản xuât và < ngày hết hạn

    public static String checkDate3(String date2, String date3) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                dateFormat.setLenient(false);
                Date date = dateFormat.parse(input);
                Date date2Date = dateFormat.parse(date2);
                Date date3Date = dateFormat.parse(date3);

                if (date.before(date2Date) || date.after(date3Date)) {
                    System.out.println("Receipt date must be from "  + date2 + " to "+ date3 );
                    continue;
                }
                return input;
            } catch (Exception e) {
                System.out.println("Invalid date.Please input again: ");
            }
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
                System.out.println("Invalid input. Please input again: ");
            }
        }
    }

}

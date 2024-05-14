
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

    public static String checkName() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Don't be empty!");
                    continue;
                } else if (input.length() < 5 || input.contains(" ")) {
                    throw new Exception();
                }
                return input;

            } catch (Exception e) {
                System.out.println("You must enter least at 5 character, and no space!");
                System.out.print("Enter UserName: ");
            }
        }
    }

    public static String checkPassword() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Don't be empty!");
                    continue;
                } else if (input.length() < 6 || input.contains(" ")) {
                    throw new Exception();
                }
                return input;

            } catch (Exception e) {
                System.out.println("You must enter least at 6 character, and no space!");
                System.out.print("Enter Password: ");
            }
        }
    }

    public static int checkChoice(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice >= min && choice <= max) {
                    return choice;
                }
                System.out.print("You must input a choice within the range " + min + " - " + max + ": ");
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice");
                System.out.print("Enter your choice: ");
            }
        }
    }

    // Check file exist 
    public static boolean checkFileExist() throws IOException {
        String fileName = "D:/user.dat";
        File file = new File(fileName);

        if (!file.exists()) {
            try {
                System.err.println("The file not exist!!!");
                file.createNewFile();
                //System.err.println("File created.");
                return false;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return true;
    }

    // Check user name existed in file
    public static boolean checkUsernameExists(String username) {
        File file = new File("d:/user.dat");
        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] accountData = line.split(",");
                String exUserName = accountData[0].trim();
                if (exUserName.equalsIgnoreCase(username)) {
                    return false;
                }
            }
            br.close();
            fr.close();
            return true;
        } catch (IOException e) {
            System.out.println("Invalid username!");
        }
        return true;
    }

    public static boolean checkPasswordExists(String password) {
        File file = new File("d:/user.dat");
        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] accountData = line.split(",");
                String existingPassword = accountData[1].trim();
                if (existingPassword.equalsIgnoreCase(password)) {
                    return true; // Password exists
                }
            }
        } catch (IOException e) {
            System.out.println("Invalid password!");
        }
        return false; // Password does not exist
    }

    public static boolean checkUsernamePasswordMatch(String username, String password) {
        File file = new File("d:/user.dat");
        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] accountData = line.split(",");
                String existingUsername = accountData[0].trim();
                String existingPassword = accountData[1].trim();
                if (existingUsername.equals(username) && existingPassword.equals(password)) {
                    return true; // Username and Password match
                }
            }
        } catch (IOException e) {
            System.out.println("Invalid!!!");
        }
        return false; // Username and Password do not match
    }
}

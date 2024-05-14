
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Manager {

    public Manager() {

    }

    public void addAccount() throws Exception {
        // Check data file exits or not
        if (!CheckInput.checkFileExist()) {
            return;
        }
        System.out.print("Enter Username: ");
        String name = CheckInput.checkName();

        System.out.print("Enter Password: ");
        String password = CheckInput.checkPassword();
        //Check user exits in file
        if (!CheckInput.checkUsernameExists(name)) {
            System.out.println("UserName existed!");
            return;
        }
        addAccountToFile(name, password);
        System.out.println("Account added successfully");
    }

    // Add account to files
    public void addAccountToFile(String username, String password) {
        File file = new File("D:/user.dat");
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            String accountData = username + "," + password;
            bw.write(accountData);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void findAccount() throws Exception {
        // Check data file exits or not
        if (!CheckInput.checkFileExist()) {
            return;
        }
        System.out.print("Enter Username: ");
        String name = CheckInput.checkName();

        System.out.print("Enter Password: ");
        String password = CheckInput.checkPassword();
        //Check username and password exits in file
//        if (!CheckInput.checkUsernameExists(name)) {
//            if (!CheckInput.checkPasswordExists(password)) {
//                System.out.println("UserName or Password existed!");
//            }
//        }
        if (!CheckInput.checkUsernamePasswordMatch(name, password)) {
            System.out.println("UserName or Password existed!");
            return;
        }
        Account fAccount = new Account(name, password);
        System.out.println("Login successful. Account found: " + fAccount.getUsername());
    }
}

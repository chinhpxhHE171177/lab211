
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {

    public Manager() {

    }

    public void addAccount() throws Exception {
        // Check if data file exists or not
        if (!CheckInput.checkFileExist()) {
            return;
        }

        System.out.print("Enter Username: ");
        String name = CheckInput.checkName();

        System.out.print("Enter Password: ");
        String password = CheckInput.checkPassword();

        // Check if username exists in the file
        if (CheckInput.checkUsernameExists(name) || CheckInput.checkPasswordExists(password)) {
            System.out.println("Username or password already exists!");
            return;
        }
        Account account = new Account(name, password);
        addAccountToFile(account);
        System.out.println("Account added successfully");
    }

// Add account to file
    public void addAccountToFile(Account acc) {
        File file = new File("D:/user.dat"); // tại file lưu trữ tại ổ D
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) { // bư để ghi văn bản-- còn fw tạo một filewriter phần vổ sung vào tệp, tham só otrue là nó sẽ thêm vào tệp nếu nó đã tồn tại
            String accountData = acc.getUsername() + "," + acc.getPassword();
            bw.write(accountData); // ghi vào tệp 
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
// login account from file

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
            System.out.println("UserName or Password not existed!");
            return;
        }
        Account fAccount = new Account(name, password);
        System.out.println("Login successful. Account found: " + fAccount.getUsername());
    }
}
